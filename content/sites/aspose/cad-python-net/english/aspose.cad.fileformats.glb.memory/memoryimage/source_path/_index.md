---
title: source_path property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 220
url: /python-net/aspose.cad.fileformats.glb.memory/memoryimage/source_path/
is_root: false
---

## source_path property


Gets the source path of this image, or **null** .

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks.

### Remarks 


Not all images are expected to have a source path.

Specifically images embedded in a GLB file or encoded with BASE64
will not have any source path at all.

So if your code depends on images having a path, it might crash
on gltf files with embedded images.
### Definition:
```python
@property
def source_path(self):
    ...
```

### See Also
* module [`aspose.cad.fileformats.glb.memory`](../../)
* class [`MemoryImage`](/cad/python-net/aspose.cad.fileformats.glb.memory/memoryimage)
