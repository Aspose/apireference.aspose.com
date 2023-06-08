---
title: Class LightBuilder.Point
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.LightBuilderPoint class. 
type: docs
weight: 11070
url: /net/aspose.cad.fileformats.glb.scenes/lightbuilder.point/
---
## LightBuilder.Point class

```csharp
public sealed class Point : LightBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [Point](point/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.cad.fileformats.glb.scenes/lightbuilder/color/) { get; set; } | Gets or sets the RGB value for light's color in linear space. |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [Intensity](../../aspose.cad.fileformats.glb.scenes/lightbuilder/intensity/) { get; set; } | Gets or sets the Brightness of light in. The units that this is defined in depend on the type of light. Point and spot lights use luminous intensity in candela (lm/sr) while directional lights use illuminance in lux (lm/m2) |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Range](../../aspose.cad.fileformats.glb.scenes/point/range/) { get; set; } | Gets or sets a Hint defining a distance cutoff at which the light's intensity may be considered to have reached zero. Supported only for point and spot lights. Must be &gt; 0. When undefined, range is assumed to be infinite. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.cad.fileformats.glb.scenes/point/clone/)() |  |

### See Also

* class [LightBuilder](../lightbuilder/)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


