---
title: VertexField
second_title: Aspose.3D for Java API Reference
description: Vertexs field memory layout description.
type: docs
weight: 212
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
| [compareTo(VertexField other)](#compareTo-com.aspose.threed.VertexField-) | Compares this instance to a specified object and returns an indication of their relative values. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determines whether this instance and a specified object, which must also be a [VertexField](../../com.aspose.threed/vertexfield) object, have the same value. |
| [getAlias()](#getAlias--) | Field's alias. |
| [getClass()](#getClass--) |  |
| [getDataType()](#getDataType--) | Data type of this field. |
| [getIndex()](#getIndex--) | Index of this field in the vertex's layout with same semantic. |
| [getOffset()](#getOffset--) | The offset in bytes of this field. |
| [getSemantic()](#getSemantic--) | The usage semantic of this field. |
| [getSize()](#getSize--) | The size in bytes of this field |
| [hashCode()](#hashCode--) | Returns the hash code for this string. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | Gets the string representation of [VertexField](../../com.aspose.threed/vertexfield) |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determines whether this instance and a specified object, which must also be a [VertexField](../../com.aspose.threed/vertexfield) object, have the same value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getAlias() {#getAlias--}
```
public String getAlias()
```


Field's alias.

**Returns:**
java.lang.String
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDataType() {#getDataType--}
```
public int getDataType()
```


Data type of this field.

**Returns:**
int
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
### getSemantic() {#getSemantic--}
```
public VertexFieldSemantic getSemantic()
```


The usage semantic of this field.

**Returns:**
[VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic)
### getSize() {#getSize--}
```
public int getSize()
```


The size in bytes of this field

**Returns:**
int
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this string.

**Returns:**
int - A 32-bit signed integer hash code.
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


Gets the string representation of [VertexField](../../com.aspose.threed/vertexfield)

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

