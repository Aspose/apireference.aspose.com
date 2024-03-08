---
title: duplicated_name_separator property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.threed.formats/discreet3dssaveoptions/duplicated_name_separator/
is_root: false
---

## duplicated_name_separator property


The separator between object's name and the duplicated counter, default value is "_".

When scene contains objects that use the same name, Aspose.3D 3DS exporter will generate a different name for the object.
For example there's two nodes named "Box", the first node will have a name "Box",
and the second node will get a new name "Box_2" using the default configuration.
### Definition:
```python
@property
def duplicated_name_separator(self):
    ...
@duplicated_name_separator.setter
def duplicated_name_separator(self, value):
    ...
```

### See Also
* module [`aspose.threed.formats`](../../)
* class [`Discreet3dsSaveOptions`](/3d/python-net/aspose.threed.formats/discreet3dssaveoptions)
