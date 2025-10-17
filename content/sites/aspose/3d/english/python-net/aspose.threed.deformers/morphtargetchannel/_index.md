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

A MorphTargetChannel is used by [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) to organize the target geometries.
Some file formats like FBX support multiple channels in parallel.



**Inheritance:** [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The MorphTargetChannel type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/__init__/#system.string) | Initializes a new instance of the [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel) class. |
| [`__init__(self)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/__init__/#) | Initializes a new instance of the [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.deformers/morphtargetchannel/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.deformers/morphtargetchannel/properties) | Gets the collection of all properties. |
| [weights](/3d/python-net/aspose.threed.deformers/morphtargetchannel/weights) | Gets the full weight values of target geometries. |
| [channel_weight](/3d/python-net/aspose.threed.deformers/morphtargetchannel/channel_weight) | Gets or sets the deformer weight of this channel. <br/>The weight is between 0.0 and 1.0 |
| [targets](/3d/python-net/aspose.threed.deformers/morphtargetchannel/targets) | Gets all targets associated with the channel. |
| [DEFAULT_WEIGHT](/3d/python-net/aspose.threed.deformers/morphtargetchannel/default_weight) | Default weight for morph target. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_weight(self, target)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/get_weight/#aspose.threed.entities.shape) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. |
| [`set_weight(self, target, weight)`](/3d/python-net/aspose.threed.deformers/morphtargetchannel/set_weight/#aspose.threed.entities.shape-float) | Sets the weight for the specified target, default value is 1, range should between 0~1 |



### Remarks 


Weight is between 0 and 1.0, and default weight for target is 0.0;

### See Also
* module [`aspose.threed.deformers`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel)
* class [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer)
