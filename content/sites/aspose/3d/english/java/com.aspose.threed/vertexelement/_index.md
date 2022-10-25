---
title: VertexElement
second_title: Aspose.3D for Java API Reference
description: Base class of vertex elements.
type: docs
weight: 186
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
| [getVertexElementType()](#getVertexElementType--) | Gets the type of the com.aspose.threed.VertexElement |
| [getName()](#getName--) | Gets the name. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [getMappingMode()](#getMappingMode--) | Gets how the element is mapped. |
| [setMappingMode(MappingMode value)](#setMappingMode-com.aspose.threed.MappingMode-) | Sets how the element is mapped. |
| [getReferenceMode()](#getReferenceMode--) | Gets how the element is referenced. |
| [setReferenceMode(ReferenceMode value)](#setReferenceMode-com.aspose.threed.ReferenceMode-) | Sets how the element is referenced. |
| [getIndices()](#getIndices--) | Gets the indices data |
| [setIndices(int[] data)](#setIndices-int---) | Load indices |
| [clear()](#clear--) | Clears all the data from this vertex element. |
| [clone(boolean withData)](#clone-boolean-) | Deep clone the vertex element |
| [toString()](#toString--) | String representation of vertex element. |
### getVertexElementType() {#getVertexElementType--}
```
public VertexElementType getVertexElementType()
```


Gets the type of the com.aspose.threed.VertexElement

**Returns:**
[VertexElementType](../../com.aspose.threed/vertexelementtype)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getMappingMode() {#getMappingMode--}
```
public MappingMode getMappingMode()
```


Gets how the element is mapped.

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode)
### setMappingMode(MappingMode value) {#setMappingMode-com.aspose.threed.MappingMode-}
```
public void setMappingMode(MappingMode value)
```


Sets how the element is mapped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [MappingMode](../../com.aspose.threed/mappingmode) | New value |

### getReferenceMode() {#getReferenceMode--}
```
public ReferenceMode getReferenceMode()
```


Gets how the element is referenced.

**Returns:**
[ReferenceMode](../../com.aspose.threed/referencemode)
### setReferenceMode(ReferenceMode value) {#setReferenceMode-com.aspose.threed.ReferenceMode-}
```
public void setReferenceMode(ReferenceMode value)
```


Sets how the element is referenced.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ReferenceMode](../../com.aspose.threed/referencemode) | New value |

### getIndices() {#getIndices--}
```
public List<Integer> getIndices()
```


Gets the indices data

**Returns:**
java.util.List<java.lang.Integer>
### setIndices(int[] data) {#setIndices-int---}
```
public void setIndices(int[] data)
```


Load indices

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | int[] |  |

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
### toString() {#toString--}
```
public String toString()
```


String representation of vertex element.

**Returns:**
java.lang.String
