---
title: Delegate ImageDecodeCallback
second_title: Aspose.CAD for .NET API Reference
description: Callback used to intercept the loading of textures so they can be decoded by the client engine and uploaded to the GPU if neccesary
type: docs
weight: 10420
url: /net/aspose.cad.fileformats.glb/imagedecodecallback/
---
## ImageDecodeCallback delegate

Callback used to intercept the loading of textures so they can be decoded by the client engine and uploaded to the GPU if neccesary.

```csharp
public delegate bool ImageDecodeCallback(ImageGlb image);
```

| Parameter | Type | Description |
| --- | --- | --- |
| image | ImageGlb | The Image containing the texture |

### Return Value

True if we want to keep the image memory data inside [`ImageGlb`](../imageglb/). Otherwise the memory will be cleared and [`ImageGlb`](../imageglb/) will be empty.

### See Also

* class [ImageGlb](../imageglb/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


