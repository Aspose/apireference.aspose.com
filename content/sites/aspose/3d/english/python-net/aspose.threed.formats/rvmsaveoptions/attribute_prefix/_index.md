---
title: attribute_prefix property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/rvmsaveoptions/attribute_prefix/
is_root: false
---

## attribute_prefix property


Gets or sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'.
For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped.

### Example 


The following code shows how to export attribute in RVM. 
		
```python
from aspose.threed import Scene
from aspose.threed.entities import Box
from aspose.threed.formats import RvmSaveOptions

scene = Scene()
box = Box().to_mesh()
# node's name is required to export attributes
boxNode = scene.root_node.create_child_node("box", box)
boxNode.set_property("rvm:Price", 12.0)
boxNode.set_property("rvm:Weight", 30.0)
opt = RvmSaveOptions()
# Properties with rvm: prefix will be exported.
opt.export_attributes = True
opt.attribute_prefix = "rvm:"
opt.author = "Aspose.3D"
opt.file_note = "Test attribute export"
scene.save("output.rvm", opt)

```
### Definition:
```python
@property
def attribute_prefix(self):
    ...
@attribute_prefix.setter
def attribute_prefix(self, value):
    ...
```

### See Also
* module [`aspose.threed.formats`](../../)
* class [`RvmSaveOptions`](/3d/python-net/aspose.threed.formats/rvmsaveoptions)
