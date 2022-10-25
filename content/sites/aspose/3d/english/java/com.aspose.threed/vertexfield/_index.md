---
title: VertexField
second_title: Aspose.3D for Java API Reference
description: Vertexs field memory layout description.
type: docs
weight: 206
url: /java/com.aspose.threed/vertexfield/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Comparable
```
public class VertexField implements Comparable<VertexField>
```

Vertex's field memory layout description.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether this instance and a specified object, which must also be a com.aspose.threed.VertexField object, have the same value. |
| [getDataType()](#getDataType--) | Data type of this field. |
| [getSemantic()](#getSemantic--) | The usage semantic of this field. |
| [getAlias()](#getAlias--) | Field's alias. |
| [getIndex()](#getIndex--) | Index of this field in the vertex's layout with same semantic. |
| [getOffset()](#getOffset--) | The offset in bytes of this field. |
| [getSize()](#getSize--) | The size in bytes of this field |
| [compareTo(VertexField other)](#compareTo-com.aspose.threed.VertexField-) | Compares this instance to a specified object and returns an indication of their relative values. |
| [toString()](#toString--) | Gets the string representation of com.aspose.threed.VertexField |
| [hashCode()](#hashCode--) | Returns the hash code for this string. |
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether this instance and a specified object, which must also be a com.aspose.threed.VertexField object, have the same value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getDataType() {#getDataType--}
```
public int getDataType()
```


Data type of this field.

**Returns:**
int
### getSemantic() {#getSemantic--}
```
public VertexFieldSemantic getSemantic()
```


The usage semantic of this field.

**Returns:**
[VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic)
### getAlias() {#getAlias--}
```
public String getAlias()
```


Field's alias.

**Returns:**
java.lang.String
### getIndex() {#getIndex--}
```
public int getIndex()
```


Index of this field in the vertex's layout with same semantic.

**Returns:**
int
### getOffset() {#getOffset--}
```
public int getOffset()
```


The offset in bytes of this field.

**Returns:**
int
### getSize() {#getSize--}
```
public int getSize()
```


The size in bytes of this field

**Returns:**
int
### compareTo(VertexField other) {#compareTo-com.aspose.threed.VertexField-}
```
public int compareTo(VertexField other)
```


Compares this instance to a specified object and returns an indication of their relative values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [VertexField](../../com.aspose.threed/vertexfield) |  |

**Returns:**
int
### toString() {#toString--}
```
public String toString()
```


Gets the string representation of com.aspose.threed.VertexField

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this string.

**Returns:**
int - A 32-bit signed integer hash code.
