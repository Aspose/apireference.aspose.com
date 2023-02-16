---
title: RevolvedAreaSolid class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 310
url: /python-net/aspose.threed.entities/revolvedareasolid/
is_root: false
---

## RevolvedAreaSolid class

This class represents a solid model by revolving a cross section provided by a profile about an axis.



**Inheritance:** [`RevolvedAreaSolid`](/3d/python-net/aspose.threed.entities/revolvedareasolid) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The RevolvedAreaSolid type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [RevolvedAreaSolid()](/3d/python-net/aspose.threed.entities/revolvedareasolid/__init__/#) | Initialize an SceneObject. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/revolvedareasolid/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/revolvedareasolid/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/revolvedareasolid/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/revolvedareasolid/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/revolvedareasolid/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/revolvedareasolid/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [angle_start](/3d/python-net/aspose.threed.entities/revolvedareasolid/angle_start) | Gets or sets the starting angle of the revolving procedure, measured in radian, default value is 0. |
| [angle_end](/3d/python-net/aspose.threed.entities/revolvedareasolid/angle_end) | Gets or sets the ending angle of the revolving procedure, measured in radian, default value is pi. |
| [axis](/3d/python-net/aspose.threed.entities/revolvedareasolid/axis) | Gets or sets the axis direction, default value is (0, 1, 0). |
| [origin](/3d/python-net/aspose.threed.entities/revolvedareasolid/origin) | Gets or sets the origin point of the revolving, default value is (0, 0, 0). |
| [shape](/3d/python-net/aspose.threed.entities/revolvedareasolid/shape) | Gets or sets the base profile used to revolve. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/revolvedareasolid/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/revolvedareasolid/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/revolvedareasolid/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/revolvedareasolid/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/revolvedareasolid/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/revolvedareasolid/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/revolvedareasolid/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/revolvedareasolid/to_mesh/#) | Convert the [`RevolvedAreaSolid`](/3d/python-net/aspose.threed.entities/revolvedareasolid) into a mesh. |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`RevolvedAreaSolid`](/3d/python-net/aspose.threed.entities/revolvedareasolid)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
