---
title: Class Camera
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Camera class. A cameras projection. A node MAY reference a camera to apply a transform to place the camera in the scene
type: docs
weight: 9780
url: /net/aspose.cad.fileformats.glb/camera/
---
## Camera class

A camera's projection. A node **MAY** reference a camera to apply a transform to place the camera in the scene.

```csharp
public sealed class Camera : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Matrix](../../aspose.cad.fileformats.glb/camera/matrix/) { get; } | Gets the projection matrix for the current [`Settings`](./settings/) |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Settings](../../aspose.cad.fileformats.glb/camera/settings/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetOrthographicMode](../../aspose.cad.fileformats.glb/camera/setorthographicmode/)(float, float, float, float) | Configures this `Camera` to use Orthographic projection. |
| [SetPerspectiveMode](../../aspose.cad.fileformats.glb/camera/setperspectivemode/)(float?, float, float, float) | Configures this `Camera` to use perspective projection. |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


