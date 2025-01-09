---
title: SweptAreaSolid class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 350
url: /aspose.threed.entities/sweptareasolid/
is_root: false
---

## SweptAreaSolid class

A [`SweptAreaSolid`](/3d/python-net/aspose.threed.entities/sweptareasolid) constructs a geometry by sweeping a profile along a directrix.



**Inheritance:** [`SweptAreaSolid`](/3d/python-net/aspose.threed.entities/sweptareasolid) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The SweptAreaSolid type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/sweptareasolid/__init__/#) | Initialize an SceneObject. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/sweptareasolid/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/sweptareasolid/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/sweptareasolid/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/sweptareasolid/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/sweptareasolid/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/sweptareasolid/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [shape](/3d/python-net/aspose.threed.entities/sweptareasolid/shape) | The base profile to construct the geometry. |
| [directrix](/3d/python-net/aspose.threed.entities/sweptareasolid/directrix) | The directrix that the swept area sweeping along with. |
| [start_point](/3d/python-net/aspose.threed.entities/sweptareasolid/start_point) | The start point of the directrix. |
| [end_point](/3d/python-net/aspose.threed.entities/sweptareasolid/end_point) | The end point of the directrix. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/sweptareasolid/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/sweptareasolid/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.entities/sweptareasolid/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/sweptareasolid/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/sweptareasolid/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/sweptareasolid/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/sweptareasolid/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh](/3d/python-net/aspose.threed.entities/sweptareasolid/to_mesh/#) | Convert current object to mesh |



### Example 


The following code shows how to modeling an solid entity by sweeping a C-shape on a circle

```python
from aspose.threed import Scene
from aspose.threed.entities import Circle, EndPoint, SweptAreaSolid
from aspose.threed.profiles import CShape

directrix = Circle(20)
shape = CShape()
solid = SweptAreaSolid()
solid.shape = shape
solid.directrix = directrix
solid.start_point = EndPoint.from_degree(0)
solid.end_point = EndPoint.from_degree(130)
swept = solid
scene = Scene()
scene.root_node.create_child_node(swept)
scene.save("swept.obj")

```

### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`SweptAreaSolid`](/3d/python-net/aspose.threed.entities/sweptareasolid)
