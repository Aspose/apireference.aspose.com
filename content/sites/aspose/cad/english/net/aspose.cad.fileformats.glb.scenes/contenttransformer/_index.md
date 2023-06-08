---
title: Class ContentTransformer
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.ContentTransformer class. Represents the transform of a Content. Applies a transform to the underlaying content object usually a Mesh a Camera or a light
type: docs
weight: 11010
url: /net/aspose.cad.fileformats.glb.scenes/contenttransformer/
---
## ContentTransformer class

Represents the transform of a [`Content`](../instancebuilder/content/). Applies a transform to the underlaying content object (usually a Mesh, a Camera or a light)

```csharp
public abstract class ContentTransformer
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Extras](../../aspose.cad.fileformats.glb.scenes/contenttransformer/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [HasRenderableContent](../../aspose.cad.fileformats.glb.scenes/contenttransformer/hasrenderablecontent/) { get; } | Gets a value indicating whether Content implements IRenderableContent |
| [Morphings](../../aspose.cad.fileformats.glb.scenes/contenttransformer/morphings/) { get; } |  |
| abstract [Name](../../aspose.cad.fileformats.glb.scenes/contenttransformer/name/) { get; set; } | Gets or sets the display text name, or null. |

## Methods

| Name | Description |
| --- | --- |
| abstract [DeepClone](../../aspose.cad.fileformats.glb.scenes/contenttransformer/deepclone/)(DeepCloneContext) |  |
| abstract [GetArmatureRoot](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getarmatureroot/)() | If this `ContentTransformer` uses a [`NodeBuilder`](../nodebuilder/) armature, it returns the root of the armature. |
| [GetCameraAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getcameraasset/)() | It this `ContentTransformer` contains a [`CameraBuilder`](../camerabuilder/) |
| [GetGeometryAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getgeometryasset/)() | If this `ContentTransformer` contains a [`IMeshBuilder`](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/). |
| [GetLightAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getlightasset/)() | It this `ContentTransformer` contains a [`LightBuilder`](../lightbuilder/) |
| abstract [GetPoseWorldMatrix](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getposeworldmatrix/)() |  |
| [UseMorphing](../../aspose.cad.fileformats.glb.scenes/contenttransformer/usemorphing/#usemorphing)() |  |
| [UseMorphing](../../aspose.cad.fileformats.glb.scenes/contenttransformer/usemorphing/#usemorphing_1)(string) |  |

## Other Members

| Name | Description |
| --- | --- |
| struct [DeepCloneContext](../../aspose.cad.fileformats.glb.scenes/contenttransformer.deepclonecontext) |  |

## Remarks

Base class of:[`FixedTransformer`](../fixedtransformer/)[`RigidTransformer`](../rigidtransformer/)[`SkinnedTransformer`](../skinnedtransformer/)

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


