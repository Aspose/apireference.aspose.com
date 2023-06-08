---
title: Class SceneBuilder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.SceneBuilder class. Represents the root scene for models cameras and lights
type: docs
weight: 11110
url: /net/aspose.cad.fileformats.glb.scenes/scenebuilder/
---
## SceneBuilder class

Represents the root scene for models, cameras and lights.

```csharp
public class SceneBuilder : BaseBuilder, IConvertibleToGltf2
```

## Constructors

| Name | Description |
| --- | --- |
| [SceneBuilder](scenebuilder/)(string) |  |

## Properties

| Name | Description |
| --- | --- |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [Instances](../../aspose.cad.fileformats.glb.scenes/scenebuilder/instances/) { get; } | Gets all the instances in this scene. |
| [Materials](../../aspose.cad.fileformats.glb.scenes/scenebuilder/materials/) { get; } | Gets all the unique material references shared by all the meshes in this scene. |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFrom](../../aspose.cad.fileformats.glb.scenes/scenebuilder/createfrom/#createfrom)(Scene) |  |
| static [Load](../../aspose.cad.fileformats.glb.scenes/scenebuilder/load/)(string, ReadSettings) |  |
| static [LoadDefaultScene](../../aspose.cad.fileformats.glb.scenes/scenebuilder/loaddefaultscene/)(string, ReadSettings) |  |
| [AddCamera](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addcamera/#addcamera_1)(CameraBuilder, AffineTransform) |  |
| [AddCamera](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addcamera/#addcamera)(CameraBuilder, NodeBuilder) |  |
| [AddCamera](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addcamera/#addcamera_2)(CameraBuilder, Vector3, Vector3) |  |
| [AddLight](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addlight/#addlight_1)(LightBuilder, AffineTransform) |  |
| [AddLight](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addlight/#addlight)(LightBuilder, NodeBuilder) |  |
| [AddNode](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addnode/)(NodeBuilder) |  |
| [AddRigidMesh](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addrigidmesh/#addrigidmesh_2)(IMeshBuilder&lt;MaterialBuilder&gt;, AffineTransform) | Adds a mesh instance to the scene, at the given location. |
| [AddRigidMesh](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addrigidmesh/#addrigidmesh)(IMeshBuilder&lt;MaterialBuilder&gt;, NodeBuilder) | Adds a mesh instance to the scene, attached to an animatable [`NodeBuilder`](../nodebuilder/) |
| [AddRigidMesh](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addrigidmesh/#addrigidmesh_1)(IMeshBuilder&lt;MaterialBuilder&gt;, NodeBuilder, AffineTransform) | Adds a mesh instance to the scene, at the given location, relative to the given node. |
| [AddScene](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addscene/)(SceneBuilder, Matrix4x4) | Copies the instances from *scene* to this `SceneBuilder` |
| [AddSkinnedMesh](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addskinnedmesh/#addskinnedmesh_1)(IMeshBuilder&lt;MaterialBuilder&gt;, params (NodeBuilder Joint, Matrix4x4 InverseBindMatrix)[]) |  |
| [AddSkinnedMesh](../../aspose.cad.fileformats.glb.scenes/scenebuilder/addskinnedmesh/#addskinnedmesh)(IMeshBuilder&lt;MaterialBuilder&gt;, Matrix4x4, params NodeBuilder[]) |  |
| [ApplyBasisTransform](../../aspose.cad.fileformats.glb.scenes/scenebuilder/applybasistransform/)(Matrix4x4, string) | Applies a tranform the this `SceneBuilder`. |
| [DeepClone](../../aspose.cad.fileformats.glb.scenes/scenebuilder/deepclone/)(bool) |  |
| [FindArmatures](../../aspose.cad.fileformats.glb.scenes/scenebuilder/findarmatures/)() | Gets all the unique armatures used by this `SceneBuilder`. |
| [ToGltf2](../../aspose.cad.fileformats.glb.scenes/scenebuilder/togltf2/#togltf2)() | Converts this `SceneBuilder` instance into a [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/) instance. |
| [ToGltf2](../../aspose.cad.fileformats.glb.scenes/scenebuilder/togltf2/#togltf2_1)(SceneBuilderSchema2Settings) | Converts this `SceneBuilder` instance into a [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/) instance. |
| static [CreateFrom](../../aspose.cad.fileformats.glb.scenes/scenebuilder/createfrom/#createfrom_1)(GlbData) |  |
| static [CreateFrom](../../aspose.cad.fileformats.glb.scenes/scenebuilder/createfrom/#createfrom_2)(IEnumerable&lt;Scene&gt;) |  |
| static [LoadAllScenes](../../aspose.cad.fileformats.glb.scenes/scenebuilder/loadallscenes/)(string, ReadSettings) |  |
| static [ToGltf2](../../aspose.cad.fileformats.glb.scenes/scenebuilder/togltf2/)(IEnumerable&lt;SceneBuilder&gt;, SceneBuilderSchema2Settings) | Converts a collection of `SceneBuilder` instances to a single [`GlbImage`](../../aspose.cad.fileformats.glb/glbimage/) instance. |

### See Also

* class [BaseBuilder](../../aspose.cad.fileformats.glb.geometry/basebuilder/)
* interface [IConvertibleToGltf2](../../aspose.cad.fileformats.glb/iconvertibletogltf2/)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


