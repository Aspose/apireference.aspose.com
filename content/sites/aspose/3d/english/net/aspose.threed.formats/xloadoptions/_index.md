---
title: Class XLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.XLoadOptions class. The Load options for DirectX X files
type: docs
weight: 1460
url: /net/aspose.threed.formats/xloadoptions/
---
## XLoadOptions class

The Load options for DirectX X files.

```csharp
public class XLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [XLoadOptions](xloadoptions/)(FileContentType) | Constructor of `XLoadOptions` |

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [FlipCoordinateSystem](../../aspose.threed.formats/xloadoptions/flipcoordinatesystem/) { get; set; } | Flip the coordinate system, this is true by default |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


