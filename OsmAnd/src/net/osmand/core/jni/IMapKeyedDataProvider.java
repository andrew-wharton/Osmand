/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class IMapKeyedDataProvider extends IMapDataProvider {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected IMapKeyedDataProvider(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.IMapKeyedDataProvider_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IMapKeyedDataProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_IMapKeyedDataProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SWIGTYPE_p_QListT_void_const_p_t getProvidedDataKeys() {
    return new SWIGTYPE_p_QListT_void_const_p_t(OsmAndCoreJNI.IMapKeyedDataProvider_getProvidedDataKeys(swigCPtr, this), true);
  }

  public boolean obtainData(SWIGTYPE_p_void key, MapKeyedData outKeyedData, SWIGTYPE_p_OsmAnd__IQueryController queryController) {
    return OsmAndCoreJNI.IMapKeyedDataProvider_obtainData__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(key), MapKeyedData.getCPtr(outKeyedData), outKeyedData, SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(queryController));
  }

  public boolean obtainData(SWIGTYPE_p_void key, MapKeyedData outKeyedData) {
    return OsmAndCoreJNI.IMapKeyedDataProvider_obtainData__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(key), MapKeyedData.getCPtr(outKeyedData), outKeyedData);
  }

}
