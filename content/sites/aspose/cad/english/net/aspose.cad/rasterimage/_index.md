---
title: RasterImage
second_title: Aspose.CAD for .NET API Reference
description: 
type: docs
weight: 30080
url: /net/aspose.cad/rasterimage/
---
## RasterImage class

Represents a raster image supporting raster graphics operations.

```csharp
public abstract class RasterImage : Image, IRasterImageArgb32PixelLoader
```

## Properties

| Name | Description |
| --- | --- |
| abstract [BitsPerPixel](bitsperpixel) { get; } | Gets the image bits per pixel count. |
| virtual [HasAlpha](hasalpha) { get; } | Gets a value indicating whether this instance has alpha. |
| virtual [HasTransparentColor](hastransparentcolor) { get; set; } | Gets a value indicating whether image has transparent color. |
| virtual [HorizontalResolution](horizontalresolution) { get; set; } | Gets or sets the horizontal resolution, in pixels per inch, of this [`RasterImage`](../rasterimage). |
| [IsRawDataAvailable](israwdataavailable) { get; } | Gets a value indicating whether raw data loading is available. |
| [RawCustomColorConverter](rawcustomcolorconverter) { get; set; } | Gets or sets the custom color converter |
| virtual [RawDataFormat](rawdataformat) { get; } | Gets the raw data format. |
| [RawDataSettings](rawdatasettings) { get; } | Gets the current raw data settings. Note when using these settings the data loads without conversion. |
| [RawFallbackIndex](rawfallbackindex) { get; set; } | Gets or sets the fallback index to use when palette index is out of bounds |
| [RawIndexedColorConverter](rawindexedcolorconverter) { get; set; } | Gets or sets the indexed color converter |
| virtual [RawLineSize](rawlinesize) { get; } | Gets the raw line size in bytes. |
| virtual [TransparentColor](transparentcolor) { get; set; } | Gets the image transparent color. |
| virtual [VerticalResolution](verticalresolution) { get; set; } | Gets or sets the vertical resolution, in pixels per inch, of this [`RasterImage`](../rasterimage). |
| virtual [XmpData](xmpdata) { get; set; } | Gets or sets the XMP metadata. |

## Methods

| Name | Description |
| --- | --- |
| abstract [AdjustBrightness](adjustbrightness)(int) | Adjust of a brightness for image. |
| abstract [AdjustContrast](adjustcontrast)(float) | Image contrasting |
| abstract [AdjustGamma](adjustgamma)(float) | Gamma-correction of an image. |
| abstract [AdjustGamma](adjustgamma)(float, float, float) | Gamma-correction of an image. |
| abstract [BinarizeBradley](binarizebradley)(double) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| abstract [BinarizeFixed](binarizefixed)(byte) | Binarization of an image with predefined threshold |
| abstract [BinarizeOtsu](binarizeotsu)() | Binarization of an image with Otsu thresholding |
| abstract [Crop](crop)(Rectangle) | Cropping the image. |
| virtual [Crop](crop)(int, int, int, int) | Crop image with shifts. |
| [Dither](dither)(DitheringMethod, int) | Performs dithering on the current image. |
| abstract [Dither](dither)(DitheringMethod, int, IColorPalette) | Performs dithering on the current image. |
| virtual [Filter](filter)(Rectangle, FilterOptionsBase) | Filters the specified rectangle. |
| [GetArgb32Pixel](getargb32pixel)(int, int) | Gets an image 32-bit ARGB pixel. |
| [GetDefaultArgb32Pixels](getdefaultargb32pixels)(Rectangle) | Gets the default 32-bit ARGB pixels array. |
| [GetDefaultPixels](getdefaultpixels)(Rectangle, IPartialArgb32PixelLoader) | Gets the default pixels array using partial pixel loader. |
| [GetDefaultRawData](getdefaultrawdata)(Rectangle, RawDataSettings) | Gets the default raw data array. |
| [GetDefaultRawData](getdefaultrawdata)(Rectangle, IPartialRawDataLoader, RawDataSettings) | Gets the default raw data array using partial pixel loader. |
| [GetPixel](getpixel)(int, int) | Gets an image pixel. |
| abstract [Grayscale](grayscale)() | Transformation of an image to its grayscale representation |
| [LoadArgb32Pixels](loadargb32pixels)(Rectangle) | Loads 32-bit ARGB pixels. |
| [LoadCmykPixels](loadcmykpixels)(Rectangle) | Loads pixels in CMYK format. |
| [LoadPartialArgb32Pixels](loadpartialargb32pixels)(Rectangle, IPartialArgb32PixelLoader) | Loads 32-bit ARGB pixels partially by packs. |
| [LoadPartialPixels](loadpartialpixels)(Rectangle, IPartialPixelLoader) | Loads pixels partially by packs. |
| [LoadPixels](loadpixels)(Rectangle) | Loads pixels. |
| [LoadRawData](loadrawdata)(Rectangle, RawDataSettings, IPartialRawDataLoader) | Loads raw data. |
| [ReadScanLine](readscanline)(int) | Reads the whole scan line by the specified scan line index. |
| [ReadScanLineArgb](readscanlineargb)(int) | Reads the whole scan line by the specified scan line index. |
| abstract [Resize](resize)(int, int, ImageResizeSettings) | Resizes the image. |
| abstract [Resize](resize)(int, int, ResizeType) | Resizes the image. |
| abstract [Rotate](rotate)(float, bool, Color) | Rotate image around the center. |
| [SaveArgb32Pixels](saveargb32pixels)(Rectangle, int[]) | Saves the 32-bit ARGB pixels. |
| [SaveCmykPixels](savecmykpixels)(Rectangle, CmykColor[]) | Saves the pixels. |
| [SavePixels](savepixels)(Rectangle, Color[]) | Saves the pixels. |
| [SaveRawData](saverawdata)(byte[], int, Rectangle, RawDataSettings) | Saves the raw data. |
| [SetArgb32Pixel](setargb32pixel)(int, int, int) | Sets an image 32-bit ARGB pixel for the specified position. |
| virtual [SetPalette](setpalette)(IColorPalette, bool) | Sets the image palette. |
| [SetPixel](setpixel)(int, int, Color) | Sets an image pixel for the specified position. |
| virtual [SetResolution](setresolution)(double, double) | Sets the resolution for this [`RasterImage`](../rasterimage). |
| [WriteScanLine](writescanline)(int, Color[]) | Writes the whole scan line to the specified scan line index. |
| [WriteScanLine](writescanline)(int, int[]) | Writes the whole scan line to the specified scan line index. |

### See Also

* class [Image](../image)
* interface [IRasterImageArgb32PixelLoader](../irasterimageargb32pixelloader)
* namespace [Aspose.CAD](../../aspose.cad)
* assembly [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
