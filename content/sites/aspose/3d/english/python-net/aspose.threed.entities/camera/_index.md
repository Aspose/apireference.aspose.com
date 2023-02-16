---
title: Camera class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.entities/camera/
is_root: false
---

## Camera class

The camera describes the eye point of the viewer looking at the scene.



**Inheritance:** [`Camera`](/3d/python-net/aspose.threed.entities/camera) → 
[`Frustum`](/3d/python-net/aspose.threed.entities/frustum) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Camera type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Camera()](/3d/python-net/aspose.threed.entities/camera/__init__/#) | Initializes a new instance of the [`Camera`](/3d/python-net/aspose.threed.entities/camera) class. |
| [Camera(projection_type)](/3d/python-net/aspose.threed.entities/camera/__init__/#ProjectionType) | Initializes a new instance of the [`Camera`](/3d/python-net/aspose.threed.entities/camera) class. |
| [Camera(name)](/3d/python-net/aspose.threed.entities/camera/__init__/#str) | Initializes a new instance of the [`Camera`](/3d/python-net/aspose.threed.entities/camera) class. |
| [Camera(name, projection_type)](/3d/python-net/aspose.threed.entities/camera/__init__/#str-ProjectionType) | Initializes a new instance of the [`Camera`](/3d/python-net/aspose.threed.entities/camera) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/camera/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/camera/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/camera/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/camera/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/camera/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/camera/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [rotation_mode](/3d/python-net/aspose.threed.entities/camera/rotation_mode) | Gets or sets the frustum's orientation mode<br/>This property only works when the [`Frustum.target`](/3d/python-net/aspose.threed.entities/frustum#target) is null.<br/>If the value is [`RotationMode.FIXED_TARGET`](/3d/python-net/aspose.threed.entities/rotationmode#FIXED_TARGET), the direction is always calculated by the property [`Frustum.look_at`](/3d/python-net/aspose.threed.entities/frustum#look_at)<br/>Otherwise the [`Frustum.look_at`](/3d/python-net/aspose.threed.entities/frustum#look_at) is always calculated by the [`Frustum.direction`](/3d/python-net/aspose.threed.entities/frustum#direction) |
| [near_plane](/3d/python-net/aspose.threed.entities/camera/near_plane) | Gets or sets the frustum's near plane distance. |
| [far_plane](/3d/python-net/aspose.threed.entities/camera/far_plane) | Gets or sets the frustum's far plane distance. |
| [aspect](/3d/python-net/aspose.threed.entities/camera/aspect) | Gets or sets the aspect ratio of the frustum |
| [ortho_height](/3d/python-net/aspose.threed.entities/camera/ortho_height) | Gets or sets the height when frustum in orthographic projection. |
| [up](/3d/python-net/aspose.threed.entities/camera/up) | Gets or sets the up direction of the camera |
| [look_at](/3d/python-net/aspose.threed.entities/camera/look_at) | Gets or sets the the interested position that the camera is looking at. |
| [direction](/3d/python-net/aspose.threed.entities/camera/direction) | Gets or sets the direction that the camera is looking at.<br/>Changes on this property will also affects the [`Frustum.look_at`](/3d/python-net/aspose.threed.entities/frustum#look_at) and [`Frustum.target`](/3d/python-net/aspose.threed.entities/frustum#target). |
| [target](/3d/python-net/aspose.threed.entities/camera/target) | Gets or sets the target that the camera is looking at.<br/>If the user supports this property, it should be prior to [`Frustum.look_at`](/3d/python-net/aspose.threed.entities/frustum#look_at) property. |
| [aperture_mode](/3d/python-net/aspose.threed.entities/camera/aperture_mode) | Gets or sets the camera's aperture mode |
| [field_of_view](/3d/python-net/aspose.threed.entities/camera/field_of_view) | Gets or sets the camera's field of view in degrees, this property is used only when ApertureMode is [`ApertureMode.HORIZONTAL`](/3d/python-net/aspose.threed.entities/aperturemode#HORIZONTAL) or [`ApertureMode.VERTICAL`](/3d/python-net/aspose.threed.entities/aperturemode#VERTICAL) |
| [field_of_view_x](/3d/python-net/aspose.threed.entities/camera/field_of_view_x) | Gets or sets the camera's horizontal field of view in degrees, this property is used only when ApertureMode is  [`ApertureMode.HORIZ_AND_VERT`](/3d/python-net/aspose.threed.entities/aperturemode#HORIZ_AND_VERT) |
| [field_of_view_y](/3d/python-net/aspose.threed.entities/camera/field_of_view_y) | Gets or sets the camera's vertical field of view in degrees, this property is used only when ApertureMode is  [`ApertureMode.HORIZ_AND_VERT`](/3d/python-net/aspose.threed.entities/aperturemode#HORIZ_AND_VERT) |
| [width](/3d/python-net/aspose.threed.entities/camera/width) | Gets or sets the view plane's width measured in inches |
| [height](/3d/python-net/aspose.threed.entities/camera/height) | Gets or sets the view plane's height measured in inches |
| [aspect_ratio](/3d/python-net/aspose.threed.entities/camera/aspect_ratio) | Gets or sets the view plane aspect ratio. |
| [magnification](/3d/python-net/aspose.threed.entities/camera/magnification) | Gets or sets the magnification used in orthographic camera |
| [projection_type](/3d/python-net/aspose.threed.entities/camera/projection_type) | Gets or sets the camera's projection type.<br/>By default the perspective projection is used. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/camera/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/camera/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/camera/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/camera/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/camera/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/camera/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/camera/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [move_forward(distance)](/3d/python-net/aspose.threed.entities/camera/move_forward/#float) | Move camera forward towards its direction or target. |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Camera`](/3d/python-net/aspose.threed.entities/camera)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Frustum`](/3d/python-net/aspose.threed.entities/frustum)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
