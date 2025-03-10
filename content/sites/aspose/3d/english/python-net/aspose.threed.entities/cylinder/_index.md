---
title: Cylinder class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.entities/cylinder/
is_root: false
---

## Cylinder class

Parameterized Cylinder.
It can also be used to represent the cone when one of radiusTop/radiusBottom is zero.



**Inheritance:** [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) → 
[`Primitive`](/3d/python-net/aspose.threed.entities/primitive) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Cylinder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/cylinder/__init__/#) | Initializes a new instance of the [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) class. |
| [`__init__(self, radius, height)`](/3d/python-net/aspose.threed.entities/cylinder/__init__/#float-float) | Initializes a new instance of the [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) class. |
| [`__init__(self, radius_top, radius_bottom, height)`](/3d/python-net/aspose.threed.entities/cylinder/__init__/#float-float-float) | Initializes a new instance of the [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) class. |
| [`__init__(self, radius_top, radius_bottom, height, radial_segments, height_segments, open_ended)`](/3d/python-net/aspose.threed.entities/cylinder/__init__/#float-float-float-int-int-bool) | Initializes a new instance of the [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) class. |
| [`__init__(self, name, radius_top, radius_bottom, height, radial_segments, height_segments, open_ended, theta_start, theta_length)`](/3d/python-net/aspose.threed.entities/cylinder/__init__/#str-float-float-float-int-int-bool-float-float) | Initializes a new instance of the [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/cylinder/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/cylinder/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/cylinder/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/cylinder/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/cylinder/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/cylinder/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/cylinder/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/cylinder/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [offset_bottom](/3d/python-net/aspose.threed.entities/cylinder/offset_bottom) | Gets or sets the vertices transformation offset of the bottom side. |
| [offset_top](/3d/python-net/aspose.threed.entities/cylinder/offset_top) | Gets or sets the vertices transformation offset of the top side. |
| [generate_fan_cylinder](/3d/python-net/aspose.threed.entities/cylinder/generate_fan_cylinder) | Gets or sets whether to generate the fan-style cylinder when the ThetaLength is less than 2*PI, otherwise the model will not be cut. |
| [shear_bottom](/3d/python-net/aspose.threed.entities/cylinder/shear_bottom) | Gets or sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [shear_top](/3d/python-net/aspose.threed.entities/cylinder/shear_top) | Gets or sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) |
| [radius_top](/3d/python-net/aspose.threed.entities/cylinder/radius_top) | Gets or sets the radius of cylinder's top cap. |
| [radius_bottom](/3d/python-net/aspose.threed.entities/cylinder/radius_bottom) | Gets or sets the radius of cylinder's bottom cap. |
| [height](/3d/python-net/aspose.threed.entities/cylinder/height) | Gets or sets the height of the cylinder. |
| [radial_segments](/3d/python-net/aspose.threed.entities/cylinder/radial_segments) | Gets or sets the radial segments. |
| [height_segments](/3d/python-net/aspose.threed.entities/cylinder/height_segments) | Gets or sets the height segments. |
| [open_ended](/3d/python-net/aspose.threed.entities/cylinder/open_ended) | Gets or sets a value indicating whether this [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder) open ended.<br/>The default value is false. |
| [theta_start](/3d/python-net/aspose.threed.entities/cylinder/theta_start) | Gets or sets the theta start.<br/>The default value is 0. |
| [theta_length](/3d/python-net/aspose.threed.entities/cylinder/theta_length) | Gets or sets the length of the theta.<br/>The default value is 2π. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/cylinder/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/cylinder/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/cylinder/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/cylinder/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/cylinder/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/cylinder/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/cylinder/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`to_mesh(self)`](/3d/python-net/aspose.threed.entities/cylinder/to_mesh/#) | Convert current object to mesh |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Cylinder`](/3d/python-net/aspose.threed.entities/cylinder)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Primitive`](/3d/python-net/aspose.threed.entities/primitive)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
