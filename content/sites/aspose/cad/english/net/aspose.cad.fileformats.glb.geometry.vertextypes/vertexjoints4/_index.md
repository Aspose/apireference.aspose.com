---
title: Struct VertexJoints4
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.VertexJoints4 struct. Defines a Vertex attribute with up to 65535 bone joints and 4 weights
type: docs
weight: 10210
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/
---
## VertexJoints4 structure

Defines a Vertex attribute with up to 65535 bone joints and 4 weights.

```csharp
public struct VertexJoints4 : IEquatable<VertexJoints4>, IVertexSkinning
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexJoints4](vertexjoints4/#constructor_2)(params (int JointIndex, float Weight)[]) |  |
| [VertexJoints4](vertexjoints4/#constructor_1)(int) |  |
| [VertexJoints4](vertexjoints4/#constructor)(ref SparseWeight8) |  |

## Properties

| Name | Description |
| --- | --- |
| [MaxBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/maxbindings/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| override [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/equals/#equals)(VertexJoints4) |  |
| [GetBinding](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/getbinding/)(int) |  |
| [GetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/getbindings/)() |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/gethashcode/)() |  |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/setbindings/#setbindings_1)(params (int Index, float Weight)[]) |  |
| [SetBindings](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/setbindings/#setbindings)(ref SparseWeight8) |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/areequal/)(ref VertexJoints4, ref VertexJoints4) |  |
| [operator ==](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/op_equality/) |  |
| [operator !=](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| [Joints](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/joints/) | Stores the indices of the 4 joints. |
| [Weights](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/weights/) | Stores the weights of the 4 joints. |

### See Also

* interface [IVertexSkinning](../ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


