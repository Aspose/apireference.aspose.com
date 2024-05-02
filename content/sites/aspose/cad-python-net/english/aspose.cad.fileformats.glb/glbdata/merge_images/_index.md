---
title: merge_images method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.cad.fileformats.glb/glbdata/merge_images/
is_root: false
---

## merge_images {#}

Transfers all the [`GlbData.logical_images`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_images) content into [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) instances



```python
def merge_images(self):
    ...
```


### Remarks

Images can be stored in three different ways:
- As satellite files.
- Embedded as MIME64 into the JSON document
- Referenced with [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview)

This call ensures all images will be internalized as [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) instances.

This action cannot be reversed.


### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
