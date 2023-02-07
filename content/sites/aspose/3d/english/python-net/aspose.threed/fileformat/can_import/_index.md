---
title: can_import property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 560
url: /python-net/aspose.threed/fileformat/can_import/
is_root: false
---

## can_import property


Gets whether Aspose.3D supports import scene from current file format.

### Example 


The following code shows how to check if importing from specified format is supported.

```python
from aspose.threed import FileFormat

outputFormat = ".glb"
format = FileFormat.get_format_by_extension(outputFormat)
if format.can_import:
    print(f"Can import from {outputFormat}")

```
### Definition:
```python
@property
def can_import(self):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [FileFormat](/3d/python-net/aspose.threed/fileformat)
