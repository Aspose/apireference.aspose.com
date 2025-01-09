---
title: Class StlLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.StlLoadOptions class. Load options for STL
type: docs
weight: 1410
url: /net/aspose.threed.formats/stlloadoptions/
---
## StlLoadOptions class

Load options for STL

```csharp
public class StlLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [StlLoadOptions](stlloadoptions/#constructor)() | Initializes of a new `StlLoadOptions` instance. |
| [StlLoadOptions](stlloadoptions/#constructor_1)(FileContentType) | Initializes of a new `StlLoadOptions` instance. |

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |
| [RecalculateNormal](../../aspose.threed.formats/stlloadoptions/recalculatenormal/) { get; set; } | Ignore the normal data that stored in STL file and recalculate the normal data based on the vertex position. Default value is false |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


