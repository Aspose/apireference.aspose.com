---
title: font_size property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.threed.profiles/text/font_size/
is_root: false
---

## font_size property


Font size scale.

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
### Definition:
```python
@property
def font_size(self):
    ...
@font_size.setter
def font_size(self, value):
    ...
```

### See Also
* module [`aspose.threed.profiles`](../../)
* class [`Text`](/3d/python-net/aspose.threed.profiles/text)
