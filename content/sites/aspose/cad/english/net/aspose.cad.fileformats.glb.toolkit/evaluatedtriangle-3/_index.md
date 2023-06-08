---
title: Struct EvaluatedTriangleTvGTvMTvS
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.ToolKit.EvaluatedTriangle3TvGTvMTvS struct. 
type: docs
weight: 11250
url: /net/aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/
---
## EvaluatedTriangle&lt;TvG,TvM,TvS&gt; structure

```csharp
public struct EvaluatedTriangle<TvG, TvM, TvS>
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

## Constructors

| Name | Description |
| --- | --- |
| [EvaluatedTriangle](evaluatedtriangle/)(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, Material) |  |

## Methods

| Name | Description |
| --- | --- |
| static [GetTrianglesFromMesh](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/gettrianglesfrommesh/)(Mesh, IGeometryTransform) |  |
| static [TransformTextureCoordsByMaterial](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/transformtexturecoordsbymaterial/)(IEnumerable&lt;EvaluatedTriangle&gt;) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/op_implicit/) |  |

## Fields

| Name | Description |
| --- | --- |
| readonly [A](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/a/) |  |
| readonly [B](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/b/) |  |
| readonly [C](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/c/) |  |
| readonly [Material](../../aspose.cad.fileformats.glb.toolkit/evaluatedtriangle-3/material/) |  |

### See Also

* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../aspose.cad.fileformats.glb.toolkit/)
* assembly [Aspose.CAD](../../)


