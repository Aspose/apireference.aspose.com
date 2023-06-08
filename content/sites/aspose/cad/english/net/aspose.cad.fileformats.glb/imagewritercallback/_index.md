---
title: Delegate ImageWriterCallback
second_title: Aspose.CAD for .NET API Reference
description: Callback to control the image writing behavior
type: docs
weight: 10440
url: /net/aspose.cad.fileformats.glb/imagewritercallback/
---
## ImageWriterCallback delegate

Callback to control the image writing behavior.

```csharp
public delegate string ImageWriterCallback(WriteContext context, string assetName, 
    MemoryImage image);
```

| Parameter | Type | Description |
| --- | --- | --- |
| context | WriteContext | The current model writing context. |
| assetName | String | The default gltf URI used to reference the image. |
| image | MemoryImage | The image to write. |

### Return Value

The final glTF URI. If it didn't change, return the value of

.

### See Also

* class [WriteContext](../writecontext/)
* struct [MemoryImage](../../aspose.cad.fileformats.glb.memory/memoryimage/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


