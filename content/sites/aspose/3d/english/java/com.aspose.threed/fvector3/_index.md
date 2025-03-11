---
title: FVector3
second_title: Aspose.3D for Java API Reference
description: A float vector with three components.
type: docs
weight: 58
url: /java/com.aspose.threed/fvector3/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class FVector3 implements Struct<FVector3>, Serializable
```

A float vector with three components.
## Constructors

| Constructor | Description |
| --- | --- |
| [FVector3(float x, float y, float z)](#FVector3-float-float-float-) | Initializes a new instance of the [FVector3](../../com.aspose.threed/fvector3). |
| [FVector3(Vector3 vec)](#FVector3-com.aspose.threed.Vector3-) | Initializes a new instance of the [FVector3](../../com.aspose.threed/fvector3). |
| [FVector3(Vector4 vec)](#FVector3-com.aspose.threed.Vector4-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector3()](#FVector3--) |  |
## Fields

| Field | Description |
| --- | --- |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The y component. |
## Methods

| Method | Description |
| --- | --- |
| [add(FVector3 a, FVector3 b)](#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \+ Operator overloading |
| [clone()](#clone--) |  |
| [copyFrom(FVector3 src)](#copyFrom-com.aspose.threed.FVector3-) |  |
| [create(FVector3 v)](#create-com.aspose.threed.FVector3-) | Explicit conversion operator to cast FVector3 to Vector3 |
| [cross(FVector3 rhs)](#cross-com.aspose.threed.FVector3-) | Cross product of two vectors |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOne()](#getOne--) | The unit scale vector with all components are all 1 |
| [getZero()](#getZero--) | The Zero vector. |
| [hashCode()](#hashCode--) |  |
| [mul(FVector3 a, float b)](#mul-com.aspose.threed.FVector3-float-) | \* Operator overloading |
| [negative(FVector3 a)](#negative-com.aspose.threed.FVector3-) | \- Operator overloading |
| [normalize()](#normalize--) | Normalizes this instance. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [sub(FVector3 a, FVector3 b)](#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \- Operator overloading |
| [toString()](#toString--) | Returns a string that represents the [FVector3](../../com.aspose.threed/fvector3) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FVector3(float x, float y, float z) {#FVector3-float-float-float-}
```
public FVector3(float x, float y, float z)
```


Initializes a new instance of the [FVector3](../../com.aspose.threed/fvector3).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | X component of the vector |
| y | float | Y component of the vector |
| z | float | Z component of the vector |

### FVector3(Vector3 vec) {#FVector3-com.aspose.threed.Vector3-}
```
public FVector3(Vector3 vec)
```


Initializes a new instance of the [FVector3](../../com.aspose.threed/fvector3).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) | Vector3 in double type |

### FVector3(Vector4 vec) {#FVector3-com.aspose.threed.Vector4-}
```
public FVector3(Vector4 vec)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector4](../../com.aspose.threed/vector4) | Vector4 in double type |

### FVector3() {#FVector3--}
```
public FVector3()
```


### x {#x}
```
public float x
```


The x component.

### y {#y}
```
public float y
```


The y component.

### z {#z}
```
public float z
```


The y component.

### add(FVector3 a, FVector3 b) {#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 add(FVector3 a, FVector3 b)
```


\+ Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | First vector |
| b | [FVector3](../../com.aspose.threed/fvector3) | Second vector |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### clone() {#clone--}
```
public FVector3 clone()
```


Clone current instance

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### copyFrom(FVector3 src) {#copyFrom-com.aspose.threed.FVector3-}
```
public void copyFrom(FVector3 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [FVector3](../../com.aspose.threed/fvector3) |  |

### create(FVector3 v) {#create-com.aspose.threed.FVector3-}
```
public static Vector3 create(FVector3 v)
```


Explicit conversion operator to cast FVector3 to Vector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [FVector3](../../com.aspose.threed/fvector3) | Vector3 in float type |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### cross(FVector3 rhs) {#cross-com.aspose.threed.FVector3-}
```
public FVector3 cross(FVector3 rhs)
```


Cross product of two vectors

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rhs | [FVector3](../../com.aspose.threed/fvector3) | Right hand side value. |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Cross product of two [FVector3](../../com.aspose.threed/fvector3)s.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOne() {#getOne--}
```
public static FVector3 getOne()
```


The unit scale vector with all components are all 1

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The unit scale vector with all components are all 1
### getZero() {#getZero--}
```
public static FVector3 getZero()
```


The Zero vector.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The Zero vector.
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### mul(FVector3 a, float b) {#mul-com.aspose.threed.FVector3-float-}
```
public static FVector3 mul(FVector3 a, float b)
```


\* Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | First vector |
| b | float | Second vector |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The product of two vectors
### negative(FVector3 a) {#negative-com.aspose.threed.FVector3-}
```
public static FVector3 negative(FVector3 a)
```


\- Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | Input vector |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The negative vector
### normalize() {#normalize--}
```
public FVector3 normalize()
```


Normalizes this instance.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Normalized vector.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### sub(FVector3 a, FVector3 b) {#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 sub(FVector3 a, FVector3 b)
```


\- Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) | First vector |
| b | [FVector3](../../com.aspose.threed/fvector3) | Second vector |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - The difference of two vectors
### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the [FVector3](../../com.aspose.threed/fvector3)

**Returns:**
java.lang.String - String representation of this vector.
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

