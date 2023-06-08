---
title: Class MorphTargetBuilderTMaterialTvGTvSTvM
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.MorphTargetBuilder4TMaterialTvGTvSTvM class. Represents the vertex deltas of a specific morph target. UseMorphTarget
type: docs
weight: 10010
url: /net/aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/
---
## MorphTargetBuilder&lt;TMaterial,TvG,TvS,TvM&gt; class

Represents the vertex deltas of a specific morph target. [`UseMorphTarget`](../meshbuilder-4/usemorphtarget/)

```csharp
public sealed class MorphTargetBuilder<TMaterial, TvG, TvS, TvM> : IMorphTargetBuilder
    where TvG : struct, IVertexGeometry
    where TvS : struct, IVertexSkinning
    where TvM : struct, IVertexMaterial
```

| Parameter | Description |
| --- | --- |
| TMaterial | The material type used by the base mesh. |
| TvG | The vertex geometry type used by the base mesh. |
| TvS | The vertex skinning type used by the base mesh. |
| TvM | The vertex material type used by the base mesh. |

## Properties

| Name | Description |
| --- | --- |
| [Positions](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/positions/) { get; } |  |
| [Vertices](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/vertices/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [GetVertices](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/getvertices/)(Vector3) | Gets a collection of vertices sharing this vertex position. |
| [SetVertex](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertex/#setvertex_1)(TvG, TvG) |  |
| [SetVertex](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertex/#setvertex)(TvG, VertexBuilder&lt;TvG, TvM, VertexEmpty&gt;) |  |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertexdelta/#setvertexdelta_2)(TvG, VertexGeometryDelta) |  |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertexdelta/#setvertexdelta)(Vector3, VertexGeometryDelta) |  |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertexdelta/#setvertexdelta_3)(TvG, VertexGeometryDelta, VertexMaterialDelta) |  |
| [SetVertexDelta](../../aspose.cad.fileformats.glb.geometry/morphtargetbuilder-4/setvertexdelta/#setvertexdelta_1)(Vector3, VertexGeometryDelta, VertexMaterialDelta) |  |

## Remarks

Morph targets are stored separately on each [`PrimitiveBuilder`](../primitivebuilder-4/), so connecting vertices between two primitives might be duplicated. This means that when we set a displaced vertex, we must be sure we do so for all instances we can find.

### See Also

* interface [IMorphTargetBuilder](../imorphtargetbuilder/)
* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexSkinning](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* interface [IVertexMaterial](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


