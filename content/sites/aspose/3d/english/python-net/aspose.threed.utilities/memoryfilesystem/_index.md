---
title: MemoryFileSystem class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.threed.utilities/memoryfilesystem/
is_root: false
---

## MemoryFileSystem class

The [`MemoryFileSystem`](/3d/python-net/aspose.threed.utilities/memoryfilesystem) will maps the read/write operations to memory.



**Inheritance:** [`MemoryFileSystem`](/3d/python-net/aspose.threed.utilities/memoryfilesystem) → 
[`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)



The MemoryFileSystem type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [MemoryFileSystem()](/3d/python-net/aspose.threed.utilities/memoryfilesystem/__init__/#) | Constructs a new instance of MemoryFileSystem |


### Properties
| Property | Description |
| :- | :- |
| [file_names](/3d/python-net/aspose.threed.utilities/memoryfilesystem/file_names) | File names that in this memory file system. |


### Methods
| Method | Description |
| :- | :- |
| [read_file(file_name, options)](/3d/python-net/aspose.threed.utilities/memoryfilesystem/read_file/#str-aspose.threed.formats.IOConfig) | Create a stream for reading dependencies. |
| [write_file(file_name, options)](/3d/python-net/aspose.threed.utilities/memoryfilesystem/write_file/#str-aspose.threed.formats.IOConfig) | Create a stream for writing dependencies. |
| [get_file_content(file_name)](/3d/python-net/aspose.threed.utilities/memoryfilesystem/get_file_content/#str) | Returns the raw content of the specified file.<br/>Throw FileNotFoundException if the specified file is not existing. |



### Example 


The following code shows how to export file to memory, includes the dependent file by using MemoryFileSystem.

```python
from aspose.threed import FileFormat, Scene
from aspose.threed.entities import Box
from aspose.threed.shading import LambertMaterial
from aspose.threed.utilities import MemoryFileSystem
from io import BytesIO

# create a scene with material
scene = Scene()
scene.root_node.create_child_node(Box()).material = LambertMaterial()
# create a save option and specify the file system, so the dependent file will be written to memory
opt = FileFormat.WAVEFRONT_OBJ.create_save_options()
mfs = MemoryFileSystem()
opt.file_system = mfs
# obj's material file name is associated with the obj's file name, so we need a explicit name.
opt.file_name = "test.obj"
with BytesIO() as ms:
    scene.save(ms, opt)
# the test.obj was written to variable ms, and we can also get the test.mtl file content by
materialFile = mfs.get_file_content("test.mtl")

```

### See Also
* module [`aspose.threed.utilities`](..)
* class [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)
* class [`MemoryFileSystem`](/3d/python-net/aspose.threed.utilities/memoryfilesystem)
