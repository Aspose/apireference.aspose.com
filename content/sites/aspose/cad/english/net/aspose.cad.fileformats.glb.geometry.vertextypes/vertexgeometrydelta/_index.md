---
title: Struct VertexGeometryDelta
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.VertexGeometryDelta struct. Defines a Vertex attribute with a Position a Normal and a Tangent
type: docs
weight: 10190
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/
---
## VertexGeometryDelta structure

Defines a Vertex attribute with a Position, a Normal and a Tangent.

```csharp
public struct VertexGeometryDelta : IEquatable<VertexGeometryDelta>, IVertexGeometry
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexGeometryDelta](vertexgeometrydelta/#constructor)(IVertexGeometry) |  |
| [VertexGeometryDelta](vertexgeometrydelta/#constructor_1)(ref Vector3, ref Vector3, ref Vector3) |  |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/add/)(ref VertexGeometryDelta) |  |
| [ApplyTransform](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/applytransform/)(ref Matrix4x4) |  |
| override [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/equals/#equals)(VertexGeometryDelta) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/gethashcode/)() |  |
| [GetPosition](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/getposition/)() |  |
| [Subtract](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/subtract/)(IVertexGeometry) |  |
| [TryGetNormal](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/trygetnormal/)(out Vector3) |  |
| [TryGetTangent](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/trygettangent/)(out Vector4) |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/areequal/)(ref VertexGeometryDelta, ref VertexGeometryDelta) |  |
| [operator ==](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/op_equality/) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/op_implicit/#op_implicit) |  (3 operators) |
| [operator !=](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| [NormalDelta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/normaldelta/) |  |
| [PositionDelta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/positiondelta/) |  |
| [TangentDelta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexgeometrydelta/tangentdelta/) |  |

### See Also

* interface [IVertexGeometry](../ivertexgeometry/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


