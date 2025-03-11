---
title: create_dummy_file_system method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.utilities/filesystem/create_dummy_file_system/
is_root: false
---

## create_dummy_file_system() {#}

Create a dummy file system, read/write operations are dummy operations.


### Returns 


A dummy file system


```python

@staticmethod
def create_dummy_file_system():
    ...
```



### Example 


The following code shows how to export file to memory, and ignore all dependent file generation.

```python
from aspose.threed import FileFormat, Scene
from aspose.threed.entities import Box
from aspose.threed.shading import LambertMaterial
from aspose.threed.utilities import FileSystem
from io import BytesIO

# create a scene with material
scene = Scene()
scene.root_node.create_child_node(Box()).material = LambertMaterial()
# create a save option and specify the file system, so the dependent file will be written to memory
opt = FileFormat.WAVEFRONT_OBJ.create_save_options()
dfs = FileSystem.create_dummy_file_system()
opt.file_system = dfs
# obj's material file name is associated with the obj's file name, so we need a explicit name.
opt.file_name = "test.obj"
with BytesIO() as ms:
    scene.save(ms, opt)

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`FileSystem`](/3d/python-net/aspose.threed.utilities/filesystem)
