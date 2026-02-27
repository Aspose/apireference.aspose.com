---
title: BlendMode Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.BlendMode enum. Specifies the blending modes available for combining images or elements in SVG
type: docs
weight: 80
url: /net/aspose.svg.builder/blendmode/
---
## BlendMode enumeration

Specifies the blending modes available for combining images or elements in SVG.

```csharp
public enum BlendMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Normal | `0` | Displays the source image as is, without any blending. |
| Multiply | `1` | Multiplies the colors of the source image and the background. The result is a darker image. |
| Screen | `2` | Makes the dark parts of the source image lighter and the light parts unchanged. |
| Overlay | `3` | Combines Multiply and Screen blend modes to enhance contrast. |
| Darken | `4` | Darkens the background based on the source image's colors. |
| Lighten | `5` | Lightens the background based on the source image's colors. |
| ColorDodge | `6` | Brightens the background to reflect the source image. |
| ColorBurn | `7` | Darkens the background to reflect the source image. |
| HardLight | `8` | Creates a hard light effect based on the source image's brightness. |
| SoftLight | `9` | Creates a soft light effect based on the source image's brightness. |
| Difference | `10` | Highlights the differences between the source image and the background. |
| Exclusion | `11` | Creates an effect similar to Difference, but with lower contrast. |
| Hue | `12` | Uses the hue of the source image combined with the luminance and saturation of the background. |
| Saturation | `13` | Uses the saturation of the source image combined with the hue and luminance of the background. |
| Color | `14` | Uses the hue and saturation of the source image combined with the luminance of the background. |
| Luminosity | `15` | Uses the luminance of the source image combined with the hue and saturation of the background. |

## Remarks

Blending modes in SVG are used to determine how two layers are blended into each other. This enum provides a variety of options that control how the colors of the blended layers mix and produce different visual effects.

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
