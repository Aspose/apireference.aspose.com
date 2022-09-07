---
title: Quaternion
second_title: Aspose.3D for Java API Reference
description: Quaternion is usually used to perform rotation in computer graphics.
type: docs
weight: 129
url: /java/com.aspose.threed/quaternion/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class Quaternion implements Struct<Quaternion>, Serializable
```

Quaternion is usually used to perform rotation in computer graphics.
## Constructors

| Constructor | Description |
| --- | --- |
| [Quaternion(double w, double x, double y, double z)](#Quaternion-double-double-double-double-) | Initializes a new instance of the com.aspose.threed.Quaternion class. |
| [Quaternion()](#Quaternion--) |  |
## Fields

| Field | Description |
| --- | --- |
| [IDENTITY](#IDENTITY) | The Identity quaternion. |
| [w](#w) | The w component. |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The z component. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Check if two quaternions equals |
| [conjugate()](#conjugate--) | Returns a conjugate quaternion of current quaternion |
| [inverse()](#inverse--) | Returns a inverse quaternion of current quaternion |
| [dot(Quaternion q)](#dot-com.aspose.threed.Quaternion-) | Dots product |
| [eulerAngles()](#eulerAngles--) | Converts quaternion to rotation represented by Euler angles All components are in radian |
| [getLength()](#getLength--) | Gets the length of the quaternion |
| [normalize()](#normalize--) | Normalize the quaternion |
| [toAngleAxis(double[] angle, Vector3 axis)](#toAngleAxis-double---com.aspose.threed.Vector3-) | Decompose the quaternion to angle and axis |
| [concat(Quaternion rhs)](#concat-com.aspose.threed.Quaternion-) | Concatenate two quaternions |
| [fromAngleAxis(double a, Vector3 axis)](#fromAngleAxis-double-com.aspose.threed.Vector3-) | Creates a quaternion around given axis and rotate in clockwise |
| [fromRotation(Vector3 orig, Vector3 dest)](#fromRotation-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Creates a quaternion that rotate from original to destination direction |
| [fromEulerAngle(double pitch, double yaw, double roll)](#fromEulerAngle-double-double-double-) | Creates quaternion from given Euler angle |
| [fromEulerAngle(Vector3 eulerAngle)](#fromEulerAngle-com.aspose.threed.Vector3-) | Creates quaternion from given Euler angle |
| [toMatrix()](#toMatrix--) | Convert the rotation presented by quaternion to transform matrix. |
| [add(Quaternion lhs, Quaternion rhs)](#add-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Operator overloading for + |
| [div(Quaternion lhs, double rhs)](#div-com.aspose.threed.Quaternion-double-) | Operator overloading for / |
| [mul(Quaternion lhs, double rhs)](#mul-com.aspose.threed.Quaternion-double-) | Operator overloading for \* |
| [mul(Quaternion lhs, Quaternion rhs)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Operator overloading for \* |
| [mul(Quaternion q, Vector3 v)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector3-) | Operator overloading for \* |
| [mul(Quaternion q, Vector4 v)](#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector4-) | Operator overloading for \* |
| [toString()](#toString--) | Gets the representation of quaternion in string |
| [mul(Vector3 v, Quaternion q)](#mul-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-) | Operator overloading for \* |
| [op_eq(Quaternion lhs, Quaternion rhs)](#op-eq-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Equal operator for quaternion |
| [op_ne(Quaternion lhs, Quaternion rhs)](#op-ne-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Not-equal operator for quaternion |
| [interpolate(float t, Quaternion from, Quaternion to)](#interpolate-float-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-) | Populates this quaternion with the interpolated value between the given quaternion arguments for a t between from and to. |
| [clone()](#clone--) |  |
| [copyFrom(Quaternion src)](#copyFrom-com.aspose.threed.Quaternion-) |  |
| [hashCode()](#hashCode--) | Gets the hash code of Quaternion |
### Quaternion(double w, double x, double y, double z) {#Quaternion-double-double-double-double-}
```
public Quaternion(double w, double x, double y, double z)
```


Initializes a new instance of the com.aspose.threed.Quaternion class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| w | double | w component of the quaternion |
| x | double | x component of the quaternion |
| y | double | y component of the quaternion |
| z | double | z component of the quaternion |

### Quaternion() {#Quaternion--}
```
public Quaternion()
```


### IDENTITY {#IDENTITY}
```
public static final Quaternion IDENTITY
```


The Identity quaternion.

### w {#w}
```
public double w
```


The w component.

### x {#x}
```
public double x
```


The x component.

### y {#y}
```
public double y
```


The y component.

### z {#z}
```
public double z
```


The z component.

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Check if two quaternions equals

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to check equality. |

**Returns:**
boolean - True if all components are identically equal.
### conjugate() {#conjugate--}
```
public Quaternion conjugate()
```


Returns a conjugate quaternion of current quaternion

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - The conjugate quaternion.
### inverse() {#inverse--}
```
public Quaternion inverse()
```


Returns a inverse quaternion of current quaternion

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Inverse quaternion.
### dot(Quaternion q) {#dot-com.aspose.threed.Quaternion-}
```
public double dot(Quaternion q)
```


Dots product

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | The quaternion |

**Returns:**
double - Dot value
### eulerAngles() {#eulerAngles--}
```
public Vector3 eulerAngles()
```


Converts quaternion to rotation represented by Euler angles All components are in radian

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### getLength() {#getLength--}
```
public double getLength()
```


Gets the length of the quaternion

**Returns:**
double
### normalize() {#normalize--}
```
public Quaternion normalize()
```


Normalize the quaternion

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Normalized quaternion.
### toAngleAxis(double[] angle, Vector3 axis) {#toAngleAxis-double---com.aspose.threed.Vector3-}
```
public void toAngleAxis(double[] angle, Vector3 axis)
```


Decompose the quaternion to angle and axis

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | double[] | The angle to rotate, in radian. |
| axis | [Vector3](../../com.aspose.threed/vector3) | The axis that rotates around. |

### concat(Quaternion rhs) {#concat-com.aspose.threed.Quaternion-}
```
public Quaternion concat(Quaternion rhs)
```


Concatenate two quaternions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) |  |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### fromAngleAxis(double a, Vector3 axis) {#fromAngleAxis-double-com.aspose.threed.Vector3-}
```
public static Quaternion fromAngleAxis(double a, Vector3 axis)
```


Creates a quaternion around given axis and rotate in clockwise

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | double | Clockwise rotation in radian |
| axis | [Vector3](../../com.aspose.threed/vector3) | Axis |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromRotation(Vector3 orig, Vector3 dest) {#fromRotation-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Quaternion fromRotation(Vector3 orig, Vector3 dest)
```


