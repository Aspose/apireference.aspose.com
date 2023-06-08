---
title: Interface IVertexGeometry
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.IVertexGeometry interface. Represents the interface that must be implemented by a geometry vertex fragment
type: docs
weight: 10080
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/
---
## IVertexGeometry interface

Represents the interface that must be implemented by a geometry vertex fragment.

```csharp
public interface IVertexGeometry
```

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/add/)(ref VertexGeometryDelta) |  |
| [ApplyTransform](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/applytransform/)(ref Matrix4x4) |  |
| [GetPosition](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/getposition/)() | Gets the position of the vertex. |
| [SetNormal](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/setnormal/)(ref Vector3) |  |
| [SetPosition](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/setposition/)(ref Vector3) |  |
| [SetTangent](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/settangent/)(ref Vector4) |  |
| [Subtract](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/subtract/)(IVertexGeometry) | calculates the difference between this vertex and *baseValue* |
| [TryGetNormal](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/trygetnormal/)(out Vector3) | Tries to get the normal of the vertex. |
| [TryGetTangent](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/trygettangent/)(out Vector4) | Tries to get the tangent of the vertex. |

## Remarks

Implemented by:

[`VertexPosition`](../vertexposition/)

[`VertexPositionNormal`](../vertexpositionnormal/)

[`VertexPositionNormalTangent`](../vertexpositionnormaltangent/)

[`VertexGeometryDelta`](../vertexgeometrydelta/)

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


