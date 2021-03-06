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

public class ArDPPTU extends ArPTZ {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArDPPTU(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArDPPTUUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArDPPTU obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArDPPTU(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArDPPTU(ArRobot robot, ArDPPTU.DeviceType deviceType, int deviceIndex) {
    this(AriaJavaJNI.new_ArDPPTU__SWIG_0(ArRobot.getCPtr(robot), robot, deviceType.swigValue(), deviceIndex), true);
  }

  public ArDPPTU(ArRobot robot, ArDPPTU.DeviceType deviceType) {
    this(AriaJavaJNI.new_ArDPPTU__SWIG_1(ArRobot.getCPtr(robot), robot, deviceType.swigValue()), true);
  }

  public ArDPPTU(ArRobot robot) {
    this(AriaJavaJNI.new_ArDPPTU__SWIG_2(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean init() {
    return AriaJavaJNI.ArDPPTU_init(swigCPtr, this);
  }

  public String getTypeName() {
    return AriaJavaJNI.ArDPPTU_getTypeName(swigCPtr, this);
  }

  public boolean canZoom() {
    return AriaJavaJNI.ArDPPTU_canZoom(swigCPtr, this);
  }

  public boolean canGetRealPanTilt() {
    return AriaJavaJNI.ArDPPTU_canGetRealPanTilt(swigCPtr, this);
  }

  public boolean blank() {
    return AriaJavaJNI.ArDPPTU_blank(swigCPtr, this);
  }

  public boolean resetCalib() {
    return AriaJavaJNI.ArDPPTU_resetCalib(swigCPtr, this);
  }

  public boolean disableReset() {
    return AriaJavaJNI.ArDPPTU_disableReset(swigCPtr, this);
  }

  public boolean resetTilt() {
    return AriaJavaJNI.ArDPPTU_resetTilt(swigCPtr, this);
  }

  public boolean resetPan() {
    return AriaJavaJNI.ArDPPTU_resetPan(swigCPtr, this);
  }

  public boolean resetAll() {
    return AriaJavaJNI.ArDPPTU_resetAll(swigCPtr, this);
  }

  public boolean enMon() {
    return AriaJavaJNI.ArDPPTU_enMon(swigCPtr, this);
  }

  public boolean disMon() {
    return AriaJavaJNI.ArDPPTU_disMon(swigCPtr, this);
  }

  public boolean saveSet() {
    return AriaJavaJNI.ArDPPTU_saveSet(swigCPtr, this);
  }

  public boolean restoreSet() {
    return AriaJavaJNI.ArDPPTU_restoreSet(swigCPtr, this);
  }

  public boolean factorySet() {
    return AriaJavaJNI.ArDPPTU_factorySet(swigCPtr, this);
  }

  public boolean awaitExec() {
    return AriaJavaJNI.ArDPPTU_awaitExec(swigCPtr, this);
  }

  public boolean haltAll() {
    return AriaJavaJNI.ArDPPTU_haltAll(swigCPtr, this);
  }

  public boolean haltPan() {
    return AriaJavaJNI.ArDPPTU_haltPan(swigCPtr, this);
  }

  public boolean haltTilt() {
    return AriaJavaJNI.ArDPPTU_haltTilt(swigCPtr, this);
  }

  public boolean initMon(double deg1, double deg2, double deg3, double deg4) {
    return AriaJavaJNI.ArDPPTU_initMon(swigCPtr, this, deg1, deg2, deg3, deg4);
  }

  public boolean limitEnforce(boolean val) {
    return AriaJavaJNI.ArDPPTU_limitEnforce(swigCPtr, this, val);
  }

  public boolean immedExec() {
    return AriaJavaJNI.ArDPPTU_immedExec(swigCPtr, this);
  }

  public boolean slaveExec() {
    return AriaJavaJNI.ArDPPTU_slaveExec(swigCPtr, this);
  }

  public double getMaxPanSlew() {
    return AriaJavaJNI.ArDPPTU_getMaxPanSlew(swigCPtr, this);
  }

  public double getMaxPanSpeed() {
    return AriaJavaJNI.ArDPPTU_getMaxPanSpeed(swigCPtr, this);
  }

  public double getMinPanSlew() {
    return AriaJavaJNI.ArDPPTU_getMinPanSlew(swigCPtr, this);
  }

  public double getMaxTiltSlew() {
    return AriaJavaJNI.ArDPPTU_getMaxTiltSlew(swigCPtr, this);
  }

  public double getMaxTiltSpeed() {
    return AriaJavaJNI.ArDPPTU_getMaxTiltSpeed(swigCPtr, this);
  }

  public double getMinTiltSlew() {
    return AriaJavaJNI.ArDPPTU_getMinTiltSlew(swigCPtr, this);
  }

  public double getMaxPanAccel() {
    return AriaJavaJNI.ArDPPTU_getMaxPanAccel(swigCPtr, this);
  }

  public double getMinPanAccel() {
    return AriaJavaJNI.ArDPPTU_getMinPanAccel(swigCPtr, this);
  }

  public double getMaxTiltAccel() {
    return AriaJavaJNI.ArDPPTU_getMaxTiltAccel(swigCPtr, this);
  }

  public double getMinTiltAccel() {
    return AriaJavaJNI.ArDPPTU_getMinTiltAccel(swigCPtr, this);
  }

  public boolean setMovePower(ArDPPTU.Axis axis, ArDPPTU.PowerMode mode) {
    return AriaJavaJNI.ArDPPTU_setMovePower(swigCPtr, this, axis.swigValue(), mode.swigValue());
  }

  public boolean setHoldPower(ArDPPTU.Axis axis, ArDPPTU.PowerMode mode) {
    return AriaJavaJNI.ArDPPTU_setHoldPower(swigCPtr, this, axis.swigValue(), mode.swigValue());
  }

  public boolean offStatPower() {
    return AriaJavaJNI.ArDPPTU_offStatPower(swigCPtr, this);
  }

  public boolean regStatPower() {
    return AriaJavaJNI.ArDPPTU_regStatPower(swigCPtr, this);
  }

  public boolean lowStatPower() {
    return AriaJavaJNI.ArDPPTU_lowStatPower(swigCPtr, this);
  }

  public boolean highMotPower() {
    return AriaJavaJNI.ArDPPTU_highMotPower(swigCPtr, this);
  }

  public boolean regMotPower() {
    return AriaJavaJNI.ArDPPTU_regMotPower(swigCPtr, this);
  }

  public boolean lowMotPower() {
    return AriaJavaJNI.ArDPPTU_lowMotPower(swigCPtr, this);
  }

  public boolean panAccel(double deg) {
    return AriaJavaJNI.ArDPPTU_panAccel(swigCPtr, this, deg);
  }

  public boolean tiltAccel(double deg) {
    return AriaJavaJNI.ArDPPTU_tiltAccel(swigCPtr, this, deg);
  }

  public boolean basePanSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_basePanSlew(swigCPtr, this, deg);
  }

  public boolean baseTiltSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_baseTiltSlew(swigCPtr, this, deg);
  }

  public boolean upperPanSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_upperPanSlew(swigCPtr, this, deg);
  }

  public boolean lowerPanSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_lowerPanSlew(swigCPtr, this, deg);
  }

  public boolean upperTiltSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_upperTiltSlew(swigCPtr, this, deg);
  }

