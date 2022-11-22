---
title: LinearExtrusion class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 170
url: /python-net/aspose.threed.entities/linearextrusion/
is_root: false
---

## LinearExtrusion class

Linear extrusion takes a 2D shape as input and extends the shape in the 3rd dimension.



The LinearExtrusion type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [LinearExtrusion()](/3d/python-net/aspose.threed.entities/linearextrusion/__init__/#) | Constructor of instance [LinearExtrusion](/3d/python-net/aspose.threed.entities/linearextrusion). |
| [LinearExtrusion(shape, height)](/3d/python-net/aspose.threed.entities/linearextrusion/__init__/#aspose.threed.profiles.Profile-float) | Constructor of instance [LinearExtrusion](/3d/python-net/aspose.threed.entities/linearextrusion). |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/linearextrusion/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/linearextrusion/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/linearextrusion/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/linearextrusion/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/linearextrusion/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/linearextrusion/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [shape](/3d/python-net/aspose.threed.entities/linearextrusion/shape) | The base shape to be extruded. |
| [direction](/3d/python-net/aspose.threed.entities/linearextrusion/direction) | The direction of extrusion, default value is (0, 0, 1) |
| [height](/3d/python-net/aspose.threed.entities/linearextrusion/height) | The height of the extruded geometry, default value is 1.0 |
| [slices](/3d/python-net/aspose.threed.entities/linearextrusion/slices) | The slices of the twisted extruded geometry, default value is 1. |
| [center](/3d/python-net/aspose.threed.entities/linearextrusion/center) | If this value is false, the linear extrusion Z range is from 0 to height, otherwise the range is from -height/2 to height/2. |
| [twist_offset](/3d/python-net/aspose.threed.entities/linearextrusion/twist_offset) | The offset that used in twisting, default value is (0, 0, 0). |
| [twist](/3d/python-net/aspose.threed.entities/linearextrusion/twist) | The number of degrees of through which the shape is extruded. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/linearextrusion/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/linearextrusion/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/linearextrusion/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/linearextrusion/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/linearextrusion/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/linearextrusion/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/linearextrusion/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/linearextrusion/to_mesh/#) | Convert the extrusion to mesh. |


### See Also

* module [aspose.threed.entities](../)
* class [Entity](/3d/python-net/aspose.threed.entities/entity)
