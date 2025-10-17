---
title: BooleanOperator class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.entities/booleanoperator/
is_root: false
---

## BooleanOperator class

Boolean operator allows you to apply Boolean operation on two [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible) instances.



**Inheritance:** [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The BooleanOperator type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/booleanoperator/__init__/#) | Constructor of [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator) |
| [`__init__(self, operation, first, second)`](/3d/python-net/aspose.threed.entities/booleanoperator/__init__/#aspose.threed.entities.booleanoperation-aspose.threed.a3dobject-aspose.threed.a3dobject) | Constructs a new instance of [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator) with two operands |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/booleanoperator/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/booleanoperator/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/booleanoperator/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/booleanoperator/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/booleanoperator/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/booleanoperator/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [operator](/3d/python-net/aspose.threed.entities/booleanoperator/operator) | The Boolean operator used in the operation to create the result mesh. |
| [first](/3d/python-net/aspose.threed.entities/booleanoperator/first) | The first operand of the Boolean operator |
| [second](/3d/python-net/aspose.threed.entities/booleanoperator/second) | The second operand of the Boolean operator |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/booleanoperator/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/booleanoperator/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/booleanoperator/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/booleanoperator/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/booleanoperator/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/booleanoperator/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/booleanoperator/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`to_mesh(self)`](/3d/python-net/aspose.threed.entities/booleanoperator/to_mesh/#) | Perform the Boolean operation on two operands |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`BooleanOperator`](/3d/python-net/aspose.threed.entities/booleanoperator)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`IMeshConvertible`](/3d/python-net/aspose.threed.entities/imeshconvertible)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
