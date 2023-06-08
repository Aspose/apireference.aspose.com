---
title: Struct VertexBuilderTvGTvMTvS
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexBuilder3TvGTvMTvS struct. Represents an individual vertex object
type: docs
weight: 10060
url: /net/aspose.cad.fileformats.glb.geometry/vertexbuilder-3/
---
## VertexBuilder&lt;TvG,TvM,TvS&gt; structure

Represents an individual vertex object.

```csharp
public struct VertexBuilder<TvG, TvM, TvS> : IEquatable<VertexBuilder>, IVertexBuilder
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

| Parameter | Description |
| --- | --- |
| TvG | The vertex fragment type with Position, Normal and Tangent.Valid types are: |
| TvM | The vertex fragment type with Colors, Texture Coordinates, and custom attributes.Valid types are: |
| TvS | The vertex fragment type with Skin Joint Weights.Valid types are: |

## Constructors

| Name | Description |
| --- | --- |
| [VertexBuilder](vertexbuilder/#constructor)(ref TvG) |  |
| [VertexBuilder](vertexbuilder/#constructor_1)(ref TvG, params (int JointIndex, float Weight)[]) |  |
| [VertexBuilder](vertexbuilder/#constructor_7)(TvG, SparseWeight8) |  |
| [VertexBuilder](vertexbuilder/#constructor_2)(ref TvG, ref TvM) |  |
| [VertexBuilder](vertexbuilder/#constructor_6)(ref TvG, ref TvS) |  |
| [VertexBuilder](vertexbuilder/#constructor_4)(ref TvG, ref TvM, params (int JointIndex, float Weight)[]) |  |
| [VertexBuilder](vertexbuilder/#constructor_3)(ref TvG, ref TvM, ref SparseWeight8) |  |
| [VertexBuilder](vertexbuilder/#constructor_5)(ref TvG, ref TvM, ref TvS) |  |

## Properties

| Name | Description |
| --- | --- |
| [Position](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/position/) { get; set; } |  |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/create/#create)(ref Vector3) |  |
| static [Create](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/create/#create_1)(ref Vector3, ref Vector3) |  |
| static [Create](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/create/#create_2)(ref Vector3, ref Vector3, ref Vector4) |  |
| static [CreateFrom](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/createfrom/)(IVertexBuilder) |  |
| override [Equals](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/equals/#equals)(VertexBuilder) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/gethashcode/)() |  |
| [TransformedBy](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/transformedby/)(ref Matrix4x4) |  |
| [Validate](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/validate/)() |  |
| [WithGeometry](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withgeometry/#withgeometry)(ref Vector3) |  |
| [WithGeometry](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withgeometry/#withgeometry_1)(ref Vector3, ref Vector3) |  |
| [WithGeometry](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withgeometry/#withgeometry_2)(ref Vector3, ref Vector3, ref Vector4) |  |
| [WithMaterial](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withmaterial/#withmaterial)(params Vector2[]) |  |
| [WithMaterial](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withmaterial/#withmaterial_1)(ref Vector4, params Vector2[]) |  |
| [WithMaterial](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withmaterial/#withmaterial_2)(ref Vector4, Vector4, params Vector2[]) |  |
| [WithSkinning](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withskinning/#withskinning_2)(params (int Index, float Weight)[]) |  |
| [WithSkinning](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withskinning/#withskinning_1)(IEnumerable&lt;(int Index, float Weight)&gt;) |  |
| [WithSkinning](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/withskinning/#withskinning)(ref SparseWeight8) |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/areequal/)(ref VertexBuilder, ref VertexBuilder) |  |
| static [CreateCompatibleMesh](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/createcompatiblemesh/#createcompatiblemesh)(string) |  |
| static [CreateCompatibleMesh&lt;TMaterial&gt;](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/createcompatiblemesh/#createcompatiblemesh_1)(string) |  |
| [operator ==](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/op_equality/) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/op_implicit/#op_implicit_2) |  (4 operators) |
| [operator !=](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| [Geometry](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/geometry/) |  |
| [Material](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/material/) |  |
| [Skinning](../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/skinning/) |  |

### See Also

* interface [IVertexBuilder](../ivertexbuilder/)
* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


