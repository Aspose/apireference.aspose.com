---
title: TransformedCurve class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 370
url: /python-net/aspose.threed.entities/transformedcurve/
is_root: false
---

## TransformedCurve class

A [TransformedCurve](/3d/python-net/aspose.threed.entities/transformedcurve) gives a curve a placement by using a transformation matrix.
This allows to perform a transformation inside a [TrimmedCurve](/3d/python-net/aspose.threed.entities/trimmedcurve) or [CompositeCurve](/3d/python-net/aspose.threed.entities/compositecurve).



**Inheritance:** [TransformedCurve](/3d/python-net/aspose.threed.entities/transformedcurve) → 
[Curve](/3d/python-net/aspose.threed.entities/curve) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The TransformedCurve type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [TransformedCurve()](/3d/python-net/aspose.threed.entities/transformedcurve/__init__/#) | The constructor of [TransformedCurve](/3d/python-net/aspose.threed.entities/transformedcurve) |
| [TransformedCurve(basis_curve, transformation)](/3d/python-net/aspose.threed.entities/transformedcurve/__init__/#Curve-aspose.threed.utilities.Matrix4) | The constructor of [TransformedCurve](/3d/python-net/aspose.threed.entities/transformedcurve) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/transformedcurve/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/transformedcurve/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/transformedcurve/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/transformedcurve/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/transformedcurve/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/transformedcurve/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [color](/3d/python-net/aspose.threed.entities/transformedcurve/color) | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [transform_matrix](/3d/python-net/aspose.threed.entities/transformedcurve/transform_matrix) | The transformation matrix. |
| [basis_curve](/3d/python-net/aspose.threed.entities/transformedcurve/basis_curve) | The basis curve. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/transformedcurve/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/transformedcurve/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/transformedcurve/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/transformedcurve/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/transformedcurve/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/transformedcurve/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/transformedcurve/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |


### See Also

* module [aspose.threed.entities](../)
* class [Curve](/3d/python-net/aspose.threed.entities/curve)
