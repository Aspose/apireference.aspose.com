---
title: Interface IMorphTargetBuilder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.IMorphTargetBuilder interface. Represents the vertex deltas of a specific morph target. UseMorphTarget
type: docs
weight: 9910
url: /net/aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/
---
## IMorphTargetBuilder interface

Represents the vertex deltas of a specific morph target. [`UseMorphTarget`](../imeshbuilder-1/usemorphtarget/)

```csharp
public interface IMorphTargetBuilder
```

## Properties

| Name | Description |
| --- | --- |
| [Positions](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/positions/) { get; } | Gets the collection of vertex positions in the base mesh |
| [Vertices](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/vertices/) { get; } | Gets the collection of vertex geometry parts in the base mesh |

## Methods

| Name | Description |
| --- | --- |
| [GetVertices](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/getvertices/)(Vector3) | Gets a collection of vertices sharing this vertex position. |
| [SetVertex](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertex/#setvertex)(IVertexGeometry, IVertexGeometry) | Sets an absolute morph target. |
| [SetVertex](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertex/#setvertex_1)(IVertexGeometry, IVertexGeometry, IVertexMaterial) | Sets an absolute morph target. |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertexdelta/#setvertexdelta)(IVertexGeometry, VertexGeometryDelta) | Sets a relative morph target |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertexdelta/#setvertexdelta_2)(Vector3, VertexGeometryDelta) | Sets a relative morph target to all base mesh vertices matching *meshPosition*. |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertexdelta/#setvertexdelta_1)(IVertexGeometry, VertexGeometryDelta, VertexMaterialDelta) | Sets a relative morph target |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/imorphtargetbuilder/setvertexdelta/#setvertexdelta_3)(Vector3, VertexGeometryDelta, VertexMaterialDelta) | Sets a relative morph target to all base mesh vertices matching *meshPosition*. |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


