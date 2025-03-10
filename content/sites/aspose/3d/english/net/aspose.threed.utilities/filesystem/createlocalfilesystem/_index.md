---
title: FileSystem.CreateLocalFileSystem
second_title: Aspose.3D for .NET API Reference
description: FileSystem method. Initialize a new FileSystem that only access local directory. All file read/write on this FileSystem instance will be mapped to specified directory
type: docs
weight: 20
url: /net/aspose.threed.utilities/filesystem/createlocalfilesystem/
---
## FileSystem.CreateLocalFileSystem method

Initialize a new [`FileSystem`](../) that only access local directory. All file read/write on this FileSystem instance will be mapped to specified directory.

```csharp
public static FileSystem CreateLocalFileSystem(string directory)
```

| Parameter | Type | Description |
| --- | --- | --- |
| directory | String | The directory in your physical file system as the virtual root directory. |

### Return Value

A new instance of file system to provide local file access

### Exceptions

| exception | condition |
| --- | --- |
| FileNotFoundException | Thrown when directory cannot be found. |

## Examples

The following code shows how to import file, and provide dependent files in a given directory

```csharp
var inputFile = "input.fbx";
var format = FileFormat.Detect(inputFile);
//create a load options instance and specify a local file system
var opt = format.CreateLoadOptions();
opt.FileSystem = FileSystem.CreateLocalFileSystem("textures/");
//load the file
var scene = Scene.FromFile(inputFile, opt);
```

### See Also

* class [FileSystem](../)
* namespace [Aspose.ThreeD.Utilities](../../filesystem/)
* assembly [Aspose.3D](../../../)


