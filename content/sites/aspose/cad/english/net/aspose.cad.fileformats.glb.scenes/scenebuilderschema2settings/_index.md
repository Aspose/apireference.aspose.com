---
title: Struct SceneBuilderSchema2Settings
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.SceneBuilderSchema2Settings struct. Defines configurable options for converting SceneBuilder to GlbImage
type: docs
weight: 11120
url: /net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/
---
## SceneBuilderSchema2Settings structure

Defines configurable options for converting [`SceneBuilder`](../scenebuilder/) to [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/)

```csharp
public struct SceneBuilderSchema2Settings
```

## Properties

| Name | Description |
| --- | --- |
| static [Default](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/default/) { get; } |  |
| static [WithGpuInstancing](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/withgpuinstancing/) { get; } |  |
| [CompactVertexWeights](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/compactvertexweights/) { get; set; } | if meshes have Skin Weights, defines the output vertex element format: - True: Short - False: Float |
| [GpuMeshInstancingMinCount](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/gpumeshinstancingmincount/) { get; set; } | determines the mínimum number mesh instances required to enable Gpu mesh instancing. |
| [MergeBuffers](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/mergebuffers/) { get; set; } | Merges all the Buffer objects into a single big buffer. Default value is TRUE. |
| [UseStridedBuffers](../../aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/usestridedbuffers/) { get; set; } | When true, meshes will be created using strided vertices when possible. |

## Remarks

Used by [`ToGltf2`](../scenebuilder/togltf2/)

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


