---
title: FileSystem.CreateDummyFileSystem
second_title: Aspose.3D for .NET API Reference
description: FileSystem method. Create a dummy file system read/write operations are dummy operations
type: docs
weight: 10
url: /net/aspose.threed.utilities/filesystem/createdummyfilesystem/
---
## FileSystem.CreateDummyFileSystem method

Create a dummy file system, read/write operations are dummy operations.

```csharp
public static FileSystem CreateDummyFileSystem()
```

### Return Value

A dummy file system

## Examples

The following code shows how to export file to memory, and ignore all dependent file generation.

```csharp
//create a scene with material
Scene scene = new Scene();
scene.RootNode.CreateChildNode(new Box()).Material = new LambertMaterial();
//create a save option and specify the file system, so the dependent file will be written to memory
var opt = FileFormat.WavefrontOBJ.CreateSaveOptions();
var dfs = FileSystem.CreateDummyFileSystem();
opt.FileSystem = dfs;
//obj's material file name is associated with the obj's file name, so we need a explicit name.
opt.FileName = "test.obj";
using (var ms = new MemoryStream())
{
    scene.Save(ms, opt);
}
```

### See Also

* class [FileSystem](../)
* namespace [Aspose.ThreeD.Utilities](../../filesystem/)
* assembly [Aspose.3D](../../../)


