---
title: BindPoint class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.animation/bindpoint/
is_root: false
---

## BindPoint class

A [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field),
[`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels.



**Inheritance:** [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The BindPoint type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, scene, prop)`](/3d/python-net/aspose.threed.animation/bindpoint/__init__/#aspose.threed.scene-aspose.threed.property) | Initializes a new instance of the [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.animation/bindpoint/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.animation/bindpoint/properties) | Gets the collection of all properties. |
| [property](/3d/python-net/aspose.threed.animation/bindpoint/property) | Gets the property associated with the CurveMapping |
| [channels_count](/3d/python-net/aspose.threed.animation/bindpoint/channels_count) | Gets the total number of property channels defined in this animation curve mapping. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.animation/bindpoint/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.animation/bindpoint/remove_property/#system.string) | Remove the specified property identified by name |
| [`add_channel(self, name, value)`](/3d/python-net/aspose.threed.animation/bindpoint/add_channel/#system.string-system.object) | Adds the specified channel property. |
| [`add_channel(self, name, type, value)`](/3d/python-net/aspose.threed.animation/bindpoint/add_channel/#system.string-system.type-system.object) | Adds the specified channel property. |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.animation/bindpoint/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.animation/bindpoint/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.animation/bindpoint/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_keyframe_sequence(self, channel_name)`](/3d/python-net/aspose.threed.animation/bindpoint/get_keyframe_sequence/#system.string) | Gets the first keyframe sequence in specified channel |
| [`create_keyframe_sequence(self, name)`](/3d/python-net/aspose.threed.animation/bindpoint/create_keyframe_sequence/#system.string) | Creates a new curve and connects it to the first channel of the curve mapping |
| [`bind_keyframe_sequence(self, channel_name, sequence)`](/3d/python-net/aspose.threed.animation/bindpoint/bind_keyframe_sequence/#system.string-aspose.threed.animation.keyframesequence) | Bind the keyframe sequence to specified channel |
| [`get_channel(self, channel_name)`](/3d/python-net/aspose.threed.animation/bindpoint/get_channel/#system.string) | Gets channel by given name |
| [`reset_channels(self)`](/3d/python-net/aspose.threed.animation/bindpoint/reset_channels/#) | Empties the property channels of this animation curve mapping. |



### See Also
* module [`aspose.threed.animation`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`BindPoint`](/3d/python-net/aspose.threed.animation/bindpoint)
