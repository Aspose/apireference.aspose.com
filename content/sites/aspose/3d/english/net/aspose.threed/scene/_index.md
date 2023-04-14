---
title: Scene
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 2310
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
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Gets all [`AnimationClip`](../../aspose.threed.animation/animationclip) defined in the scene. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Gets or sets the top-level asset information |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Gets or sets the active [`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Objects that not directly used in scene hierarchy can be defined in Library. This is useful when you're using sub-scenes and put reusable components under sub-scenes. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Gets or sets the name. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Gets all [`Pose`](../pose) used in this scene. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Gets the collection of all properties. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Gets the root node of the scene. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Gets the scene that this object belongs to |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Gets all sub-scenes |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile)(string) | Opens the scene from given path |
| static [FromFile](../../aspose.threed/scene/fromfile)(string, CancellationToken) | Opens the scene from given path |
| static [FromFile](../../aspose.threed/scene/fromfile)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromFile](../../aspose.threed/scene/fromfile)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromStream](../../aspose.threed/scene/fromstream)(Stream, CancellationToken) | Opens the scene from given stream |
| static [FromStream](../../aspose.threed/scene/fromstream)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| static [FromStream](../../aspose.threed/scene/fromstream)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Clear](../../aspose.threed/scene/clear)() | Clears the scene content and restores the default settings. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | A shorthand function to create and register the [`AnimationClip`](../../aspose.threed.animation/animationclip) The first [`AnimationClip`](../../aspose.threed.animation/animationclip) will be assigned to the [`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Gets a named [`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Get the value of specified property |
| [Open](../../aspose.threed/scene/open)(Stream) | Opens the scene from given stream |
| [Open](../../aspose.threed/scene/open)(string) | Opens the scene from given path |
| [Open](../../aspose.threed/scene/open)(Stream, CancellationToken) | Opens the scene from given stream |
| [Open](../../aspose.threed/scene/open)(string, CancellationToken) | Opens the scene from given path |
| [Open](../../aspose.threed/scene/open)(string, LoadOptions) | Opens the scene from given path using specified file format. |
| [Open](../../aspose.threed/scene/open)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| [Open](../../aspose.threed/scene/open)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Open](../../aspose.threed/scene/open)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| [Open](../../aspose.threed/scene/open)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Remove the specified property identified by name |
| [Render](../../aspose.threed/scene/render)(Camera, string) | Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png |
| [Render](../../aspose.threed/scene/render)(Camera, TextureData) | Render the scene into bitmap from given camera's perspective. |
| [Render](../../aspose.threed/scene/render)(Camera, TextureData, ImageRenderOptions) | Render the scene into bitmap from given camera's perspective. |
| [Render](../../aspose.threed/scene/render)(Camera, string, Vector2, string) | Render the scene into external file from given camera's perspective. |
| [Render](../../aspose.threed/scene/render)(Camera, string, Vector2, string, ImageRenderOptions) | Render the scene into external file from given camera's perspective. |
| [Save](../../aspose.threed/scene/save)(string) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save)(Stream, FileFormat) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save)(Stream, SaveOptions) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save)(string, FileFormat) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save)(string, SaveOptions) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save)(Stream, FileFormat, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save)(Stream, SaveOptions, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save)(string, FileFormat, CancellationToken) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save)(string, SaveOptions, CancellationToken) | Saves the scene to specified path using specified file format. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Sets the value of specified property |

### See Also

* class [SceneObject](../sceneobject)
* namespace [Aspose.ThreeD](../../aspose.threed)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
