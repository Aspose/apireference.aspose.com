---
title: AnimationChannel class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.threed.animation/animationchannel/
is_root: false
---

## AnimationChannel class

A channel maps property's component field to a set of keyframe sequences



**Inheritance:** [`AnimationChannel`](/3d/python-net/aspose.threed.animation/animationchannel) → 
[`KeyframeSequence`](/3d/python-net/aspose.threed.animation/keyframesequence) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The AnimationChannel type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.animation/animationchannel/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.animation/animationchannel/properties) | Gets the collection of all properties. |
| [bind_point](/3d/python-net/aspose.threed.animation/animationchannel/bind_point) | Gets the property bind point which owns this curve |
| [key_frames](/3d/python-net/aspose.threed.animation/animationchannel/key_frames) | Gets the key frames of this curve. |
| [post_behavior](/3d/python-net/aspose.threed.animation/animationchannel/post_behavior) | Gets the post behavior indicates what the sampled value should be after the last key frame. |
| [pre_behavior](/3d/python-net/aspose.threed.animation/animationchannel/pre_behavior) | Gets the pre behavior indicates what the sampled value should be before the first key. |
| [component_type](/3d/python-net/aspose.threed.animation/animationchannel/component_type) | Gets the component field's type |
| [default_value](/3d/python-net/aspose.threed.animation/animationchannel/default_value) | Gets or sets the Default value of the channel.<br/>If a channel has no keyframe sequences connected, the default value will be used during the animation evaluation.<br/>A real scenario: Animation only animates a node's x coordinate, the y and z are not changed, <br/>then the default value will be used during full translation evaluation. |
| [keyframe_sequence](/3d/python-net/aspose.threed.animation/animationchannel/keyframe_sequence) | Gets associated keyframe sequence inside this channel |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.animation/animationchannel/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.animation/animationchannel/remove_property/#str) | Remove the specified property identified by name |
| [add](/3d/python-net/aspose.threed.animation/animationchannel/add/#float-float) | Create a new key frame with specified value |
| [add](/3d/python-net/aspose.threed.animation/animationchannel/add/#float-float-aspose.threed.animation.Interpolation) | Create a new key frame with specified value |
| [get_property](/3d/python-net/aspose.threed.animation/animationchannel/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.animation/animationchannel/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.animation/animationchannel/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [reset](/3d/python-net/aspose.threed.animation/animationchannel/reset/#) | Removes all key frames and reset the post/pre behaviors. |



### See Also
* module [`aspose.threed.animation`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`AnimationChannel`](/3d/python-net/aspose.threed.animation/animationchannel)
* class [`KeyframeSequence`](/3d/python-net/aspose.threed.animation/keyframesequence)
