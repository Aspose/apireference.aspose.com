---
title: Geometry
second_title: Aspose.3D for Java API Reference
description: The base class of all renderable geometric objects like com.aspose.threed.Mesh com.aspose.threed.NurbsSurface com.aspose.threed.Patch and etc..
type: docs
weight: 66
url: /java/com.aspose.threed/geometry/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity)
```
public class Geometry extends Entity
```

The base class of all renderable geometric objects (like com.aspose.threed.Mesh, com.aspose.threed.NurbsSurface, com.aspose.threed.Patch and etc.).

The com.aspose.threed.Geometry base class supports:

 *  **Control point management**, control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models.
 *  **Vertex element definition**, vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see com.aspose.threed.VertexElement for more details.
 *  **Object deforming**, com.aspose.threed.Deformer can be bonded to animate geometry's shape.
## Constructors

| Constructor | Description |
| --- | --- |
| [Geometry(String name)](#Geometry-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Geometry class. |
## Methods

| Method | Description |
| --- | --- |
| [getVisible()](#getVisible--) | Gets if the geometry is visible |
| [setVisible(boolean value)](#setVisible-boolean-) | Sets if the geometry is visible |
| [getDeformers()](#getDeformers--) | Gets all deformers associated with this geometry. |
| [getControlPoints()](#getControlPoints--) | Gets all control points |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [getVertexElements()](#getVertexElements--) | Gets all vertex elements |
| [getElement(VertexElementType type)](#getElement-com.aspose.threed.VertexElementType-) | Gets a vertex element with specified type |
| [getVertexElementOfUV(TextureMapping textureMapping)](#getVertexElementOfUV-com.aspose.threed.TextureMapping-) | Gets a com.aspose.threed.VertexElementUV instance with given texture mapping type |
| [createElement(VertexElementType type)](#createElement-com.aspose.threed.VertexElementType-) | Creates a vertex element with specified type and add it to the geometry. |
| [addElement(VertexElement element)](#addElement-com.aspose.threed.VertexElement-) | Adds an existing vertex element to current geometry |
| [createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)](#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Creates a vertex element with specified type and add it to the geometry. |
| [createElementUV(TextureMapping uvMapping)](#createElementUV-com.aspose.threed.TextureMapping-) | Creates a com.aspose.threed.VertexElementUV with given texture mapping type. |
| [createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)](#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Creates a com.aspose.threed.VertexElementUV with given texture mapping type. |
| [<T>getDeformers2()](#-T-getDeformers2--) | Gets all deformers with specified deformer types |
### Geometry(String name) {#Geometry-java.lang.String-}
```
public Geometry(String name)
```


Initializes a new instance of the com.aspose.threed.Geometry class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gets if the geometry is visible

**Returns:**
boolean
### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Sets if the geometry is visible

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getDeformers() {#getDeformers--}
```
public Collection<Deformer> getDeformers()
```


Gets all deformers associated with this geometry.

**Returns:**
java.util.Collection<com.aspose.threed.Deformer>
### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Gets all control points

**Returns:**
java.util.List<com.aspose.threed.Vector4>
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets whether this geometry can cast shadow

**Returns:**
boolean
### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets whether this geometry can cast shadow

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Gets whether this geometry can receive shadow.

**Returns:**
boolean
### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Sets whether this geometry can receive shadow.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getVertexElements() {#getVertexElements--}
```
public List<VertexElement> getVertexElements()
```


Gets all vertex elements

**Returns:**
java.util.List<com.aspose.threed.VertexElement>
### getElement(VertexElementType type) {#getElement-com.aspose.threed.VertexElementType-}
```
public VertexElement getElement(VertexElementType type)
```


Gets a vertex element with specified type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | which vertex element type to find |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - com.aspose.threed.VertexElement instance if found, otherwise null will be returned.
### getVertexElementOfUV(TextureMapping textureMapping) {#getVertexElementOfUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV getVertexElementOfUV(TextureMapping textureMapping)
```


Gets a com.aspose.threed.VertexElementUV instance with given texture mapping type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textureMapping | [TextureMapping](../../com.aspose.threed/texturemapping) |  |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - VertexElementUV with the texture mapping type
### createElement(VertexElementType type) {#createElement-com.aspose.threed.VertexElementType-}
```
public VertexElement createElement(VertexElementType type)
```


Creates a vertex element with specified type and add it to the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex element type |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element.
### addElement(VertexElement element) {#addElement-com.aspose.threed.VertexElement-}
```
public void addElement(VertexElement element)
```


Adds an existing vertex element to current geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [VertexElement](../../com.aspose.threed/vertexelement) | The vertex element to add |

### createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode) {#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElement createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)
```


Creates a vertex element with specified type and add it to the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex element type |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Default mapping mode |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Default reference mode |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element.
### createElementUV(TextureMapping uvMapping) {#createElementUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping)
```


Creates a com.aspose.threed.VertexElementUV with given texture mapping type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Which texture mapping type to create |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode) {#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)
```


Creates a com.aspose.threed.VertexElementUV with given texture mapping type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Which texture mapping type to create |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Default mapping mode |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Default reference mode |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### <T>getDeformers2() {#-T-getDeformers2--}
```
public Collection<T> <T>getDeformers2()
```


Gets all deformers with specified deformer types

**Returns:**
java.util.Collection<T> - Deformer collection
