---
title: Interface IMeshPrimitiveDecoder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Runtime.IMeshPrimitiveDecoder interface. Exposes an API to get geometry data from a mesh primitive
type: docs
weight: 10910
url: /net/aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/
---
## IMeshPrimitiveDecoder interface

Exposes an API to get geometry data from a mesh primitive

```csharp
public interface IMeshPrimitiveDecoder
```

## Properties

| Name | Description |
| --- | --- |
| [ColorsCount](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/colorscount/) { get; } | Gets a value indicating the number of color vertex attributes. In the range of 0 to 2. |
| [JointsWeightsCount](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/jointsweightscount/) { get; } | Gets a value indicating the number of skinning joint-weight attributes. The values can be 0, 4 or 8. |
| [LineIndices](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/lineindices/) { get; } | Gets a sequence of tuples where each item represents the vertex indices of a line. |
| [MorphTargetsCount](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/morphtargetscount/) { get; } | Gets a value indicating the total number of morph targets for this primitive. |
| [TexCoordsCount](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/texcoordscount/) { get; } | Gets a value indicating the number of texture coordinate vertex attributes. In the range of 0 to 2. |
| [TriangleIndices](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/triangleindices/) { get; } | Gets a sequence of tuples where each item represents the vertex indices of a triangle. |
| [VertexCount](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/vertexcount/) { get; } | Gets a value indicating the total number of vertices for this primitive. |

## Methods

| Name | Description |
| --- | --- |
| [GetColor](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getcolor/)(int, int) | Gets the color for the given vertex. |
| [GetColorDeltas](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getcolordeltas/)(int, int) | Gets the sequence of color deltas for the given vertex. (morph targets) |
| [GetNormal](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getnormal/)(int) | Gets the normal for the given vertex. |
| [GetNormalDeltas](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getnormaldeltas/)(int) | Gets the sequence of normals deltas for the given vertex. (morph targets) |
| [GetPosition](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getposition/)(int) | Gets the position for the given vertex. |
| [GetPositionDeltas](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getpositiondeltas/)(int) | Gets the sequence of position deltas for the given vertex. (morph targets) |
| [GetSkinWeights](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/getskinweights/)(int) | Gets the skin weights for the given vertex. |
| [GetTangent](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/gettangent/)(int) | Gets the tangent for the given vertex. |
| [GetTangentDeltas](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/gettangentdeltas/)(int) | Gets the sequence of tangent deltas for the given vertex. (morph targets) |
| [GetTextureCoord](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/gettexturecoord/)(int, int) | Gets the UV coordinate for the given vertex. |
| [GetTextureCoordDeltas](../../aspose.cad.fileformats.glb.runtime/imeshprimitivedecoder/gettexturecoorddeltas/)(int, int) | Gets the sequence of texture coordinate deltas for the given vertex. (morph targets) |

## Remarks

Implemented by _MeshPrimitiveDecoder

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../aspose.cad.fileformats.glb.runtime/)
* assembly [Aspose.CAD](../../)


