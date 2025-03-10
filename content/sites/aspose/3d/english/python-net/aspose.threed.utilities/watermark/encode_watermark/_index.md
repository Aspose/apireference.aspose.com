---
title: encode_watermark method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.utilities/watermark/encode_watermark/
is_root: false
---

## encode_watermark(, input, text) {#aspose.threed.entities.Mesh-str}

Encode a text into mesh' blind watermark.


### Returns 


A new mesh instance with blind watermark encoded


```python

@staticmethod
def encode_watermark(input, text):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | Mesh to encode a blind watermark |
| text | str | Text to encode to the mesh |
### Remarks

Both [`Watermark.encode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/encode_watermark) and [`Watermark.decode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/decode_watermark) will perform license check
Trial usage will throw exception, you can use [`TrialException.suppress_trial_exception`](/3d/python-net/aspose.threed/trialexception#suppress_trial_exception) to suppress the exception, but it will not lift the restriction here.
A valid license is required to use these features without any restrictions.
### Example 


The following code shows how to encode a blind watermark into a mesh and save to ply file

```python
from aspose.threed import Scene
from aspose.threed.entities import Cylinder
from aspose.threed.utilities import Watermark

mesh = Cylinder().to_mesh()
encodedMesh = Watermark.encode_watermark(mesh, "Hello")
Scene(encodedMesh).save("test.ply")

```


## encode_watermark(, input, text, password) {#aspose.threed.entities.Mesh-str-str}

Encode a text into mesh' blind watermark.


### Returns 


A new mesh instance with blind watermark encoded


```python

@staticmethod
def encode_watermark(input, text, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | Mesh to encode a blind watermark |
| text | str | Text to encode to the mesh |
| password | str | Password to protect the watermark, it's optional |
### Remarks

Both [`Watermark.encode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/encode_watermark) and [`Watermark.decode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/decode_watermark) will perform license check
Trial usage will throw exception, you can use [`TrialException.suppress_trial_exception`](/3d/python-net/aspose.threed/trialexception#suppress_trial_exception) to suppress the exception, but it will not lift the restriction here.
A valid license is required to use these features without any restrictions.
### Example 


The following code shows how to encode a blind watermark into a mesh and save to ply file

```python
from aspose.threed import Scene
from aspose.threed.entities import Cylinder
from aspose.threed.utilities import Watermark

mesh = Cylinder().to_mesh()
encodedMesh = Watermark.encode_watermark(mesh, "Hello", "password")
Scene(encodedMesh).save("test.ply")

```


## encode_watermark(, input, text, password, permanent) {#aspose.threed.entities.Mesh-str-str-bool}

Encode a text into mesh' blind watermark.


### Returns 


A new mesh instance with blind watermark encoded


```python

@staticmethod
def encode_watermark(input, text, password, permanent):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| input | aspose.threed.entities.Mesh | Mesh to encode a blind watermark |
| text | str | Text to encode to the mesh |
| password | str | Password to protect the watermark, it's optional |
| permanent | bool | The permanent watermark will not be overwritten or removed. |
### Remarks

Both [`Watermark.encode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/encode_watermark) and [`Watermark.decode_watermark`](/3d/python-net/aspose.threed.utilities/watermark/decode_watermark) will perform license check
Trial usage will throw exception, you can use [`TrialException.suppress_trial_exception`](/3d/python-net/aspose.threed/trialexception#suppress_trial_exception) to suppress the exception, but it will not lift the restriction here.
A valid license is required to use these features without any restrictions.
### Example 


The following code shows how to encode a blind watermark into a mesh and save to ply file

```python
from aspose.threed import Scene
from aspose.threed.entities import Cylinder
from aspose.threed.utilities import Watermark

mesh = Cylinder().to_mesh()
encodedMesh = Watermark.encode_watermark(mesh, "Hello", "password")
Scene(encodedMesh).save("test.ply")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`Watermark`](/3d/python-net/aspose.threed.utilities/watermark)
