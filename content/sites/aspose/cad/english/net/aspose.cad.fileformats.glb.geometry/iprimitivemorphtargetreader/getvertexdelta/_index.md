---
title: IPrimitiveMorphTargetReader.GetVertexDelta
second_title: Aspose.CAD for .NET API Reference
description: IPrimitiveMorphTargetReader method. Gets the VertexGeometryDelta of a given vertex for a given morph target
type: docs
weight: 30
url: /net/aspose.cad.fileformats.glb.geometry/iprimitivemorphtargetreader/getvertexdelta/
---
## IPrimitiveMorphTargetReader.GetVertexDelta method

Gets the [`VertexGeometryDelta`](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/) of a given vertex for a given morph target.

```csharp
public VertexBuilder<VertexGeometryDelta, VertexMaterialDelta, VertexEmpty> GetVertexDelta(
    int vertexIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexIndex | Int32 | The index of the vertex. |

### Return Value

A Vertex delta (Morphed vertex subtracted by base vertex).

### See Also

* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../vertexbuilder-3/)
* struct [VertexGeometryDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/)
* struct [VertexMaterialDelta](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/)
* struct [VertexEmpty](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/)
* interface [IPrimitiveMorphTargetReader](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../iprimitivemorphtargetreader/)
* assembly [Aspose.CAD](../../../)


