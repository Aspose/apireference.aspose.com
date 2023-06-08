---
title: Class LightBuilder
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Scenes.LightBuilder class. Represents the base class light object
type: docs
weight: 11050
url: /net/aspose.cad.fileformats.glb.scenes/lightbuilder/
---
## LightBuilder class

Represents the base class light object.

```csharp
public abstract class LightBuilder : BaseBuilder
```

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.cad.fileformats.glb.scenes/lightbuilder/color/) { get; set; } | Gets or sets the RGB value for light's color in linear space. |
| [Extras](../../aspose.cad.fileformats.glb.geometry/basebuilder/extras/) { get; set; } | Gets or sets the custom data of this object. |
| [Intensity](../../aspose.cad.fileformats.glb.scenes/lightbuilder/intensity/) { get; set; } | Gets or sets the Brightness of light in. The units that this is defined in depend on the type of light. Point and spot lights use luminous intensity in candela (lm/sr) while directional lights use illuminance in lux (lm/m2) |
| [Name](../../aspose.cad.fileformats.glb.geometry/basebuilder/name/) { get; set; } | Gets or sets the display text name, or null. |
| static [LocalDirection](../../aspose.cad.fileformats.glb.scenes/lightbuilder/localdirection/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| abstract [Clone](../../aspose.cad.fileformats.glb.scenes/lightbuilder/clone/)() |  |

## Other Members

| Name | Description |
| --- | --- |
| class [Directional](../../aspose.cad.fileformats.glb.scenes/lightbuilder.directional) |  |
| class [Point](../../aspose.cad.fileformats.glb.scenes/lightbuilder.point) |  |
| class [Spot](../../aspose.cad.fileformats.glb.scenes/lightbuilder.spot) |  |

## Remarks

Derived types are: - [`Directional`](../lightbuilder.directional/) - [`Point`](../lightbuilder.point/) - [`Spot`](../lightbuilder.spot/)

### See Also

* class [BaseBuilder](../../aspose.cad.fileformats.glb.geometry/basebuilder/)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../aspose.cad.fileformats.glb.scenes/)
* assembly [Aspose.CAD](../../)


