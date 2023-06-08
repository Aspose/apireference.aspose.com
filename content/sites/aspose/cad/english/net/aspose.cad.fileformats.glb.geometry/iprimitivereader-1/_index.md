---
title: Interface IPrimitiveReaderTMaterial
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.IPrimitiveReader1TMaterial interface. 
type: docs
weight: 9940
url: /net/aspose.cad.fileformats.glb.geometry/iprimitivereader-1/
---
## IPrimitiveReader&lt;TMaterial&gt; interface

```csharp
public interface IPrimitiveReader<TMaterial>
```

## Properties

| Name | Description |
| --- | --- |
| [Lines](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/lines/) { get; } | Gets the indices of all lines. |
| [Material](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/material/) { get; } | Gets the current *TMaterial* instance used by this primitive. |
| [MorphTargets](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/morphtargets/) { get; } | Gets the list of [`IPrimitiveMorphTargetReader`](../iprimitivemorphtargetreader/). |
| [Points](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/points/) { get; } | Gets the indices of all points. |
| [Surfaces](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/surfaces/) { get; } | Gets the indices of all the surfaces. |
| [Triangles](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/triangles/) { get; } | Gets the indices of all the surfaces as triangles. |
| [VertexType](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/vertextype/) { get; } | Gets a generic type of [`VertexBuilder`](../vertexbuilder-3/). |
| [Vertices](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/vertices/) { get; } | Gets the list of [`IVertexBuilder`](../ivertexbuilder/) vertices. |
| [VerticesPerPrimitive](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/verticesperprimitive/) { get; } | Gets the number of vertices used by each primitive shape. Valid values: 1- Points. 2- Lines. 3- Triangles. |

## Methods

| Name | Description |
| --- | --- |
| [GetIndices](../../aspose.cad.fileformats.glb.geometry/iprimitivereader-1/getindices/)() | Calculates the raw list of indices to use for this primitive. |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


