---
title: RvmSaveOptions.AttributePrefix
second_title: Aspose.3D for .NET API Reference
description: RvmSaveOptions property. Gets or sets the prefix of which attributes that will be exported the exported property will contains no prefix custom properties with different prefix will not be exported default value is rvm. For example if a property is rvmRefno345 the exported attribute will be Refno  345 the prefix is stripped
type: docs
weight: 30
url: /net/aspose.threed.formats/rvmsaveoptions/attributeprefix/
---
## RvmSaveOptions.AttributePrefix property

Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped.

```csharp
public string AttributePrefix { get; set; }
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


