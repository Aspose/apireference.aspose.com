---
title: Class PunctualLight
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.PunctualLight class. A directional point or spot light
type: docs
weight: 10820
url: /net/aspose.cad.fileformats.glb/punctuallight/
---
## PunctualLight class

A directional, point, or spot light.

```csharp
public sealed class PunctualLight : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.cad.fileformats.glb/punctuallight/color/) { get; set; } | Gets or sets the RGB value for light's color in linear space. |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [InnerConeAngle](../../aspose.cad.fileformats.glb/punctuallight/innerconeangle/) { get; } | Gets the Angle, in radians, from centre of spotlight where falloff begins. Must be greater than or equal to 0 and less than outerConeAngle. |
| [Intensity](../../aspose.cad.fileformats.glb/punctuallight/intensity/) { get; set; } | Gets or sets the Brightness of light in. The units that this is defined in depend on the type of light. point and spot lights use luminous intensity in candela (lm/sr) while directional lights use illuminance in lux (lm/m2) |
| [LightType](../../aspose.cad.fileformats.glb/punctuallight/lighttype/) { get; } | Gets the type of light. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [OuterConeAngle](../../aspose.cad.fileformats.glb/punctuallight/outerconeangle/) { get; } | Gets Angle, in radians, from centre of spotlight where falloff ends. Must be greater than innerConeAngle and less than or equal to PI / 2.0. |
| [Range](../../aspose.cad.fileformats.glb/punctuallight/range/) { get; set; } | Gets or sets a Hint defining a distance cutoff at which the light's intensity may be considered to have reached zero. Supported only for point and spot lights. When undefined, range is assumed to be infinite. |
| static [LocalDirection](../../aspose.cad.fileformats.glb/punctuallight/localdirection/) { get; } | Gets the Local light direction. |

## Methods

| Name | Description |
| --- | --- |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetColor](../../aspose.cad.fileformats.glb/punctuallight/setcolor/)(Vector3, float, float) | Defines the light color, intensity and range for the current `PunctualLight`. |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetSpotCone](../../aspose.cad.fileformats.glb/punctuallight/setspotcone/)(float, float) | Sets the cone angles for the Spot light. |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


