---
title: Class VertexPreprocessorTvGTvMTvS
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.VertexPreprocessor3TvGTvMTvS class. Represents a VertexBuilder preprocessor used by VertexPreprocessor
type: docs
weight: 10280
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/
---
## VertexPreprocessor&lt;TvG,TvM,TvS&gt; class

Represents a [`VertexBuilder`](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/) preprocessor used by [`VertexPreprocessor`](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/vertexpreprocessor/)

```csharp
public sealed class VertexPreprocessor<TvG, TvM, TvS>
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

| Parameter | Description |
| --- | --- |
| TvG | The vertex fragment type with Position, Normal and Tangent. Valid types are: [`VertexPosition`](../vertexposition/), [`VertexPositionNormal`](../vertexpositionnormal/), [`VertexPositionNormalTangent`](../vertexpositionnormaltangent/). |
| TvM | The vertex fragment type with Colors and Texture Coordinates. Valid types are: [`VertexEmpty`](../vertexempty/), [`VertexColor1`](../vertexcolor1/), [`VertexTexture1`](../vertextexture1/), [`VertexColor1Texture1`](../vertexcolor1texture1/). |
| TvS | The vertex fragment type with Skin Joint Weights. Valid types are: [`VertexEmpty`](../vertexempty/), [`VertexJoints4`](../vertexjoints4/), [`VertexJoints8`](../vertexjoints8/). |

## Constructors

| Name | Description |
| --- | --- |
| [VertexPreprocessor](vertexpreprocessor/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [Append](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/append/#append)(VertexGeometryPreprocessor&lt;TvG&gt;) |  |
| [Append](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/append/#append_1)(VertexMaterialPreprocessor&lt;TvM&gt;) |  |
| [Append](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/append/#append_2)(VertexSkinningPreprocessor&lt;TvS&gt;) |  |
| [Clear](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/clear/)() |  |
| [PreprocessVertex](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/preprocessvertex/)(ref VertexBuilder&lt;TvG, TvM, TvS&gt;) |  |
| [SetSanitizerPreprocessors](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/setsanitizerpreprocessors/)() |  |
| [SetValidationPreprocessors](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpreprocessor-3/setvalidationpreprocessors/)() |  |

### See Also

* interface [IVertexGeometry](../ivertexgeometry/)
* interface [IVertexMaterial](../ivertexmaterial/)
* interface [IVertexSkinning](../ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


