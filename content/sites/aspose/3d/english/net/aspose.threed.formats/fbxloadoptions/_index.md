---
title: Class FbxLoadOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.FbxLoadOptions class. Load options for Fbx format
type: docs
weight: 1610
url: /net/aspose.threed.formats/fbxloadoptions/
---
## FbxLoadOptions class

Load options for Fbx format.

```csharp
public class FbxLoadOptions : LoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [FbxLoadOptions](fbxloadoptions/#constructor)() | Constructor of `FbxLoadOptions` |
| [FbxLoadOptions](fbxloadoptions/#constructor_1)(FileFormat) | Constructor of `FbxLoadOptions` |

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [KeepBuiltinGlobalSettings](../../aspose.threed.formats/fbxloadoptions/keepbuiltinglobalsettings/) { get; set; } | Gets or sets whether to keep the builtin properties in GlobalSettings which have a native property replacement in [`AssetInfo`](../../aspose.threed/assetinfo/). Set this to true if you want the full properties in GlobalSettings Default value is false |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


