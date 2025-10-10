---
title: Class UsdSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.UsdSaveOptions class. Save options for USD/USDZ formats
type: docs
weight: 1540
url: /net/aspose.threed.formats/usdsaveoptions/
---
## UsdSaveOptions class

Save options for USD/USDZ formats.

```csharp
public class UsdSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [UsdSaveOptions](usdsaveoptions/#constructor)() | Initialize a new `UsdSaveOptions` with [`USD`](../../aspose.threed/fileformat/usd/) format |
| [UsdSaveOptions](usdsaveoptions/#constructor_1)(FileFormat) | Initialize a new `UsdSaveOptions` with specified USD/USDZ format. |

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [ExportMetaData](../../aspose.threed.formats/usdsaveoptions/exportmetadata/) { get; set; } | Export node's properties through USD's customData field. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [MaterialConverter](../../aspose.threed.formats/usdsaveoptions/materialconverter/) { get; set; } | Custom converter to convert the geometry's material to PBR material If this is unassigned, USD exporter will automatically convert the standard material to PBR material. Default value is null |
| [PrimitiveToMesh](../../aspose.threed.formats/usdsaveoptions/primitivetomesh/) { get; set; } | Convert the primitive entities to mesh during the export. Or directly encode the primitives to the output file(will use Aspose's extension definition for unofficial primitives like Dish, Torus) Default value is true. |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


