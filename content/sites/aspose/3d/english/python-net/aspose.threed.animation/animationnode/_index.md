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

[`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other [`A3DObject`](/3d/python-net/aspose.threed/a3dobject) object's numerical properties.



**Inheritance:** [`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The AnimationNode type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.animation/animationnode/__init__/#system.string) | Initializes a new instance of the [`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) class. |
| [`__init__(self)`](/3d/python-net/aspose.threed.animation/animationnode/__init__/#) | Initializes a new instance of the [`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode) class. |


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
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.animation/animationnode/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.animation/animationnode/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_keyframe_sequence(self, target, prop_name, channel_name, create)`](/3d/python-net/aspose.threed.animation/animationnode/get_keyframe_sequence/#aspose.threed.a3dobject-system.string-system.string-bool) | Gets the keyframe sequence on given property and channel. |
| [`get_keyframe_sequence(self, target, prop_name, create)`](/3d/python-net/aspose.threed.animation/animationnode/get_keyframe_sequence/#aspose.threed.a3dobject-system.string-bool) | Gets the keyframe sequence on given property. |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.animation/animationnode/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.animation/animationnode/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.animation/animationnode/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`find_bind_point(self, target, name)`](/3d/python-net/aspose.threed.animation/animationnode/find_bind_point/#aspose.threed.a3dobject-system.string) | Finds the bind point by target and name. |
| [`get_bind_point(self, target, prop_name, create)`](/3d/python-net/aspose.threed.animation/animationnode/get_bind_point/#aspose.threed.a3dobject-system.string-bool) | Gets the animation bind point on given property. |
| [`create_bind_point(self, obj, prop_name)`](/3d/python-net/aspose.threed.animation/animationnode/create_bind_point/#aspose.threed.a3dobject-system.string) | Creates a BindPoint based on the property data type. |



### See Also
* module [`aspose.threed.animation`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`AnimationNode`](/3d/python-net/aspose.threed.animation/animationnode)
