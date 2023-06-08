---
title: Class MeshBuilderTMaterialTvGTvMTvS
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.MeshBuilder4TMaterialTvGTvMTvS class. Represents an utility class to help build meshes by adding primitives associated with a given material
type: docs
weight: 10000
url: /net/aspose.cad.fileformats.glb.geometry/meshbuilder-4/
---
## MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt; class

Represents an utility class to help build meshes by adding primitives associated with a given material.

```csharp
public class MeshBuilder<TMaterial, TvG, TvM, TvS> : BaseBuilder, ICloneable, 
    IMeshBuilder<TMaterial>
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

| Parameter | Description |
| --- | --- |
| TMaterial | The material type used by this [`PrimitiveBuilder`](../primitivebuilder-4/) instance. |
| TvG | The vertex fragment type with Position, Normal and Tangent. Valid types are: |
| TvM | The vertex fragment type with Colors and Texture Coordinates. Valid types are: |
| TvS | The vertex fragment type with Skin Joint Weights. Valid types are: |

## Constructors

| Name | Description |
| --- | --- |
| [MeshBuilder](meshbuilder/)(string) |  |

## Properties

| Name | Description |
| --- | --- |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [IsEmpty](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/isempty/) { get; } |  |
| [Materials](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/materials/) { get; } |  |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Primitives](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/primitives/) { get; } |  |
| [VertexPreprocessor](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/vertexpreprocessor/) { get; set; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddMesh](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/#addmesh_1)(IMeshBuilder&lt;TMaterial&gt;, Matrix4x4) |  |
| [AddMesh](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/#addmesh)(IMeshBuilder&lt;TMaterial&gt;, Func&lt;TMaterial, TMaterial&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) |  |
| [AddMesh&lt;TSourceMaterial&gt;](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/#addmesh_2)(IMeshBuilder&lt;TSourceMaterial&gt;, Func&lt;TSourceMaterial, TMaterial&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) |  |
| [Clone](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/clone/)(Func&lt;TMaterial, TMaterial&gt;) |  |
| [TransformVertices](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/transformvertices/)(Func&lt;VertexBuilder&lt;TvG, TvM, TvS&gt;, VertexBuilder&lt;TvG, TvM, TvS&gt;&gt;) | Transforms all the points of all the [`PrimitiveBuilder`](../primitivebuilder-4/) of the this `MeshBuilder` using the given lambfa function. |
| [UseMorphTarget](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/usemorphtarget/)(int) |  |
| [UsePrimitive](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/useprimitive/)(TMaterial, int) | Creates, or uses an existing primitive using *material*. |
| [Validate](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/validate/)() |  |

### See Also

* class [BaseBuilder](../basebuilder/)
* interface [IMeshBuilder&lt;TMaterial&gt;](../imeshbuilder-1/)
* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


