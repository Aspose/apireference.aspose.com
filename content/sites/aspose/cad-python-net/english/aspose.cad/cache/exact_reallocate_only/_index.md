---
title: exact_reallocate_only property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /aspose.cad/cache/exact_reallocate_only/
is_root: false
---

## exact_reallocate_only property


Gets or sets a value indicating whether reallocation should be exact or not. If reallocation is non exact the performance should be higher.

### Remarks 


The exact reallocation will perform reallocation of additional memory only up to the upper limit specified.
When passing upper limit for in-memory during reallocation the cached data will be copied to disk if possible.
When passing upper limit for disk memory during reallocation the appropriate exception is thrown.
The performance should be higher if this option is turned off as no additional copying will be performed if possible,
however this may also lead to pass upper limits specified for memory or disk.
### Definition:
```python
@property
def exact_reallocate_only(self):
    ...
@exact_reallocate_only.setter
def exact_reallocate_only(self, value):
    ...
```

### See Also
* module [`aspose.cad`](../../)
* class [`Cache`](/cad/python-net/aspose.cad/cache)
