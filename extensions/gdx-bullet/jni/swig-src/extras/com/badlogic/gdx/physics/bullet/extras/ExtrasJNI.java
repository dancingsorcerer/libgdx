/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Pool;

public class ExtrasJNI {
  public final static native long new_btStringArray__SWIG_0();
  public final static native void delete_btStringArray(long jarg1);
  public final static native long new_btStringArray__SWIG_1(long jarg1, btStringArray jarg1_);
  public final static native int btStringArray_size(long jarg1, btStringArray jarg1_);
  public final static native String btStringArray_at__SWIG_0(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native void btStringArray_clear(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_pop_back(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_resizeNoInitialize(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native void btStringArray_resize__SWIG_0(long jarg1, btStringArray jarg1_, int jarg2, String jarg3);
  public final static native void btStringArray_resize__SWIG_1(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native String btStringArray_expandNonInitializing(long jarg1, btStringArray jarg1_);
  public final static native String btStringArray_expand__SWIG_0(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native String btStringArray_expand__SWIG_1(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_push_back(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native int btStringArray_capacity(long jarg1, btStringArray jarg1_);
  public final static native void btStringArray_reserve(long jarg1, btStringArray jarg1_, int jarg2);
  public final static native long new_btStringArray_less();
  public final static native void delete_btStringArray_less(long jarg1);
  public final static native void btStringArray_swap(long jarg1, btStringArray jarg1_, int jarg2, int jarg3);
  public final static native int btStringArray_findBinarySearch(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native int btStringArray_findLinearSearch(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native void btStringArray_remove(long jarg1, btStringArray jarg1_, String jarg2);
  public final static native void btStringArray_initializeFromBuffer(long jarg1, btStringArray jarg1_, long jarg2, int jarg3, int jarg4);
  public final static native void btStringArray_copyFromArray(long jarg1, btStringArray jarg1_, long jarg2, btStringArray jarg2_);
  public final static native long new_btWorldImporter(long jarg1, btDynamicsWorld jarg1_);
  public final static native void delete_btWorldImporter(long jarg1);
  public final static native void btWorldImporter_deleteAllData(long jarg1, btWorldImporter jarg1_);
  public final static native void btWorldImporter_setVerboseMode(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getVerboseMode(long jarg1, btWorldImporter jarg1_);
  public final static native int btWorldImporter_getNumCollisionShapes(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getCollisionShapeByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumRigidBodies(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getRigidBodyByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumConstraints(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getConstraintByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumBvhs(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getBvhByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native int btWorldImporter_getNumTriangleInfoMaps(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_getTriangleInfoMapByIndex(long jarg1, btWorldImporter jarg1_, int jarg2);
  public final static native long btWorldImporter_getCollisionShapeByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native long btWorldImporter_getRigidBodyByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native long btWorldImporter_getConstraintByName(long jarg1, btWorldImporter jarg1_, String jarg2);
  public final static native String btWorldImporter_getNameForPointer__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2);
  public final static native void btWorldImporter_setDynamicsWorldInfo(long jarg1, btWorldImporter jarg1_, Vector3 jarg2, long jarg3, btContactSolverInfo jarg3_);
  public final static native long btWorldImporter_createRigidBody(long jarg1, btWorldImporter jarg1_, boolean jarg2, float jarg3, Matrix4 jarg4, long jarg5, btCollisionShape jarg5_, String jarg6);
  public final static native long btWorldImporter_createCollisionObject(long jarg1, btWorldImporter jarg1_, Matrix4 jarg2, long jarg3, btCollisionShape jarg3_, String jarg4);
  public final static native long btWorldImporter_createPlaneShape(long jarg1, btWorldImporter jarg1_, Vector3 jarg2, float jarg3);
  public final static native long btWorldImporter_createBoxShape(long jarg1, btWorldImporter jarg1_, Vector3 jarg2);
  public final static native long btWorldImporter_createSphereShape(long jarg1, btWorldImporter jarg1_, float jarg2);
  public final static native long btWorldImporter_createCapsuleShapeX(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCapsuleShapeY(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCapsuleShapeZ(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeX(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeY(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createCylinderShapeZ(long jarg1, btWorldImporter jarg1_, float jarg2, float jarg3);
  public final static native long btWorldImporter_createTriangleMeshContainer(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createBvhTriangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_, long jarg3, btOptimizedBvh jarg3_);
  public final static native long btWorldImporter_createConvexTriangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_);
  public final static native long btWorldImporter_createGimpactShape(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterface jarg2_);
  public final static native long btWorldImporter_createStridingMeshInterfaceData(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterfaceData jarg2_);
  public final static native long btWorldImporter_createConvexHullShape(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createCompoundShape(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createScaledTrangleMeshShape(long jarg1, btWorldImporter jarg1_, long jarg2, btBvhTriangleMeshShape jarg2_, Vector3 jarg3);
  public final static native long btWorldImporter_createMultiSphereShape(long jarg1, btWorldImporter jarg1_, long jarg2, btVector3 jarg2_, java.nio.FloatBuffer jarg3, int jarg4);
  public final static native long btWorldImporter_createMeshInterface(long jarg1, btWorldImporter jarg1_, long jarg2, btStridingMeshInterfaceData jarg2_);
  public final static native long btWorldImporter_createOptimizedBvh(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createTriangleInfoMap(long jarg1, btWorldImporter jarg1_);
  public final static native long btWorldImporter_createPoint2PointConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Vector3 jarg4, Vector3 jarg5);
  public final static native long btWorldImporter_createPoint2PointConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Vector3 jarg3);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5, boolean jarg6);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_2(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4 jarg3, boolean jarg4);
  public final static native long btWorldImporter_createHingeConstraint__SWIG_3(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4 jarg3);
  public final static native long btWorldImporter_createConeTwistConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5);
  public final static native long btWorldImporter_createConeTwistConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4 jarg3);
  public final static native long btWorldImporter_createGeneric6DofConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5, boolean jarg6);
  public final static native long btWorldImporter_createGeneric6DofConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4 jarg3, boolean jarg4);
  public final static native long btWorldImporter_createGeneric6DofSpringConstraint(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5, boolean jarg6);
  public final static native long btWorldImporter_createSliderConstraint__SWIG_0(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, long jarg3, btRigidBody jarg3_, Matrix4 jarg4, Matrix4 jarg5, boolean jarg6);
  public final static native long btWorldImporter_createSliderConstraint__SWIG_1(long jarg1, btWorldImporter jarg1_, long jarg2, btRigidBody jarg2_, Matrix4 jarg3, boolean jarg4);
  public final static native long new_btBulletWorldImporter__SWIG_0(long jarg1, btDynamicsWorld jarg1_);
  public final static native long new_btBulletWorldImporter__SWIG_1();
  public final static native void delete_btBulletWorldImporter(long jarg1);
  public final static native boolean btBulletWorldImporter_loadFile(long jarg1, btBulletWorldImporter jarg1_, String jarg2);
  public final static native boolean btBulletWorldImporter_loadFileFromMemory__SWIG_0(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_convertAllObjects(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_convertAllObjectsSwigExplicitbtBulletWorldImporter(long jarg1, btBulletWorldImporter jarg1_, long jarg2);
  public final static native boolean btBulletWorldImporter_loadFileFromMemory__SWIG_1(long jarg1, btBulletWorldImporter jarg1_, java.nio.ByteBuffer jarg2, int jarg3);
  public final static native void btBulletWorldImporter_director_connect(btBulletWorldImporter obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void btBulletWorldImporter_change_ownership(btBulletWorldImporter obj, long cptr, boolean take_or_release);
  public final static native long btBulletWorldImporter_SWIGUpcast(long jarg1);

  public static void SwigDirector_btBulletWorldImporter_deleteAllData(btBulletWorldImporter self) {
    self.deleteAllData();
  }
  public static void SwigDirector_btBulletWorldImporter_setDynamicsWorldInfo(btBulletWorldImporter self, Vector3 gravity, long solverInfo) {
    self.setDynamicsWorldInfo(gravity, new btContactSolverInfo(solverInfo, false));
  }
  public static long SwigDirector_btBulletWorldImporter_createRigidBody(btBulletWorldImporter self, boolean isDynamic, float mass, Matrix4 startTransform, long shape, String bodyName) {
    return btRigidBody.getCPtr(self.createRigidBody(isDynamic, mass, startTransform, (shape == 0) ? null : new btCollisionShape(shape, false), bodyName));
  }
  public static long SwigDirector_btBulletWorldImporter_createCollisionObject(btBulletWorldImporter self, Matrix4 startTransform, long shape, String bodyName) {
    return btCollisionObject.getCPtr(self.createCollisionObject(startTransform, (shape == 0) ? null : new btCollisionShape(shape, false), bodyName));
  }
  public static long SwigDirector_btBulletWorldImporter_createPlaneShape(btBulletWorldImporter self, Vector3 planeNormal, float planeConstant) {
    return btCollisionShape.getCPtr(self.createPlaneShape(planeNormal, planeConstant));
  }
  public static long SwigDirector_btBulletWorldImporter_createBoxShape(btBulletWorldImporter self, Vector3 halfExtents) {
    return btCollisionShape.getCPtr(self.createBoxShape(halfExtents));
  }
  public static long SwigDirector_btBulletWorldImporter_createSphereShape(btBulletWorldImporter self, float radius) {
    return btCollisionShape.getCPtr(self.createSphereShape(radius));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeX(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCapsuleShapeX(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeY(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCapsuleShapeY(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCapsuleShapeZ(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCapsuleShapeZ(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeX(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCylinderShapeX(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeY(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCylinderShapeY(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createCylinderShapeZ(btBulletWorldImporter self, float radius, float height) {
    return btCollisionShape.getCPtr(self.createCylinderShapeZ(radius, height));
  }
  public static long SwigDirector_btBulletWorldImporter_createTriangleMeshContainer(btBulletWorldImporter self) {
    return btTriangleIndexVertexArray.getCPtr(self.createTriangleMeshContainer());
  }
  public static long SwigDirector_btBulletWorldImporter_createBvhTriangleMeshShape(btBulletWorldImporter self, long trimesh, long bvh) {
    return btBvhTriangleMeshShape.getCPtr(self.createBvhTriangleMeshShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false), (bvh == 0) ? null : new btOptimizedBvh(bvh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createConvexTriangleMeshShape(btBulletWorldImporter self, long trimesh) {
    return btCollisionShape.getCPtr(self.createConvexTriangleMeshShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createGimpactShape(btBulletWorldImporter self, long trimesh) {
    return SWIGTYPE_p_btGImpactMeshShape.getCPtr(self.createGimpactShape((trimesh == 0) ? null : new btStridingMeshInterface(trimesh, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createStridingMeshInterfaceData(btBulletWorldImporter self, long interfaceData) {
    return btStridingMeshInterfaceData.getCPtr(self.createStridingMeshInterfaceData((interfaceData == 0) ? null : new btStridingMeshInterfaceData(interfaceData, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createConvexHullShape(btBulletWorldImporter self) {
    return btConvexHullShape.getCPtr(self.createConvexHullShape());
  }
  public static long SwigDirector_btBulletWorldImporter_createCompoundShape(btBulletWorldImporter self) {
    return btCompoundShape.getCPtr(self.createCompoundShape());
  }
  public static long SwigDirector_btBulletWorldImporter_createScaledTrangleMeshShape(btBulletWorldImporter self, long meshShape, Vector3 localScalingbtBvhTriangleMeshShape) {
    return btScaledBvhTriangleMeshShape.getCPtr(self.createScaledTrangleMeshShape((meshShape == 0) ? null : new btBvhTriangleMeshShape(meshShape, false), localScalingbtBvhTriangleMeshShape));
  }
  public static long SwigDirector_btBulletWorldImporter_createMeshInterface(btBulletWorldImporter self, long meshData) {
    return btTriangleIndexVertexArray.getCPtr(self.createMeshInterface(new btStridingMeshInterfaceData(meshData, false)));
  }
  public static long SwigDirector_btBulletWorldImporter_createOptimizedBvh(btBulletWorldImporter self) {
    return btOptimizedBvh.getCPtr(self.createOptimizedBvh());
  }
  public static long SwigDirector_btBulletWorldImporter_createTriangleInfoMap(btBulletWorldImporter self) {
    return btTriangleInfoMap.getCPtr(self.createTriangleInfoMap());
  }
  public static long SwigDirector_btBulletWorldImporter_createPoint2PointConstraint__SWIG_0(btBulletWorldImporter self, long rbA, long rbB, Vector3 pivotInA, Vector3 pivotInB) {
    return btPoint2PointConstraint.getCPtr(self.createPoint2PointConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), pivotInA, pivotInB));
  }
  public static long SwigDirector_btBulletWorldImporter_createPoint2PointConstraint__SWIG_1(btBulletWorldImporter self, long rbA, Vector3 pivotInA) {
    return btPoint2PointConstraint.getCPtr(self.createPoint2PointConstraint(new btRigidBody(rbA, false), pivotInA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_0(btBulletWorldImporter self, long rbA, long rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
    return btHingeConstraint.getCPtr(self.createHingeConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame, useReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_1(btBulletWorldImporter self, long rbA, long rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    return btHingeConstraint.getCPtr(self.createHingeConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_2(btBulletWorldImporter self, long rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
    return btHingeConstraint.getCPtr(self.createHingeConstraint(new btRigidBody(rbA, false), rbAFrame, useReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createHingeConstraint__SWIG_3(btBulletWorldImporter self, long rbA, Matrix4 rbAFrame) {
    return btHingeConstraint.getCPtr(self.createHingeConstraint(new btRigidBody(rbA, false), rbAFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeTwistConstraint__SWIG_0(btBulletWorldImporter self, long rbA, long rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
    return btConeTwistConstraint.getCPtr(self.createConeTwistConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), rbAFrame, rbBFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createConeTwistConstraint__SWIG_1(btBulletWorldImporter self, long rbA, Matrix4 rbAFrame) {
    return btConeTwistConstraint.getCPtr(self.createConeTwistConstraint(new btRigidBody(rbA, false), rbAFrame));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofConstraint__SWIG_0(btBulletWorldImporter self, long rbA, long rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    return btGeneric6DofConstraint.getCPtr(self.createGeneric6DofConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofConstraint__SWIG_1(btBulletWorldImporter self, long rbB, Matrix4 frameInB, boolean useLinearReferenceFrameB) {
    return btGeneric6DofConstraint.getCPtr(self.createGeneric6DofConstraint(new btRigidBody(rbB, false), frameInB, useLinearReferenceFrameB));
  }
  public static long SwigDirector_btBulletWorldImporter_createGeneric6DofSpringConstraint(btBulletWorldImporter self, long rbA, long rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    return btGeneric6DofSpringConstraint.getCPtr(self.createGeneric6DofSpringConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createSliderConstraint__SWIG_0(btBulletWorldImporter self, long rbA, long rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    return btSliderConstraint.getCPtr(self.createSliderConstraint(new btRigidBody(rbA, false), new btRigidBody(rbB, false), frameInA, frameInB, useLinearReferenceFrameA));
  }
  public static long SwigDirector_btBulletWorldImporter_createSliderConstraint__SWIG_1(btBulletWorldImporter self, long rbB, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    return btSliderConstraint.getCPtr(self.createSliderConstraint(new btRigidBody(rbB, false), frameInB, useLinearReferenceFrameA));
  }
  public static boolean SwigDirector_btBulletWorldImporter_convertAllObjects(btBulletWorldImporter self, long file) {
    return self.convertAllObjects((file == 0) ? null : new SWIGTYPE_p_bParse__btBulletFile(file, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}