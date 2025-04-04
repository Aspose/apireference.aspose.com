﻿---
title: set_license method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed/license/set_license/
is_root: false
---

## set_license(self, license_name) {#str}

Licenses the component.



```python

def set_license(self, license_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| license_name | str |  |
### Remarks

Tries to find the license in the following locations:


1. Explicit path.
### Example 


In this example, an attempt will be made to find a license file named MyLicense.lic
in the folder that contains 

Can be a full or short file name.
Use an empty string to switch to evaluation mode.


## set_license(self, stream) {#io.RawIOBase}

Licenses the component.



```python

def set_license(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | A stream that contains the license. |
### Remarks

Use this method to load a license from a stream.
### Example 


```python
from aspose.threed import License

license = License()
license.set_license(myStream)

```



### See Also
* module [`aspose.threed`](../../)
* class [`License`](/3d/python-net/aspose.threed/license)
