---
title: Class AmfSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.AmfSaveOptions class. Save options for AMF
type: docs
weight: 1090
url: /net/aspose.threed.formats/amfsaveoptions/
---
## AmfSaveOptions class

Save options for AMF

```csharp
public class AmfSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [AmfSaveOptions](amfsaveoptions/)() | Constructor of `AmfSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [EnableCompression](../../aspose.threed.formats/amfsaveoptions/enablecompression/) { get; set; } | Whether to use compression to reduce the final file size, default value is true |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


