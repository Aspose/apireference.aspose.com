---
title: Class FileSystem
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.FileSystem class. File system encapsulation. Aspose.3D will use this to read/write dependencies
type: docs
weight: 1230
url: /net/aspose.threed.utilities/filesystem/
---
## FileSystem class

File system encapsulation. Aspose.3D will use this to read/write dependencies.

```csharp
public abstract class FileSystem : IDisposable
```

## Methods

| Name | Description |
| --- | --- |
| static [CreateDummyFileSystem](../../aspose.threed.utilities/filesystem/createdummyfilesystem/)() | Create a dummy file system, read/write operations are dummy operations. |
| static [CreateLocalFileSystem](../../aspose.threed.utilities/filesystem/createlocalfilesystem/)(string) | Initialize a new `FileSystem` that only access local directory. All file read/write on this FileSystem instance will be mapped to specified directory. |
| static [CreateMemoryFileSystem](../../aspose.threed.utilities/filesystem/creatememoryfilesystem/)(IDictionary&lt;string, MemoryStream&gt;) |  |
| static [CreateZipFileSystem](../../aspose.threed.utilities/filesystem/createzipfilesystem/#createzipfilesystem_1)(string) | File system to provide to the read-only access to speicified zip file or zip stream. File system will be disposed after the open/save operation. |
| static [CreateZipFileSystem](../../aspose.threed.utilities/filesystem/createzipfilesystem/#createzipfilesystem)(Stream, string) | Create a file system to provide to the read-only access to speicified zip file or zip stream. File system will be disposed after the open/save operation. |
| virtual [Dispose](../../aspose.threed.utilities/filesystem/dispose/)() | Dispose the File system and release its resources. |
| abstract [ReadFile](../../aspose.threed.utilities/filesystem/readfile/)(string, IOConfig) | Create a stream for reading dependencies. |
| abstract [WriteFile](../../aspose.threed.utilities/filesystem/writefile/)(string, IOConfig) | Create a stream for writing dependencies. |

### Examples

The following code shows how to import file, and provide dependent files in a given directory

```csharp
var inputFile = "input.fbx";
var format = FileFormat.Detect(inputFile);
//create a load options instance and specify a zip file system
var opt = format.CreateLoadOptions();
opt.FileSystem = new LocalFileSystem("textures/");
//load the file
var scene = Scene.FromFile(inputFile, opt);
```

### See Also

* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


