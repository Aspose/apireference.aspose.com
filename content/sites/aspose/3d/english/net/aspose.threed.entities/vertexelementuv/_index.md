---
title: Class VertexElementUV
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.VertexElementUV class. Defines the UV coordinates for specified components. A geometry can have multiple VertexElementUV elements and each one have different TextureMappings
type: docs
weight: 930
url: /net/aspose.threed.entities/vertexelementuv/
---
## VertexElementUV class

Defines the UV coordinates for specified components. A geometry can have multiple `VertexElementUV` elements, and each one have different [`TextureMapping`](../texturemapping/)s.

```csharp
public class VertexElementUV : VertexElementVector4
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexElementUV](vertexelementuv/#constructor)() | Initializes a new instance of the `VertexElementUV` class. The default texture mapping type is Diffuse |
| [VertexElementUV](vertexelementuv/#constructor_1)(TextureMapping) | Initializes a new instance of the `VertexElementUV` class. |

## Properties

| Name | Description |
| --- | --- |
| [Data](../../aspose.threed.entities/vertexelementvector4/data/) { get; } | Gets the vertex data |
| [Indices](../../aspose.threed.entities/vertexelement/indices/) { get; } | Gets the indices data |
| [MappingMode](../../aspose.threed.entities/vertexelement/mappingmode/) { get; set; } | Gets or sets how the element is mapped. |
| [Name](../../aspose.threed.entities/vertexelement/name/) { get; set; } | Gets or sets the name. |
| [ReferenceMode](../../aspose.threed.entities/vertexelement/referencemode/) { get; set; } | Gets or sets how the element is referenced. |
| [VertexElementType](../../aspose.threed.entities/vertexelement/vertexelementtype/) { get; } | Gets the type of the [`VertexElement`](../vertexelement/) |

## Methods

| Name | Description |
| --- | --- |
| [AddData](../../aspose.threed.entities/vertexelementuv/adddata/#adddata)(IEnumerable&lt;Vector2&gt;) |  |
| [AddData](../../aspose.threed.entities/vertexelementuv/adddata/#adddata_1)(IEnumerable&lt;Vector3&gt;) |  |
| override [Clear](../../aspose.threed.entities/vertexelementvector4/clear/)() | Removes all elements from the direct and the index arrays. |
| [CopyTo](../../aspose.threed.entities/vertexelementvector4/copyto/)(VertexElementVector4) | Copies data to specified element |
| [SetData](../../aspose.threed.entities/vertexelementvector4/setdata/)(Vector4[]) | Load data |
| [SetIndices](../../aspose.threed.entities/vertexelement/setindices/)(int[]) | Load indices |
| override [ToString](../../aspose.threed.entities/vertexelement/tostring/)() | String representation of vertex element. |

### See Also

* class [VertexElementVector4](../vertexelementvector4/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


