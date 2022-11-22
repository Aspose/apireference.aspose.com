---
title: Frustum class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed.entities/frustum/
is_root: false
---

## Frustum class

The base class of [Camera](/3d/python-net/aspose.threed.entities/camera) and [Light](/3d/python-net/aspose.threed.entities/light)



The Frustum type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/frustum/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/frustum/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/frustum/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/frustum/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/frustum/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/frustum/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [rotation_mode](/3d/python-net/aspose.threed.entities/frustum/rotation_mode) | Gets or sets the frustum's orientation mode<br/>            This property only works when the [Frustum.target](/3d/python-net/aspose.threed.entities/frustum#target) is null.<br/>            If the value is [RotationMode.FIXED_TARGET](/3d/python-net/aspose.threed.entities/rotationmode#FIXED_TARGET), the direction is always calculated by the property [Frustum.look_at](/3d/python-net/aspose.threed.entities/frustum#look_at)<br/>            Otherwise the [Frustum.look_at](/3d/python-net/aspose.threed.entities/frustum#look_at) is always calculated by the [Frustum.direction](/3d/python-net/aspose.threed.entities/frustum#direction) |
| [near_plane](/3d/python-net/aspose.threed.entities/frustum/near_plane) | Gets or sets the frustum's near plane distance. |
| [far_plane](/3d/python-net/aspose.threed.entities/frustum/far_plane) | Gets or sets the frustum's far plane distance. |
| [aspect](/3d/python-net/aspose.threed.entities/frustum/aspect) | Gets or sets the aspect ratio of the frustum |
| [ortho_height](/3d/python-net/aspose.threed.entities/frustum/ortho_height) | Gets or sets the height when frustum in orthographic projection. |
| [up](/3d/python-net/aspose.threed.entities/frustum/up) | Gets or sets the up direction of the camera |
| [look_at](/3d/python-net/aspose.threed.entities/frustum/look_at) | Gets or sets the the interested position that the camera is looking at. |
| [direction](/3d/python-net/aspose.threed.entities/frustum/direction) | Gets or sets the direction that the camera is looking at.<br/>            Changes on this property will also affects the [Frustum.look_at](/3d/python-net/aspose.threed.entities/frustum#look_at) and [Frustum.target](/3d/python-net/aspose.threed.entities/frustum#target). |
| [target](/3d/python-net/aspose.threed.entities/frustum/target) | Gets or sets the target that the camera is looking at.<br/>            If the user supports this property, it should be prior to [Frustum.look_at](/3d/python-net/aspose.threed.entities/frustum#look_at) property. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/frustum/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/frustum/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/frustum/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/frustum/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/frustum/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/frustum/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/frustum/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |


### See Also

* module [aspose.threed.entities](../)
* class [Entity](/3d/python-net/aspose.threed.entities/entity)
