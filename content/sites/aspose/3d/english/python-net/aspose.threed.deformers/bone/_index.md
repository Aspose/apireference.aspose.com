---
title: Bone class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.deformers/bone/
is_root: false
---

## Bone class

A bone defines the subset of the geometry's control point, and defined blend weight for each control point.
The [`Bone`](/3d/python-net/aspose.threed.deformers/bone) object cannot be used directly, a [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) instance is used to deform the geometry, and [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) comes with a set of bones, each bone linked to a node.
NOTE: A control point of a geometry can be bounded to more than one Bones.



**Inheritance:** [`Bone`](/3d/python-net/aspose.threed.deformers/bone) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Bone type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Bone(name)](/3d/python-net/aspose.threed.deformers/bone/__init__/#str) | Initializes a new instance of the [`Bone`](/3d/python-net/aspose.threed.deformers/bone) class. |
| [Bone()](/3d/python-net/aspose.threed.deformers/bone/__init__/#) | Initializes a new instance of the [`Bone`](/3d/python-net/aspose.threed.deformers/bone) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.deformers/bone/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.deformers/bone/properties) | Gets the collection of all properties. |
| [weight_count](/3d/python-net/aspose.threed.deformers/bone/weight_count) | Gets the count of weight, this is automatically extended by [`Bone.set_weight(index, weight)`](/3d/python-net/aspose.threed.deformers/bone/set_weight) |
| [transform](/3d/python-net/aspose.threed.deformers/bone/transform) | Gets or sets the transform matrix of the node containing the bone. |
| [bone_transform](/3d/python-net/aspose.threed.deformers/bone/bone_transform) | Gets or sets the transform matrix of the bone. |
| [node](/3d/python-net/aspose.threed.deformers/bone/node) | Gets or sets the node. The bone node is the bone which skin attached to, the [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) will use bone node to influence the displacement of the control points.<br/>Bone node usually has a [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) attached, but it's not required.<br/>Attached [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton) is usually used by DCC software to show skeleton to user. |


### Indexer
| Name | Description |
| :- | :- |
| [index] |  |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.deformers/bone/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.deformers/bone/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.deformers/bone/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.deformers/bone/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.deformers/bone/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_weight(index)](/3d/python-net/aspose.threed.deformers/bone/get_weight/#int) | Gets the weight for control point specified by index |
| [set_weight(index, weight)](/3d/python-net/aspose.threed.deformers/bone/set_weight/#int-float) | Sets the weight for control point specified by index |



### See Also
* module [`aspose.threed.deformers`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Bone`](/3d/python-net/aspose.threed.deformers/bone)
* class [`Skeleton`](/3d/python-net/aspose.threed.entities/skeleton)
* class [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer)
