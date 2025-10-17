---
title: decode_watermark method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.utilities/watermark/decode_watermark/
is_root: false
---

## decode_watermark(, input) {#aspose.threed.entities.Mesh}

Decode the watermark from a mesh


### Returns 


Blind watermark or null if no watermark decoded.


```python

@staticmethod
def decode_watermark(input):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | The mesh to extract watermark |
### Remarks

Both [`Watermark.encode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/encode_watermark) and [`Watermark.decode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/decode_watermark) will perform license check
Trial usage will throw exception, you can use [`TrialException.suppress_trial_exception`](/3d/python-net/aspose.threed/trialexception#suppress_trial_exception) to suppress the exception, but it will not lift the restriction here.
A valid license is required to use these features without any restrictions.### Exceptions
| Exception | Description |
| :- | :- |
| UnauthorizedAccessException | The mesh is protected by password, and provided password is incorrect. |



### Example 


The following code shows how to decode a blind watermark from a mesh saved in 3D file

```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh
from aspose.threed.utilities import Watermark

mesh = pycore.cast(Mesh, FileFormat.PLY.decode("test.ply"))
watermark = Watermark.decode_watermark(mesh)

```


## decode_watermark(, input, password) {#aspose.threed.entities.Mesh-System.String}

Decode the watermark from a mesh


### Returns 


Blind watermark or null if no watermark decoded.


```python

@staticmethod
def decode_watermark(input, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | The mesh to extract watermark |
| password | System.String | The password to decrypt the watermark |
### Exceptions
| Exception | Description |
| :- | :- |
| UnauthorizedAccessException | The mesh is protected by password, and provided password is incorrect. |



### Example 


The following code shows how to decode a blind watermark from a mesh saved in 3D file

```python
from aspose import pycore
from aspose.threed import FileFormat
from aspose.threed.entities import Mesh
from aspose.threed.utilities import Watermark

mesh = pycore.cast(Mesh, FileFormat.PLY.decode("test.ply"))
watermark = Watermark.decode_watermark(mesh, "password")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Watermark`](/3d/python-net/aspose.threed.utilities/watermark)
