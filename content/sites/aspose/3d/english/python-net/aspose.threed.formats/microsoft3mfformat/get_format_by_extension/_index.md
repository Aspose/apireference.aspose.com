---
title: get_format_by_extension method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed.formats/microsoft3mfformat/get_format_by_extension/
is_root: false
---

## get_format_by_extension(, extension_name) {#System.String}

Gets the preferred file format from the file extension name
The extension name should starts with a dot('.').


### Returns 


Instance of [`FileFormat`](/3d/python-net/aspose.threed/fileformat), otherwise null returned.


```python

@staticmethod
def get_format_by_extension(extension_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| extension_name | System.String | The extension name started with '.' to query. |

### Example 


The following code shows how to save scene to memory using specified format

```python
from aspose.threed import FileFormat, Scene
from aspose.threed.entities import Box
from io import BytesIO

scene = Scene(Box())
outputFormat = ".glb"
format = FileFormat.get_format_by_extension(outputFormat)
with BytesIO() as ms:
    scene.save(ms, format)

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`FileFormat`](/3d/python-net/aspose.threed/fileformat)
* class [`Microsoft3MFFormat`](/3d/python-net/aspose.threed.formats/microsoft3mfformat)
