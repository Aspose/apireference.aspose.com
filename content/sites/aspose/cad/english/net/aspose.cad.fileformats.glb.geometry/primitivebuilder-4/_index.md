---
title: Class PrimitiveBuilderTMaterialTvGTvMTvS
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.PrimitiveBuilder4TMaterialTvGTvMTvS class. Represents an utility class to help build mesh primitives by adding points lines or triangles
type: docs
weight: 10030
url: /net/aspose.cad.fileformats.glb.geometry/primitivebuilder-4/
---
## PrimitiveBuilder&lt;TMaterial,TvG,TvM,TvS&gt; class

Represents an utility class to help build mesh primitives by adding points, lines or triangles

```csharp
public abstract class PrimitiveBuilder<TMaterial, TvG, TvM, TvS> : IPrimitiveBuilder, 
    IPrimitiveReader<TMaterial>
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

| Parameter | Description |
| --- | --- |
| TMaterial | The material type used by this `PrimitiveBuilder` instance. |
| TvG | The vertex fragment type with Position, Normal and Tangent. Valid types are: - [`VertexPosition`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexposition/) - [`VertexPositionNormal`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpositionnormal/) - [`VertexPositionNormalTangent`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexpositionnormaltangent/) |
| TvM | The vertex fragment type with Colors and Texture Coordinates. Valid types are: - [`VertexEmpty`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/) - [`VertexColor1`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexcolor1/) - [`VertexTexture1`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertextexture1/) - [`VertexColor1Texture1`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexcolor1texture1/) - [`VertexColor1Texture2`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexcolor1texture2/) - [`VertexColor1Texture1`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexcolor1texture1/) - [`VertexColor2Texture2`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexcolor2texture2/) |
| TvS | The vertex fragment type with Skin Joint Weights. Valid types are: - [`VertexEmpty`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/) - [`VertexJoints4`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints4/) - [`VertexJoints8`](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexjoints8/) |

## Properties

| Name | Description |
| --- | --- |
| virtual [Lines](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/lines/) { get; } | Gets the list in indices of the lines contained in this primitive. |
| [Material](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/material/) { get; } | Gets the *TMaterial* used by this primitive. |
| [Mesh](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/mesh/) { get; } | Gets the parent mesh that owns this primitive. |
| virtual [Points](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/points/) { get; } | Gets the list in indices of the points contained in this primitive. |
| virtual [Surfaces](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/surfaces/) { get; } | Gets the list in indices of the surfaces contained in this primitive. |
| virtual [Triangles](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/triangles/) { get; } | Gets the list in indices of triangles contained in this primitive. |
| [VertexType](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/vertextype/) { get; } | Gets the type of the vertex used by this primitive. |
| [Vertices](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/vertices/) { get; } | Gets the list of vertices used by this primitive. |
| abstract [VerticesPerPrimitive](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/verticesperprimitive/) { get; } | Gets the number of vertices used by each primitive: 1 - Points 2 - Lines 3 - Triangles |

## Methods

| Name | Description |
| --- | --- |
| [AddLine](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addline/#addline)(IVertexBuilder, IVertexBuilder) | Adds a line. |
| virtual [AddLine](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addline/#addline_1)(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) | Adds a line. |
| [AddPoint](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addpoint/#addpoint)(IVertexBuilder) | Adds a point. |
| virtual [AddPoint](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addpoint/#addpoint_1)(VertexBuilder&lt;TvG, TvM, TvS&gt;) | Adds a point. |
| [AddQuadrangle](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addquadrangle/#addquadrangle)(IVertexBuilder, IVertexBuilder, IVertexBuilder, IVertexBuilder) | Adds a quadrangle. |
| virtual [AddQuadrangle](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addquadrangle/#addquadrangle_1)(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) | Adds a quadrangle. |
| [AddTriangle](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addtriangle/#addtriangle)(IVertexBuilder, IVertexBuilder, IVertexBuilder) | Adds a triangle. |
| virtual [AddTriangle](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/addtriangle/#addtriangle_1)(VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;) | Adds a triangle. |
| [ContainsVertex](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/containsvertex/)(ref VertexBuilder&lt;TvG, TvM, TvS&gt;) | Checks if a vertex is already in the vertex buffer. |
| abstract [GetIndices](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/getindices/)() |  |
| [TransformVertices](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/transformvertices/)(Func&lt;VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) |  |
| [Validate](../../aspose.cad.fileformats.glb.geometry/primitivebuilder-4/validate/)() |  |

### See Also

* interface [IPrimitiveBuilder](../iprimitivebuilder/)
* interface [IPrimitiveReader&lt;TMaterial&gt;](../iprimitivereader-1/)
* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


