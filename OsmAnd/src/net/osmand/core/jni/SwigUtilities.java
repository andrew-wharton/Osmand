/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class SwigUtilities {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SwigUtilities(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwigUtilities obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static SWIGTYPE_p_QByteArray readEntireFile(String filename) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.SwigUtilities_readEntireFile(filename), true);
  }

  public static SWIGTYPE_p_QByteArray readPartOfFile(String filename, long offset, long length) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.SwigUtilities_readPartOfFile(filename, offset, length), true);
  }

  public static SWIGTYPE_p_QByteArray emptyQByteArray() {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.SwigUtilities_emptyQByteArray(), true);
  }

}
