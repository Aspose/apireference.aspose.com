---
title: Scene class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed/scene/
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
| [Scene()](/3d/python-net/aspose.threed/scene/__init__/#) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class. |
| [Scene(entity)](/3d/python-net/aspose.threed/scene/__init__/#Entity) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class with an entity attached to a new node. |
| [Scene(parent_scene, name)](/3d/python-net/aspose.threed/scene/__init__/#Scene-str) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class as a sub-scene. |
| [Scene(file_name)](/3d/python-net/aspose.threed/scene/__init__/#str) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class and open the file immediately.<br/>This is an obsoleted constructor, please use [`Scene.from_file(file_name)`](/3d/python-net/aspose.threed/scene/from_file). |


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


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed/scene/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed/scene/remove_property/#str) | Remove the specified property identified by name |
| [open(stream)](/3d/python-net/aspose.threed/scene/open/#io.RawIOBase) | Opens the scene from given stream |
| [open(file_name, options)](/3d/python-net/aspose.threed/scene/open/#str-aspose.threed.formats.LoadOptions) | Opens the scene from given path using specified file format. |
| [open(file_name)](/3d/python-net/aspose.threed/scene/open/#str) | Opens the scene from given path |
| [save(stream, format)](/3d/python-net/aspose.threed/scene/save/#io.RawIOBase-FileFormat) | Saves the scene to stream using specified file format. |
| [save(stream, options)](/3d/python-net/aspose.threed/scene/save/#io.RawIOBase-aspose.threed.formats.SaveOptions) | Saves the scene to stream using specified file format. |
| [save(file_name)](/3d/python-net/aspose.threed/scene/save/#str) | Saves the scene to specified path using specified file format. |
| [save(file_name, format)](/3d/python-net/aspose.threed/scene/save/#str-FileFormat) | Saves the scene to specified path using specified file format. |
| [save(file_name, options)](/3d/python-net/aspose.threed/scene/save/#str-aspose.threed.formats.SaveOptions) | Saves the scene to specified path using specified file format. |
| [render(camera, file_name)](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str) | Render the scene into external file from given camera's perspective.<br/>The default output size is 1024x768 and output format is png |
| [render(camera, file_name, size, format)](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str-aspose.pydrawing.Size-aspose.pydrawing.imaging.ImageFormat) | Render the scene into external file from given camera's perspective. |
| [render(camera, file_name, size, format, options)](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-str-aspose.pydrawing.Size-aspose.pydrawing.imaging.ImageFormat-ImageRenderOptions) | Render the scene into external file from given camera's perspective. |
| [render(camera, bitmap)](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-aspose.pydrawing.Bitmap) | Render the scene into bitmap from given camera's perspective. |
| [render(camera, bitmap, options)](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.Camera-aspose.pydrawing.Bitmap-ImageRenderOptions) | Render the scene into bitmap from given camera's perspective. |
| [get_property(property)](/3d/python-net/aspose.threed/scene/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed/scene/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed/scene/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_animation_clip(name)](/3d/python-net/aspose.threed/scene/get_animation_clip/#str) | Gets a named [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) |
| [clear()](/3d/python-net/aspose.threed/scene/clear/#) | Clears the scene content and restores the default settings. |
| [create_animation_clip(name)](/3d/python-net/aspose.threed/scene/create_animation_clip/#str) | A shorthand function to create and register the [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)<br/>The first [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) will be assigned to the [`Scene.current_animation_clip`](/3d/python-net/aspose.threed/scene#current_animation_clip) |
| [from_file(file_name)](/3d/python-net/aspose.threed/scene/from_file/#str) | Opens the scene from given path |



### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)
* class [`Pose`](/3d/python-net/aspose.threed/pose)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
