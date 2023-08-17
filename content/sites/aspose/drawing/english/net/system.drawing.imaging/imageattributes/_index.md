---
title: ImageAttributes
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 740
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
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | Clears the brush color-remap table of this ImageAttributes object. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey)() | Clears the color key (transparency range) for the default category. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey)(ColorAdjustType) | Clears the color key (transparency range) for a specified category. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix)() | Clears the color-adjustment matrix for the default category. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix)(ColorAdjustType) | Clears the color-adjustment matrix for a specified category. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma)() | Disables gamma correction for the default category. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma)(ColorAdjustType) | Disables gamma correction for a specified category. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop)() | Clears the NoOp setting for the default category. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop)(ColorAdjustType) | Clears the NoOp setting for a specified category. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel)() | Clears the CMYK (cyan-magenta-yellow-black) output channel setting for the default category. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel)(ColorAdjustType) | Clears the (cyan-magenta-yellow-black) output channel setting for a specified category. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile)() | Clears the output channel color profile setting for the default category. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile)(ColorAdjustType) | Clears the output channel color profile setting for a specified category. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable)() | Clears the color-remap table for the default category. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable)(ColorAdjustType) | Clears the color-remap table for a specified category. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold)() | Clears the threshold value for the default category. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold)(ColorAdjustType) | Clears the threshold value for a specified category. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | Creates an exact copy of this ImageAttributes object. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | Releases all resources used by this ImageAttributes object. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | Adjusts the colors in a palette according to the adjustment settings of a specified category. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | Sets the color-remap table for the brush category. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey)(Color, Color) | Sets the color key for the default category. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey)(Color, Color, ColorAdjustType) | Sets the color key (transparency range) for a specified category. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices)(ColorMatrix, ColorMatrix) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for the default category. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix and the grayscale-adjustment matrix for a specified category. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix)(ColorMatrix) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix)(ColorMatrix, ColorMatrixFlag) | Sets the color-adjustment matrix for the default category. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Sets the color-adjustment matrix for a specified category. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma)(float) | Sets the gamma value for the default category. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma)(float, ColorAdjustType) | Sets the gamma value for a specified category. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop)() | Turns off color adjustment for the default category. You can call the [`ClearNoOp`](./clearnoop) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop) method. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop)(ColorAdjustType) | Turns off color adjustment for a specified category. You can call the [`ClearNoOp`](./clearnoop) method to reinstate the color-adjustment settings that were in place before the call to the [`SetNoOp`](./setnoop) method. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel)(ColorChannelFlag) | Sets the CMYK (cyan-magenta-yellow-black) output channel for the default category. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel)(ColorChannelFlag, ColorAdjustType) | Sets the CMYK (cyan-magenta-yellow-black) output channel for a specified category. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile)(string) | Sets the output channel color-profile file for the default category. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile)(string, ColorAdjustType) | Sets the output channel color-profile file for a specified category. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable)(ColorMap[]) | Sets the color-remap table for the default category. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable)(ColorMap[], ColorAdjustType) | Sets the color-remap table for a specified category. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold)(float) | Sets the threshold (transparency range) for the default category. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold)(float, ColorAdjustType) | Sets the threshold (transparency range) for a specified category. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode)(WrapMode) | Sets the wrap mode that is used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode)(WrapMode, Color) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode)(WrapMode, Color, bool) | Sets the wrap mode and color used to decide how to tile a texture across a shape, or at shape boundaries. A texture is tiled across a shape to fill it in when the texture is smaller than the shape it is filling. |

### See Also

* namespace [System.Drawing.Imaging](../../system.drawing.imaging)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
