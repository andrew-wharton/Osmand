/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class BinaryMapPrimitivesProvider extends IMapTiledDataProvider {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected BinaryMapPrimitivesProvider(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.BinaryMapPrimitivesProvider_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinaryMapPrimitivesProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_BinaryMapPrimitivesProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BinaryMapPrimitivesProvider(BinaryMapDataProvider dataProvider, Primitiviser primitiviser, long tileSize) {
    this(OsmAndCoreJNI.new_BinaryMapPrimitivesProvider__SWIG_0(BinaryMapDataProvider.getCPtr(dataProvider), dataProvider, Primitiviser.getCPtr(primitiviser), primitiviser, tileSize), true);
  }

  public BinaryMapPrimitivesProvider(BinaryMapDataProvider dataProvider, Primitiviser primitiviser) {
    this(OsmAndCoreJNI.new_BinaryMapPrimitivesProvider__SWIG_1(BinaryMapDataProvider.getCPtr(dataProvider), dataProvider, Primitiviser.getCPtr(primitiviser), primitiviser), true);
  }

  public BinaryMapDataProvider getDataProvider() {
    long cPtr = OsmAndCoreJNI.BinaryMapPrimitivesProvider_dataProvider_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BinaryMapDataProvider(cPtr, true);
  }

  public Primitiviser getPrimitiviser() {
    long cPtr = OsmAndCoreJNI.BinaryMapPrimitivesProvider_primitiviser_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Primitiviser(cPtr, true);
  }

  public long getTileSize() {
    return OsmAndCoreJNI.BinaryMapPrimitivesProvider_tileSize_get(swigCPtr, this);
  }

  public ZoomLevel getMinZoom() {
    return ZoomLevel.swigToEnum(OsmAndCoreJNI.BinaryMapPrimitivesProvider_getMinZoom(swigCPtr, this));
  }

  public ZoomLevel getMaxZoom() {
    return ZoomLevel.swigToEnum(OsmAndCoreJNI.BinaryMapPrimitivesProvider_getMaxZoom(swigCPtr, this));
  }

  public boolean obtainData(TileId tileId, ZoomLevel zoom, MapTiledData outTiledData, SWIGTYPE_p_OsmAnd__IQueryController queryController) {
    return OsmAndCoreJNI.BinaryMapPrimitivesProvider_obtainData__SWIG_0(swigCPtr, this, TileId.getCPtr(tileId), tileId, zoom.swigValue(), MapTiledData.getCPtr(outTiledData), outTiledData, SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(queryController));
  }

  public boolean obtainData(TileId tileId, ZoomLevel zoom, MapTiledData outTiledData) {
    return OsmAndCoreJNI.BinaryMapPrimitivesProvider_obtainData__SWIG_1(swigCPtr, this, TileId.getCPtr(tileId), tileId, zoom.swigValue(), MapTiledData.getCPtr(outTiledData), outTiledData);
  }

  public boolean obtainData(TileId tileId, ZoomLevel zoom, MapTiledData outTiledData, SWIGTYPE_p_BinaryMapPrimitivesProvider_Metrics__Metric_obtainData metric, SWIGTYPE_p_OsmAnd__IQueryController queryController) {
    return OsmAndCoreJNI.BinaryMapPrimitivesProvider_obtainData__SWIG_2(swigCPtr, this, TileId.getCPtr(tileId), tileId, zoom.swigValue(), MapTiledData.getCPtr(outTiledData), outTiledData, SWIGTYPE_p_BinaryMapPrimitivesProvider_Metrics__Metric_obtainData.getCPtr(metric), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(queryController));
  }

}
