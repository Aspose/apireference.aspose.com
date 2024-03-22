---
title: Class Discreet3dsSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.Discreet3dsSaveOptions class. Save options for 3DS file
type: docs
weight: 1890
url: /net/aspose.threed.formats/discreet3dssaveoptions/
---
## Discreet3dsSaveOptions class

Save options for 3DS file.

```csharp
public class Discreet3dsSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [Discreet3dsSaveOptions](discreet3dssaveoptions/)() | Constructor of `Discreet3dsSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [DuplicatedNameCounterBase](../../aspose.threed.formats/discreet3dssaveoptions/duplicatednamecounterbase/) { get; set; } | The counter used by generating new name for duplicated names, default value is 2. |
| [DuplicatedNameCounterFormat](../../aspose.threed.formats/discreet3dssaveoptions/duplicatednamecounterformat/) { get; set; } | The format of the duplicated counter, default value is empty string. |
| [DuplicatedNameSeparator](../../aspose.threed.formats/discreet3dssaveoptions/duplicatednameseparator/) { get; set; } | The separator between object's name and the duplicated counter, default value is "_". When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object. For example there's two nodes named "Box", the first node will have a name "Box", and the second node will get a new name "Box_2" using the default configuration. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportCamera](../../aspose.threed.formats/discreet3dssaveoptions/exportcamera/) { get; set; } | Gets or sets whether export all cameras in the scene. |
| [ExportLight](../../aspose.threed.formats/discreet3dssaveoptions/exportlight/) { get; set; } | Gets or sets whether export all lights in the scene. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinateSystem](../../aspose.threed.formats/discreet3dssaveoptions/flipcoordinatesystem/) { get; set; } | Gets or sets flip coordinate system of control points/normal during importing/exporting. |
| [GammaCorrectedColor](../../aspose.threed.formats/discreet3dssaveoptions/gammacorrectedcolor/) { get; set; } | A 3ds file may contains original color and gamma corrected color for same attribute, Setting this to true will use the gamma corrected color if possible, otherwise the Aspose.3D will try to use the original color. |
| [HighPreciseColor](../../aspose.threed.formats/discreet3dssaveoptions/highprecisecolor/) { get; set; } | If this is true, the generated 3ds file will use high precise color, means each channel of red/green/blue are in 32bit float. Otherwise the generated file will use 24bit color, each channel use 8bit byte. The default value is false, because not all applications supports the high-precise color. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [MasterScale](../../aspose.threed.formats/discreet3dssaveoptions/masterscale/) { get; set; } | Gets or sets the master scale used in exporting. |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


