---
title: Scene class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 210
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
| [`__init__(self)`](/3d/python-net/aspose.threed/scene/__init__/#) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class. |
| [`__init__(self, entity)`](/3d/python-net/aspose.threed/scene/__init__/#aspose.threed.entity) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class with an entity attached to a new node. |
| [`__init__(self, parent_scene, name)`](/3d/python-net/aspose.threed/scene/__init__/#aspose.threed.scene-system.string) | Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class as a sub-scene. |


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
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/scene/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/scene/remove_property/#system.string) | Remove the specified property identified by name |
| [`open(self, stream)`](/3d/python-net/aspose.threed/scene/open/#io.rawiobase) | Opens the scene from given stream |
| [`open(self, file_name, options)`](/3d/python-net/aspose.threed/scene/open/#system.string-aspose.threed.formats.loadoptions) | Opens the scene from given path using specified file format. |
| [`open(self, file_name)`](/3d/python-net/aspose.threed/scene/open/#system.string) | Opens the scene from given path |
| [`save(self, stream, format)`](/3d/python-net/aspose.threed/scene/save/#io.rawiobase-aspose.threed.fileformat) | Saves the scene to stream using specified file format. |
| [`save(self, stream, options)`](/3d/python-net/aspose.threed/scene/save/#io.rawiobase-aspose.threed.formats.saveoptions) | Saves the scene to stream using specified file format. |
| [`save(self, file_name)`](/3d/python-net/aspose.threed/scene/save/#system.string) | Saves the scene to specified path using specified file format. |
| [`save(self, file_name, format)`](/3d/python-net/aspose.threed/scene/save/#system.string-aspose.threed.fileformat) | Saves the scene to specified path using specified file format. |
| [`save(self, file_name, options)`](/3d/python-net/aspose.threed/scene/save/#system.string-aspose.threed.formats.saveoptions) | Saves the scene to specified path using specified file format. |
| [`render(self, camera, file_name)`](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.camera-system.string) | Render the scene into external file from given camera's perspective.<br/>The default output size is 1024x768 and output format is png |
| [`render(self, camera, file_name, size, format)`](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.camera-system.string-aspose.threed.utilities.vector2-system.string) | Render the scene into external file from given camera's perspective. |
| [`render(self, camera, file_name, size, format, options)`](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.camera-system.string-aspose.threed.utilities.vector2-system.string-aspose.threed.imagerenderoptions) | Render the scene into external file from given camera's perspective. |
| [`render(self, camera, bitmap)`](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.camera-aspose.threed.render.texturedata) | Render the scene into bitmap from given camera's perspective. |
| [`render(self, camera, bitmap, options)`](/3d/python-net/aspose.threed/scene/render/#aspose.threed.entities.camera-aspose.threed.render.texturedata-aspose.threed.imagerenderoptions) | Render the scene into bitmap from given camera's perspective. |
| [`get_property(self, property)`](/3d/python-net/aspose.threed/scene/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed/scene/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed/scene/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_animation_clip(self, name)`](/3d/python-net/aspose.threed/scene/get_animation_clip/#system.string) | Gets a named [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) |
| [`clear(self)`](/3d/python-net/aspose.threed/scene/clear/#) | Clears the scene content and restores the default settings. |
| [`create_animation_clip(self, name)`](/3d/python-net/aspose.threed/scene/create_animation_clip/#system.string) | A shorthand function to create and register the [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)<br/>The first [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip) will be assigned to the [`Scene.current_animation_clip`](/3d/python-net/aspose.threed/scene#current_animation_clip) |
| [`from_file(, file_name)`](/3d/python-net/aspose.threed/scene/from_file/#system.string) | Opens the scene from given path |



### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`AnimationClip`](/3d/python-net/aspose.threed.animation/animationclip)
* class [`Pose`](/3d/python-net/aspose.threed/pose)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
