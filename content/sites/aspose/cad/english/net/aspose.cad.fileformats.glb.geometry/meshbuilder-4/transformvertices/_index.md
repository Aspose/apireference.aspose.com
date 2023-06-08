---
title: MeshBuilder4.TransformVertices
second_title: Aspose.CAD for .NET API Reference
description: MeshBuilder method. Transforms all the points of all the PrimitiveBuilder of the this MeshBuilder using the given lambfa function
type: docs
weight: 80
url: /net/aspose.cad.fileformats.glb.geometry/meshbuilder-4/transformvertices/
---
## MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;.TransformVertices method

Transforms all the points of all the [`PrimitiveBuilder`](../../primitivebuilder-4/) of the this [`MeshBuilder`](../) using the given lambfa function.

```csharp
public void TransformVertices(
    Func<VertexBuilder<TvG, TvM, TvS>, VertexBuilder<TvG, TvM, TvS>> vertexTransform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexTransform | Func`2 | A lambda function to transform [`VertexBuilder`](../../vertexbuilder-3/) vertices. |

### See Also

* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../meshbuilder-4/)
* assembly [Aspose.CAD](../../../)


