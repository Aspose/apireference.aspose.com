---
title: Class VertexElement
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.VertexElement class. Base class of vertex elements. A vertex element type is identified by VertexElementType. A VertexElement describes how the vertex element is mapped to a geometry surface and how the mapping information is arranged in memory. A VertexElement contains Normals UVs or other kind of information
type: docs
weight: 790
url: /net/aspose.threed.entities/vertexelement/
---
## VertexElement class

Base class of vertex elements. A vertex element type is identified by VertexElementType. A VertexElement describes how the vertex element is mapped to a geometry surface and how the mapping information is arranged in memory. A VertexElement contains Normals, UVs or other kind of information.

```csharp
public abstract class VertexElement : IIndexedVertexElement
```

## Properties

| Name | Description |
| --- | --- |
| [Indices](../../aspose.threed.entities/vertexelement/indices/) { get; } | Gets the indices data |
| [MappingMode](../../aspose.threed.entities/vertexelement/mappingmode/) { get; set; } | Gets or sets how the element is mapped. |
| [Name](../../aspose.threed.entities/vertexelement/name/) { get; set; } | Gets or sets the name. |
| [ReferenceMode](../../aspose.threed.entities/vertexelement/referencemode/) { get; set; } | Gets or sets how the element is referenced. |
| [VertexElementType](../../aspose.threed.entities/vertexelement/vertexelementtype/) { get; } | Gets the type of the `VertexElement` |

## Methods

| Name | Description |
| --- | --- |
| abstract [Clear](../../aspose.threed.entities/vertexelement/clear/)() | Clears all the data from this vertex element. |
| [SetIndices](../../aspose.threed.entities/vertexelement/setindices/)(int[]) | Load indices |
| override [ToString](../../aspose.threed.entities/vertexelement/tostring/)() | String representation of vertex element. |

### See Also

* interface [IIndexedVertexElement](../iindexedvertexelement/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


