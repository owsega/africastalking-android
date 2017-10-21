/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsip_transport_flags_e {
  public final static pjsip_transport_flags_e PJSIP_TRANSPORT_RELIABLE = new pjsip_transport_flags_e("PJSIP_TRANSPORT_RELIABLE", pjsua2JNI.PJSIP_TRANSPORT_RELIABLE_get());
  public final static pjsip_transport_flags_e PJSIP_TRANSPORT_SECURE = new pjsip_transport_flags_e("PJSIP_TRANSPORT_SECURE", pjsua2JNI.PJSIP_TRANSPORT_SECURE_get());
  public final static pjsip_transport_flags_e PJSIP_TRANSPORT_DATAGRAM = new pjsip_transport_flags_e("PJSIP_TRANSPORT_DATAGRAM", pjsua2JNI.PJSIP_TRANSPORT_DATAGRAM_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsip_transport_flags_e swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsip_transport_flags_e.class + " with value " + swigValue);
  }

  private pjsip_transport_flags_e(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsip_transport_flags_e(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsip_transport_flags_e(String swigName, pjsip_transport_flags_e swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsip_transport_flags_e[] swigValues = { PJSIP_TRANSPORT_RELIABLE, PJSIP_TRANSPORT_SECURE, PJSIP_TRANSPORT_DATAGRAM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
