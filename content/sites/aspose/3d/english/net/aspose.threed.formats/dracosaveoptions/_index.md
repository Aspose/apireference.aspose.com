---
title: Class DracoSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.DracoSaveOptions class. Save options for Google draco files
type: docs
weight: 1130
url: /net/aspose.threed.formats/dracosaveoptions/
---
## DracoSaveOptions class

Save options for Google draco files

```csharp
public class DracoSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [DracoSaveOptions](dracosaveoptions/)() | Construct a default configuration for saving draco files. |

## Properties

| Name | Description |
| --- | --- |
| [ApplyUnitScale](../../aspose.threed.formats/dracosaveoptions/applyunitscale/) { get; set; } | Apply [`UnitScaleFactor`](../../aspose.threed/assetinfo/unitscalefactor/) to the mesh. Default value is false. |
| [ColorBits](../../aspose.threed.formats/dracosaveoptions/colorbits/) { get; set; } | Quantization bits for vertex color, default value is 10 |
| [CompressionLevel](../../aspose.threed.formats/dracosaveoptions/compressionlevel/) { get; set; } | Compression level, default value is Standard |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load. |
| [NormalBits](../../aspose.threed.formats/dracosaveoptions/normalbits/) { get; set; } | Quantization bits for normal vectors, default value is 10 |
| [PointCloud](../../aspose.threed.formats/dracosaveoptions/pointcloud/) { get; set; } | Export the scene as point cloud, default value is false. |
| [PositionBits](../../aspose.threed.formats/dracosaveoptions/positionbits/) { get; set; } | Quantization bits for position, default value is 14 |
| [TextureCoordinateBits](../../aspose.threed.formats/dracosaveoptions/texturecoordinatebits/) { get; set; } | Quantization bits for texture coordinate, default value is 12 |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


