---
title: GlobalTransform
second_title: Aspose.3D for Java API Reference
description: Global transform is similar to com.aspose.threed.Transform but its immutable while it represents the final evaluated transformation.
type: docs
weight: 67
url: /java/com.aspose.threed/globaltransform/
---

**Inheritance:**
java.lang.Object
```
public class GlobalTransform
```

Global transform is similar to com.aspose.threed.Transform but it's immutable while it represents the final evaluated transformation. Right-hand coordinate system is used while evaluating global transform
## Methods

| Method | Description |
| --- | --- |
| [getTranslation()](#getTranslation--) | Gets the translation |
| [getScale()](#getScale--) | Gets the scale |
| [getEulerAngles()](#getEulerAngles--) | Gets the rotation represented in Euler angles, measured in degree |
| [getRotation()](#getRotation--) | Gets the rotation represented in quaternion. |
| [getTransformMatrix()](#getTransformMatrix--) | Gets the transform matrix. |
### getTranslation() {#getTranslation--}
```
public Vector3 getTranslation()
```


Gets the translation

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getScale() {#getScale--}
```
public Vector3 getScale()
```


Gets the scale

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getEulerAngles() {#getEulerAngles--}
```
public Vector3 getEulerAngles()
```


Gets the rotation represented in Euler angles, measured in degree

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### getRotation() {#getRotation--}
```
public Quaternion getRotation()
```


Gets the rotation represented in quaternion.

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### getTransformMatrix() {#getTransformMatrix--}
```
public Matrix4 getTransformMatrix()
```


Gets the transform matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
