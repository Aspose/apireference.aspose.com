---
title: VertexDeclaration
second_title: Aspose.3D for Java API Reference
description: The declaration of a custom defined vertexs structure
type: docs
weight: 192
url: /java/com.aspose.threed/vertexdeclaration/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable, java.lang.Comparable
```
public final class VertexDeclaration implements Iterable<VertexField>, Comparable<VertexDeclaration>
```

The declaration of a custom defined vertex's structure
## Constructors

| Constructor | Description |
| --- | --- |
| [VertexDeclaration()](#VertexDeclaration--) |  |
## Methods

| Method | Description |
| --- | --- |
| [addField(int dataType, VertexFieldSemantic semantic)](#addField-int-com.aspose.threed.VertexFieldSemantic-) | Add a new vertex field |
| [addField(int dataType, VertexFieldSemantic semantic, int index)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-) | Add a new vertex field |
| [addField(int dataType, VertexFieldSemantic semantic, int index, String alias)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-java.lang.String-) | Add a new vertex field |
| [clear()](#clear--) | Clear all fields. |
| [compareTo(VertexDeclaration other)](#compareTo-com.aspose.threed.VertexDeclaration-) | Compares this instance to a specified object and returns an indication of their relative values. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether this instance and a specified object, which must also be a [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) object, have the same value. |
| [fromGeometry(Geometry geometry, boolean useFloat)](#fromGeometry-com.aspose.threed.Geometry-boolean-) | Create a [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) based on a [Geometry](../../com.aspose.threed/geometry)'s layout. |
| [get(int index)](#get-int-) | Gets the [VertexField](../../com.aspose.threed/vertexfield) by index |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Gets the count of all fields defined in this [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |
| [getSealed()](#getSealed--) | A [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) will be sealed when its been used by [TriMesh](../../com.aspose.threed/trimesh), no more modifications is allowed. |
| [getSize()](#getSize--) | The size in byte of the vertex structure. |
| [hashCode()](#hashCode--) | Returns the hash code for this string. |
| [iterator()](#iterator--) | Gets an enumerator to walk through all vertex fields in this instance. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | String representation of [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### VertexDeclaration() {#VertexDeclaration--}
```
public VertexDeclaration()
```


### addField(int dataType, VertexFieldSemantic semantic) {#addField-int-com.aspose.threed.VertexFieldSemantic-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic)
```


Add a new vertex field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataType | int | The data type of the vertex field |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | How will this field used for |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### addField(int dataType, VertexFieldSemantic semantic, int index) {#addField-int-com.aspose.threed.VertexFieldSemantic-int-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic, int index)
```


Add a new vertex field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataType | int | The data type of the vertex field |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | How will this field used for |
| index | int | The index for same field semantic, -1 for auto-generation |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### addField(int dataType, VertexFieldSemantic semantic, int index, String alias) {#addField-int-com.aspose.threed.VertexFieldSemantic-int-java.lang.String-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic, int index, String alias)
```


Add a new vertex field

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataType | int | The data type of the vertex field |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | How will this field used for |
| index | int | The index for same field semantic, -1 for auto-generation |
| alias | java.lang.String | The alias name of the field |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### clear() {#clear--}
```
public void clear()
```


Clear all fields.

### compareTo(VertexDeclaration other) {#compareTo-com.aspose.threed.VertexDeclaration-}
```
public int compareTo(VertexDeclaration other)
```


Compares this instance to a specified object and returns an indication of their relative values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |  |

**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether this instance and a specified object, which must also be a [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) object, have the same value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### fromGeometry(Geometry geometry, boolean useFloat) {#fromGeometry-com.aspose.threed.Geometry-boolean-}
```
public static VertexDeclaration fromGeometry(Geometry geometry, boolean useFloat)
```


Create a [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) based on a [Geometry](../../com.aspose.threed/geometry)'s layout.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) |  |
| useFloat | boolean | Use float instead of double type |

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration)
### get(int index) {#get-int-}
```
public VertexField get(int index)
```


Gets the [VertexField](../../com.aspose.threed/vertexfield) by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public int getCount()
```


Gets the count of all fields defined in this [VertexDeclaration](../../com.aspose.threed/vertexdeclaration)

**Returns:**
int
### getSealed() {#getSealed--}
```
public boolean getSealed()
```


A [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) will be sealed when its been used by [TriMesh](../../com.aspose.threed/trimesh), no more modifications is allowed.

**Returns:**
boolean
### getSize() {#getSize--}
```
public int getSize()
```


The size in byte of the vertex structure.

**Returns:**
int
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this string.

**Returns:**
int - A 32-bit signed integer hash code.
### iterator() {#iterator--}
```
public Iterator<VertexField> iterator()
```


Gets an enumerator to walk through all vertex fields in this instance.

**Returns:**
java.util.Iterator<com.aspose.threed.VertexField> - Enumerator
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```


String representation of [VertexDeclaration](../../com.aspose.threed/vertexdeclaration)

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

