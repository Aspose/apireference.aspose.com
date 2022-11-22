---
title: Torus class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 360
url: /python-net/aspose.threed.entities/torus/
is_root: false
---

## Torus class

Parameterized torus.



**Inheritance:** [Torus](/3d/python-net/aspose.threed.entities/torus) → 
[Primitive](/3d/python-net/aspose.threed.entities/primitive) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The Torus type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Torus()](/3d/python-net/aspose.threed.entities/torus/__init__/#) | Initializes a new instance of the [Torus](/3d/python-net/aspose.threed.entities/torus) class. |
| [Torus(radius, tube)](/3d/python-net/aspose.threed.entities/torus/__init__/#float-float) | Initializes a new instance of the [Torus](/3d/python-net/aspose.threed.entities/torus) class. |
| [Torus(radius, tube, arc)](/3d/python-net/aspose.threed.entities/torus/__init__/#float-float-float) | Initializes a new instance of the [Torus](/3d/python-net/aspose.threed.entities/torus) class. |
| [Torus(name, radius, tube, radial_segments, tubular_segments, arc)](/3d/python-net/aspose.threed.entities/torus/__init__/#str-float-float-int-int-float) | Initializes a new instance of the [Torus](/3d/python-net/aspose.threed.entities/torus) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/torus/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/torus/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/torus/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/torus/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/torus/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/torus/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/torus/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/torus/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [radius](/3d/python-net/aspose.threed.entities/torus/radius) | Gets or sets the radius of the torus. |
| [tube](/3d/python-net/aspose.threed.entities/torus/tube) | Gets or sets the radius of the tube. |
| [radial_segments](/3d/python-net/aspose.threed.entities/torus/radial_segments) | Gets or sets the radial segments. |
| [tubular_segments](/3d/python-net/aspose.threed.entities/torus/tubular_segments) | Gets or sets the tubular segments. |
| [arc](/3d/python-net/aspose.threed.entities/torus/arc) | Gets or sets the arc. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/torus/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/torus/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/torus/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/torus/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/torus/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/torus/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/torus/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/torus/to_mesh/#) | Convert current object to mesh |


### See Also

* module [aspose.threed.entities](../)
* class [Primitive](/3d/python-net/aspose.threed.entities/primitive)
