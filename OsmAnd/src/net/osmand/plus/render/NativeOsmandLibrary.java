package net.osmand.plus.render;


import net.osmand.NativeLibrary;
import net.osmand.PlatformUtil;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.render.OsmandRenderer.RenderingContext;
import net.osmand.render.RenderingRuleSearchRequest;
import net.osmand.render.RenderingRulesStorage;

import org.apache.commons.logging.Log;

import android.graphics.Bitmap;

public class NativeOsmandLibrary extends NativeLibrary {
	private static final Log log = PlatformUtil.getLog(NativeOsmandLibrary.class);
	
	private static NativeOsmandLibrary library;
	private static Boolean isNativeSupported = null;

    public NativeOsmandLibrary(boolean newLibrary) {
        super(newLibrary);
    }

    public static NativeOsmandLibrary getLoadedLibrary(){
		synchronized (NativeOsmandLibrary.class) {
			return library;
		}
	}
	public static void loadLibrary(String name) {
		try {
        	System.out.println("Loading " + name);
            System.loadLibrary(name);
        } catch( UnsatisfiedLinkError e ) {
            System.err.println("Failed to load '"+name + "':" + e);
            throw e;
        }
	}

    public static NativeOsmandLibrary getLibrary(RenderingRulesStorage storage, OsmandApplication ctx) {
		if (!isLoaded()) {
			synchronized (NativeOsmandLibrary.class) {
				if (!isLoaded()) {
					isNativeSupported = false;
					try {
						log.debug("Loading native gnustl_shared..."); //$NON-NLS-1$
						System.loadLibrary("gnustl_shared");
						log.debug("Loading native cpufeatures_proxy..."); //$NON-NLS-1$
						System.loadLibrary("cpufeatures_proxy");
						if (android.os.Build.VERSION.SDK_INT >= 8) {
							log.debug("Loading jnigraphics, since Android >= 2.2 ..."); //$NON-NLS-1$
							System.loadLibrary("jnigraphics");
						}
						final String libCpuSuffix = cpuHasNeonSupport() ? "_neon" : "";
						log.debug("Loading native libraries..."); //$NON-NLS-1$
						loadOldCore(libCpuSuffix);
						log.debug("Creating NativeOsmandLibrary instance..."); //$NON-NLS-1$
						library = new NativeOsmandLibrary(false);
						log.debug("Initializing rendering rules storage..."); //$NON-NLS-1$
						NativeOsmandLibrary.initRenderingRulesStorage(storage);
						isNativeSupported = true;
					} catch (Throwable e) {
						log.error("Failed to load native library", e); //$NON-NLS-1$
					}
				}
			}
			
		}
		return library;
	}

	private static void loadOldCore(final String libCpuSuffix) {
		System.loadLibrary("osmand" + libCpuSuffix);
	}

	public static boolean isSupported()
	{
		return isNativeSupported != null && isNativeSupported;
	}
	
	public static boolean isLoaded() {
		return isNativeSupported != null;  
	}
	
	public static boolean isNativeSupported(RenderingRulesStorage storage, OsmandApplication ctx) {
		if(storage != null) {
			getLibrary(storage, ctx);
		}
		return isSupported();
	}
	
	public boolean useDirectRendering(){
		return android.os.Build.VERSION.SDK_INT >= 8;
	}

	public RenderingGenerationResult generateRendering(RenderingContext rc, NativeSearchResult searchResultHandler,
			Bitmap bitmap, boolean isTransparent, RenderingRuleSearchRequest render) {
		if (searchResultHandler == null) {
			log.error("Error search result = null"); //$NON-NLS-1$
			return new RenderingGenerationResult(null);
		}
		
		// Android 2.2+
		if(android.os.Build.VERSION.SDK_INT >= 8) { 
			return generateRenderingDirect(rc, searchResultHandler.nativeHandler, bitmap, render);
		} else {
			return generateRenderingIndirect(rc, searchResultHandler.nativeHandler, isTransparent, render, false);
		}
	}

	
	private static native RenderingGenerationResult generateRenderingDirect(RenderingContext rc, long searchResultHandler,
			Bitmap bitmap, RenderingRuleSearchRequest render);
			
	public static native int getCpuCount();
	public static native boolean cpuHasNeonSupport();
	
}
