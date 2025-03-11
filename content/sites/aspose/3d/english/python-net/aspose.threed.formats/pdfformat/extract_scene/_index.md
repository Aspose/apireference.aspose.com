---
title: extract_scene method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.formats/pdfformat/extract_scene/
is_root: false
---

## extract_scene(self, file_name) {#str}

Extract 3D scenes from PDF file.


### Returns 


List of decoded 3D scenes  that supported by Aspose.3D


```python

def extract_scene(self, file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name of input PDF file |

### Example 


The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.
		
```python
from aspose.threed import FileFormat

scenes = FileFormat.PDF.extract_scene("input.pdf")
for i in range(len(scenes)):
    scenes[i].save(f"output-{i}.obj")

```


## extract_scene(self, file_name, password) {#str-bytes}

Extract 3D scenes from PDF file.


### Returns 


List of decoded 3D scenes  that supported by Aspose.3D


```python

def extract_scene(self, file_name, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | str | File name of input PDF file |
| password | bytes | Password of the PDF file |

### Example 


The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.
		
```python
from aspose.threed import FileFormat

scenes = FileFormat.PDF.extract_scene("input.pdf")
for i in range(len(scenes)):
    scenes[i].save(f"output-{i}.obj")

```


## extract_scene(self, stream, password) {#io.RawIOBase-bytes}

Extract raw 3D content from PDF stream.


### Returns 


List of decoded 3D scenes  that supported by Aspose.3D


```python

def extract_scene(self, stream, password):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | Stream of input PDF file |
| password | bytes | Password of the PDF file |

### Example 


The following code shows how to extract all supported 3D scenes from a 3D PDF file, and write them to obj format.
		
```python
from aspose.threed import FileFormat

scenes = FileFormat.PDF.extract_scene("input.pdf")
for i in range(len(scenes)):
    scenes[i].save(f"output-{i}.obj")

```



### See Also
* module [`aspose.threed.formats`](../../)
* class [`PdfFormat`](/3d/python-net/aspose.threed.formats/pdfformat)
