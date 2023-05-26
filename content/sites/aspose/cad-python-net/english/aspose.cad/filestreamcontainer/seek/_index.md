---
title: seek method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /aspose.cad/filestreamcontainer/seek/
is_root: false
---

## seek {#int-aspose.cad.SeekOrigin}

Sets the position within the current stream.


### Returns 


The new position within the current stream.


```python
def seek(self, offset, origin):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| offset | int | A byte offset relative to the `origin` parameter. This value represents offset from the starting stream position passed in the StreamContainer constructor. |
| origin | [`SeekOrigin`](/cad/python-net/aspose.cad/seekorigin) | A value of type [`SeekOrigin`](/cad/python-net/aspose.cad/seekorigin) indicating the reference point used to obtain the new position. |



### See Also
* module [`aspose.cad`](../../)
* class [`FileStreamContainer`](/cad/python-net/aspose.cad/filestreamcontainer)
* class [`SeekOrigin`](/cad/python-net/aspose.cad/seekorigin)
