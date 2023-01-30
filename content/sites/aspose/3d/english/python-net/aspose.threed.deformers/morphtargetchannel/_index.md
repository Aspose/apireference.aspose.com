---
title: MorphTargetChannel class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.deformers/morphtargetchannel/
is_root: false
---

## MorphTargetChannel class

A MorphTargetChannel is used by [MorphTargetDeformer](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) to organize the target geometries.
Some file formats like FBX support multiple channels in parallel.



**Inheritance:** [MorphTargetChannel](/3d/python-net/aspose.threed.deformers/morphtargetchannel) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The MorphTargetChannel type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [MorphTargetChannel(name)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/__init__/#str) | Initializes a new instance of the [MorphTargetChannel](/3d/python-net/aspose.threed.deformers/morphtargetchannel) class. |
| [MorphTargetChannel()](/3d/python-net/aspose.threed.deformers/morphtargetchannel/__init__/#) | Initializes a new instance of the [MorphTargetChannel](/3d/python-net/aspose.threed.deformers/morphtargetchannel) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.deformers/morphtargetchannel/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.deformers/morphtargetchannel/properties) | Gets the collection of all properties. |
| [weights](/3d/python-net/aspose.threed.deformers/morphtargetchannel/weights) | Gets the full weight values of target geometries. |
| [channel_weight](/3d/python-net/aspose.threed.deformers/morphtargetchannel/channel_weight) | Gets or sets the deformer weight of this channel. <br/>The weight is between 0.0 and 1.0 |
| [targets](/3d/python-net/aspose.threed.deformers/morphtargetchannel/targets) | Gets all targets associated with the channel. |
| [DEFAULT_WEIGHT](/3d/python-net/aspose.threed.deformers/morphtargetchannel/DEFAULT_WEIGHT) | Default weight for morph target. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_weight(target)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/get_weight/#aspose.threed.entities.Shape) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. |
| [set_weight(target, weight)](/3d/python-net/aspose.threed.deformers/morphtargetchannel/set_weight/#aspose.threed.entities.Shape-float) | Sets the weight for the specified target, default value is 1, range should between 0~1 |



### Remarks 


Weight is between 0 and 1.0, and default weight for target is 0.0;
### See Also

* module [aspose.threed.deformers](../)
* class [A3DObject](/3d/python-net/aspose.threed.deformers/a3dobject)
