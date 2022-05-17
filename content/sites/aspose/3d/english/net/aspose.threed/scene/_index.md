---
title: Scene
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 2240
url: /net/aspose.threed/scene/
---
## Scene class

A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc. Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx Node hierarchy can be accessed through [`RootNode`](./rootnode)[`Library`](./library) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library.

```csharp
public class Scene : SceneObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Scene](scene)() | Initializes a new instance of the [`Scene`](../scene) class. |
| [Scene](scene)(Entity) | Initializes a new instance of the [`Scene`](../scene) class with an entity attached to a new node. |
| [Scene](scene)(Scene, string) | Initializes a new instance of the [`Scene`](../scene) class as a sub-scene. |

## Properties

| Name | Description |
| --- | --- |
| [AnimationClips](animationclips) { get; } | Gets all [`AnimationClip`](../../aspose.threed.animation/animationclip) defined in the scene. |
| [AssetInfo](assetinfo) { get; set; } | Gets or sets the top-level asset information |
| [CurrentAnimationClip](currentanimationclip) { get; set; } | Gets or sets the active [`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](library) { get; } | Objects that not directly used in scene hierarchy can be defined in Library. This is useful when you're using sub-scenes and put reusable components under sub-scenes. |
| virtual [Name](name) { get; set; } | Gets or sets the name. |
| [Poses](poses) { get; } | Gets all [`Pose`](../pose) used in this scene. |
| [Properties](properties) { get; } | Gets the collection of all properties. |
| [RootNode](rootnode) { get; } | Gets the root node of the scene. |
| [Scene](scene) { get; } | Gets the scene that this object belongs to |
| [SubScenes](subscenes) { get; } | Gets all sub-scenes |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](fromfile)(string, CancellationToken) | Opens the scene from given path |
| static [FromFile](fromfile)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromFile](fromfile)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromStream](fromstream)(Stream, CancellationToken) | Opens the scene from given stream |
| static [FromStream](fromstream)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| static [FromStream](fromstream)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Clear](clear)() | Clears the scene content and restores the default settings. |
| [CreateAnimationClip](createanimationclip)(string) | A shorthand function to create and register the [`AnimationClip`](../../aspose.threed.animation/animationclip) The first [`AnimationClip`](../../aspose.threed.animation/animationclip) will be assigned to the [`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetAnimationClip](getanimationclip)(string) | Gets a named [`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](getproperty)(string) | Get the value of specified property |
| [Open](open)(Stream, CancellationToken) | Opens the scene from given stream |
| [Open](open)(string, CancellationToken) | Opens the scene from given path |
| [Open](open)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| [Open](open)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Open](open)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| [Open](open)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| [RemoveProperty](removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](removeproperty)(string) | Remove the specified property identified by name |
| [Render](render)(Camera, Bitmap) | Render the scene into bitmap from given camera's perspective. |
| [Render](render)(Camera, string) | Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png |
| [Render](render)(Camera, Bitmap, ImageRenderOptions) | Render the scene into bitmap from given camera's perspective. |
| [Render](render)(Camera, string, Size, ImageFormat) | Render the scene into external file from given camera's perspective. |
| [Render](render)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Render the scene into external file from given camera's perspective. |
| [Save](save)(Stream, FileFormat, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](save)(Stream, SaveOptions, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](save)(string, FileFormat, CancellationToken) | Saves the scene to specified path using specified file format. |
| [Save](save)(string, SaveOptions, CancellationToken) | Saves the scene to specified path using specified file format. |
| [SetProperty](setproperty)(string, object) | Sets the value of specified property |

### See Also

* class [SceneObject](../sceneobject)
* namespace [Aspose.ThreeD](../../aspose.threed)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3d.dll -->
