---
title: Sphere class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 340
url: /python-net/aspose.threed.entities/sphere/
is_root: false
---

## Sphere class

Parameterized sphere.



The Sphere type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Sphere()](/3d/python-net/aspose.threed.entities/sphere/__init__/#) | Initializes a new instance of the [Sphere](/3d/python-net/aspose.threed.entities/sphere) with default radius 1. |
| [Sphere(radius)](/3d/python-net/aspose.threed.entities/sphere/__init__/#float) | Initializes a new instance of the [Sphere](/3d/python-net/aspose.threed.entities/sphere) class with specified radius. |
| [Sphere(radius, width_segments, height_segments)](/3d/python-net/aspose.threed.entities/sphere/__init__/#float-int-int) | Initializes a new instance of the [Sphere](/3d/python-net/aspose.threed.entities/sphere) class with specified radius, width segments and height segments. |
| [Sphere(name, radius, width_segments, height_segments, phi_start, phi_length, theta_start, theta_length)](/3d/python-net/aspose.threed.entities/sphere/__init__/#str-float-int-int-float-float-float-float) | Initializes a new instance of the [Sphere](/3d/python-net/aspose.threed.entities/sphere) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/sphere/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/sphere/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/sphere/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/sphere/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/sphere/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/sphere/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/sphere/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/sphere/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [width_segments](/3d/python-net/aspose.threed.entities/sphere/width_segments) | Gets or sets the width segments. |
| [height_segments](/3d/python-net/aspose.threed.entities/sphere/height_segments) | Gets or sets the height segments. |
| [phi_start](/3d/python-net/aspose.threed.entities/sphere/phi_start) | Gets or sets the phi start. |
| [phi_length](/3d/python-net/aspose.threed.entities/sphere/phi_length) | Gets or sets the length of the phi. |
| [theta_start](/3d/python-net/aspose.threed.entities/sphere/theta_start) | Gets or sets the theta start. |
| [theta_length](/3d/python-net/aspose.threed.entities/sphere/theta_length) | Gets or sets the length of the theta. |
| [radius](/3d/python-net/aspose.threed.entities/sphere/radius) | Gets or sets the radius of the sphere. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/sphere/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/sphere/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/sphere/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/sphere/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/sphere/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/sphere/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/sphere/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/sphere/to_mesh/#) | Convert current object to mesh |


### See Also

* module [aspose.threed.entities](../)
* class [Primitive](/3d/python-net/aspose.threed.entities/primitive)
