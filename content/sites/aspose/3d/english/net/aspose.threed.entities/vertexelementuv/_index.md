---
title: Class VertexElementUV
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.VertexElementUV class. Defines the UV coordinates for specified components. A geometry can have multiple VertexElementUV elements and each one have different TextureMappings
type: docs
weight: 2550
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
| [Data](../../aspose.threed.entities/vertexelementvector4/data/) { get; } | Gets the vertex data(Inherited from [`VertexElementVector4`](../vertexelementvector4/).) |
| [Indices](../../aspose.threed.entities/vertexelement/indices/) { get; } | Gets the indices data(Inherited from [`VertexElement`](../vertexelement/).) |
| [MappingMode](../../aspose.threed.entities/vertexelement/mappingmode/) { get; set; } | Gets or sets how the element is mapped.(Inherited from [`VertexElement`](../vertexelement/).) |
| [Name](../../aspose.threed.entities/vertexelement/name/) { get; set; } | Gets or sets the name.(Inherited from [`VertexElement`](../vertexelement/).) |
| [ReferenceMode](../../aspose.threed.entities/vertexelement/referencemode/) { get; set; } | Gets or sets how the element is referenced.(Inherited from [`VertexElement`](../vertexelement/).) |
| [VertexElementType](../../aspose.threed.entities/vertexelement/vertexelementtype/) { get; } | Gets the type of the [`VertexElement`](../vertexelement/)(Inherited from [`VertexElement`](../vertexelement/).) |

## Methods

| Name | Description |
| --- | --- |
| [AddData](../../aspose.threed.entities/vertexelementuv/adddata/#adddata)(IEnumerable&lt;Vector2&gt;) |  |
| [AddData](../../aspose.threed.entities/vertexelementuv/adddata/#adddata_1)(IEnumerable&lt;Vector3&gt;) |  |
| override [Clear](../../aspose.threed.entities/vertexelementvector4/clear/)() | Removes all elements from the direct and the index arrays.(Inherited from [`VertexElementVector4`](../vertexelementvector4/).) |
| [CopyTo](../../aspose.threed.entities/vertexelementvector4/copyto/)(VertexElementVector4) | Copies data to specified element(Inherited from [`VertexElementVector4`](../vertexelementvector4/).) |
| [SetData](../../aspose.threed.entities/vertexelementvector4/setdata/)(Vector4[]) | Load data(Inherited from [`VertexElementVector4`](../vertexelementvector4/).) |
| [SetIndices](../../aspose.threed.entities/vertexelement/setindices/)(int[]) | Load indices(Inherited from [`VertexElement`](../vertexelement/).) |
| override [ToString](../../aspose.threed.entities/vertexelement/tostring/)() | String representation of vertex element.(Inherited from [`VertexElement`](../vertexelement/).) |

### See Also

* class [VertexElementVector4](../vertexelementvector4/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


