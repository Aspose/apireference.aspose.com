---
title: Interface IVertexSkinning
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.IVertexSkinning interface. Represents the interface that must be implemented by a skinning vertex fragment
type: docs
weight: 10100
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/
---
## IVertexSkinning interface

Represents the interface that must be implemented by a skinning vertex fragment.

```csharp
public interface IVertexSkinning
```

## Properties

| Name | Description |
| --- | --- |
| [JointsHigh](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/jointshigh/) { get; } | Gets the indices of the next 4 joints, if supported. |
| [JointsLow](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/jointslow/) { get; } | Gets the indices of the first 4 joints. |
| [MaxBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/maxbindings/) { get; } | Gets the Number of valid joints supported.Typical values are 0, 4 or 8. |
| [WeightsHigh](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/weightshigh/) { get; } | Gets the weights of the next 4 joints, if supported. |
| [WeightsLow](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/weightslow/) { get; } | Gets the weights of the first 4 joints. |

## Methods

| Name | Description |
| --- | --- |
| [GetBinding](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/getbinding/)(int) | Gets a joint-weight pair. |
| [GetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/getbindings/)() | Gets the packed joints-weights. |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/setbindings/#setbindings_1)(params (int Index, float Weight)[]) | Sets the packed joints-weights. |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/setbindings/#setbindings)(ref SparseWeight8) |  |

## Remarks

Implemented by:

[`VertexEmpty`](../vertexempty/)

[`VertexJoints4`](../vertexjoints4/)

[`VertexJoints8`](../vertexjoints8/)

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


