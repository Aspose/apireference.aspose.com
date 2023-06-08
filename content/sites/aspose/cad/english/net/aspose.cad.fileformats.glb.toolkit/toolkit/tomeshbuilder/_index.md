---
title: Toolkit.ToMeshBuilder
second_title: Aspose.CAD for .NET API Reference
description: Toolkit method. 
type: docs
weight: 190
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/tomeshbuilder/
---
## ToMeshBuilder(this Mesh) {#tomeshbuilder}

```csharp
public static IMeshBuilder<MaterialBuilder> ToMeshBuilder(this Mesh srcMesh)
```

### See Also

* interface [IMeshBuilder&lt;TMaterial&gt;](../../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* class [Mesh](../../../aspose.cad.fileformats.glb/mesh/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## ToMeshBuilder&lt;TvG,TvM,TvS&gt;(this IEnumerable&lt;EvaluatedTriangle&lt;TvG, TvM, TvS&gt;&gt;) {#tomeshbuilder_2}

```csharp
public static MeshBuilder<MaterialBuilder, TvG, TvM, TvS> ToMeshBuilder<TvG, TvM, TvS>(
    this IEnumerable<EvaluatedTriangle<TvG, TvM, TvS>> triangles)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

### See Also

* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* struct [EvaluatedTriangle&lt;TvG,TvM,TvS&gt;](../../evaluatedtriangle-3/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## ToMeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;(this IEnumerable&lt;(VertexBuilder&lt;TvG, TvM, TvS&gt; A, VertexBuilder&lt;TvG, TvM, TvS&gt; B, VertexBuilder&lt;TvG, TvM, TvS&gt; C, TMaterial Material)&gt;, Converter&lt;TMaterial, MaterialBuilder&gt;) {#tomeshbuilder_1}

```csharp
public static MeshBuilder<MaterialBuilder, TvG, TvM, TvS> ToMeshBuilder<TMaterial, TvG, TvM, TvS>(
    this IEnumerable<(VertexBuilder<TvG, TvM, TvS> A, VertexBuilder<TvG, TvM, TvS> B, VertexBuilder<TvG, TvM, TvS> C, TMaterial Material)> triangles, 
    Converter<TMaterial, MaterialBuilder> materialFunc)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
    where TvS : struct, IVertexSkinning
```

### See Also

* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* struct [VertexBuilder&lt;TvG,TvM,TvS&gt;](../../../aspose.cad.fileformats.glb.geometry/vertexbuilder-3/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* interface [IVertexSkinning](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexskinning/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)


