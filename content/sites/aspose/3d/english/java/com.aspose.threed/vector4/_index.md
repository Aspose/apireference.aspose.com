---
title: Vector4
second_title: Aspose.3D for Java API Reference
description: A vector with four components.
type: docs
weight: 183
url: /java/com.aspose.threed/vector4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class Vector4 implements Comparable<Vector4>, Struct<Vector4>, Serializable
```

A vector with four components.
## Constructors

| Constructor | Description |
| --- | --- |
| [Vector4(Color color)](#Vector4-java.awt.Color-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4(Vector3 vec, double w)](#Vector4-com.aspose.threed.Vector3-double-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4(Vector3 vec)](#Vector4-com.aspose.threed.Vector3-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4(FVector4 vec)](#Vector4-com.aspose.threed.FVector4-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4(double x, double y, double z)](#Vector4-double-double-double-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4(double x, double y, double z, double w)](#Vector4-double-double-double-double-) | Initializes a new instance of the com.aspose.threed.Vector4 struct. |
| [Vector4()](#Vector4--) |  |
## Fields

| Field | Description |
| --- | --- |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The z component. |
| [w](#w) | The w component. |
## Methods

| Method | Description |
| --- | --- |
| [add(Vector4 lhs, Vector4 rhs)](#add-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operator overloading for + |
| [sub(Vector4 lhs, Vector4 rhs)](#sub-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operator overloading for - (minus) |
| [mul(Vector4 lhs, Vector4 rhs)](#mul-com.aspose.threed.Vector4-com.aspose.threed.Vector4-) | Operator overloading for \* |
| [mul(Vector4 lhs, double rhs)](#mul-com.aspose.threed.Vector4-double-) | Operator overloading for \* |
| [create(Vector4 v)](#create-com.aspose.threed.Vector4-) | Explicit conversion operator to cast Vector4 to FVector4 |
| [set(double newX, double newY, double newZ)](#set-double-double-double-) | Sets vector's xyz components at a time, w will be set to 1 |
| [equals(Object obj)](#equals-java.lang.Object-) | Check if two vectors are equal |
| [set(double newX, double newY, double newZ, double newW)](#set-double-double-double-double-) | Sets vector's all components at a time |
| [toString()](#toString--) | Returns a java.lang.String that represents the current com.aspose.threed.Vector4. |
| [compareTo(Vector4 other)](#compareTo-com.aspose.threed.Vector4-) | Compare current vector to another instance. |
| [clone()](#clone--) |  |
| [copyFrom(Vector4 src)](#copyFrom-com.aspose.threed.Vector4-) |  |
| [hashCode()](#hashCode--) | Gets the hash code of this vector |
### Vector4(Color color) {#Vector4-java.awt.Color-}
```
public Vector4(Color color)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | Color. |

### Vector4(Vector3 vec, double w) {#Vector4-com.aspose.threed.Vector3-double-}
```
public Vector4(Vector3 vec, double w)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vec. |
| w | double | The width. |

### Vector4(Vector3 vec) {#Vector4-com.aspose.threed.Vector3-}
```
public Vector4(Vector3 vec)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vec. |

### Vector4(FVector4 vec) {#Vector4-com.aspose.threed.FVector4-}
```
public Vector4(FVector4 vec)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [FVector4](../../com.aspose.threed/fvector4) | Vec. |

### Vector4(double x, double y, double z) {#Vector4-double-double-double-}
```
public Vector4(double x, double y, double z)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x coordinate. |
| y | double | The y coordinate. |
| z | double | The z coordinate. |

### Vector4(double x, double y, double z, double w) {#Vector4-double-double-double-double-}
```
public Vector4(double x, double y, double z, double w)
```


Initializes a new instance of the com.aspose.threed.Vector4 struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x coordinate. |
| y | double | The y coordinate. |
| z | double | The z coordinate. |
| w | double | The width. |

### Vector4() {#Vector4--}
```
public Vector4()
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

### w {#w}
```
public double w
```


The w component.

### add(Vector4 lhs, Vector4 rhs) {#add-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 add(Vector4 lhs, Vector4 rhs)
```


Operator overloading for +

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | The left vector |
| rhs | [Vector4](../../com.aspose.threed/vector4) | The right vector |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### sub(Vector4 lhs, Vector4 rhs) {#sub-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 sub(Vector4 lhs, Vector4 rhs)
```


Operator overloading for - (minus)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | The left vector |
| rhs | [Vector4](../../com.aspose.threed/vector4) | The right vector |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### mul(Vector4 lhs, Vector4 rhs) {#mul-com.aspose.threed.Vector4-com.aspose.threed.Vector4-}
```
public static Vector4 mul(Vector4 lhs, Vector4 rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | The left vector |
| rhs | [Vector4](../../com.aspose.threed/vector4) | The right vector |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### mul(Vector4 lhs, double rhs) {#mul-com.aspose.threed.Vector4-double-}
```
public static Vector4 mul(Vector4 lhs, double rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector4](../../com.aspose.threed/vector4) | The left vector |
| rhs | double | The right double value |

**Returns:**
[Vector4](../../com.aspose.threed/vector4) - Result vector
### create(Vector4 v) {#create-com.aspose.threed.Vector4-}
```
public static FVector4 create(Vector4 v)
```


Explicit conversion operator to cast Vector4 to FVector4

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector4](../../com.aspose.threed/vector4) |  |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### set(double newX, double newY, double newZ) {#set-double-double-double-}
```
public void set(double newX, double newY, double newZ)
```


Sets vector's xyz components at a time, w will be set to 1

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newX | double | New X component. |
| newY | double | New Y component. |
| newZ | double | New Z component. |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Check if two vectors are equal

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### set(double newX, double newY, double newZ, double newW) {#set-double-double-double-double-}
```
public void set(double newX, double newY, double newZ, double newW)
```


Sets vector's all components at a time

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| newX | double | New X component. |
| newY | double | New Y component. |
| newZ | double | New Z component. |
| newW | double | New W component. |

### toString() {#toString--}
```
public String toString()
```


Returns a java.lang.String that represents the current com.aspose.threed.Vector4.

**Returns:**
java.lang.String - A java.lang.String that represents the current com.aspose.threed.Vector4.
### compareTo(Vector4 other) {#compareTo-com.aspose.threed.Vector4-}
```
public int compareTo(Vector4 other)
```


Compare current vector to another instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Vector4](../../com.aspose.threed/vector4) |  |

**Returns:**
int
### clone() {#clone--}
```
public Vector4 clone()
```




**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### copyFrom(Vector4 src) {#copyFrom-com.aspose.threed.Vector4-}
```
public void copyFrom(Vector4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Vector4](../../com.aspose.threed/vector4) |  |

### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets the hash code of this vector

**Returns:**
int
