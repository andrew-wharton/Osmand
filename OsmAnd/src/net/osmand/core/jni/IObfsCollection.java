/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class IObfsCollection {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected IObfsCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IObfsCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_IObfsCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_QListT_std__shared_ptrT_ObfFile_const_t_t getObfFiles() {
    return new SWIGTYPE_p_QListT_std__shared_ptrT_ObfFile_const_t_t(OsmAndCoreJNI.IObfsCollection_getObfFiles(swigCPtr, this), true);
  }

  public ObfDataInterface obtainDataInterface() {
    long cPtr = OsmAndCoreJNI.IObfsCollection_obtainDataInterface(swigCPtr, this);
    return (cPtr == 0) ? null : new ObfDataInterface(cPtr, true);
  }

}
