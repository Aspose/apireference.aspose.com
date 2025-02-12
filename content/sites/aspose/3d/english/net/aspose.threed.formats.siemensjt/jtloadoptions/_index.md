---
title: Class JtLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.SiemensJT.JtLoadOptions class. Load options for Siemens JT
type: docs
weight: 1380
url: /net/aspose.threed.formats.siemensjt/jtloadoptions/
---
## JtLoadOptions class

Load options for Siemens JT

```csharp
public class JtLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [JtLoadOptions](jtloadoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |
| [LoadPMI](../../aspose.threed.formats.siemensjt/jtloadoptions/loadpmi/) { get; set; } | Load PMI information from JT file if possible, the data will be saved as property "PMI" of [`AssetInfo`](../../aspose.threed/scene/assetinfo/). Default value is false. |
| [LoadProperties](../../aspose.threed.formats.siemensjt/jtloadoptions/loadproperties/) { get; set; } | Load properties from JT's property table as Aspose.3D properties. Default value is false. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../../aspose.threed.formats/ioconfig/).) |

### See Also

* class [LoadOptions](../../aspose.threed.formats/loadoptions/)
* namespace [Aspose.ThreeD.Formats.SiemensJT](../../aspose.threed.formats.siemensjt/)
* assembly [Aspose.3D](../../)


