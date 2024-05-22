---
title: BlendMode enumeration
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 1260
url: /python-net/aspose.svg.builder/blendmode/
is_root: false
---

## BlendMode enumeration

Specifies the blending modes available for combining images or elements in SVG.



The BlendMode type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NORMAL | Displays the source image as is, without any blending. |
| MULTIPLY | Multiplies the colors of the source image and the background. The result is a darker image. |
| SCREEN | Makes the dark parts of the source image lighter and the light parts unchanged. |
| OVERLAY | Combines Multiply and Screen blend modes to enhance contrast. |
| DARKEN | Darkens the background based on the source image's colors. |
| LIGHTEN | Lightens the background based on the source image's colors. |
| COLOR_DODGE | Brightens the background to reflect the source image. |
| COLOR_BURN | Darkens the background to reflect the source image. |
| HARD_LIGHT | Creates a hard light effect based on the source image's brightness. |
| SOFT_LIGHT | Creates a soft light effect based on the source image's brightness. |
| DIFFERENCE | Highlights the differences between the source image and the background. |
| EXCLUSION | Creates an effect similar to Difference, but with lower contrast. |
| HUE | Uses the hue of the source image combined with the luminance and saturation of the background. |
| SATURATION | Uses the saturation of the source image combined with the hue and luminance of the background. |
| COLOR | Uses the hue and saturation of the source image combined with the luminance of the background. |
| LUMINOSITY | Uses the luminance of the source image combined with the hue and saturation of the background. |



### Remarks 


Blending modes in SVG are used to determine how two layers are blended into each other. This enum provides a variety of options that control how the colors of the blended layers mix and produce different visual effects.

### See Also
* module [`aspose.svg.builder`](..)
