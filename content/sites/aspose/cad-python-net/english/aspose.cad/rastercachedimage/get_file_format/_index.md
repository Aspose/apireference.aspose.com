---
title: get_file_format method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 180
url: /aspose.cad/rastercachedimage/get_file_format/
is_root: false
---

## get_file_format {#str}

Gets the file format.


### Returns 


The determined file format.


```python
def get_file_format(self, file_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path. |
### Remarks

The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether file may be loaded.
### Example 


Determines whether file is a DWG drawing

```python
from aspose.cad import FileFormat, Image

fileFormat = Image.get_file_format("file.dwg")
if fileFormat >= FileFormat.CAD_R010 and fileFormat <= FileFormat.CAD_R2010:
    print("This is a DWG drawing")

```


## get_file_format {#io.RawIOBase}

Gets the file format.


### Returns 


The determined file format.


```python
def get_file_format(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream. |
### Remarks

The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether stream may be loaded.
### Example 


Determines whether a stream contains a DXF drawing

```python
from aspose.cad import FileFormat, Image

with open("file.dxf", "rb") as f:
    fileFormat = Image.get_file_format(f)
    if fileFormat >= FileFormat.DXF_CAD_R010 and fileFormat <= FileFormat.DXF_CAD_R2010:
        print("This is a DXF drawing")

```



### See Also
* module [`aspose.cad`](../../)
* class [`RasterCachedImage`](/cad/python-net/aspose.cad/rastercachedimage)
