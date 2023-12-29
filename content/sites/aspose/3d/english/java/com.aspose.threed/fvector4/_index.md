---
title: FVector4
second_title: Aspose.3D for Java API Reference
description: A float vector with four components.
type: docs
weight: 59
url: /java/com.aspose.threed/fvector4/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class FVector4 implements Struct<FVector4>, Serializable
```

A float vector with four components.
## Constructors

| Constructor | Description |
| --- | --- |
| [FVector4(float x, float y, float z, float w)](#FVector4-float-float-float-float-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4(float x, float y, float z)](#FVector4-float-float-float-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4(Color color)](#FVector4-java.awt.Color-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4(Vector4 vec)](#FVector4-com.aspose.threed.Vector4-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4(Vector3 vec)](#FVector4-com.aspose.threed.Vector3-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4(Vector3 vec, float w)](#FVector4-com.aspose.threed.Vector3-float-) | Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4). |
| [FVector4()](#FVector4--) |  |
## Fields

| Field | Description |
| --- | --- |
| [w](#w) | The w component. |
| [x](#x) | The x component. |
| [y](#y) | The y component. |
| [z](#z) | The z component. |
## Methods

| Method | Description |
| --- | --- |
| [add(FVector4 lhs, FVector4 rhs)](#add-com.aspose.threed.FVector4-com.aspose.threed.FVector4-) | Operator overloading for + |
| [clone()](#clone--) |  |
| [copyFrom(FVector4 src)](#copyFrom-com.aspose.threed.FVector4-) |  |
| [create(FVector4 v)](#create-com.aspose.threed.FVector4-) | Explicit conversion operator to cast Vector4 to FVector4 |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [mul(FVector4 lhs, FVector4 rhs)](#mul-com.aspose.threed.FVector4-com.aspose.threed.FVector4-) | Operator overloading for \* |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [sub(FVector4 lhs, FVector4 rhs)](#sub-com.aspose.threed.FVector4-com.aspose.threed.FVector4-) | Operator overloading for - (minus) |
| [toString()](#toString--) | Returns a string that represents the [FVector4](../../com.aspose.threed/fvector4) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FVector4(float x, float y, float z, float w) {#FVector4-float-float-float-float-}
```
public FVector4(float x, float y, float z, float w)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float |  |
| y | float |  |
| z | float |  |
| w | float |  |

### FVector4(float x, float y, float z) {#FVector4-float-float-float-}
```
public FVector4(float x, float y, float z)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float |  |
| y | float |  |
| z | float |  |

### FVector4(Color color) {#FVector4-java.awt.Color-}
```
public FVector4(Color color)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color |  |

### FVector4(Vector4 vec) {#FVector4-com.aspose.threed.Vector4-}
```
public FVector4(Vector4 vec)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector4](../../com.aspose.threed/vector4) |  |

### FVector4(Vector3 vec) {#FVector4-com.aspose.threed.Vector3-}
```
public FVector4(Vector3 vec)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) |  |

### FVector4(Vector3 vec, float w) {#FVector4-com.aspose.threed.Vector3-float-}
```
public FVector4(Vector3 vec, float w)
```


Initializes a new instance of the [FVector4](../../com.aspose.threed/fvector4).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vec | [Vector3](../../com.aspose.threed/vector3) |  |
| w | float |  |

### FVector4() {#FVector4--}
```
public FVector4()
```


### w {#w}
```
public float w
```


The w component.

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


The z component.

### add(FVector4 lhs, FVector4 rhs) {#add-com.aspose.threed.FVector4-com.aspose.threed.FVector4-}
```
public static FVector4 add(FVector4 lhs, FVector4 rhs)
```


Operator overloading for +

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [FVector4](../../com.aspose.threed/fvector4) | The left vector |
| rhs | [FVector4](../../com.aspose.threed/fvector4) | The right vector |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4) - Result vector
### clone() {#clone--}
```
public FVector4 clone()
```




**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### copyFrom(FVector4 src) {#copyFrom-com.aspose.threed.FVector4-}
```
public void copyFrom(FVector4 src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [FVector4](../../com.aspose.threed/fvector4) |  |

### create(FVector4 v) {#create-com.aspose.threed.FVector4-}
```
public static Vector4 create(FVector4 v)
```


Explicit conversion operator to cast Vector4 to FVector4

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v | [FVector4](../../com.aspose.threed/fvector4) |  |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
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
### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
### mul(FVector4 lhs, FVector4 rhs) {#mul-com.aspose.threed.FVector4-com.aspose.threed.FVector4-}
```
public static FVector4 mul(FVector4 lhs, FVector4 rhs)
```


Operator overloading for \*

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [FVector4](../../com.aspose.threed/fvector4) | The left vector |
| rhs | [FVector4](../../com.aspose.threed/fvector4) | The right vector |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4) - Result vector
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### sub(FVector4 lhs, FVector4 rhs) {#sub-com.aspose.threed.FVector4-com.aspose.threed.FVector4-}
```
public static FVector4 sub(FVector4 lhs, FVector4 rhs)
```


Operator overloading for - (minus)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| lhs | [FVector4](../../com.aspose.threed/fvector4) | The left vector |
| rhs | [FVector4](../../com.aspose.threed/fvector4) | The right vector |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4) - Result vector
### toString() {#toString--}
```
public String toString()
```


Returns a string that represents the [FVector4](../../com.aspose.threed/fvector4)

**Returns:**
java.lang.String
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

