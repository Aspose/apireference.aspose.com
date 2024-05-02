---
title: get_file_format method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.fileformats.dwf/dwfimage/get_file_format/
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



### See Also
* module [`aspose.cad.fileformats.dwf`](../../)
* class [`DwfImage`](/cad/python-net/aspose.cad.fileformats.dwf/dwfimage)
