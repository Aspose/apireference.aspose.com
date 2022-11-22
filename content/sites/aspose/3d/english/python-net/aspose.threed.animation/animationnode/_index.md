---
title: AnimationNode class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.animation/animationnode/
is_root: false
---

## AnimationNode class

Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition.
            
            [AnimationNode](/3d/python-net/aspose.threed.animation/animationnode) defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [A3DObject](/3d/python-net/aspose.threed/a3dobject) object's numerical properties.



The AnimationNode type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [AnimationNode(name)](/3d/python-net/aspose.threed.animation/animationnode/__init__/#str) | Initializes a new instance of the [AnimationNode](/3d/python-net/aspose.threed.animation/animationnode) class. |
| [AnimationNode()](/3d/python-net/aspose.threed.animation/animationnode/__init__/#) | Initializes a new instance of the [AnimationNode](/3d/python-net/aspose.threed.animation/animationnode) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.animation/animationnode/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.animation/animationnode/properties) | Gets the collection of all properties. |
| [bind_points](/3d/python-net/aspose.threed.animation/animationnode/bind_points) | Gets the current property bind points |
| [sub_animations](/3d/python-net/aspose.threed.animation/animationnode/sub_animations) | Gets the sub-animation nodes under current animations |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.animation/animationnode/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.animation/animationnode/remove_property/#str) | Remove the specified property identified by name |
| [get_keyframe_sequence(target, prop_name, channel_name, create)](/3d/python-net/aspose.threed.animation/animationnode/get_keyframe_sequence/#A3DObject-str-str-bool) | Gets the keyframe sequence on given property and channel. |
| [get_keyframe_sequence(target, prop_name, create)](/3d/python-net/aspose.threed.animation/animationnode/get_keyframe_sequence/#A3DObject-str-bool) | Gets the keyframe sequence on given property. |
| [get_property(property)](/3d/python-net/aspose.threed.animation/animationnode/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.animation/animationnode/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.animation/animationnode/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [find_bind_point(name)](/3d/python-net/aspose.threed.animation/animationnode/find_bind_point/#str) | Finds the bind point by name. |
| [get_bind_point(target, prop_name, create)](/3d/python-net/aspose.threed.animation/animationnode/get_bind_point/#A3DObject-str-bool) | Gets the animation bind point on given property. |
| [create_bind_point(obj, prop_name)](/3d/python-net/aspose.threed.animation/animationnode/create_bind_point/#A3DObject-str) | Creates a BindPoint based on the property data type. |


### See Also

* module [aspose.threed.animation](../)
* class [A3DObject](/3d/python-net/aspose.threed.animation/a3dobject)
