---
title: Vector2
second_title: Aspose.3D for Java API Reference
description: A vector with two components.
type: docs
weight: 196
url: /java/com.aspose.threed/vector2/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable, com.aspose.threed.Struct, java.io.Serializable
```
public final class Vector2 implements Comparable<Vector2>, Struct<Vector2>, Serializable
```

A vector with two components.
## Constructors

| Constructor | Description |
| --- | --- |
| [Vector2(double s)](#Vector2-double-) | Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct. |
| [Vector2(Vector3 s)](#Vector2-com.aspose.threed.Vector3-) | Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct. |
| [Vector2(FVector2 vec)](#Vector2-com.aspose.threed.FVector2-) | Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct. |
| [Vector2(double x, double y)](#Vector2-double-double-) | Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct. |
| [Vector2()](#Vector2--) |  |
## Fields

| Field | Description |
| --- | --- |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
## Methods

| Method | Description |
| --- | --- |
| [add(Vector2 lhs, Vector2 rhs)](#add-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Addition operator for Vector2 |
| [clone()](#clone--) |  |
| [compareTo(Vector2 other)](#compareTo-com.aspose.threed.Vector2-) | Compare current vector to another instance. |
| [copyFrom(Vector2 src)](#copyFrom-com.aspose.threed.Vector2-) |  |
| [create(Vector2 v)](#create-com.aspose.threed.Vector2-) | Explicit conversion operator to cast Vector2 to FVector2 |
| [cross(Vector2 v)](#cross-com.aspose.threed.Vector2-) | Cross product of two vectors |
| [div(Vector2 lhs, double rhs)](#div-com.aspose.threed.Vector2-double-) | Division operator for Vector2 |
| [dot(Vector2 rhs)](#dot-com.aspose.threed.Vector2-) | Gets the dot product of two vectors |
| [equals(Vector2 rhs)](#equals-com.aspose.threed.Vector2-) | Check if two vector2 equals |
| [equals(Object obj)](#equals-java.lang.Object-) | Check if two vector2 equals |
| [getClass()](#getClass--) |  |
| [getLength()](#getLength--) | Gets the length. |
| [getU()](#getU--) | Gets the U component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. |
| [getV()](#getV--) | Gets the V component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. |
| [hashCode()](#hashCode--) | Gets the hash code of Vector2 |
| [mul(Vector2 lhs, double rhs)](#mul-com.aspose.threed.Vector2-double-) | Multiply operator for Vector2 |
| [mul(double lhs, Vector2 rhs)](#mul-double-com.aspose.threed.Vector2-) | Multiply operator for Vector2 |
| [normalize()](#normalize--) | Normalizes this instance. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_eq(Vector2 lhs, Vector2 rhs)](#op-eq-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Equal operator for Vector2 |
| [op_ne(Vector2 lhs, Vector2 rhs)](#op-ne-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Not-equal operator for Vector2 |
| [setU(double value)](#setU-double-) | Sets the U component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. |
| [setV(double value)](#setV-double-) | Sets the V component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. |
| [sub(Vector2 lhs, Vector2 rhs)](#sub-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Subtraction operator for Vector2 |
| [toString()](#toString--) | Returns a java.lang.String that represents the current [Vector2](../../com.aspose.threed/vector2). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Vector2(double s) {#Vector2-double-}
```
public Vector2(double s)
```


Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | double | S. |

### Vector2(Vector3 s) {#Vector2-com.aspose.threed.Vector3-}
```
public Vector2(Vector3 s)
```


Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | [Vector3](../../com.aspose.threed/vector3) | S. |

### Vector2(FVector2 vec) {#Vector2-com.aspose.threed.FVector2-}
```
public Vector2(FVector2 vec)
```


Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [FVector2](../../com.aspose.threed/fvector2) | Vector in float. |

### Vector2(double x, double y) {#Vector2-double-double-}
```
public Vector2(double x, double y)
```


Initializes a new instance of the [Vector2](../../com.aspose.threed/vector2) struct.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | The x coordinate. |
| y | double | The y coordinate. |

### Vector2() {#Vector2--}
```
public Vector2()
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

### add(Vector2 lhs, Vector2 rhs) {#add-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static Vector2 add(Vector2 lhs, Vector2 rhs)
```


Addition operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of addition.
### clone() {#clone--}
```
public Vector2 clone()
```


Clone current instance

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### compareTo(Vector2 other) {#compareTo-com.aspose.threed.Vector2-}
```
public int compareTo(Vector2 other)
```


Compare current vector to another instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
int
### copyFrom(Vector2 src) {#copyFrom-com.aspose.threed.Vector2-}
```
public void copyFrom(Vector2 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [Vector2](../../com.aspose.threed/vector2) |  |

### create(Vector2 v) {#create-com.aspose.threed.Vector2-}
```
public static FVector2 create(Vector2 v)
```


Explicit conversion operator to cast Vector2 to FVector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2)
### cross(Vector2 v) {#cross-com.aspose.threed.Vector2-}
```
public double cross(Vector2 v)
```


Cross product of two vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
double
### div(Vector2 lhs, double rhs) {#div-com.aspose.threed.Vector2-double-}
```
public static Vector2 div(Vector2 lhs, double rhs)
```


Division operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | double | Right hand side value. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of division.
### dot(Vector2 rhs) {#dot-com.aspose.threed.Vector2-}
```
public double dot(Vector2 rhs)
```


Gets the dot product of two vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
double - The dot product of the two vectors.
### equals(Vector2 rhs) {#equals-com.aspose.threed.Vector2-}
```
public boolean equals(Vector2 rhs)
```


Check if two vector2 equals

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [Vector2](../../com.aspose.threed/vector2) | The right hand side value. |

**Returns:**
boolean - True if all components are identically equal.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Check if two vector2 equals

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to compare. |

**Returns:**
boolean - True if all components are identically equal.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLength() {#getLength--}
```
public double getLength()
```


Gets the length.

**Returns:**
double - the length.
### getU() {#getU--}
```
public double getU()
```


Gets the U component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of x component.

**Returns:**
double - the U component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of x component.
### getV() {#getV--}
```
public double getV()
```


Gets the V component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of y component.

**Returns:**
double - the V component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of y component.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets the hash code of Vector2

**Returns:**
int - The hash code of the [Vector2](../../com.aspose.threed/vector2)
### mul(Vector2 lhs, double rhs) {#mul-com.aspose.threed.Vector2-double-}
```
public static Vector2 mul(Vector2 lhs, double rhs)
```


Multiply operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | double | Right hand side value. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of multiply.
### mul(double lhs, Vector2 rhs) {#mul-double-com.aspose.threed.Vector2-}
```
public static Vector2 mul(double lhs, Vector2 rhs)
```


Multiply operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | double | Left hand side value. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of multiply.
### normalize() {#normalize--}
```
public Vector2 normalize()
```


Normalizes this instance.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - Normalized vector.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_eq(Vector2 lhs, Vector2 rhs) {#op-eq-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static boolean op_eq(Vector2 lhs, Vector2 rhs)
```


Equal operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
boolean - True if all components are identically equal.
### op_ne(Vector2 lhs, Vector2 rhs) {#op-ne-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static boolean op_ne(Vector2 lhs, Vector2 rhs)
```


Not-equal operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
boolean - True if two vectors are not equal.
### setU(double value) {#setU-double-}
```
public void setU(double value)
```


Sets the U component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of x component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setV(double value) {#setV-double-}
```
public void setV(double value)
```


Sets the V component if the [Vector2](../../com.aspose.threed/vector2) is used as a mapping coordinate. It's an alias of y component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### sub(Vector2 lhs, Vector2 rhs) {#sub-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static Vector2 sub(Vector2 lhs, Vector2 rhs)
```


Subtraction operator for Vector2

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [Vector2](../../com.aspose.threed/vector2) | Left hand side value. |
| rhs | [Vector2](../../com.aspose.threed/vector2) | Right hand side value. |

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - The result of substraction.
### toString() {#toString--}
```
public String toString()
```


Returns a java.lang.String that represents the current [Vector2](../../com.aspose.threed/vector2).

**Returns:**
java.lang.String - A java.lang.String that represents the current [Vector2](../../com.aspose.threed/vector2).
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