Creates a quaternion that rotate from original to destination direction

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| orig | [Vector3](../../com.aspose.threed/vector3) | Original direction |
| dest | [Vector3](../../com.aspose.threed/vector3) | Destination direction |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromEulerAngle(double pitch, double yaw, double roll) {#fromEulerAngle-double-double-double-}
```
public static Quaternion fromEulerAngle(double pitch, double yaw, double roll)
```


Creates quaternion from given Euler angle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pitch | double | Pitch in radian |
| yaw | double | Yaw in radian |
| roll | double | Roll in radian |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### fromEulerAngle(Vector3 eulerAngle) {#fromEulerAngle-com.aspose.threed.Vector3-}
```
public static Quaternion fromEulerAngle(Vector3 eulerAngle)
```


Creates quaternion from given Euler angle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| eulerAngle | [Vector3](../../com.aspose.threed/vector3) | Euler angle in radian |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Created quaternion
### toMatrix() {#toMatrix--}
```
public Matrix4 toMatrix()
```


Convert the rotation presented by quaternion to transform matrix.

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The matrix representation of current quaternion.
### add(Quaternion lhs, Quaternion rhs) {#add-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion add(Quaternion lhs, Quaternion rhs)
```


Operator overloading for +

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left quaternion |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Right quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### div(Quaternion lhs, double rhs) {#div-com.aspose.threed.Quaternion-double-}
```
public static Quaternion div(Quaternion lhs, double rhs)
```


Operator overloading for /

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left quaternion |
| rhs | double | Right quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### mul(Quaternion lhs, double rhs) {#mul-com.aspose.threed.Quaternion-double-}
```
public static Quaternion mul(Quaternion lhs, double rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left quaternion |
| rhs | double | Right quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### mul(Quaternion lhs, Quaternion rhs) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion mul(Quaternion lhs, Quaternion rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left quaternion |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Right quaternion |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - Result quaternion
### mul(Quaternion q, Vector3 v) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Quaternion q, Vector3 v)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | The rotation quaternion |
| v | [Vector3](../../com.aspose.threed/vector3) | Vector to rotate |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Rotated vector
### mul(Quaternion q, Vector4 v) {#mul-com.aspose.threed.Quaternion-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Quaternion q, Vector4 v)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) | The rotation quaternion |
| v | [Vector4](../../com.aspose.threed/vector4) | Vector to rotate |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Rotated vector
### toString() {#toString--}
```
public String toString()
```


Gets the representation of quaternion in string

**Returns:**
java.lang.String - Object string
### mul(Vector3 v, Quaternion q) {#mul-com.aspose.threed.Vector3-com.aspose.threed.Quaternion-}
```
public static Vector3 mul(Vector3 v, Quaternion q)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) | The rotation quaternion |
| q | [Quaternion](../../com.aspose.threed/quaternion) | Vector to rotate |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Rotated vector
### op_eq(Quaternion lhs, Quaternion rhs) {#op-eq-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static boolean op_eq(Quaternion lhs, Quaternion rhs)
```


Equal operator for quaternion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left hand side value. |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Right hand side value. |

**Returns:**
boolean - True if all components are identically equal.
### op_ne(Quaternion lhs, Quaternion rhs) {#op-ne-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static boolean op_ne(Quaternion lhs, Quaternion rhs)
```


Not-equal operator for quaternion

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Quaternion](../../com.aspose.threed/quaternion) | Left hand side value. |
| rhs | [Quaternion](../../com.aspose.threed/quaternion) | Right hand side value. |

**Returns:**
boolean - True if two quaternions are not equal.
### interpolate(float t, Quaternion from, Quaternion to) {#interpolate-float-com.aspose.threed.Quaternion-com.aspose.threed.Quaternion-}
```
public static Quaternion interpolate(float t, Quaternion from, Quaternion to)
```


Populates this quaternion with the interpolated value between the given quaternion arguments for a t between from and to.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| t | float | The coefficient to interpolate. |
| from | [Quaternion](../../com.aspose.threed/quaternion) | Source quaternion. |
| to | [Quaternion](../../com.aspose.threed/quaternion) | Target quaternion. |

**Returns:**
[Quaternion](../../com.aspose.threed/quaternion) - The interpolated quaternion.
### clone() {#clone--}
```
public Quaternion clone()
```




**Returns:**
[Quaternion](../../com.aspose.threed/quaternion)
### copyFrom(Quaternion src) {#copyFrom-com.aspose.threed.Quaternion-}
```
public void copyFrom(Quaternion src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Quaternion](../../com.aspose.threed/quaternion) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets the hash code of Quaternion

**Returns:**
int - The hash code of the com.aspose.threed.Quaternion
