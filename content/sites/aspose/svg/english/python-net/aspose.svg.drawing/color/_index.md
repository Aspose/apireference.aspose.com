---
title: Color class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.drawing/color/
is_root: false
---

## Color class

The Color class lets you specify colors as 
Red-Green-Blue (RGB) values,
Hue-Saturation-Luminosity (HSL) values,
Hue-Saturation-Value (HSV) values,
Hue-Whiteness-Blackness (HWB) values,
lightness-A-B (LAB) values,
Luminance-Chroma-Hue (LCH) values,
Cyan-Magenta-Yellow-Key (CMYK) values,
Natural colors (NCOL) values,
or with a color name. 
An Alpha channel is also available to indicate transparency.



The Color type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>By default color is black. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#float-float-float) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-1. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#float-float-float-float) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-1. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#byte-byte-byte) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-255. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#byte-byte-byte-byte) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-255. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#int-int-int) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-255. |
| [__init__](/svg/python-net/aspose.svg.drawing/color/__init__/#int-int-int-int) | Initializes a new instance of the [`Color`](/svg/python-net/aspose.svg.drawing/color) class.<br/>All color components must be in the range 0-255. |


### Properties
| Property | Description |
| :- | :- |
| [red](/svg/python-net/aspose.svg.drawing/color/red) | Represents the red component of the color |
| [green](/svg/python-net/aspose.svg.drawing/color/green) | Represents the green component of the color. |
| [blue](/svg/python-net/aspose.svg.drawing/color/blue) | Represents the blue component of the color. |
| [alpha](/svg/python-net/aspose.svg.drawing/color/alpha) | Represents the alpha component of the color. |


### Methods
| Method | Description |
| :- | :- |
| [from_rgb](/svg/python-net/aspose.svg.drawing/color/from_rgb/#byte-byte-byte) | Returns a new Color with the requested ged, green, blue values.<br/>All color components must be in the range 0-255. |
| [from_rgb](/svg/python-net/aspose.svg.drawing/color/from_rgb/#int-int-int) | Returns a new Color with the requested ged, green, blue values.<br/>All color components must be in the range 0-255. |
| [from_rgb](/svg/python-net/aspose.svg.drawing/color/from_rgb/#float-float-float) | Returns a new Color with the requested ged, green, blue values.<br/>All color components must be in the range 0-1. |
| [from_rgba](/svg/python-net/aspose.svg.drawing/color/from_rgba/#byte-byte-byte-byte) | Returns a new Color with the requested ged, green, blue, alpha values.<br/>All color components must be in the range 0-255. |
| [from_rgba](/svg/python-net/aspose.svg.drawing/color/from_rgba/#int-int-int-int) | Returns a new Color with the requested ged, green, blue, alpha values.<br/>All color components must be in the range 0-255. |
| [from_rgba](/svg/python-net/aspose.svg.drawing/color/from_rgba/#float-float-float-float) | Returns a new Color with the requested ged, green, blue, alpha values.<br/>All color components must be in the range 0-1. |
| [from_gray](/svg/python-net/aspose.svg.drawing/color/from_gray/#float) | Returns a new Color with the requested gray value. |
| [from_uint](/svg/python-net/aspose.svg.drawing/color/from_uint/#int) | Returns a new Color with the requested ARGB value. |
| [from_int](/svg/python-net/aspose.svg.drawing/color/from_int/#int) | Returns a new Color with the requested ARGB value. |
| [from_string](/svg/python-net/aspose.svg.drawing/color/from_string/#str) | Parses string containing the CSS color and returns a new Color. |
| [from_hsl](/svg/python-net/aspose.svg.drawing/color/from_hsl/#float-float-float) | Returns a new Color with the requested hue, saturation, saturation values. |
| [from_hsla](/svg/python-net/aspose.svg.drawing/color/from_hsla/#float-float-float-float) | Returns a new Color with the requested hue, saturation, saturation, alpha values. |
| [from_hsv](/svg/python-net/aspose.svg.drawing/color/from_hsv/#float-float-float) | Returns a new Color with the requested hue, saturation, value. |
| [from_hsva](/svg/python-net/aspose.svg.drawing/color/from_hsva/#float-float-float-float) | Returns a new Color with the requested hue, saturation, value, alpha. |
| [from_hwb](/svg/python-net/aspose.svg.drawing/color/from_hwb/#float-float-float) | Returns a new Color with the requested hue, whiteness, blackness values. |
| [from_hwba](/svg/python-net/aspose.svg.drawing/color/from_hwba/#float-float-float-float) | Returns a new Color with the requested hue, whiteness, blackness values. |
| [from_cmyk](/svg/python-net/aspose.svg.drawing/color/from_cmyk/#float-float-float-float) | Returns a new Color with the requested cyan, magenta, yellow, key (black) values. |
| [from_cmyka](/svg/python-net/aspose.svg.drawing/color/from_cmyka/#float-float-float-float-float) | Returns a new Color with the requested cyan, magenta, yellow, key (black), alpha values. |
| [from_lab](/svg/python-net/aspose.svg.drawing/color/from_lab/#float-float-float) | Returns a new Color with the requested lightness, A, B values. |
| [from_laba](/svg/python-net/aspose.svg.drawing/color/from_laba/#float-float-float-float) | Returns a new Color with the requested lightness, A, B, alpha values. |
| [from_oklab](/svg/python-net/aspose.svg.drawing/color/from_oklab/#float-float-float) | Returns a new Color with the requested lightness, A, B values for OKLAB model. |
| [from_oklaba](/svg/python-net/aspose.svg.drawing/color/from_oklaba/#float-float-float-float) | Returns a new Color with the requested lightness, A, B, alpha values for OKLAB model. |
| [from_lch](/svg/python-net/aspose.svg.drawing/color/from_lch/#float-float-float) | Returns a new Color with the requested luminance, chroma, hue values. |
| [from_lcha](/svg/python-net/aspose.svg.drawing/color/from_lcha/#float-float-float-float) | Returns a new Color with the requested luminance, chroma, hue, alpha values. |
| [from_oklch](/svg/python-net/aspose.svg.drawing/color/from_oklch/#float-float-float) | Returns a new Color with the requested luminance, chroma, hue values for OKLAB model. |
| [from_oklcha](/svg/python-net/aspose.svg.drawing/color/from_oklcha/#float-float-float-float) | Returns a new Color with the requested luminance, chroma, hue, alpha values for OKLAB model. |
| [to_rgb_hex_string](/svg/python-net/aspose.svg.drawing/color/to_rgb_hex_string/#) | Returns a hexadecimal color is specified with: #RRGGBB. |
| [to_natural_color_string](/svg/python-net/aspose.svg.drawing/color/to_natural_color_string/#int) | Returns a Natural colors (NCol) specified color using a color letter with a number to specify the distance (in percent) from the color. |
| [to_name](/svg/python-net/aspose.svg.drawing/color/to_name/#) | Returns the name of the color if it matches a color in the list of CSS named colors, or an empty string. |
| [convert](/svg/python-net/aspose.svg.drawing/color/convert/#aspose.svg.drawing.ColorModel) | Returns a color components in the format of the specified color model. |
| [to_rgb_string](/svg/python-net/aspose.svg.drawing/color/to_rgb_string/#) | Returns a string containing the RGB color specified by: rgb(R, G, B). |
| [to_rgba_hex_string](/svg/python-net/aspose.svg.drawing/color/to_rgba_hex_string/#) | Returns a Hexadecimal color is specified with: #RRGGBBAA. |
| [to_rgba_string](/svg/python-net/aspose.svg.drawing/color/to_rgba_string/#) | Returns a string containing the RGBA color specified by: rgba(R, G, B, A). |
| [to_int](/svg/python-net/aspose.svg.drawing/color/to_int/#) | Encodes the Color ARGB components into int. |
| [to_uint](/svg/python-net/aspose.svg.drawing/color/to_uint/#) | Encodes the Color ARGB components into unsigned int. |
| [get_luminosity](/svg/python-net/aspose.svg.drawing/color/get_luminosity/#) | Returns a luminosity of the Color. |
| [add_luminosity](/svg/python-net/aspose.svg.drawing/color/add_luminosity/#float) | Creates copy of the Color with Sum of its luminosity and the delta value. |
| [with_luminosity](/svg/python-net/aspose.svg.drawing/color/with_luminosity/#float) | Creates copy of the Color with specified luminosity. |
| [with_alpha](/svg/python-net/aspose.svg.drawing/color/with_alpha/#float) | Creates copy of the Color with specified alpha component. |
| [get_saturation](/svg/python-net/aspose.svg.drawing/color/get_saturation/#) | Returns a saturation of the Color. |
| [with_saturation](/svg/python-net/aspose.svg.drawing/color/with_saturation/#float) | Creates copy of the Color with specified saturation. |
| [get_hue](/svg/python-net/aspose.svg.drawing/color/get_hue/#) | Returns a Hue of the Color. |
| [with_hue](/svg/python-net/aspose.svg.drawing/color/with_hue/#float) | Creates copy of the Color with specified Hue. |
| [get_complementary](/svg/python-net/aspose.svg.drawing/color/get_complementary/#) | Returns a new color that is on the opposite side of the color wheel from the original. |



### See Also
* module [`aspose.svg.drawing`](..)
* class [`Color`](/svg/python-net/aspose.svg.drawing/color)
