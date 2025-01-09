---
title: Class ZipArchiveFileSystem
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.ZipArchiveFileSystem class. File system to provide to the readonly access to speicified zip file or zip stream. File system will be disposed after the open/save operation
type: docs
weight: 2830
url: /net/aspose.threed.utilities/ziparchivefilesystem/
---
## ZipArchiveFileSystem class

File system to provide to the read-only access to speicified zip file or zip stream. File system will be disposed after the open/save operation.

```csharp
public class ZipArchiveFileSystem : FileSystem
```

## Methods

| Name | Description |
| --- | --- |
| override [Dispose](../../aspose.threed.utilities/ziparchivefilesystem/dispose/)() | Dispose the ZipArchiveFileSystem and release its internal resources. |
| override [ReadFile](../../aspose.threed.utilities/ziparchivefilesystem/readfile/)(string, IOConfig) | Open file for reading |
| override [WriteFile](../../aspose.threed.utilities/ziparchivefilesystem/writefile/)(string, IOConfig) | Open file for writing, not implemented in this class. |

### Examples

The following code shows how to import file, and provide dependent files in a zip archive file.

```csharp
var inputFile = "input.fbx";
var format = FileFormat.Detect(inputFile);
//create a load options instance and specify a zip file system
var opt = format.CreateLoadOptions();
opt.FileSystem = new ZipArchiveFileSystem("textures.zip");
//load the file
var scene = Scene.FromFile(inputFile, opt);
```

### See Also

* class [FileSystem](../filesystem/)
* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


