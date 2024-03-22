---
title: Class Scene
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Scene class. A scene is a toplevel object that contains the nodes geometries materials textures animation poses subscenes and etc. Scene can have subscenes acts as multipledocument support in files like collada/blender/fbx Node hierarchy can be accessed through RootNodeLibrary is used to keep a reference of unattached objects during serializationlike meta data or custom objects so it can be used as a library
type: docs
weight: 260
url: /net/aspose.threed/scene/
---
## Scene class

A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc. Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx Node hierarchy can be accessed through [`RootNode`](./rootnode/)[`Library`](./library/) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library.

```csharp
public class Scene : SceneObject
```

## Constructors

| Name | Description |
| --- | --- |
| [Scene](scene/#constructor)() | Initializes a new instance of the `Scene` class. |
| [Scene](scene/#constructor_1)(Entity) | Initializes a new instance of the `Scene` class with an entity attached to a new node. |
| [Scene](scene/#constructor_2)(Scene, string) | Initializes a new instance of the `Scene` class as a sub-scene. |

## Properties

| Name | Description |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | Gets all [`AnimationClip`](../../aspose.threed.animation/animationclip/) defined in the scene. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | Gets or sets the top-level asset information |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | Gets or sets the active [`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | Objects that not directly used in scene hierarchy can be defined in Library. This is useful when you're using sub-scenes and put reusable components under sub-scenes. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../a3dobject/).) |
| [Poses](../../aspose.threed/scene/poses/) { get; } | Gets all [`Pose`](../pose/) used in this scene. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../a3dobject/).) |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | Gets the root node of the scene. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../sceneobject/).) |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | Gets all sub-scenes |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | Opens the scene from given path |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | Opens the scene from given path |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | Opens the scene from given stream |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Clear](../../aspose.threed/scene/clear/)() | Clears the scene content and restores the default settings. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | A shorthand function to create and register the [`AnimationClip`](../../aspose.threed.animation/animationclip/) The first [`AnimationClip`](../../aspose.threed.animation/animationclip/) will be assigned to the [`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../a3dobject/).) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | Gets a named [`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../a3dobject/).) |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | Opens the scene from given stream |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | Opens the scene from given path |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | Opens the scene from given stream |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | Opens the scene from given path |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | Opens the scene from given path using specified file format. |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | Opens the scene from given stream using specified file format. |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | Opens the scene from given stream using specified IO config. |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | Opens the scene from given path using specified file format. |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | Opens the scene from given path using specified file format. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../a3dobject/).) |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png |
| [Render](../../aspose.threed/scene/render/#render)(Camera, TextureData) | Render the scene into bitmap from given camera's perspective. |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, TextureData, ImageRenderOptions) | Render the scene into bitmap from given camera's perspective. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Vector2, string) | Render the scene into external file from given camera's perspective. |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Vector2, string, ImageRenderOptions) | Render the scene into external file from given camera's perspective. |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | Saves the scene to stream using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | Saves the scene to specified path using specified file format. |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | Saves the scene to specified path using specified file format. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../a3dobject/).) |

### See Also

* class [SceneObject](../sceneobject/)
* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


