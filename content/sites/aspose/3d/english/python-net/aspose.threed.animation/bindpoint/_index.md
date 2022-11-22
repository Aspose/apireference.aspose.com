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

A [BindPoint](/3d/python-net/aspose.threed.animation/bindpoint) is usually created on an object's property, some property types contains multiple component fields(like a Vector3 field),
            [BindPoint](/3d/python-net/aspose.threed.animation/bindpoint) will generate channel for each component field and connects the field to one or more keyframe sequence instance(s) through the channels.



The BindPoint type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [BindPoint(scene, prop)](/3d/python-net/aspose.threed.animation/bindpoint/__init__/#Scene-Property) | Initializes a new instance of the [BindPoint](/3d/python-net/aspose.threed.animation/bindpoint) class. |


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
| [remove_property(property)](/3d/python-net/aspose.threed.animation/bindpoint/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.animation/bindpoint/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.animation/bindpoint/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.animation/bindpoint/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.animation/bindpoint/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_keyframe_sequence(channel_name)](/3d/python-net/aspose.threed.animation/bindpoint/get_keyframe_sequence/#str) | Gets the first keyframe sequence in specified channel |
| [get_keyframe_sequences(channel_name)](/3d/python-net/aspose.threed.animation/bindpoint/get_keyframe_sequences/#str) | Gets all keyframe sequences in specified channel |
| [create_keyframe_sequence(name)](/3d/python-net/aspose.threed.animation/bindpoint/create_keyframe_sequence/#str) | Creates a new curve and connects it to the first channel of the curve mapping |
| [bind_keyframe_sequence(channel_name, sequence)](/3d/python-net/aspose.threed.animation/bindpoint/bind_keyframe_sequence/#str-KeyframeSequence) | Bind the keyframe sequence to specified channel |
| [get_channel(channel_name)](/3d/python-net/aspose.threed.animation/bindpoint/get_channel/#str) | Gets channel by given name |
| [add_channel(name, value)](/3d/python-net/aspose.threed.animation/bindpoint/add_channel/#str-any) | Adds the specified channel property. |
| [reset_channels()](/3d/python-net/aspose.threed.animation/bindpoint/reset_channels/#) | Empties the property channels of this animation curve mapping. |


### See Also

* module [aspose.threed.animation](../)
* class [A3DObject](/3d/python-net/aspose.threed.animation/a3dobject)
