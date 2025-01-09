---
title: extract method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.threed.formats/pdfformat/extract/
is_root: false
---

## extract {#str-bytes}

Extract raw 3D content from PDF file.


### Returns 


A list of all 3D contents in bytes, including the formats that Aspose.3D don't supported.


```python
def extract(self, file_name, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name of input PDF file |
| password | bytes | Password of the PDF file |


## extract {#io.RawIOBase-bytes}

Extract raw 3D content from PDF stream.


### Returns 


A list of all 3D contents in bytes, including the formats that Aspose.3D don't supported.


```python
def extract(self, stream, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Stream of input PDF file |
| password | bytes | Password of the PDF file |



### See Also
* module [`aspose.threed.formats`](../../)
* class [`PdfFormat`](/3d/python-net/aspose.threed.formats/pdfformat)
