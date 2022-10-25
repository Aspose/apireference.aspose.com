---
title: VertexDeclaration
second_title: Aspose.3D for Java API Reference
description: The declaration of a custom defined vertexs structure
type: docs
weight: 185
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
| [getSealed()](#getSealed--) | A com.aspose.threed.VertexDeclaration will be sealed when its been used by com.aspose.threed.TriMesh, no more modifications is allowed. |
| [getCount()](#getCount--) | Gets the count of all fields defined in this com.aspose.threed.VertexDeclaration |
| [get(int index)](#get-int-) | Gets the com.aspose.threed.VertexField by index |
| [clear()](#clear--) | Clear all fields. |
| [addField(int dataType, VertexFieldSemantic semantic, int index, String alias)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-java.lang.String-) | Add a new vertex field |
| [addField(int dataType, VertexFieldSemantic semantic)](#addField-int-com.aspose.threed.VertexFieldSemantic-) | Add a new vertex field |
| [addField(int dataType, VertexFieldSemantic semantic, int index)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-) | Add a new vertex field |
| [fromGeometry(Geometry geometry, boolean useFloat)](#fromGeometry-com.aspose.threed.Geometry-boolean-) | Create a com.aspose.threed.VertexDeclaration based on a com.aspose.threed.Geometry's layout. |
| [getSize()](#getSize--) | The size in byte of the vertex structure. |
| [compareTo(VertexDeclaration other)](#compareTo-com.aspose.threed.VertexDeclaration-) | Compares this instance to a specified object and returns an indication of their relative values. |
| [toString()](#toString--) | String representation of com.aspose.threed.VertexDeclaration |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether this instance and a specified object, which must also be a com.aspose.threed.VertexDeclaration object, have the same value. |
| [hashCode()](#hashCode--) | Returns the hash code for this string. |
| [iterator()](#iterator--) | Gets an enumerator to walk through all vertex fields in this instance. |
### VertexDeclaration() {#VertexDeclaration--}
```
public VertexDeclaration()
```


### getSealed() {#getSealed--}
```
public boolean getSealed()
```


A com.aspose.threed.VertexDeclaration will be sealed when its been used by com.aspose.threed.TriMesh, no more modifications is allowed.

**Returns:**
boolean
### getCount() {#getCount--}
```
public int getCount()
```


Gets the count of all fields defined in this com.aspose.threed.VertexDeclaration

**Returns:**
int
### get(int index) {#get-int-}
```
public VertexField get(int index)
```


Gets the com.aspose.threed.VertexField by index

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int |  |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### clear() {#clear--}
```
public void clear()
```


Clear all fields.

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
### fromGeometry(Geometry geometry, boolean useFloat) {#fromGeometry-com.aspose.threed.Geometry-boolean-}
```
public static VertexDeclaration fromGeometry(Geometry geometry, boolean useFloat)
```


Create a com.aspose.threed.VertexDeclaration based on a com.aspose.threed.Geometry's layout.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) |  |
| useFloat | boolean | Use float instead of double type |

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration)
### getSize() {#getSize--}
```
public int getSize()
```


The size in byte of the vertex structure.

**Returns:**
int
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
### toString() {#toString--}
```
public String toString()
```


String representation of com.aspose.threed.VertexDeclaration

**Returns:**
java.lang.String
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether this instance and a specified object, which must also be a com.aspose.threed.VertexDeclaration object, have the same value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
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
