---
title: VertexElementUV
second_title: Aspose.3D for Java API Reference
description: Defines the UV coordinates for specified components.
type: docs
weight: 206
url: /java/com.aspose.threed/vertexelementuv/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.VertexElement](../../com.aspose.threed/vertexelement), [com.aspose.threed.VertexElementVector4](../../com.aspose.threed/vertexelementvector4)
```
public class VertexElementUV extends VertexElementVector4
```

Defines the UV coordinates for specified components. A geometry can have multiple [VertexElementUV](../../com.aspose.threed/vertexelementuv) elements, and each one have different [TextureMapping](../../com.aspose.threed/texturemapping)s.
## Constructors

| Constructor | Description |
| --- | --- |
| [VertexElementUV()](#VertexElementUV--) | Initializes a new instance of the [VertexElementUV](../../com.aspose.threed/vertexelementuv) class. |
| [VertexElementUV(TextureMapping textureMapping)](#VertexElementUV-com.aspose.threed.TextureMapping-) | Initializes a new instance of the [VertexElementUV](../../com.aspose.threed/vertexelementuv) class. |
## Methods

| Method | Description |
| --- | --- |
| [addData(Iterable<Vector2> data)](#addData-java.lang.Iterable-com.aspose.threed.Vector2--) | Add a set of [Vector2](../../com.aspose.threed/vector2) to VertexElementUV.Data. |
| [addData2(Iterable<Vector3> data)](#addData2-java.lang.Iterable-com.aspose.threed.Vector3--) | Add a set of [Vector3](../../com.aspose.threed/vector3) to VertexElementUV.Data. |
| [clear()](#clear--) | Removes all elements from the direct and the index arrays. |
| [clone(boolean withData)](#clone-boolean-) | Deep clone the vertex element |
| [clone(boolean withDirect, boolean withIndice)](#clone-boolean-boolean-) |  |
| [copyTo(VertexElementVector4 target)](#copyTo-com.aspose.threed.VertexElementVector4-) | Copies data to specified element |
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
| [setData(Vector4[] data)](#setData-com.aspose.threed.Vector4---) | Load data |
| [setIndices(int[] data)](#setIndices-int---) | Load indices |
| [setMappingMode(MappingMode value)](#setMappingMode-com.aspose.threed.MappingMode-) | Sets how the element is mapped. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setReferenceMode(ReferenceMode value)](#setReferenceMode-com.aspose.threed.ReferenceMode-) | Sets how the element is referenced. |
| [toString()](#toString--) | String representation of vertex element. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### VertexElementUV() {#VertexElementUV--}
```
public VertexElementUV()
```


Initializes a new instance of the [VertexElementUV](../../com.aspose.threed/vertexelementuv) class. The default texture mapping type is [TextureMapping.DIFFUSE](../../com.aspose.threed/texturemapping\#DIFFUSE)

### VertexElementUV(TextureMapping textureMapping) {#VertexElementUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV(TextureMapping textureMapping)
```


Initializes a new instance of the [VertexElementUV](../../com.aspose.threed/vertexelementuv) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textureMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | The texture mapping type. |

### addData(Iterable<Vector2> data) {#addData-java.lang.Iterable-com.aspose.threed.Vector2--}
```
public void addData(Iterable<Vector2> data)
```


Add a set of [Vector2](../../com.aspose.threed/vector2) to VertexElementUV.Data. This is a short-cut, this method will convert the [Vector2](../../com.aspose.threed/vector2) to [Vector4](../../com.aspose.threed/vector4) with z to 0 and w to 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Iterable<com.aspose.threed.Vector2> |  |

### addData2(Iterable<Vector3> data) {#addData2-java.lang.Iterable-com.aspose.threed.Vector3--}
```
public void addData2(Iterable<Vector3> data)
```


Add a set of [Vector3](../../com.aspose.threed/vector3) to VertexElementUV.Data. This is a short-cut, this method will convert the [Vector3](../../com.aspose.threed/vector3) to [Vector4](../../com.aspose.threed/vector4) with w to 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Iterable<com.aspose.threed.Vector3> |  |

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
### copyTo(VertexElementVector4 target) {#copyTo-com.aspose.threed.VertexElementVector4-}
```
public void copyTo(VertexElementVector4 target)
```


Copies data to specified element

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| target | [VertexElementVector4](../../com.aspose.threed/vertexelementvector4) | Target. |

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
public List<Vector4> getData()
```


Gets the vertex data

**Returns:**
java.util.List<com.aspose.threed.Vector4>
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




### setData(Vector4[] data) {#setData-com.aspose.threed.Vector4---}
```
public void setData(Vector4[] data)
```


Load data

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | [Vector4\[\]](../../com.aspose.threed/vector4) |  |

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

