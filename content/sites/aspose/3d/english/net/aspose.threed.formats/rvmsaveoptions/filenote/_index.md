---
title: RvmSaveOptions.FileNote
second_title: Aspose.3D for .NET API Reference
description: RvmSaveOptions property. File note in the file header
type: docs
weight: 70
url: /net/aspose.threed.formats/rvmsaveoptions/filenote/
---
## RvmSaveOptions.FileNote property

File note in the file header.

```csharp
public string FileNote { get; set; }
```

## Examples

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

* class [RvmSaveOptions](../)
* namespace [Aspose.ThreeD.Formats](../../rvmsaveoptions/)
* assembly [Aspose.3D](../../../)


