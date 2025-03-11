---
title: Class Microsoft3MFSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats._3MF.Microsoft3MFSaveOptions class. Save options for Microsoft 3MF file
type: docs
weight: 1460
url: /net/aspose.threed.formats._3mf/microsoft3mfsaveoptions/
---
## Microsoft3MFSaveOptions class

Save options for Microsoft 3MF file.

```csharp
public class Microsoft3MFSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [Microsoft3MFSaveOptions](microsoft3mfsaveoptions/)() | Construct a `Microsoft3MFSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [BuildAll](../../aspose.threed.formats._3mf/microsoft3mfsaveoptions/buildall/) { get; set; } | Mark all geometries in scene to be printable. Or you can manually mark node to be printable by [`SetBuildable`](../../aspose.threed.formats/microsoft3mfformat/setbuildable/) Default value is true |
| [EnableCompression](../../aspose.threed.formats._3mf/microsoft3mfsaveoptions/enablecompression/) { get; set; } | Enable compression on the output 3mf file Default value is true |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../../aspose.threed.formats/saveoptions/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |

### See Also

* class [SaveOptions](../../aspose.threed.formats/saveoptions/)
* namespace [Aspose.ThreeD.Formats._3MF](../../aspose.threed.formats._3mf/)
* assembly [Aspose.3D](../../)


