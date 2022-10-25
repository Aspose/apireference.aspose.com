---
title: FVector3
second_title: Aspose.3D for Java API Reference
description: A float vector with three components.
type: docs
weight: 57
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
| [FVector3(float x, float y, float z)](#FVector3-float-float-float-) | Initializes a new instance of the com.aspose.threed.FVector3. |
| [FVector3(Vector3 vec)](#FVector3-com.aspose.threed.Vector3-) | Initializes a new instance of the com.aspose.threed.FVector3. |
| [FVector3(Vector4 vec)](#FVector3-com.aspose.threed.Vector4-) | Initializes a new instance of the com.aspose.threed.FVector4. |
| [FVector3()](#FVector3--) |  |
## Fields

| Field | Description |
| --- | --- |
| [ZERO](#ZERO) | The Zero vector. |
| [UNIT_SCALE](#UNIT-SCALE) | The unit scale vector with all components are all 1 |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The y component. |
## Methods

| Method | Description |
| --- | --- |
| [create(FVector3 v)](#create-com.aspose.threed.FVector3-) | Explicit conversion operator to cast FVector3 to Vector3 |
| [toString()](#toString--) | Returns a string that represents the com.aspose.threed.FVector3 |
| [normalize()](#normalize--) | Normalizes this instance. |
| [cross(FVector3 rhs)](#cross-com.aspose.threed.FVector3-) | Cross product of two vectors |
| [add(FVector3 a, FVector3 b)](#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \+ Operator overloading |
| [negative(FVector3 a)](#negative-com.aspose.threed.FVector3-) | \- Operator overloading |
| [sub(FVector3 a, FVector3 b)](#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-) | \- Operator overloading |
| [mul(FVector3 a, float b)](#mul-com.aspose.threed.FVector3-float-) | \* Operator overloading |
| [clone()](#clone--) |  |
| [copyFrom(FVector3 src)](#copyFrom-com.aspose.threed.FVector3-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### FVector3(float x, float y, float z) {#FVector3-float-float-float-}
```
public FVector3(float x, float y, float z)
```


Initializes a new instance of the com.aspose.threed.FVector3.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float |  |
| y | float |  |
| z | float |  |

### FVector3(Vector3 vec) {#FVector3-com.aspose.threed.Vector3-}
```
public FVector3(Vector3 vec)
```


Initializes a new instance of the com.aspose.threed.FVector3.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) |  |

### FVector3(Vector4 vec) {#FVector3-com.aspose.threed.Vector4-}
```
public FVector3(Vector4 vec)
```


Initializes a new instance of the com.aspose.threed.FVector4.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector4](../../com.aspose.threed/vector4) |  |

### FVector3() {#FVector3--}
```
public FVector3()
```


### ZERO {#ZERO}
```
public static final FVector3 ZERO
```


The Zero vector.

### UNIT_SCALE {#UNIT-SCALE}
```
public static final FVector3 UNIT_SCALE
```


The unit scale vector with all components are all 1

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

### create(FVector3 v) {#create-com.aspose.threed.FVector3-}
```
public static Vector3 create(FVector3 v)
```


Explicit conversion operator to cast FVector3 to Vector3

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [FVector3](../../com.aspose.threed/fvector3) |  |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the com.aspose.threed.FVector3

**Returns:**
java.lang.String
### normalize() {#normalize--}
```
public FVector3 normalize()
```


Normalizes this instance.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Normalized vector.
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
[FVector3](../../com.aspose.threed/fvector3) - Cross product of two com.aspose.threed.FVector3s.
### add(FVector3 a, FVector3 b) {#add-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 add(FVector3 a, FVector3 b)
```


\+ Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) |  |
| b | [FVector3](../../com.aspose.threed/fvector3) |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### negative(FVector3 a) {#negative-com.aspose.threed.FVector3-}
```
public static FVector3 negative(FVector3 a)
```


\- Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### sub(FVector3 a, FVector3 b) {#sub-com.aspose.threed.FVector3-com.aspose.threed.FVector3-}
```
public static FVector3 sub(FVector3 a, FVector3 b)
```


\- Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) |  |
| b | [FVector3](../../com.aspose.threed/fvector3) |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### mul(FVector3 a, float b) {#mul-com.aspose.threed.FVector3-float-}
```
public static FVector3 mul(FVector3 a, float b)
```


\* Operator overloading

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [FVector3](../../com.aspose.threed/fvector3) |  |
| b | float |  |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### clone() {#clone--}
```
public FVector3 clone()
```




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

### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
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
