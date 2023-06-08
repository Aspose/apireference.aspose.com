---
title: SceneBuilderSchema2Settings.GpuMeshInstancingMinCount
second_title: Aspose.CAD for .NET API Reference
description: SceneBuilderSchema2Settings property. determines the mínimum number mesh instances required to enable Gpu mesh instancing
type: docs
weight: 40
url: /net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/gpumeshinstancingmincount/
---
## SceneBuilderSchema2Settings.GpuMeshInstancingMinCount property

determines the mínimum number mesh instances required to enable Gpu mesh instancing.

```csharp
public int GpuMeshInstancingMinCount { get; set; }
```

## Remarks

Set to MaxValue to disable gpu instancing.

If set to a small value like 10, any mesh instance collection smaller than this will be instantiated using individual nodes, otherwise it will use Gpu Instancing extension.

### See Also

* struct [SceneBuilderSchema2Settings](../)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../scenebuilderschema2settings/)
* assembly [Aspose.CAD](../../../)


