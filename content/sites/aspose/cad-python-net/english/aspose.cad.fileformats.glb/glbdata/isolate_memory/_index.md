---
title: isolate_memory method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 170
url: /python-net/aspose.cad.fileformats.glb/glbdata/isolate_memory/
is_root: false
---

## isolate_memory {#}

Refreshes all internal memory buffers.



```python
def isolate_memory(self):
    ...
```


### Remarks

[`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer) instances can be created using external Byte arrays, which
can potentially be shared with other instances. Editing these arrays directly can lead to data
corruption.
This method refreshes all internal memory buffers, by copying the data into newly allocated
buffers. This ensures that at this point, all memory buffers are not shared and of exclusive
use of this [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance.


### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`Buffer`](/cad/python-net/aspose.cad.fileformats.glb/buffer)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
