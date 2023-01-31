---
title: LocalFileSystem class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed.utilities/localfilesystem/
is_root: false
---

## LocalFileSystem class

The [LocalFileSystem](/3d/python-net/aspose.threed.utilities/localfilesystem) will maps the read/write operations to local directory.



**Inheritance:** [LocalFileSystem](/3d/python-net/aspose.threed.utilities/localfilesystem) → 
[FileSystem](/3d/python-net/aspose.threed.utilities/filesystem)



The LocalFileSystem type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [LocalFileSystem(directory)](/3d/python-net/aspose.threed.utilities/localfilesystem/__init__/#str) | Initialize a new [LocalFileSystem](/3d/python-net/aspose.threed.utilities/localfilesystem) with specified base directory. |


### Methods
| Method | Description |
| :- | :- |
| [read_file(file_name, options)](/3d/python-net/aspose.threed.utilities/localfilesystem/read_file/#str-aspose.threed.formats.IOConfig) | Create a stream for reading dependencies. |
| [write_file(file_name, options)](/3d/python-net/aspose.threed.utilities/localfilesystem/write_file/#str-aspose.threed.formats.IOConfig) | Create a stream for writing dependencies. |



### Example 


The following code shows how to import file, and provide dependent files in a given directory

```python
from aspose.threed import FileFormat, Scene
from aspose.threed.utilities import LocalFileSystem

inputFile = "input.fbx"
format = FileFormat.detect(inputFile)

# create a load options instance and specify a zip file system
opt = format.create_load_options()
opt.file_system = LocalFileSystem("textures/")

# load the file
scene = Scene.from_file(inputFile, opt)

```
### See Also

* module [aspose.threed.utilities](../)
* class [FileSystem](/3d/python-net/aspose.threed.utilities/filesystem)
