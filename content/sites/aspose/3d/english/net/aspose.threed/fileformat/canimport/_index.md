---
title: FileFormat.CanImport
second_title: Aspose.3D for .NET API Reference
description: FileFormat property. Gets whether Aspose.3D supports import scene from current file format
type: docs
weight: 490
url: /net/aspose.threed/fileformat/canimport/
---
## FileFormat.CanImport property

Gets whether Aspose.3D supports import scene from current file format.

```csharp
public bool CanImport { get; }
```

### Examples

The following code shows how to check if importing from specified format is supported.

```csharp
var outputFormat = ".glb";
var format = FileFormat.GetFormatByExtension(outputFormat);
if (format.CanImport)
    Console.WriteLine($"Can import from {outputFormat}");
```

### See Also

* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


