---
title: Class ImageAttributes
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Imaging.ImageAttributes class. Contains information about how bitmap and metafile colors are manipulated during rendering
type: docs
weight: 710
url: /net/aspose.drawing.imaging/imageattributes/
---
## ImageAttributes class

Contains information about how bitmap and metafile colors are manipulated during rendering.

```csharp
public sealed class ImageAttributes : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageAttributes](imageattributes/)() | Initializes a new instance of the `ImageAttributes` class. |

## Methods

| Name | Description |
| --- | --- |
| [ClearBrushRemapTable](../../aspose.drawing.imaging/imageattributes/clearbrushremaptable/)() | Clears the brush color-remap table of this ImageAttributes object. |
| [ClearColorKey](../../aspose.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | Clears the color key (transparency range) for the default category. |
| [ClearColorKey](../../aspose.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | Clears the color key (transparency range) for a specified category. |
| [ClearColorMatrix](../../aspose.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | Clears the color-adjustment matrix for the default category. |
| [ClearColorMatrix](../../aspose.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | Clears the color-adjustment matrix for a specified category. |
| [ClearGamma](../../aspose.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | Disables gamma correction for the default category. |
| [ClearGamma](../../aspose.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | Disables gamma correction for a specified category. |
| [ClearNoOp](../../aspose.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | Clears the NoOp setting for the default category. |
| [ClearNoOp](../../aspose.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | Clears the NoOp setting for a specified category. |
| [ClearOutputChannel](../../aspose.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | Clears the CMYK (cyan-magenta-yellow-black) output channel setting for the default category. |
| [ClearOutputChannel](../../aspose.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | Clears the (cyan-magenta-yellow-black) output channel setting for a specified category. |
| [ClearOutputChannelColorProfile](../../aspose.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | Clears the output channel color profile setting for the default category. |
| [ClearOutputChannelColorProfile](../../aspose.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Clears the output channel color profile setting for a specified category. |
| [ClearRemapTable](../../aspose.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | Clears the color-remap table for the default category. |
| [ClearRemapTable](../../aspose.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | Clears the color-remap table for a specified category. |
| [ClearThreshold](../../aspose.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | Clears the threshold value for the default category. |
| [ClearThreshold](../../aspose.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | Clears the threshold value for a specified category. |
| [Clone](../../aspose.drawing.imaging/imageattributes/clone/)() | Creates an exact copy of this ImageAttributes object. |
| [Dispose](../../aspose.drawing.imaging/imageattributes/dispose/)() | Releases all resources used by this ImageAttributes object. |
| [GetAdjustedPalette](../../aspose.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | Adjusts the colors in a palette according to the adjustment settings of a specified category. |
| [SetBrushRemapTable](../../aspose.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | Sets the color-remap table for the brush category. |
| [SetColorKey](../../aspose.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | Sets the color key for the default category. |
| [SetColorKey](../../aspose.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | Sets the color key (transparency range) for a specified category. |
| [SetColorMatrices](../../aspose.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](../../aspose.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](../../aspose.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for a specified category. |
| [SetColorMatrix](../../aspose.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](../../aspose.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](../../aspose.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix for a specified category. |
| [SetGamma](../../aspose.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | Sets the gamma value for the default category. |
| [SetGamma](../../aspose.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | Sets the gamma value for a specified category. |
| [SetNoOp](../../aspose.drawing.imaging/imageattributes/setnoop/#setnoop)() | Turns off color adjustment for the default category. You can call the [`ClearNoOp`](./clearnoop/) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop/) method. |
| [SetNoOp](../../aspose.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | Turns off color adjustment for a specified category. You can call the [`ClearNoOp`](./clearnoop/) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop/) method. |
| [SetOutputChannel](../../aspose.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | Sets the CMYK (cyan-magenta-yellow-black) output channel for the default category. |
| [SetOutputChannel](../../aspose.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Sets the CMYK (cyan-magenta-yellow-black) output channel for a specified category. |
| [SetOutputChannelColorProfile](../../aspose.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | Sets the output channel color-profile file for the default category. |
| [SetOutputChannelColorProfile](../../aspose.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Sets the output channel color-profile file for a specified category. |
| [SetRemapTable](../../aspose.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | Sets the color-remap table for the default category. |
| [SetRemapTable](../../aspose.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | Sets the color-remap table for a specified category. |
| [SetThreshold](../../aspose.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | Sets the threshold (transparency range) for the default category. |
| [SetThreshold](../../aspose.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | Sets the threshold (transparency range) for a specified category. |
| [SetWrapMode](../../aspose.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | Sets the wrap mode that is used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](../../aspose.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](../../aspose.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |

### See Also

* namespace [Aspose.Drawing.Imaging](../../aspose.drawing.imaging/)
* assembly [Aspose.Drawing.Common](../../)


