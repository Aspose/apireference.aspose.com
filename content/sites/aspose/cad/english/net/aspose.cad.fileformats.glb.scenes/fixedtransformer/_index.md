---
title: Class FixedTransformer
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.FixedTransformer class. Represents the transform of a Content. Applies a fixed Matrix4x4 transform to the underlaying content
type: docs
weight: 11030
url: /net/aspose.cad.fileformats.glb.scenes/fixedtransformer/
---
## FixedTransformer class

Represents the transform of a [`Content`](../instancebuilder/content/). Applies a fixed Matrix4x4 transform to the underlaying content.

```csharp
public class FixedTransformer : ContentTransformer
```

## Properties

| Name | Description |
| --- | --- |
| [ChildTransform](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/childtransform/) { get; set; } |  |
| override [Extras](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/extras/) { get; set; } |  |
| [HasRenderableContent](../../aspose.cad.fileformats.glb.scenes/contenttransformer/hasrenderablecontent/) { get; } | Gets a value indicating whether Content implements IRenderableContent |
| [Morphings](../../aspose.cad.fileformats.glb.scenes/contenttransformer/morphings/) { get; } |  |
| override [Name](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/name/) { get; set; } |  |
| [ParentNode](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/parentnode/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| override [DeepClone](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/deepclone/)(DeepCloneContext) |  |
| override [GetArmatureRoot](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/getarmatureroot/)() |  |
| [GetCameraAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getcameraasset/)() | It this [`ContentTransformer`](../contenttransformer/) contains a [`CameraBuilder`](../camerabuilder/) |
| [GetGeometryAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getgeometryasset/)() | If this [`ContentTransformer`](../contenttransformer/) contains a [`IMeshBuilder`](../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/). |
| [GetLightAsset](../../aspose.cad.fileformats.glb.scenes/contenttransformer/getlightasset/)() | It this [`ContentTransformer`](../contenttransformer/) contains a [`LightBuilder`](../lightbuilder/) |
| override [GetPoseWorldMatrix](../../aspose.cad.fileformats.glb.scenes/fixedtransformer/getposeworldmatrix/)() |  |
| [UseMorphing](../../aspose.cad.fileformats.glb.scenes/contenttransformer/usemorphing/)() |  |
| [UseMorphing](../../aspose.cad.fileformats.glb.scenes/contenttransformer/usemorphing/)(string) |  |

### See Also

* class [ContentTransformer](../contenttransformer/)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


