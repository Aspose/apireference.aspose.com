---
title: Class StlSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.StlSaveOptions class. Save options for STL
type: docs
weight: 1830
url: /net/aspose.threed.formats/stlsaveoptions/
---
## StlSaveOptions class

Save options for STL

```csharp
public class StlSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [StlSaveOptions](stlsaveoptions/#constructor)() | Initializes of a new `StlSaveOptions` instance. |
| [StlSaveOptions](stlsaveoptions/#constructor_1)(FileContentType) | Initializes of a new `StlSaveOptions` instance. |

## Properties

| Name | Description |
| --- | --- |
| [AxisSystem](../../aspose.threed.formats/stlsaveoptions/axissystem/) { get; set; } | Gets or sets the axis system in the exported stl file. |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FlipCoordinateSystem](../../aspose.threed.formats/stlsaveoptions/flipcoordinatesystem/) { get; set; } | Gets or sets whether flip coordinate system of control points/normal during exporting. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


