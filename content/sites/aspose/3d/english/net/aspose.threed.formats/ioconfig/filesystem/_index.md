---
title: IOConfig.FileSystem
second_title: Aspose.3D for .NET API Reference
description: IOConfig property. Allow user to handle how to manage the external dependencies during load/save
type: docs
weight: 40
url: /net/aspose.threed.formats/ioconfig/filesystem/
---
## IOConfig.FileSystem property

Allow user to handle how to manage the external dependencies during load/save.

```csharp
public FileSystem FileSystem { get; set; }
```

## Examples

The default FileSystem is LocalFileSystem, it is not safe in environment like server side, But you can override the file system access by specifying a different implementation. Aspose.3D provides different FileSystem implementation like: Memory-based file systemDirectory-based file systemDummy file systemZip file system And you can also use your own implementation.

```csharp
Scene scene = new Scene();
var material = new PhongMaterial();
var boxNode = scene.RootNode.CreateChildNode(new Box());
boxNode.Material = material;

var opt = new ObjSaveOptions();
var memFs = new Dictionary<string, MemoryStream>();
opt.FileSystem = FileSystem.CreateMemoryFileSystem(memFs);
using var output = new MemoryStream();
opt.FileName = "output.obj";
scene.Save(output, opt);
//The material will be written to variable memFs named output.mtl
var materialInBytes = memFs["output.mtl"].ToArray();
```

### See Also

* class [FileSystem](../../../aspose.threed.utilities/filesystem/)
* class [IOConfig](../)
* namespace [Aspose.ThreeD.Formats](../../ioconfig/)
* assembly [Aspose.3D](../../../)


