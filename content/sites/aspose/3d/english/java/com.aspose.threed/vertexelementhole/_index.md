---
title: VertexElementHole
second_title: Aspose.3D for Java API Reference
description: Defines if specified polygon is hole
type: docs
weight: 194
url: /java/com.aspose.threed/vertexelementhole/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.VertexElement](../../com.aspose.threed/vertexelement), com.aspose.threed.VertexElementTemplate
```
public class VertexElementHole extends VertexElementTemplate<Boolean>
```

Defines if specified polygon is hole
## Constructors

| Constructor | Description |
| --- | --- |
| [VertexElementHole()](#VertexElementHole--) | Initializes a new instance of the [VertexElementHole](../../com.aspose.threed/vertexelementhole) class. |
## Methods

| Method | Description |
| --- | --- |
| [clear()](#clear--) | Removes all elements from the direct and the index arrays. |
| [clone(boolean withData)](#clone-boolean-) | Deep clone the vertex element |
| [clone(boolean withDirect, boolean withIndice)](#clone-boolean-boolean-) |  |
| [copyTo(VertexElementTemplate<T> target)](#copyTo-com.aspose.threed.VertexElementTemplate-T--) | Copies data to specified element |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Gets the vertex data |
| [getIndices()](#getIndices--) | Gets the indices data |
| [getMappingMode()](#getMappingMode--) | Gets how the element is mapped. |
| [getName()](#getName--) | Gets the name. |
| [getReferenceMode()](#getReferenceMode--) | Gets how the element is referenced. |
| [getVertexElementType()](#getVertexElementType--) | Gets the type of the [VertexElement](../../com.aspose.threed/vertexelement) |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setData(T[] data)](#setData-T---) | Load data |
| [setIndices(int[] data)](#setIndices-int---) | Load indices |
| [setMappingMode(MappingMode value)](#setMappingMode-com.aspose.threed.MappingMode-) | Sets how the element is mapped. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setReferenceMode(ReferenceMode value)](#setReferenceMode-com.aspose.threed.ReferenceMode-) | Sets how the element is referenced. |
| [toString()](#toString--) | String representation of vertex element. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### VertexElementHole() {#VertexElementHole--}
```
public VertexElementHole()
```


Initializes a new instance of the [VertexElementHole](../../com.aspose.threed/vertexelementhole) class.

### clear() {#clear--}
```
public void clear()
```


Removes all elements from the direct and the index arrays.

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
### clone(boolean withDirect, boolean withIndice) {#clone-boolean-boolean-}
```
public VertexElement clone(boolean withDirect, boolean withIndice)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| withDirect | boolean |  |
| withIndice | boolean |  |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement)
### copyTo(VertexElementTemplate<T> target) {#copyTo-com.aspose.threed.VertexElementTemplate-T--}
```
public void copyTo(VertexElementTemplate<T> target)
```


Copies data to specified element

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [VertexElementTemplate](../../com.aspose.threed/vertexelementtemplate) | Target. |

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
### getData() {#getData--}
```
public List<T> getData()
```


Gets the vertex data

**Returns:**
java.util.List<T>
### getIndices() {#getIndices--}
```
public List<Integer> getIndices()
```


Gets the indices data

**Returns:**
java.util.List<java.lang.Integer>
### getMappingMode() {#getMappingMode--}
```
public MappingMode getMappingMode()
```


Gets how the element is mapped.

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode)
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getReferenceMode() {#getReferenceMode--}
```
public ReferenceMode getReferenceMode()
```


Gets how the element is referenced.

**Returns:**
[ReferenceMode](../../com.aspose.threed/referencemode)
### getVertexElementType() {#getVertexElementType--}
```
public VertexElementType getVertexElementType()
```


Gets the type of the [VertexElement](../../com.aspose.threed/vertexelement)

**Returns:**
[VertexElementType](../../com.aspose.threed/vertexelementtype)
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




### setData(T[] data) {#setData-T---}
```
public void setData(T[] data)
```


Load data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | T[] |  |

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

