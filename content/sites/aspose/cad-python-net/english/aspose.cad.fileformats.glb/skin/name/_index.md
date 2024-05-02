---
title: name property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.cad.fileformats.glb/skin/name/
is_root: false
---

## name property


Gets or sets the display text name, or null.

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks.

### Remarks 


glTF does not define any rule for object names.

This means that names can be null or non unique.

So don't use [`LogicalChildOfRoot.name`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot#name) for anything other than object name display.

If you need to reference objects by some ID, use lookup tables instead.
### Definition:
```python
@property
def name(self):
    ...
@name.setter
def name(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`Skin`](/cad/python-net/aspose.cad.fileformats.glb/skin)
