---
title: Text class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.threed.profiles/text/
is_root: false
---

## Text class

Text profile, this profile describes contours using font and text.



**Inheritance:** [`Text`](/3d/python-net/aspose.threed.profiles/text) → 
[`Profile`](/3d/python-net/aspose.threed.profiles/profile) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Text type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.profiles/text/__init__/#) | Initialize an SceneObject. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/text/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/text/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/text/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/text/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/text/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/text/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [content](/3d/python-net/aspose.threed.profiles/text/content) | Content of the text |
| [font](/3d/python-net/aspose.threed.profiles/text/font) | The font of the text. |
| [font_size](/3d/python-net/aspose.threed.profiles/text/font_size) | Font size scale. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/text/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/text/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.profiles/text/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.profiles/text/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.profiles/text/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.profiles/text/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.profiles/text/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



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
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Profile`](/3d/python-net/aspose.threed.profiles/profile)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`Text`](/3d/python-net/aspose.threed.profiles/text)
