---
title: TransformBuilder
second_title: Aspose.3D for Java API Reference
description: The com.aspose.threed.TransformBuilder is used to build transform matrix by a chain of transformations.
type: docs
weight: 171
url: /java/com.aspose.threed/transformbuilder/
---

**Inheritance:**
java.lang.Object
```
public class TransformBuilder
```

The com.aspose.threed.TransformBuilder is used to build transform matrix by a chain of transformations.
## Constructors

| Constructor | Description |
| --- | --- |
| [TransformBuilder(Matrix4 initial, ComposeOrder order)](#TransformBuilder-com.aspose.threed.Matrix4-com.aspose.threed.ComposeOrder-) | Construct a com.aspose.threed.TransformBuilder with initial transform matrix and specified compose order |
| [TransformBuilder(ComposeOrder order)](#TransformBuilder-com.aspose.threed.ComposeOrder-) | Construct a com.aspose.threed.TransformBuilder with initial identity transform matrix and specified compose order |
| [TransformBuilder()](#TransformBuilder--) | Construct a com.aspose.threed.TransformBuilder with initial identity transform matrix and specified compose order |
## Methods

| Method | Description |
| --- | --- |
| [getMatrix()](#getMatrix--) | Gets the current matrix value |
| [setMatrix(Matrix4 value)](#setMatrix-com.aspose.threed.Matrix4-) | Sets the current matrix value |
| [getComposeOrder()](#getComposeOrder--) | Gets the chain compose order. |
| [setComposeOrder(ComposeOrder value)](#setComposeOrder-com.aspose.threed.ComposeOrder-) | Sets the chain compose order. |
| [compose(Matrix4 m)](#compose-com.aspose.threed.Matrix4-) | Append or prepend the argument to internal matrix. |
| [append(Matrix4 m)](#append-com.aspose.threed.Matrix4-) | Append the new transform matrix to the transform chain. |
| [prepend(Matrix4 m)](#prepend-com.aspose.threed.Matrix4-) | Prepend the new transform matrix to the transform chain. |
| [rearrange(Axis newX, Axis newY, Axis newZ)](#rearrange-com.aspose.threed.Axis-com.aspose.threed.Axis-com.aspose.threed.Axis-) | Rearrange the layout of the axis. |
| [scale(double s)](#scale-double-) | Chain a scaling transform matrix with a component scaled by s |
| [scale(double x, double y, double z)](#scale-double-double-double-) | Chain a scaling transform matrix |
| [scale(Vector3 s)](#scale-com.aspose.threed.Vector3-) | Chain a scale transform |
| [rotateDegree(double angle, Vector3 axis)](#rotateDegree-double-com.aspose.threed.Vector3-) | Chain a rotation transform in degree |
| [rotateRadian(double angle, Vector3 axis)](#rotateRadian-double-com.aspose.threed.Vector3-) | Chain a rotation transform in radian |
| [rotate(Quaternion q)](#rotate-com.aspose.threed.Quaternion-) | Chain a rotation by a quaternion |
| [rotateEulerDegree(double degX, double degY, double degZ)](#rotateEulerDegree-double-double-double-) | Chain a rotation by Euler angles in degree |
| [rotateEulerRadian(double x, double y, double z)](#rotateEulerRadian-double-double-double-) | Chain a rotation by Euler angles in radian |
| [rotateEulerRadian(Vector3 r)](#rotateEulerRadian-com.aspose.threed.Vector3-) | Chain a rotation by Euler angles in radian |
| [translate(double tx, double ty, double tz)](#translate-double-double-double-) | Chain a translation transform |
| [translate(Vector3 v)](#translate-com.aspose.threed.Vector3-) | Chain a translation transform |
| [reset()](#reset--) | Reset the transform to identity matrix |
| [rotateDegree(Vector3 rot, RotationOrder order)](#rotateDegree-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-) | Append rotation with specified order |
| [rotateRadian(Vector3 rot, RotationOrder order)](#rotateRadian-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-) | Append rotation with specified order |
### TransformBuilder(Matrix4 initial, ComposeOrder order) {#TransformBuilder-com.aspose.threed.Matrix4-com.aspose.threed.ComposeOrder-}
```
public TransformBuilder(Matrix4 initial, ComposeOrder order)
```


Construct a com.aspose.threed.TransformBuilder with initial transform matrix and specified compose order

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| initial | [Matrix4](../../com.aspose.threed/matrix4) |  |
| order | [ComposeOrder](../../com.aspose.threed/composeorder) |  |

### TransformBuilder(ComposeOrder order) {#TransformBuilder-com.aspose.threed.ComposeOrder-}
```
public TransformBuilder(ComposeOrder order)
```


Construct a com.aspose.threed.TransformBuilder with initial identity transform matrix and specified compose order

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| order | [ComposeOrder](../../com.aspose.threed/composeorder) |  |

### TransformBuilder() {#TransformBuilder--}
```
public TransformBuilder()
```


Construct a com.aspose.threed.TransformBuilder with initial identity transform matrix and specified compose order

### getMatrix() {#getMatrix--}
```
public Matrix4 getMatrix()
```


Gets the current matrix value

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4)
### setMatrix(Matrix4 value) {#setMatrix-com.aspose.threed.Matrix4-}
```
public void setMatrix(Matrix4 value)
```


Sets the current matrix value

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | New value |

### getComposeOrder() {#getComposeOrder--}
```
public ComposeOrder getComposeOrder()
```


Gets the chain compose order.

**Returns:**
[ComposeOrder](../../com.aspose.threed/composeorder)
### setComposeOrder(ComposeOrder value) {#setComposeOrder-com.aspose.threed.ComposeOrder-}
```
public void setComposeOrder(ComposeOrder value)
```


Sets the chain compose order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ComposeOrder](../../com.aspose.threed/composeorder) | New value |

### compose(Matrix4 m) {#compose-com.aspose.threed.Matrix4-}
```
public void compose(Matrix4 m)
```


Append or prepend the argument to internal matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

### append(Matrix4 m) {#append-com.aspose.threed.Matrix4-}
```
public TransformBuilder append(Matrix4 m)
```


Append the new transform matrix to the transform chain.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### prepend(Matrix4 m) {#prepend-com.aspose.threed.Matrix4-}
```
public TransformBuilder prepend(Matrix4 m)
```


Prepend the new transform matrix to the transform chain.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rearrange(Axis newX, Axis newY, Axis newZ) {#rearrange-com.aspose.threed.Axis-com.aspose.threed.Axis-com.aspose.threed.Axis-}
```
public TransformBuilder rearrange(Axis newX, Axis newY, Axis newZ)
```


Rearrange the layout of the axis.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newX | [Axis](../../com.aspose.threed/axis) | The new x component source |
| newY | [Axis](../../com.aspose.threed/axis) | The new y component source |
| newZ | [Axis](../../com.aspose.threed/axis) | The new z component source |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(double s) {#scale-double-}
```
public TransformBuilder scale(double s)
```


Chain a scaling transform matrix with a component scaled by s

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(double x, double y, double z) {#scale-double-double-double-}
```
public TransformBuilder scale(double x, double y, double z)
```


Chain a scaling transform matrix

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(Vector3 s) {#scale-com.aspose.threed.Vector3-}
```
public TransformBuilder scale(Vector3 s)
```


Chain a scale transform

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateDegree(double angle, Vector3 axis) {#rotateDegree-double-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateDegree(double angle, Vector3 axis)
```


Chain a rotation transform in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | double | The angle to rotate in degree |
| axis | [Vector3](../../com.aspose.threed/vector3) | The axis to rotate |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateRadian(double angle, Vector3 axis) {#rotateRadian-double-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateRadian(double angle, Vector3 axis)
```


Chain a rotation transform in radian

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | double | The angle to rotate in radian |
| axis | [Vector3](../../com.aspose.threed/vector3) | The axis to rotate |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotate(Quaternion q) {#rotate-com.aspose.threed.Quaternion-}
```
public TransformBuilder rotate(Quaternion q)
```


Chain a rotation by a quaternion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerDegree(double degX, double degY, double degZ) {#rotateEulerDegree-double-double-double-}
```
public TransformBuilder rotateEulerDegree(double degX, double degY, double degZ)
```


Chain a rotation by Euler angles in degree

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| degX | double |  |
| degY | double |  |
| degZ | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerRadian(double x, double y, double z) {#rotateEulerRadian-double-double-double-}
```
public TransformBuilder rotateEulerRadian(double x, double y, double z)
```


Chain a rotation by Euler angles in radian

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerRadian(Vector3 r) {#rotateEulerRadian-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateEulerRadian(Vector3 r)
```


Chain a rotation by Euler angles in radian

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### translate(double tx, double ty, double tz) {#translate-double-double-double-}
```
public TransformBuilder translate(double tx, double ty, double tz)
```


Chain a translation transform

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| tx | double |  |
| ty | double |  |
| tz | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### translate(Vector3 v) {#translate-com.aspose.threed.Vector3-}
```
public TransformBuilder translate(Vector3 v)
```


Chain a translation transform

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### reset() {#reset--}
```
public void reset()
```


Reset the transform to identity matrix

### rotateDegree(Vector3 rot, RotationOrder order) {#rotateDegree-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-}
```
public void rotateDegree(Vector3 rot, RotationOrder order)
```


Append rotation with specified order

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rot | [Vector3](../../com.aspose.threed/vector3) | Rotation in degrees |
| order | [RotationOrder](../../com.aspose.threed/rotationorder) |  |

### rotateRadian(Vector3 rot, RotationOrder order) {#rotateRadian-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-}
```
public void rotateRadian(Vector3 rot, RotationOrder order)
```


Append rotation with specified order

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rot | [Vector3](../../com.aspose.threed/vector3) | Rotation in radian |
| order | [RotationOrder](../../com.aspose.threed/rotationorder) |  |

