---
title: try_parse_mime64 method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.cad.fileformats.glb.memory/memoryimage/try_parse_mime64/
is_root: false
---

## try_parse_mime64 {#str-any}

Tries to parse a Mime64 string to [`MemoryImage`](/cad/python-net/aspose.cad.fileformats.glb.memory/memoryimage)


### Returns 


true if decoding succeeded.


```python
def try_parse_mime64(self, mime_64content, image):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mime_64content | str | The Mime64 string source. |
| image | any | if decoding succeeds, it will contain the image file. |
### Remarks

The string must be haedered with a mime prefix like:     "data:image/png;base64,"


### See Also
* module [`aspose.cad.fileformats.glb.memory`](../../)
* class [`MemoryImage`](/cad/python-net/aspose.cad.fileformats.glb.memory/memoryimage)
