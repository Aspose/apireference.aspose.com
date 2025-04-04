---
title: VertexElement
second_title: Aspose.3D for Java API Reference
description: Base class of vertex elements.
type: docs
weight: 202
url: /java/com.aspose.threed/vertexelement/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.threed.IIndexedVertexElement](../../com.aspose.threed/iindexedvertexelement)
```
public abstract class VertexElement implements IIndexedVertexElement
```

Base class of vertex elements. A vertex element type is identified by VertexElementType. A VertexElement describes how the vertex element is mapped to a geometry surface and how the mapping information is arranged in memory. A VertexElement contains Normals, UVs or other kind of information.
## Methods

| Method | Description |
| --- | --- |
| [clear()](#clear--) | Clears all the data from this vertex element. |
| [clone(boolean withData)](#clone-boolean-) | Deep clone the vertex element |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getIndices()](#getIndices--) | Gets the indices data |
| [getMappingMode()](#getMappingMode--) | Gets how the element is mapped. |
| [getName()](#getName--) | Gets the name. |
| [getReferenceMode()](#getReferenceMode--) | Gets how the element is referenced. |
| [getVertexElementType()](#getVertexElementType--) | Gets the type of the [VertexElement](../../com.aspose.threed/vertexelement) |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setIndices(int[] data)](#setIndices-int---) | Load indices |
| [setMappingMode(MappingMode value)](#setMappingMode-com.aspose.threed.MappingMode-) | Sets how the element is mapped. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setReferenceMode(ReferenceMode value)](#setReferenceMode-com.aspose.threed.ReferenceMode-) | Sets how the element is referenced. |
| [toString()](#toString--) | String representation of vertex element. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clear() {#clear--}
```
public abstract void clear()
```


Clears all the data from this vertex element.

### clone(boolean withData) {#clone-boolean-}
```
public VertexElement clone(boolean withData)
```


Deep clone the vertex element

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| withData | boolean | Clone the vertex with direct and index array |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement)
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
### getIndices() {#getIndices--}
```
public List<Integer> getIndices()
```


Gets the indices data

**Returns:**
java.util.List<java.lang.Integer> - the indices data
### getMappingMode() {#getMappingMode--}
```
public MappingMode getMappingMode()
```


Gets how the element is mapped.

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode) - how the element is mapped.
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String - the name.
### getReferenceMode() {#getReferenceMode--}
```
public ReferenceMode getReferenceMode()
```


Gets how the element is referenced.

**Returns:**
[ReferenceMode](../../com.aspose.threed/referencemode) - how the element is referenced.
### getVertexElementType() {#getVertexElementType--}
```
public VertexElementType getVertexElementType()
```


Gets the type of the [VertexElement](../../com.aspose.threed/vertexelement)

**Returns:**
[VertexElementType](../../com.aspose.threed/vertexelementtype) - the type of the [VertexElement](../../com.aspose.threed/vertexelement)
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




### setIndices(int[] data) {#setIndices-int---}
```
public void setIndices(int[] data)
```


Load indices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | int[] |  |

### setMappingMode(MappingMode value) {#setMappingMode-com.aspose.threed.MappingMode-}
```
public void setMappingMode(MappingMode value)
```


Sets how the element is mapped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [MappingMode](../../com.aspose.threed/mappingmode) | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setReferenceMode(ReferenceMode value) {#setReferenceMode-com.aspose.threed.ReferenceMode-}
```
public void setReferenceMode(ReferenceMode value)
```


Sets how the element is referenced.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ReferenceMode](../../com.aspose.threed/referencemode) | New value |

### toString() {#toString--}
```
public String toString()
```


String representation of vertex element.

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

