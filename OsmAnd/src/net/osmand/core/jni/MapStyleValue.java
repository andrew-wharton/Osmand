/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class MapStyleValue {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected MapStyleValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MapStyleValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_MapStyleValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MapStyleValue() {
    this(OsmAndCoreJNI.new_MapStyleValue(), true);
  }

  public void setIsComplex(boolean value) {
    OsmAndCoreJNI.MapStyleValue_isComplex_set(swigCPtr, this, value);
  }

  public boolean getIsComplex() {
    return OsmAndCoreJNI.MapStyleValue_isComplex_get(swigCPtr, this);
  }

}
