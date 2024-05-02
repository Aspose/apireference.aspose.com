---
title: isolate_memory property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.cad.fileformats.glb.runtime/runtimeoptions/isolate_memory/
is_root: false
---

## isolate_memory property


True if we want to copy buffers data instead of sharing it.

### Remarks 


If we want to create a runtime representation of the model, so the garbage collector will release the source model,
we have to set this to true, so we will not use any reference to the source model.
### Definition:
```python
@property
def isolate_memory(self):
    ...
@isolate_memory.setter
def isolate_memory(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.glb.runtime`](../../)
* class [`RuntimeOptions`](/cad/python-net/aspose.cad.fileformats.glb.runtime/runtimeoptions)
