---
title: ZipArchiveFileSystem class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 260
url: /python-net/aspose.threed.utilities/ziparchivefilesystem/
is_root: false
---

## ZipArchiveFileSystem class

File system to provide to the read-only access to speicified zip file or zip stream.
File system will be disposed after the open/save operation.



**Inheritance:** [ZipArchiveFileSystem](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem) → 
[FileSystem](/3d/python-net/aspose.threed.utilities/filesystem)



The ZipArchiveFileSystem type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [ZipArchiveFileSystem(stream, base_dir)](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem/__init__/#io.RawIOBase-str) | Construct a [ZipArchiveFileSystem](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem) through a stream. |
| [ZipArchiveFileSystem(stream)](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem/__init__/#io.RawIOBase) | Construct a [ZipArchiveFileSystem](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem) through a stream. |
| [ZipArchiveFileSystem(file_name)](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem/__init__/#str) | Construct a [ZipArchiveFileSystem](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem) through a file name. |


### Methods
| Method | Description |
| :- | :- |
| [read_file(file_name, options)](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem/read_file/#str-aspose.threed.formats.IOConfig) | Open file for reading |
| [write_file(file_name, options)](/3d/python-net/aspose.threed.utilities/ziparchivefilesystem/write_file/#str-aspose.threed.formats.IOConfig) | Open file for writing, not implemented in this class. |



### Example 


The following code shows how to import file, and provide dependent files in a zip archive file.

```python
from aspose.threed import FileFormat, Scene
from aspose.threed.utilities import ZipArchiveFileSystem

inputFile = "input.fbx"
format = FileFormat.detect(inputFile)

# create a load options instance and specify a zip file system
opt = format.create_load_options()
opt.file_system = ZipArchiveFileSystem("textures.zip")

# load the file
scene = Scene.from_file(inputFile, opt)

```
### See Also

* module [aspose.threed.utilities](../)
* class [FileSystem](/3d/python-net/aspose.threed.utilities/filesystem)
