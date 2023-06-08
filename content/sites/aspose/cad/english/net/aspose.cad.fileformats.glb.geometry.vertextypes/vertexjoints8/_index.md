---
title: Struct VertexJoints8
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.VertexJoints8 struct. Defines a Vertex attribute with up to 65535 bone joints and 8 weights
type: docs
weight: 10220
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/
---
## VertexJoints8 structure

Defines a Vertex attribute with up to 65535 bone joints and 8 weights.

```csharp
public struct VertexJoints8 : IEquatable<VertexJoints8>, IVertexSkinning
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexJoints8](vertexjoints8/#constructor_2)(params (int JointIndex, float Weight)[]) |  |
| [VertexJoints8](vertexjoints8/#constructor_1)(int) |  |
| [VertexJoints8](vertexjoints8/#constructor)(ref SparseWeight8) |  |

## Properties

| Name | Description |
| --- | --- |
| [MaxBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/maxbindings/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| override [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/equals/#equals)(VertexJoints8) |  |
| [GetBinding](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/getbinding/)(int) |  |
| [GetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/getbindings/)() |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/gethashcode/)() |  |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/setbindings/#setbindings_1)(params (int Index, float Weight)[]) |  |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/setbindings/#setbindings)(ref SparseWeight8) |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/areequal/)(ref VertexJoints8, ref VertexJoints8) |  |
| [operator ==](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/op_equality/) |  |
| [operator !=](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| [Joints0](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/joints0/) | Stores the indices of the first 4 joints. |
| [Joints1](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/joints1/) | Stores the indices of the next 4 joints. |
| [Weights0](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/weights0/) | Stores the weights of the first 4 joints. |
| [Weights1](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/weights1/) | Stores the weights of the next 4 joints. |

### See Also

* interface [IVertexSkinning](../ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