  public boolean lowerTiltSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_lowerTiltSlew(swigCPtr, this, deg);
  }

  public boolean indepMove() {
    return AriaJavaJNI.ArDPPTU_indepMove(swigCPtr, this);
  }

  public boolean velMove() {
    return AriaJavaJNI.ArDPPTU_velMove(swigCPtr, this);
  }

  public boolean panSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_panSlew(swigCPtr, this, deg);
  }

  public boolean tiltSlew(double deg) {
    return AriaJavaJNI.ArDPPTU_tiltSlew(swigCPtr, this, deg);
  }

  public boolean canPanTiltSlew() {
    return AriaJavaJNI.ArDPPTU_canPanTiltSlew(swigCPtr, this);
  }

  public boolean panSlewRel(double deg) {
    return AriaJavaJNI.ArDPPTU_panSlewRel(swigCPtr, this, deg);
  }

  public boolean tiltSlewRel(double deg) {
    return AriaJavaJNI.ArDPPTU_tiltSlewRel(swigCPtr, this, deg);
  }

  public double getLastPanRequest() {
    return AriaJavaJNI.ArDPPTU_getLastPanRequest(swigCPtr, this);
  }

  public double getLastTiltRequest() {
    return AriaJavaJNI.ArDPPTU_getLastTiltRequest(swigCPtr, this);
  }

  public double getPanSlew() {
    return AriaJavaJNI.ArDPPTU_getPanSlew(swigCPtr, this);
  }

  public double getTiltSlew() {
    return AriaJavaJNI.ArDPPTU_getTiltSlew(swigCPtr, this);
  }

  public double getBasePanSlew() {
    return AriaJavaJNI.ArDPPTU_getBasePanSlew(swigCPtr, this);
  }

  public double getBaseTiltSlew() {
    return AriaJavaJNI.ArDPPTU_getBaseTiltSlew(swigCPtr, this);
  }

  public double getPanAccel() {
    return AriaJavaJNI.ArDPPTU_getPanAccel(swigCPtr, this);
  }

  public double getTiltAccel() {
    return AriaJavaJNI.ArDPPTU_getTiltAccel(swigCPtr, this);
  }

  public void query() {
    AriaJavaJNI.ArDPPTU_query(swigCPtr, this);
  }

  public final static class DeviceType {
    public final static DeviceType PANTILT_DEFAULT = new DeviceType("PANTILT_DEFAULT");
    public final static DeviceType PANTILT_PTUD47 = new DeviceType("PANTILT_PTUD47");
    public final static DeviceType PANTILT_PTUD46 = new DeviceType("PANTILT_PTUD46");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static DeviceType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + DeviceType.class + " with value " + swigValue);
    }

    private DeviceType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private DeviceType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private DeviceType(String swigName, DeviceType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static DeviceType[] swigValues = { PANTILT_DEFAULT, PANTILT_PTUD47, PANTILT_PTUD46 };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Axis {
    public final static Axis PAN = new Axis("PAN", AriaJavaJNI.ArDPPTU_PAN_get());
    public final static Axis TILT = new Axis("TILT", AriaJavaJNI.ArDPPTU_TILT_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Axis swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Axis.class + " with value " + swigValue);
    }

    private Axis(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Axis(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Axis(String swigName, Axis swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Axis[] swigValues = { PAN, TILT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class PowerMode {
    public final static PowerMode OFF = new PowerMode("OFF", AriaJavaJNI.ArDPPTU_OFF_get());
    public final static PowerMode LOW = new PowerMode("LOW", AriaJavaJNI.ArDPPTU_LOW_get());
    public final static PowerMode NORMAL = new PowerMode("NORMAL", AriaJavaJNI.ArDPPTU_NORMAL_get());
    public final static PowerMode HIGH = new PowerMode("HIGH", AriaJavaJNI.ArDPPTU_HIGH_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PowerMode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PowerMode.class + " with value " + swigValue);
    }

    private PowerMode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PowerMode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PowerMode(String swigName, PowerMode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PowerMode[] swigValues = { OFF, LOW, NORMAL, HIGH };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
