---
title: Class CameraPerspective
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.CameraPerspective class. A perspective camera containing properties to create a perspective projection matrix
type: docs
weight: 9800
url: /net/aspose.cad.fileformats.glb/cameraperspective/
---
## CameraPerspective class

A perspective camera containing properties to create a perspective projection matrix.

```csharp
public sealed class CameraPerspective : ExtraProperties, ICamera
```

## Properties

| Name | Description |
| --- | --- |
| [AspectRatio](../../aspose.cad.fileformats.glb/cameraperspective/aspectratio/) { get; } | Gets the aspect ratio between horizontal window size and vertical window size. |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IsOrthographic](../../aspose.cad.fileformats.glb/cameraperspective/isorthographic/) { get; } |  |
| [IsPerspective](../../aspose.cad.fileformats.glb/cameraperspective/isperspective/) { get; } |  |
| [Matrix](../../aspose.cad.fileformats.glb/cameraperspective/matrix/) { get; } | Gets the projection matrix for the current settings |
| [VerticalFOV](../../aspose.cad.fileformats.glb/cameraperspective/verticalfov/) { get; } | Gets the vertical field of view, in radians |
| [ZFar](../../aspose.cad.fileformats.glb/cameraperspective/zfar/) { get; } | Gets the far plane distance in the Z axis. |
| [ZNear](../../aspose.cad.fileformats.glb/cameraperspective/znear/) { get; } | Gets the near plane distance in the Z axis. |

## Methods

| Name | Description |
| --- | --- |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |
| static [VerifyParameters](../../aspose.cad.fileformats.glb/cameraperspective/verifyparameters/)(float?, float, float, float) |  |

### See Also

* class [ExtraProperties](../extraproperties/)
* interface [ICamera](../icamera/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


