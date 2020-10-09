/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class IndexHNSWFlat extends IndexHNSW {
  private transient long swigCPtr;

  protected IndexHNSWFlat(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexHNSWFlat_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexHNSWFlat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexHNSWFlat(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IndexHNSWFlat() {
    this(swigfaissJNI.new_IndexHNSWFlat__SWIG_0(), true);
  }

  public IndexHNSWFlat(int d, int M, MetricType metric) {
    this(swigfaissJNI.new_IndexHNSWFlat__SWIG_1(d, M, metric.swigValue()), true);
  }

  public IndexHNSWFlat(int d, int M) {
    this(swigfaissJNI.new_IndexHNSWFlat__SWIG_2(d, M), true);
  }

}
