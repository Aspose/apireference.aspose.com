---
title: VertexElementUV
second_title: Aspose.3D for Java API Reference
description: Defines the UV coordinates for specified components.
type: docs
weight: 199
url: /java/com.aspose.threed/vertexelementuv/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.VertexElement](../../com.aspose.threed/vertexelement), [com.aspose.threed.VertexElementVector4](../../com.aspose.threed/vertexelementvector4)
```
public class VertexElementUV extends VertexElementVector4
```

Defines the UV coordinates for specified components. A geometry can have multiple com.aspose.threed.VertexElementUV elements, and each one have different com.aspose.threed.TextureMappings.
## Constructors

| Constructor | Description |
| --- | --- |
| [VertexElementUV()](#VertexElementUV--) | Initializes a new instance of the com.aspose.threed.VertexElementUV class. |
| [VertexElementUV(TextureMapping textureMapping)](#VertexElementUV-com.aspose.threed.TextureMapping-) | Initializes a new instance of the com.aspose.threed.VertexElementUV class. |
## Methods

| Method | Description |
| --- | --- |
| [addData(Iterable<Vector2> data)](#addData-java.lang.Iterable-com.aspose.threed.Vector2--) | Add a set of com.aspose.threed.Vector2 to VertexElementUV.Data. |
| [clone(boolean withDirect, boolean withIndice)](#clone-boolean-boolean-) |  |
| [addData2(Iterable<Vector3> data)](#addData2-java.lang.Iterable-com.aspose.threed.Vector3--) | Add a set of com.aspose.threed.Vector3 to VertexElementUV.Data. |
### VertexElementUV() {#VertexElementUV--}
```
public VertexElementUV()
```


Initializes a new instance of the com.aspose.threed.VertexElementUV class. The default texture mapping type is com.aspose.threed.TextureMapping\#DIFFUSE

### VertexElementUV(TextureMapping textureMapping) {#VertexElementUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV(TextureMapping textureMapping)
```


Initializes a new instance of the com.aspose.threed.VertexElementUV class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textureMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | The texture mapping type. |

### addData(Iterable<Vector2> data) {#addData-java.lang.Iterable-com.aspose.threed.Vector2--}
```
public void addData(Iterable<Vector2> data)
```


Add a set of com.aspose.threed.Vector2 to VertexElementUV.Data. This is a short-cut, this method will convert the com.aspose.threed.Vector2 to com.aspose.threed.Vector4 with z to 0 and w to 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Iterable<com.aspose.threed.Vector2> |  |

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
### addData2(Iterable<Vector3> data) {#addData2-java.lang.Iterable-com.aspose.threed.Vector3--}
```
public void addData2(Iterable<Vector3> data)
```


Add a set of com.aspose.threed.Vector3 to VertexElementUV.Data. This is a short-cut, this method will convert the com.aspose.threed.Vector3 to com.aspose.threed.Vector4 with w to 0.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | java.lang.Iterable<com.aspose.threed.Vector3> |  |

