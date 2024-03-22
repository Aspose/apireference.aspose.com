---
title: FileFormat.CanExport
second_title: Aspose.3D for .NET API Reference
description: FileFormat property. Gets whether Aspose.3D supports export scene to current file format
type: docs
weight: 480
url: /net/aspose.threed/fileformat/canexport/
---
## FileFormat.CanExport property

Gets whether Aspose.3D supports export scene to current file format.

```csharp
public bool CanExport { get; }
```

### Examples

The following code shows how to check if exporting to specified format is supported.

```csharp
var outputFormat = ".glb";
var format = FileFormat.GetFormatByExtension(outputFormat);
if (format.CanExport)
    Console.WriteLine($"Can export to {outputFormat}");
```

### See Also

* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


