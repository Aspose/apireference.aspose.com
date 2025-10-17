---
title: from_file method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.profiles/fontfile/from_file/
is_root: false
---

## from_file(, file_name) {#System.String}

Load FontFile from file name


### Returns 


FontFile instance


```python

@staticmethod
def from_file(file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | Path to the font file |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed to read from file. |



### Example 


The following code shows how to create a 3D mesh from text using specified font file.
		
```python
from aspose.threed import Scene
from aspose.threed.entities import LinearExtrusion
from aspose.threed.profiles import FontFile, Text

font = FontFile.from_file(r"CascadiaCode-Regular.otf")
text = Text()
text.font = font
text.content = "ABC"
text.font_size = 10.0
linear = LinearExtrusion(text, 10).to_mesh()
scene = Scene(linear)
scene.save(r"test.stl")

```



### See Also
* module [`aspose.threed.profiles`](../../)
* class [`FontFile`](/3d/python-net/aspose.threed.profiles/fontfile)
