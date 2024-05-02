---
title: merge_buffers method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 200
url: /python-net/aspose.cad.fileformats.glb/glbdata/merge_buffers/
is_root: false
---

## merge_buffers {#}

Merges all the [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers) instances into a single big one.



```python
def merge_buffers(self):
    ...
```


### Remarks

When merging the buffers, it also adjusts the BufferView offsets so the data they point to remains the same.




If images are required to be included in the binary, call [`GlbData.merge_images`](/cad/python-net/aspose.cad.fileformats.glb/glbdata/merge_images)
before calling [`GlbData.merge_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata/merge_buffers).### Exceptions
| Exception | Description |
| :- | :- |
| InvalidOperationException | .Net arrays have an upper limit of 2Gb, so this is the biggest a buffer can normally grow,<br/>so attempting to merge buffers that sum more than 2Gb will throw this exception. |




## merge_buffers {#int}

Merges all the [`GlbData.logical_buffers`](/cad/python-net/aspose.cad.fileformats.glb/glbdata#logical_buffers) instances into buffers of `max_size` size.



```python
def merge_buffers(self, max_size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| max_size | int | The maximum size of each buffer.<br/>Notice that if a single BufferView is larger than `max_size`, that buffer will be also larger. |



### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
