---
title: MemoryImage.SourcePath
second_title: Aspose.CAD for .NET API Reference
description: MemoryImage property. Gets the source path of this image or null
type: docs
weight: 140
url: /net/aspose.cad.fileformats.glb.memory/memoryimage/sourcepath/
---
## MemoryImage.SourcePath property

Gets the source path of this image, or **null**.

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️** see remarks.

```csharp
public string SourcePath { get; }
```

## Remarks

Not all images are expected to have a source path. Specifically images embedded in a GLB file or encoded with BASE64 will not have any source path at all. So if your code depends on images having a path, it might crash on gltf files with embedded images.

### See Also

* struct [MemoryImage](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../memoryimage/)
* assembly [Aspose.CAD](../../../)


