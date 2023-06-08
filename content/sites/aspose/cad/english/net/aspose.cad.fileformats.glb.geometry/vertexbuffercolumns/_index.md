---
title: Class VertexBufferColumns
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexBufferColumns class. Represents a vertex buffer where every vertex attribute is represented as a vector column
type: docs
weight: 10050
url: /net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/
---
## VertexBufferColumns class

Represents a vertex buffer, where every vertex attribute is represented as a vector column.

```csharp
public class VertexBufferColumns
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexBufferColumns](vertexbuffercolumns/#constructor)() | The default constructor. |
| [VertexBufferColumns](vertexbuffercolumns/#constructor_1)(VertexBufferColumns) |  |

## Properties

| Name | Description |
| --- | --- |
| [Colors0](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/colors0/) { get; set; } |  |
| [Colors1](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/colors1/) { get; set; } |  |
| [Joints0](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/joints0/) { get; set; } |  |
| [Joints1](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/joints1/) { get; set; } |  |
| [MorphTargets](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/morphtargets/) { get; } |  |
| [Normals](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/normals/) { get; set; } |  |
| [Positions](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/positions/) { get; set; } |  |
| [Tangents](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/tangents/) { get; set; } |  |
| [TexCoords0](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/texcoords0/) { get; set; } |  |
| [TexCoords1](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/texcoords1/) { get; set; } |  |
| [TexCoords2](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/texcoords2/) { get; set; } |  |
| [TexCoords3](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/texcoords3/) { get; set; } |  |
| [Weights0](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/weights0/) { get; set; } |  |
| [Weights1](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/weights1/) { get; set; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddMorphTarget](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/addmorphtarget/)() |  |
| [GetCompatibleVertexType](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/getcompatiblevertextype/)() |  |
| [GetVertex](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/getvertex/#getvertex)(Type, int) |  |
| [GetVertex&lt;TvG,TvM&gt;](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/getvertex/#getvertex_1)(int) |  |
| [GetVertex&lt;TvG,TvM,TvS&gt;](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/getvertex/#getvertex_2)(int) |  |
| [IsolateColumns](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/isolatecolumns/)() | Performs an in-place copy of the contents of every column, which guarantees that the columns of this `VertexBufferColumns` are not shared by any other object and can be modified safely. |
| [WithTransform](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/withtransform/)(IGeometryTransform) |  |
| static [CalculateSmoothNormals](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/calculatesmoothnormals/)(IReadOnlyList&lt;(VertexBufferColumns Vertices, IEnumerable&lt;(int A, int B, int C)&gt; Indices)&gt;) |  |
| static [CalculateTangents](../../aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/calculatetangents/)(IReadOnlyList&lt;(VertexBufferColumns Vertices, IEnumerable&lt;(int A, int B, int C)&gt; Indices)&gt;) |  |

## Remarks

One of the use cases of `VertexBufferColumns` is to bind the different attribute columns directly to the [`Accessor`](../../aspose.cad.fileformats.glb/accessor/) source feed, which means that if you modify the contents of a column that is bound directly to a model, you're modifying the model's internal data.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


