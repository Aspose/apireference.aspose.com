---
title: Toolkit.ToStaticMeshBuilder
second_title: Aspose.CAD for .NET API Reference
description: Toolkit method. Evaluates the current srcScene at a given animation and time and creates a static MeshBuilder
type: docs
weight: 220
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/tostaticmeshbuilder/
---
## ToStaticMeshBuilder&lt;TMaterial,TvG,TvM&gt;(this Scene, Converter&lt;Material, TMaterial&gt;, RuntimeOptions, Animation, float) {#tostaticmeshbuilder_1}

Evaluates the current *srcScene* at a given *animation* and *time* and creates a static [`MeshBuilder`](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/)

```csharp
public static MeshBuilder<TMaterial, TvG, TvM, VertexEmpty> 
    ToStaticMeshBuilder<TMaterial, TvG, TvM>(this Scene srcScene, 
    Converter<Material, TMaterial> materialFunc, RuntimeOptions options, Animation animation, 
    float time)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
```

| Parameter | Description |
| --- | --- |
| TMaterial | Any material type |
| TvG | A subtype of [`IVertexGeometry`](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/) |
| TvM | A subtype of [`IVertexMaterial`](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/) |
| srcScene | The source [`Scene`](../../../aspose.cad.fileformats.glb/scene/) to evaluate. |
| materialFunc | A function to convert [`Material`](../../../aspose.cad.fileformats.glb/material/) into *TMaterial*. |
| options | Evaluation options. |
| animation | The source [`Animation`](../../../aspose.cad.fileformats.glb/animation/) to evaluate. |
| time | A time point, in seconds, within *animation*. |

### Return Value

A new [`MeshBuilder`](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/) containing the evaluated geometry.

### See Also

* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/)
* struct [VertexEmpty](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/)
* class [Scene](../../../aspose.cad.fileformats.glb/scene/)
* class [Material](../../../aspose.cad.fileformats.glb/material/)
* class [RuntimeOptions](../../../aspose.cad.fileformats.glb.runtime/runtimeoptions/)
* class [Animation](../../../aspose.cad.fileformats.glb/animation/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)

---

## ToStaticMeshBuilder&lt;TvG,TvM&gt;(this Scene, RuntimeOptions, Animation, float) {#tostaticmeshbuilder}

```csharp
public static MeshBuilder<MaterialBuilder, TvG, TvM, VertexEmpty> ToStaticMeshBuilder<TvG, TvM>(
    this Scene srcScene, RuntimeOptions options, Animation animation, float time)
    where TvG : struct, IVertexGeometry
    where TvM : struct, IVertexMaterial
```

### See Also

* class [MeshBuilder&lt;TMaterial,TvG,TvM,TvS&gt;](../../../aspose.cad.fileformats.glb.geometry/meshbuilder-4/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* struct [VertexEmpty](../../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexempty/)
* class [Scene](../../../aspose.cad.fileformats.glb/scene/)
* class [RuntimeOptions](../../../aspose.cad.fileformats.glb.runtime/runtimeoptions/)
* class [Animation](../../../aspose.cad.fileformats.glb/animation/)
* interface [IVertexGeometry](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexgeometry/)
* interface [IVertexMaterial](../../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)


