---
title: HalfSpace class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.threed.entities/halfspace/
is_root: false
---

## HalfSpace class

[`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace) represents a infinity space which is split by a plane, this can be used with [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator)



**Inheritance:** [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The HalfSpace type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/halfspace/__init__/#) | Constructs a new instance of [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace) |
| [`__init__(self, normal, position)`](/3d/python-net/aspose.threed.entities/halfspace/__init__/#aspose.threed.utilities.vector3-aspose.threed.utilities.vector3) | Constructs a new instance of [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace) with given normal vector and a position on the cutter plane; |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/halfspace/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/halfspace/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/halfspace/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/halfspace/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/halfspace/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/halfspace/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [normal](/3d/python-net/aspose.threed.entities/halfspace/normal) | The normal of the split plane, the plane is defined as N * P + D = 0 where N is Normal and P is any point on the plane. |
| [position](/3d/python-net/aspose.threed.entities/halfspace/position) | The any point on the split plane, the plane is defined as N * P + D = 0 where N is Normal and P is any point on the plane. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/halfspace/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/halfspace/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/halfspace/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/halfspace/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/halfspace/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/halfspace/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/halfspace/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`HalfSpace`](/3d/python-net/aspose.threed.entities/halfspace)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
