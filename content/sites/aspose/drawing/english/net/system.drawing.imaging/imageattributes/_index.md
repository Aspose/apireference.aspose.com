---
title: ImageAttributes
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 730
url: /net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Contains information about how bitmap and metafile colors are manipulated during rendering.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageAttributes](imageattributes)() | Initializes a new instance of the [`ImageAttributes`](../imageattributes) class. |

## Methods

| Name | Description |
| --- | --- |
| [ClearBrushRemapTable](clearbrushremaptable)() | Clears the brush color-remap table of this ImageAttributes object. |
| [ClearColorKey](clearcolorkey)() | Clears the color key (transparency range) for the default category. |
| [ClearColorKey](clearcolorkey)(ColorAdjustType) | Clears the color key (transparency range) for a specified category. |
| [ClearColorMatrix](clearcolormatrix)() | Clears the color-adjustment matrix for the default category. |
| [ClearColorMatrix](clearcolormatrix)(ColorAdjustType) | Clears the color-adjustment matrix for a specified category. |
| [ClearGamma](cleargamma)() | Disables gamma correction for the default category. |
| [ClearGamma](cleargamma)(ColorAdjustType) | Disables gamma correction for a specified category. |
| [ClearNoOp](clearnoop)() | Clears the NoOp setting for the default category. |
| [ClearNoOp](clearnoop)(ColorAdjustType) | Clears the NoOp setting for a specified category. |
| [ClearOutputChannel](clearoutputchannel)() | Clears the CMYK (cyan-magenta-yellow-black) output channel setting for the default category. |
| [ClearOutputChannel](clearoutputchannel)(ColorAdjustType) | Clears the (cyan-magenta-yellow-black) output channel setting for a specified category. |
| [ClearOutputChannelColorProfile](clearoutputchannelcolorprofile)() | Clears the output channel color profile setting for the default category. |
| [ClearOutputChannelColorProfile](clearoutputchannelcolorprofile)(ColorAdjustType) | Clears the output channel color profile setting for a specified category. |
| [ClearRemapTable](clearremaptable)() | Clears the color-remap table for the default category. |
| [ClearRemapTable](clearremaptable)(ColorAdjustType) | Clears the color-remap table for a specified category. |
| [ClearThreshold](clearthreshold)() | Clears the threshold value for the default category. |
| [ClearThreshold](clearthreshold)(ColorAdjustType) | Clears the threshold value for a specified category. |
| [Clone](clone)() | Creates an exact copy of this ImageAttributes object. |
| [Dispose](dispose)() | Releases all resources used by this ImageAttributes object. |
| [GetAdjustedPalette](getadjustedpalette)(ColorPalette, ColorAdjustType) | Adjusts the colors in a palette according to the adjustment settings of a specified category. |
| [SetBrushRemapTable](setbrushremaptable)(ColorMap[]) | Sets the color-remap table for the brush category. |
| [SetColorKey](setcolorkey)(Color, Color) | Sets the color key for the default category. |
| [SetColorKey](setcolorkey)(Color, Color, ColorAdjustType) | Sets the color key (transparency range) for a specified category. |
| [SetColorMatrices](setcolormatrices)(ColorMatrix, ColorMatrix) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](setcolormatrices)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](setcolormatrices)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for a specified category. |
| [SetColorMatrix](setcolormatrix)(ColorMatrix) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](setcolormatrix)(ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](setcolormatrix)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix for a specified category. |
| [SetGamma](setgamma)(float) | Sets the gamma value for the default category. |
| [SetGamma](setgamma)(float, ColorAdjustType) | Sets the gamma value for a specified category. |
| [SetNoOp](setnoop)() | Turns off color adjustment for the default category. You can call the [`ClearNoOp`](./clearnoop) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop) method. |
| [SetNoOp](setnoop)(ColorAdjustType) | Turns off color adjustment for a specified category. You can call the [`ClearNoOp`](./clearnoop) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop) method. |
| [SetOutputChannel](setoutputchannel)(ColorChannelFlag) | Sets the CMYK (cyan-magenta-yellow-black) output channel for the default category. |
| [SetOutputChannel](setoutputchannel)(ColorChannelFlag, ColorAdjustType) | Sets the CMYK (cyan-magenta-yellow-black) output channel for a specified category. |
| [SetOutputChannelColorProfile](setoutputchannelcolorprofile)(string) | Sets the output channel color-profile file for the default category. |
| [SetOutputChannelColorProfile](setoutputchannelcolorprofile)(string, ColorAdjustType) | Sets the output channel color-profile file for a specified category. |
| [SetRemapTable](setremaptable)(ColorMap[]) | Sets the color-remap table for the default category. |
| [SetRemapTable](setremaptable)(ColorMap[], ColorAdjustType) | Sets the color-remap table for a specified category. |
| [SetThreshold](setthreshold)(float) | Sets the threshold (transparency range) for the default category. |
| [SetThreshold](setthreshold)(float, ColorAdjustType) | Sets the threshold (transparency range) for a specified category. |
| [SetWrapMode](setwrapmode)(WrapMode) | Sets the wrap mode that is used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](setwrapmode)(WrapMode, Color) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](setwrapmode)(WrapMode, Color, bool) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
