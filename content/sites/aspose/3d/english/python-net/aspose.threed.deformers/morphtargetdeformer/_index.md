---
title: MorphTargetDeformer class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.deformers/morphtargetdeformer/
is_root: false
---

## MorphTargetDeformer class

MorphTargetDeformer provides per-vertex animation.
MorphTargetDeformer organize all targets via [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel), each channel can organize multiple targets.
A common use of morph target deformer is to apply facial expression to a character.
More details can be found at https://en.wikipedia.org/wiki/Morph_target_animation



**Inheritance:** [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) → 
[`Deformer`](/3d/python-net/aspose.threed.deformers/deformer) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The MorphTargetDeformer type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/__init__/#system.string) | Initializes a new instance of the [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) class. |
| [`__init__(self)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/__init__/#) | Initializes a new instance of the [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/properties) | Gets the collection of all properties. |
| [owner](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/owner) | Gets the geometry which owns this deformer |
| [channels](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/channels) | Gets all channels contained in this deformer |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |



### See Also
* module [`aspose.threed.deformers`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer)
* class [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel)
* class [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer)
