---
title: Vertex
second_title: Aspose.3D for Java API Reference
description: Vertex reference used to access the raw vertex in .
type: docs
weight: 190
url: /java/com.aspose.threed/vertex/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable
```
public abstract class Vertex implements Comparable<Vertex>
```

Vertex reference, used to access the raw vertex in [TriMesh](../../com.aspose.threed/trimesh).
## Constructors

| Constructor | Description |
| --- | --- |
| [Vertex()](#Vertex--) |  |
## Methods

| Method | Description |
| --- | --- |
| [compareTo(Vertex other)](#compareTo-com.aspose.threed.Vertex-) | Compare the vertex with another vertex instance |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [readDouble(VertexField field)](#readDouble-com.aspose.threed.VertexField-) | Read the double field |
| [readFVector2(VertexField field)](#readFVector2-com.aspose.threed.VertexField-) | Read the vector2 field |
| [readFVector3(VertexField field)](#readFVector3-com.aspose.threed.VertexField-) | Read the vector3 field |
| [readFVector4(VertexField field)](#readFVector4-com.aspose.threed.VertexField-) | Read the vector4 field |
| [readFloat(VertexField field)](#readFloat-com.aspose.threed.VertexField-) | Read the float field |
| [readVector2(VertexField field)](#readVector2-com.aspose.threed.VertexField-) | Read the vector2 field |
| [readVector3(VertexField field)](#readVector3-com.aspose.threed.VertexField-) | Read the vector3 field |
| [readVector4(VertexField field)](#readVector4-com.aspose.threed.VertexField-) | Read the vector4 field |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Vertex() {#Vertex--}
```
public Vertex()
```


### compareTo(Vertex other) {#compareTo-com.aspose.threed.Vertex-}
```
public abstract int compareTo(Vertex other)
```


Compare the vertex with another vertex instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [Vertex](../../com.aspose.threed/vertex) |  |

**Returns:**
int
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

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
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### readDouble(VertexField field) {#readDouble-com.aspose.threed.VertexField-}
```
public double readDouble(VertexField field)
```


Read the double field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a float/double compatible data type |

**Returns:**
double
### readFVector2(VertexField field) {#readFVector2-com.aspose.threed.VertexField-}
```
public FVector2 readFVector2(VertexField field)
```


Read the vector2 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector2/FVector2 data type |

**Returns:**
[FVector2](../../com.aspose.threed/fvector2)
### readFVector3(VertexField field) {#readFVector3-com.aspose.threed.VertexField-}
```
public FVector3 readFVector3(VertexField field)
```


Read the vector3 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector3/FVector3 data type |

**Returns:**
[FVector3](../../com.aspose.threed/fvector3)
### readFVector4(VertexField field) {#readFVector4-com.aspose.threed.VertexField-}
```
public FVector4 readFVector4(VertexField field)
```


Read the vector4 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector4/FVector4 data type |

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
### readFloat(VertexField field) {#readFloat-com.aspose.threed.VertexField-}
```
public float readFloat(VertexField field)
```


Read the float field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a float/double compatible data type |

**Returns:**
float
### readVector2(VertexField field) {#readVector2-com.aspose.threed.VertexField-}
```
public Vector2 readVector2(VertexField field)
```


Read the vector2 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector2/FVector2 data type |

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### readVector3(VertexField field) {#readVector3-com.aspose.threed.VertexField-}
```
public Vector3 readVector3(VertexField field)
```


Read the vector3 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector3/FVector3 data type |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### readVector4(VertexField field) {#readVector4-com.aspose.threed.VertexField-}
```
public Vector4 readVector4(VertexField field)
```


Read the vector4 field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| field | [VertexField](../../com.aspose.threed/vertexfield) | The field with a Vector4/FVector4 data type |

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

