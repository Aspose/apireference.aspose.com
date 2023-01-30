---
title: decode_watermark method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.utilities/watermark/decode_watermark/
is_root: false
---

## decode_watermark(input, password) {#aspose.threed.entities.Mesh-str}

Decode the watermark from a mesh


### Returns 


Blind watermark or null if no watermark decoded.


```python
def decode_watermark(self, input, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | The mesh to extract watermark |
| password | str | The password to decrypt the watermark |
### Exceptions
| Exception | Description |
| :- | :- |
| UnauthorizedAccessException | The mesh is protected by password, and provided password is incorrect. |



### Example 


The following code shows how to decode a blind watermark from a mesh saved in 3D file

```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.utilities import Watermark

mesh = pycore.cast(Aspose.ThreeD.Entities.Mesh, FileFormat.PLY.decode("test.ply", None))
watermark = Watermark.decode_watermark(mesh, "password")

```



### See Also
* module [aspose.threed.utilities](../../)
* class [Watermark](/3d/python-net/aspose.threed.utilities/watermark)
