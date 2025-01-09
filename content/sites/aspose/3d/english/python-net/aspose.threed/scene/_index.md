---
title: Scene class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 200
url: /aspose.threed/scene/
is_root: false
---

## Scene class

A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc.
Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx
Node hierarchy can be accessed through [`Scene.root_node`](/3d/python-net/aspose.threed/scene#root_node)[`Scene.library`](/3d/python-net/aspose.threed/scene#library) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library.



**Inheritance:** [`Scene`](/3d/python-net/aspose.threed/scene) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Scene type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed/scene/__init__/#) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class. |
| [__init__](/3d/python-net/aspose.threed/scene/__init__/#aspose.threed.Entity) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class with an entity attached to a new node. |
| [__init__](/3d/python-net/aspose.threed/scene/__init__/#aspose.threed.Scene-str) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class as a sub-scene. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/scene/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/scene/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed/scene/scene) | Gets the scene that this object belongs to |
| [sub_scenes](/3d/python-net/aspose.threed/scene/sub_scenes) | Gets all sub-scenes |
| [library](/3d/python-net/aspose.threed/scene/library) | Objects that not directly used in scene hierarchy can be defined in Library.<br/>This is useful when you're using sub-scenes and put reusable components under sub-scenes. |
| [animation_clips](/3d/python-net/aspose.threed/scene/animation_clips) | Gets all [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) defined in the scene. |
| [current_animation_clip](/3d/python-net/aspose.threed/scene/current_animation_clip) | Gets or sets the active [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) |
| [asset_info](/3d/python-net/aspose.threed/scene/asset_info) | Gets or sets the top-level asset information |
| [poses](/3d/python-net/aspose.threed/scene/poses) | Gets all [`Pose`](/3d/python-net/aspose.threed/pose) used in this scene. |
| [root_node](/3d/python-net/aspose.threed/scene/root_node) | Gets the root node of the scene. |
| [VERSION](/3d/python-net/aspose.threed/scene/version) | Gets the current release version |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed/scene/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed/scene/remove_property/#str) | Remove the specified property identified by name |
| [open](/3d/python-net/aspose.threed/scene/open/#io.RawIOBase) | Opens the scene from given stream |
| [open](/3d/python-net/aspose.threed/scene/open/#str-aspose.threed.formats.LoadOptions) | Opens the scene from given path using specified file format. |
| [open](/3d/python-net/aspose.threed/scene/open/#str) | Opens the scene from given path |
| [save](/3d/python-net/aspose.threed/scene/save/#io.RawIOBase-aspose.threed.FileFormat) | Saves the scene to stream using specified file format. |
| [save](/3d/python-net/aspose.threed/scene/save/#io.RawIOBase-aspose.threed.formats.SaveOptions) | Saves the scene to stream using specified file format. |
| [save](/3d/python-net/aspose.threed/scene/save/#str) | Saves the scene to specified path using specified file format. |
| [save](/3d/python-net/aspose.threed/scene/save/#str-aspose.threed.FileFormat) | Saves the scene to specified path using specified file format. |
| [save](/3d/python-net/aspose.threed/scene/save/#str-aspose.threed.formats.SaveOptions) | Saves the scene to specified path using specified file format. |
| [render](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str) | Render the scene into external file from given camera's perspective.<br/>The default output size is 1024x768 and output format is png |
| [render](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str-aspose.threed.utilities.Vector2-str) | Render the scene into external file from given camera's perspective. |
| [render](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str-aspose.threed.utilities.Vector2-str-aspose.threed.ImageRenderOptions) | Render the scene into external file from given camera's perspective. |
| [render](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-aspose.threed.render.TextureData) | Render the scene into bitmap from given camera's perspective. |
| [render](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-aspose.threed.render.TextureData-aspose.threed.ImageRenderOptions) | Render the scene into bitmap from given camera's perspective. |
| [get_property](/3d/python-net/aspose.threed/scene/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed/scene/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed/scene/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_animation_clip](/3d/python-net/aspose.threed/scene/get_animation_clip/#str) | Gets a named [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) |
| [clear](/3d/python-net/aspose.threed/scene/clear/#) | Clears the scene content and restores the default settings. |
| [create_animation_clip](/3d/python-net/aspose.threed/scene/create_animation_clip/#str) | A shorthand function to create and register the [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)<br/>The first [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) will be assigned to the [`Scene.current_animation_clip`](/3d/python-net/aspose.threed/scene#current_animation_clip) |
| [from_file](/3d/python-net/aspose.threed/scene/from_file/#str) | Opens the scene from given path |



### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)
* class [`Pose`](/3d/python-net/aspose.threed/pose)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
