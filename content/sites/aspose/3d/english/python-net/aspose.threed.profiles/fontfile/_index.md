---
title: FontFile class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed.profiles/fontfile/
is_root: false
---

## FontFile class

Font file contains definitions for glyphs, this is used to create text profile.



**Inheritance:** [`FontFile`](/3d/python-net/aspose.threed.profiles/fontfile) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The FontFile type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/fontfile/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/fontfile/properties) | Gets the collection of all properties. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/fontfile/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/fontfile/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.profiles/fontfile/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.profiles/fontfile/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.profiles/fontfile/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`from_file(, file_name)`](/3d/python-net/aspose.threed.profiles/fontfile/from_file/#str) | Load FontFile from file name |
| [`parse(, bytes)`](/3d/python-net/aspose.threed.profiles/fontfile/parse/#bytes) | Parse FontFile from bytes |



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
* module [`aspose.threed.profiles`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`FontFile`](/3d/python-net/aspose.threed.profiles/fontfile)
