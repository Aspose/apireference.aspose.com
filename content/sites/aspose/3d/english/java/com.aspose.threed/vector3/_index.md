---
title: Vector3
second_title: Aspose.3D for Java API Reference
description: A vector with three components.
type: docs
weight: 182
url: /java/com.aspose.threed/vector3/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.threed.Struct, java.io.Serializable
```
public final class Vector3 implements Comparable<Vector3>, Struct<Vector3>, Serializable
```

A vector with three components.
## Constructors

| Constructor | Description |
| --- | --- |
| [Vector3(double x, double y, double z)](#Vector3-double-double-double-) | Initializes a new instance of the com.aspose.threed.Vector3 struct. |
| [Vector3(FVector3 vec)](#Vector3-com.aspose.threed.FVector3-) | Initializes a new instance of the com.aspose.threed.Vector3 struct. |
| [Vector3(Color color)](#Vector3-java.awt.Color-) | Initializes a new instance of the com.aspose.threed.Vector3 struct. |
| [Vector3(double v)](#Vector3-double-) | Initializes a new instance of the com.aspose.threed.Vector3 struct. |
| [Vector3(Vector4 vec4)](#Vector3-com.aspose.threed.Vector4-) | Initializes a new instance of the com.aspose.threed.Vector3 struct. |
| [Vector3()](#Vector3--) |  |
## Fields

| Field | Description |
| --- | --- |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The z component. |
| [ORIGIN](#ORIGIN) | Gets the origin position. |
| [UNIT_SCALE](#UNIT-SCALE) | Gets the unit scale vector. |
| [X_AXIS](#X-AXIS) | Gets the X axis. |
| [Y_AXIS](#Y-AXIS) | Gets the Y axis. |
| [Z_AXIS](#Z-AXIS) | Gets the Z axis. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Check if two vector3 equals |
| [create(Vector3 v)](#create-com.aspose.threed.Vector3-) | Explicit conversion operator to cast Vector3 to FVector3 |
| [dot(Vector3 rhs)](#dot-com.aspose.threed.Vector3-) | Gets the dot product of two vectors |
| [normalize()](#normalize--) | Normalizes this instance. |
| [getLength2()](#getLength2--) | Gets the square of the length. |
| [getLength()](#getLength--) | Gets the length of this vector. |
| [sin()](#sin--) | Calculates sine on each component |
| [cos()](#cos--) | Calculates cosine on each component |
| [cross(Vector3 rhs)](#cross-com.aspose.threed.Vector3-) | Cross product of two vectors |
| [negative(Vector3 v)](#negative-com.aspose.threed.Vector3-) | Operator overloading for - |
| [sub(Vector3 lhs, Vector3 rhs)](#sub-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operator overloading for - (minus) |
| [add(Vector3 lhs, Vector3 rhs)](#add-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operator overloading for + |
| [mul(Vector3 lhs, Vector3 rhs)](#mul-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Operator overloading for \* |
| [mul(double lhs, Vector3 rhs)](#mul-double-com.aspose.threed.Vector3-) | Operator overloading for \* |
| [mul(Vector3 lhs, double rhs)](#mul-com.aspose.threed.Vector3-double-) | Operator overloading for \* |
| [div(Vector3 lhs, double rhs)](#div-com.aspose.threed.Vector3-double-) | Operator overloading for / |
| [op_eq(Vector3 lhs, Vector3 rhs)](#op-eq-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Equal operator for Vector3 |
| [op_ne(Vector3 lhs, Vector3 rhs)](#op-ne-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Not-equal operator for Vector3 |
| [set(double newX, double newY, double newZ)](#set-double-double-double-) | Sets the x/y/z component in one call. |
| [toString()](#toString--) | Returns a java.lang.String that represents the current com.aspose.threed.Vector3. |
| [angleBetween(Vector3 dir, Vector3 up)](#angleBetween-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Calculate the inner angle between two direction Two direction can be non-normalized vectors |
| [angleBetween(Vector3 dir)](#angleBetween-com.aspose.threed.Vector3-) | Calculate the inner angle between two direction Two direction can be non-normalized vectors |
| [compareTo(Vector3 other)](#compareTo-com.aspose.threed.Vector3-) | Compare current vector to another instance. |
| [clone()](#clone--) |  |
| [copyFrom(Vector3 src)](#copyFrom-com.aspose.threed.Vector3-) |  |
| [hashCode()](#hashCode--) | Gets the hash code of Vector3 |
### Vector3(double x, double y, double z) {#Vector3-double-double-double-}
```
public Vector3(double x, double y, double z)
```


Initializes a new instance of the com.aspose.threed.Vector3 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x coordinate. |
| y | double | The y coordinate. |
| z | double | The z coordinate. |

### Vector3(FVector3 vec) {#Vector3-com.aspose.threed.FVector3-}
```
public Vector3(FVector3 vec)
```


Initializes a new instance of the com.aspose.threed.Vector3 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [FVector3](../../com.aspose.threed/fvector3) | The x coordinate. |

### Vector3(Color color) {#Vector3-java.awt.Color-}
```
public Vector3(Color color)
```


Initializes a new instance of the com.aspose.threed.Vector3 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | Color. |

### Vector3(double v) {#Vector3-double-}
```
public Vector3(double v)
```


Initializes a new instance of the com.aspose.threed.Vector3 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | double | V. |

### Vector3(Vector4 vec4) {#Vector3-com.aspose.threed.Vector4-}
```
public Vector3(Vector4 vec4)
```


Initializes a new instance of the com.aspose.threed.Vector3 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec4 | [Vector4](../../com.aspose.threed/vector4) | Vec4. |

### Vector3() {#Vector3--}
```
public Vector3()
```


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

### ORIGIN {#ORIGIN}
```
public static final Vector3 ORIGIN
```


Gets the origin position.

### UNIT_SCALE {#UNIT-SCALE}
```
public static final Vector3 UNIT_SCALE
```


Gets the unit scale vector.

### X_AXIS {#X-AXIS}
```
public static final Vector3 X_AXIS
```


Gets the X axis.

### Y_AXIS {#Y-AXIS}
```
public static final Vector3 Y_AXIS
```


Gets the Y axis.

### Z_AXIS {#Z-AXIS}
```
public static final Vector3 Z_AXIS
```


Gets the Z axis.

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Check if two vector3 equals

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to check equality. |

**Returns:**
boolean - True if all components are identically equal.
### create(Vector3 v) {#create-com.aspose.threed.Vector3-}
```
public static FVector3 create(Vector3 v)
```


Explicit conversion operator to cast Vector3 to FVector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### dot(Vector3 rhs) {#dot-com.aspose.threed.Vector3-}
```
public double dot(Vector3 rhs)
```


Gets the dot product of two vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Right hand side value. |

**Returns:**
double - The dot product of the two vectors.
### normalize() {#normalize--}
```
public Vector3 normalize()
```


Normalizes this instance.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Normalized vector.
### getLength2() {#getLength2--}
```
public double getLength2()
```


Gets the square of the length.

**Returns:**
double
### getLength() {#getLength--}
```
public double getLength()
```


Gets the length of this vector.

**Returns:**
double
### sin() {#sin--}
```
public Vector3 sin()
```


Calculates sine on each component

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Calculated com.aspose.threed.Vector3.
### cos() {#cos--}
```
public Vector3 cos()
```


Calculates cosine on each component

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Calculated com.aspose.threed.Vector3.
### cross(Vector3 rhs) {#cross-com.aspose.threed.Vector3-}
```
public Vector3 cross(Vector3 rhs)
```


Cross product of two vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Right hand side value. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Cross product of two com.aspose.threed.Vector3s.
### negative(Vector3 v) {#negative-com.aspose.threed.Vector3-}
```
public static Vector3 negative(Vector3 v)
```


Operator overloading for -

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) | The origin vector |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### sub(Vector3 lhs, Vector3 rhs) {#sub-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 sub(Vector3 lhs, Vector3 rhs)
```


Operator overloading for - (minus)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | The left vector |
| rhs | [Vector3](../../com.aspose.threed/vector3) | The right vector |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### add(Vector3 lhs, Vector3 rhs) {#add-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 add(Vector3 lhs, Vector3 rhs)
```


Operator overloading for +

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | The left vector |
| rhs | [Vector3](../../com.aspose.threed/vector3) | The right vector |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### mul(Vector3 lhs, Vector3 rhs) {#mul-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static Vector3 mul(Vector3 lhs, Vector3 rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | The left vector |
| rhs | [Vector3](../../com.aspose.threed/vector3) | The right vector |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### mul(double lhs, Vector3 rhs) {#mul-double-com.aspose.threed.Vector3-}
```
public static Vector3 mul(double lhs, Vector3 rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | double | The left scalar |
| rhs | [Vector3](../../com.aspose.threed/vector3) | The right vector |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### mul(Vector3 lhs, double rhs) {#mul-com.aspose.threed.Vector3-double-}
```
public static Vector3 mul(Vector3 lhs, double rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | The left vector |
| rhs | double | The right double value |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### div(Vector3 lhs, double rhs) {#div-com.aspose.threed.Vector3-double-}
```
public static Vector3 div(Vector3 lhs, double rhs)
```


Operator overloading for /

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | The left vector |
| rhs | double | The right double value |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - Result vector
### op_eq(Vector3 lhs, Vector3 rhs) {#op-eq-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static boolean op_eq(Vector3 lhs, Vector3 rhs)
```


Equal operator for Vector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Left hand side value. |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Right hand side value. |

**Returns:**
boolean - True if all components are identically equal.
### op_ne(Vector3 lhs, Vector3 rhs) {#op-ne-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public static boolean op_ne(Vector3 lhs, Vector3 rhs)
```


Not-equal operator for Vector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector3](../../com.aspose.threed/vector3) | Left hand side value. |
| rhs | [Vector3](../../com.aspose.threed/vector3) | Right hand side value. |

**Returns:**
boolean - True if two vectors are not equal.
### set(double newX, double newY, double newZ) {#set-double-double-double-}
```
public void set(double newX, double newY, double newZ)
```


Sets the x/y/z component in one call.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newX | double | The x component. |
| newY | double | The y component. |
| newZ | double | The z component. |

### toString() {#toString--}
```
public String toString()
```


Returns a java.lang.String that represents the current com.aspose.threed.Vector3.

**Returns:**
java.lang.String - A java.lang.String that represents the current com.aspose.threed.Vector3.
### angleBetween(Vector3 dir, Vector3 up) {#angleBetween-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public double angleBetween(Vector3 dir, Vector3 up)
```


Calculate the inner angle between two direction Two direction can be non-normalized vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dir | [Vector3](../../com.aspose.threed/vector3) | The direction vector to compare with |
| up | [Vector3](../../com.aspose.threed/vector3) | The up vector of the two direction's shared plane |

**Returns:**
double - inner angle in radian
### angleBetween(Vector3 dir) {#angleBetween-com.aspose.threed.Vector3-}
```
public double angleBetween(Vector3 dir)
```


Calculate the inner angle between two direction Two direction can be non-normalized vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dir | [Vector3](../../com.aspose.threed/vector3) | The direction vector to compare with |

**Returns:**
double - inner angle in radian
### compareTo(Vector3 other) {#compareTo-com.aspose.threed.Vector3-}
```
public int compareTo(Vector3 other)
```


Compare current vector to another instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
int
### clone() {#clone--}
```
public Vector3 clone()
```




**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### copyFrom(Vector3 src) {#copyFrom-com.aspose.threed.Vector3-}
```
public void copyFrom(Vector3 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Vector3](../../com.aspose.threed/vector3) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets the hash code of Vector3

**Returns:**
int - The hash code of the com.aspose.threed.Vector3
