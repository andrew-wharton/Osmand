/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class OnlineTileSources extends IOnlineTileSources {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected OnlineTileSources(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.OnlineTileSources_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnlineTileSources obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_OnlineTileSources(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OnlineTileSources() {
    this(OsmAndCoreJNI.new_OnlineTileSources(), true);
  }

  public boolean loadFrom(SWIGTYPE_p_QByteArray content) {
    return OsmAndCoreJNI.OnlineTileSources_loadFrom__SWIG_0(swigCPtr, this, SWIGTYPE_p_QByteArray.getCPtr(content));
  }

  public boolean loadFrom(SWIGTYPE_p_QIODevice ioDevice) {
    return OsmAndCoreJNI.OnlineTileSources_loadFrom__SWIG_1(swigCPtr, this, SWIGTYPE_p_QIODevice.getCPtr(ioDevice));
  }

  public boolean loadFrom(String fileName) {
    return OsmAndCoreJNI.OnlineTileSources_loadFrom__SWIG_2(swigCPtr, this, fileName);
  }

  public boolean saveTo(SWIGTYPE_p_QIODevice ioDevice) {
    return OsmAndCoreJNI.OnlineTileSources_saveTo__SWIG_0(swigCPtr, this, SWIGTYPE_p_QIODevice.getCPtr(ioDevice));
  }

  public boolean saveTo(String fileName) {
    return OsmAndCoreJNI.OnlineTileSources_saveTo__SWIG_1(swigCPtr, this, fileName);
  }

  public SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__IOnlineTileSources__Source_const_t_t getCollection() {
    return new SWIGTYPE_p_QHashT_QString_std__shared_ptrT_OsmAnd__IOnlineTileSources__Source_const_t_t(OsmAndCoreJNI.OnlineTileSources_getCollection(swigCPtr, this), true);
  }

  public IOnlineTileSources.Source getSourceByName(String sourceName) {
    long cPtr = OsmAndCoreJNI.OnlineTileSources_getSourceByName(swigCPtr, this, sourceName);
    return (cPtr == 0) ? null : new IOnlineTileSources.Source(cPtr, true);
  }

  public boolean addSource(IOnlineTileSources.Source source) {
    return OsmAndCoreJNI.OnlineTileSources_addSource(swigCPtr, this, IOnlineTileSources.Source.getCPtr(source));
  }

  public boolean removeSource(String sourceName) {
    return OsmAndCoreJNI.OnlineTileSources_removeSource(swigCPtr, this, sourceName);
  }

  public static OnlineTileSources getBuiltIn() {
    long cPtr = OsmAndCoreJNI.OnlineTileSources_getBuiltIn();
    return (cPtr == 0) ? null : new OnlineTileSources(cPtr, true);
  }

}
