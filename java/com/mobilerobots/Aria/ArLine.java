/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2014 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLine {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArLine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArLine() {
    this(AriaJavaJNI.new_ArLine__SWIG_0(), true);
  }

  public ArLine(double a, double b, double c) {
    this(AriaJavaJNI.new_ArLine__SWIG_1(a, b, c), true);
  }

  public ArLine(double x1, double y1, double x2, double y2) {
    this(AriaJavaJNI.new_ArLine__SWIG_2(x1, y1, x2, y2), true);
  }

  public void newParameters(double a, double b, double c) {
    AriaJavaJNI.ArLine_newParameters(swigCPtr, this, a, b, c);
  }

  public void newParametersFromEndpoints(double x1, double y1, double x2, double y2) {
    AriaJavaJNI.ArLine_newParametersFromEndpoints(swigCPtr, this, x1, y1, x2, y2);
  }

  public double getA() {
    return AriaJavaJNI.ArLine_getA(swigCPtr, this);
  }

  public double getB() {
    return AriaJavaJNI.ArLine_getB(swigCPtr, this);
  }

  public double getC() {
    return AriaJavaJNI.ArLine_getC(swigCPtr, this);
  }

  public boolean intersects(ArLine line, ArPose pose) {
    return AriaJavaJNI.ArLine_intersects(swigCPtr, this, ArLine.getCPtr(line), line, ArPose.getCPtr(pose), pose);
  }

  public void makeLinePerp(ArPose pose, ArLine line) {
    AriaJavaJNI.ArLine_makeLinePerp(swigCPtr, this, ArPose.getCPtr(pose), pose, ArLine.getCPtr(line), line);
  }

  public double getPerpDist(ArPose pose) {
    return AriaJavaJNI.ArLine_getPerpDist(swigCPtr, this, ArPose.getCPtr(pose), pose);
  }

  public double getPerpSquaredDist(ArPose pose) {
    return AriaJavaJNI.ArLine_getPerpSquaredDist(swigCPtr, this, ArPose.getCPtr(pose), pose);
  }

  public boolean getPerpPoint(ArPose pose, ArPose perpPoint) {
    return AriaJavaJNI.ArLine_getPerpPoint(swigCPtr, this, ArPose.getCPtr(pose), pose, ArPose.getCPtr(perpPoint), perpPoint);
  }

}
