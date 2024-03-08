---
title: detect method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.threed.formats/plyformat/detect/
is_root: false
---

## detect {#str}

Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header.


### Returns 





```python
def detect(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str |  |

### Example 


```python
from aspose.threed import FileFormat

fmt = FileFormat.detect("input.fbx")
print(f"Input file format: {fmt}")

```


## detect {#io.RawIOBase-str}

Detect the file format from data stream, file name is optional for guessing types that has no magic header.


### Returns 





```python
def detect(self, stream, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase |  |
| file_name | str |  |

### Example 


```python
from aspose.threed import FileFormat
from io import BytesIO
import bytearray

bytes = bytearray(100)
fmt = FileFormat.detect(BytesIO(bytes), "input-file")
print(f"Input data format: {fmt}")

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`PlyFormat`](/3d/python-net/aspose.threed.formats/plyformat)
