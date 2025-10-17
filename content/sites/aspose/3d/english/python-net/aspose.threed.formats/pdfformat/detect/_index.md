---
title: detect method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.formats/pdfformat/detect/
is_root: false
---

## detect(, file_name) {#System.String}

Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header.


### Returns 


The [`FileFormat`](/3d/python-net/aspose.threed/fileformat) instance of the detected type or null if failed.


```python

@staticmethod
def detect(file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | Path to the file to detect file format. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Exception thrown when failed to read data. |



### Example 


```python
from aspose.threed import FileFormat

fmt = FileFormat.detect("input.fbx")
print(f"Input file format: {fmt}")

```


## detect(, stream, file_name) {#io.RawIOBase-System.String}

Detect the file format from data stream, file name is optional for guessing types that has no magic header.


### Returns 


The [`FileFormat`](/3d/python-net/aspose.threed/fileformat) instance of the detected type or null if failed.


```python

@staticmethod
def detect(stream, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Stream containing data to detect |
| file_name | System.String | Original file name of the data, used as hint. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Exception thrown when failed to read data. |



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
* class [`FileFormat`](/3d/python-net/aspose.threed/fileformat)
* class [`PdfFormat`](/3d/python-net/aspose.threed.formats/pdfformat)
