/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGeneric6DofSpringConstraintDoubleData2 extends BulletBase {
	private long swigCPtr;
	
	protected btGeneric6DofSpringConstraintDoubleData2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGeneric6DofSpringConstraintDoubleData2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGeneric6DofSpringConstraintDoubleData2(long cPtr, boolean cMemoryOwn) {
		this("btGeneric6DofSpringConstraintDoubleData2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGeneric6DofSpringConstraintDoubleData2 obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btGeneric6DofSpringConstraintDoubleData2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void set6dofData(btGeneric6DofConstraintDoubleData2 value) {
    DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_6dofData_set(swigCPtr, this, btGeneric6DofConstraintDoubleData2.getCPtr(value), value);
  }

  public btGeneric6DofConstraintDoubleData2 get6dofData() {
    long cPtr = DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_6dofData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btGeneric6DofConstraintDoubleData2(cPtr, false);
  }

  public void setSpringEnabled(int[] value) {
    DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springEnabled_set(swigCPtr, this, value);
  }

  public int[] getSpringEnabled() {
    return DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springEnabled_get(swigCPtr, this);
}

  public void setEquilibriumPoint(double[] value) {
    DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_equilibriumPoint_set(swigCPtr, this, value);
  }

  public double[] getEquilibriumPoint() {
    return DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_equilibriumPoint_get(swigCPtr, this);
}

  public void setSpringStiffness(double[] value) {
    DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springStiffness_set(swigCPtr, this, value);
  }

  public double[] getSpringStiffness() {
    return DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springStiffness_get(swigCPtr, this);
}

  public void setSpringDamping(double[] value) {
    DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springDamping_set(swigCPtr, this, value);
  }

  public double[] getSpringDamping() {
    return DynamicsJNI.btGeneric6DofSpringConstraintDoubleData2_springDamping_get(swigCPtr, this);
}

  public btGeneric6DofSpringConstraintDoubleData2() {
    this(DynamicsJNI.new_btGeneric6DofSpringConstraintDoubleData2(), true);
  }

}
