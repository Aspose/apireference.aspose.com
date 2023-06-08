---
title: Class MeshBuilderTvG
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.MeshBuilder1TvG class. 
type: docs
weight: 9970
url: /net/aspose.cad.fileformats.glb.geometry/meshbuilder-1/
---
## MeshBuilder&lt;TvG&gt; class

```csharp
public class MeshBuilder<TvG> : MeshBuilder<MaterialBuilder, TvG, VertexEmpty, VertexEmpty>
    where TvG : struct, IVertexGeometry
```

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
| [AddMesh](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/)(IMeshBuilder&lt;MaterialBuilder&gt;, Matrix4x4) |  |
| [AddMesh](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/)(IMeshBuilder&lt;MaterialBuilder&gt;, Func&lt;MaterialBuilder, MaterialBuilder&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, VertexEmpty, VertexEmpty&gt;&gt;) |  |
| [AddMesh&lt;TSourceMaterial&gt;](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/addmesh/)(IMeshBuilder&lt;TSourceMaterial&gt;, Func&lt;TSourceMaterial, MaterialBuilder&gt;, Converter&lt;IVertexBuilder, VertexBuilder&lt;TvG, VertexEmpty, VertexEmpty&gt;&gt;) |  |
| [Clone](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/clone/)(Func&lt;MaterialBuilder, MaterialBuilder&gt;) |  |
| [TransformVertices](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/transformvertices/)(Func&lt;VertexBuilder&lt;TvG, VertexEmpty, VertexEmpty&gt;, VertexBuilder&lt;TvG, VertexEmpty, VertexEmpty&gt;&gt;) |  |
| [UseMorphTarget](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/usemorphtarget/)(int) |  |
| [UsePrimitive](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/useprimitive/)(MaterialBuilder, int) |  |
| [Validate](../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/validate/)() |  |

### See Also

* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../meshbuilder-4/)
* class [MaterialBuilder](../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* struct [VertexEmpty](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/)
* interface [IVertexGeometry](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../aspose.cad.fileformats.glb.geometry/)
* assembly [Aspose.CAD](../../)


