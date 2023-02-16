---
title: content_type property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 580
url: /python-net/aspose.threed.formats/rvmformat/content_type/
is_root: false
---

## content_type property


Gets file format content type

### Example 


```python
from aspose.threed import FileContentType, FileFormat

format = FileFormat.MAYA_BINARY
if format.content_type == FileContentType.BINARY:
    print(f"{format} is binary format")
else:
    print(f"{format} is text-based format")

```
### Definition:
```python
@property
def content_type(self):
    ...
```

### See Also
* module [`aspose.threed.formats`](../../)
* class [`FileContentType`](/3d/python-net/aspose.threed/filecontenttype)
* class [`RvmFormat`](/3d/python-net/aspose.threed.formats/rvmformat)
