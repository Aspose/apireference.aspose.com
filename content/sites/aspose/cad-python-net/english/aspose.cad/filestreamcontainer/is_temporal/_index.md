---
title: is_temporal property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 230
url: /aspose.cad/filestreamcontainer/is_temporal/
is_root: false
---

## is_temporal property


Gets or sets a value indicating whether stream is temporal.

### Remarks 


A temporal stream will remove iself when disposed. If the stream is memory based this property has no effect.
The stream can be marked as temporal or persistent in case it was created explicitly otherwise the appropriate exception is thrown.
### Definition:
```python
@property
def is_temporal(self):
    ...
@is_temporal.setter
def is_temporal(self, value):
    ...
```

### See Also
* module [`aspose.cad`](../../)
* class [`FileStreamContainer`](/cad/python-net/aspose.cad/filestreamcontainer)
