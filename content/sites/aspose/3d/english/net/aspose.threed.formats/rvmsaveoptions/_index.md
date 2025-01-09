---
title: Class RvmSaveOptions
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Formats.RvmSaveOptions class. Save options for Aveva PDMS RVM file
type: docs
weight: 1390
url: /net/aspose.threed.formats/rvmsaveoptions/
---
## RvmSaveOptions class

Save options for Aveva PDMS RVM file.

```csharp
public class RvmSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [RvmSaveOptions](rvmsaveoptions/#constructor)() | Constructor of `RvmSaveOptions` |
| [RvmSaveOptions](rvmsaveoptions/#constructor_1)(FileContentType) | Constructor of `RvmSaveOptions` |

## Properties

| Name | Description |
| --- | --- |
| [AttributeListFile](../../aspose.threed.formats/rvmsaveoptions/attributelistfile/) { get; set; } | Gets or sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. |
| [AttributePrefix](../../aspose.threed.formats/rvmsaveoptions/attributeprefix/) { get; set; } | Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped. |
| [Author](../../aspose.threed.formats/rvmsaveoptions/author/) { get; set; } | Author information, default value is '3d@aspose' |
| [CreationTime](../../aspose.threed.formats/rvmsaveoptions/creationtime/) { get; set; } | The timestamp that exported this file, default value is current time |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Gets or sets the default encoding for text-based files. Default value is null which means the importer/exporter will decide which encoding to use.(Inherited from [`IOConfig`](../ioconfig/).) |
| [ExportAttributes](../../aspose.threed.formats/rvmsaveoptions/exportattributes/) { get; set; } | Gets or sets whether to export the attribute list to an external .att file, default value is false. |
| [ExportTextures](../../aspose.threed.formats/saveoptions/exporttextures/) { get; set; } | Try to copy textures used in scene to output directory.(Inherited from [`SaveOptions`](../saveoptions/).) |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Gets the file format that specified in current Save/Load option.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | The file name of the exporting/importing scene. This is optional, but useful when serialize external assets like OBJ's material.(Inherited from [`IOConfig`](../ioconfig/).) |
| [FileNote](../../aspose.threed.formats/rvmsaveoptions/filenote/) { get; set; } | File note in the file header. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Allow user to handle how to manage the external dependencies during load/save.(Inherited from [`IOConfig`](../ioconfig/).) |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Some files like OBJ depends on external file, the lookup paths will allows Aspose.3D to look for external file to load.(Inherited from [`IOConfig`](../ioconfig/).) |

### Examples

The following code shows how to export attribute in RVM.

```csharp
Scene scene = new Scene();
var box = new Box().ToMesh();
//node's name is required to export attributes
var boxNode = scene.RootNode.CreateChildNode("box", box);
boxNode.SetProperty("rvm:Price", 12.0);
boxNode.SetProperty("rvm:Weight", 30.0);
var opt = new RvmSaveOptions();
//Properties with rvm: prefix will be exported.
opt.ExportAttributes = true;
opt.AttributePrefix = "rvm:";
opt.Author = "Aspose.3D";
opt.FileNote = "Test attribute export";
scene.Save("output.rvm", opt);
```

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* assembly [Aspose.3D](../../)


