---
title: IPrimitiveMorphTargetReader.GetVertex
second_title: Aspose.CAD for .NET API Reference
description: IPrimitiveMorphTargetReader method. Gets the vertex for the given vertexIndex morphed by the current morph target if any
type: docs
weight: 20
url: /net/aspose.cad.fileformats.glb.geometry/iprimitivemorphtargetreader/getvertex/
---
## IPrimitiveMorphTargetReader.GetVertex method

Gets the vertex for the given *vertexIndex* morphed by the current morph target (if any).

```csharp
public IVertexBuilder GetVertex(int vertexIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| vertexIndex | Int32 | The index of the vertex. |

### Return Value

If the given index has a morphed vertex, it will return it, else it will return the base vertex.

### See Also

* interface [IVertexBuilder](../../ivertexbuilder/)
* interface [IPrimitiveMorphTargetReader](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../iprimitivemorphtargetreader/)
* assembly [Aspose.CAD](../../../)


