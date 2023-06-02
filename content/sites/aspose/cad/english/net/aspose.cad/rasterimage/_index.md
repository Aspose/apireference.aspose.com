---
title: Class RasterImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.RasterImage class. Represents a raster image supporting raster graphics operations
type: docs
weight: 36220
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
| virtual [BackgroundColor](../../aspose.cad/image/backgroundcolor/) { get; set; } | Gets or sets a value for the background color. |
| abstract [BitsPerPixel](../../aspose.cad/rasterimage/bitsperpixel/) { get; } | Gets the image bits per pixel count. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../image/) container. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| virtual [HasAlpha](../../aspose.cad/rasterimage/hasalpha/) { get; } | Gets a value indicating whether this instance has alpha. |
| virtual [HasBackgroundColor](../../aspose.cad/image/hasbackgroundcolor/) { get; set; } | Gets or sets a value indicating whether image has background color. |
| virtual [HasTransparentColor](../../aspose.cad/rasterimage/hastransparentcolor/) { get; set; } | Gets a value indicating whether image has transparent color. |
| abstract [Height](../../aspose.cad/image/height/) { get; } | Gets the image height. |
| virtual [HorizontalResolution](../../aspose.cad/rasterimage/horizontalresolution/) { get; set; } | Gets or sets the horizontal resolution, in pixels per inch, of this `RasterImage`. |
| abstract [IsCached](../../aspose.cad/datastreamsupporter/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [IsRawDataAvailable](../../aspose.cad/rasterimage/israwdataavailable/) { get; } | Gets a value indicating whether raw data loading is available. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [RawCustomColorConverter](../../aspose.cad/rasterimage/rawcustomcolorconverter/) { get; set; } | Gets or sets the custom color converter |
| virtual [RawDataFormat](../../aspose.cad/rasterimage/rawdataformat/) { get; } | Gets the raw data format. |
| [RawDataSettings](../../aspose.cad/rasterimage/rawdatasettings/) { get; } | Gets the current raw data settings. Note when using these settings the data loads without conversion. |
| [RawFallbackIndex](../../aspose.cad/rasterimage/rawfallbackindex/) { get; set; } | Gets or sets the fallback index to use when palette index is out of bounds |
| [RawIndexedColorConverter](../../aspose.cad/rasterimage/rawindexedcolorconverter/) { get; set; } | Gets or sets the indexed color converter |
| virtual [RawLineSize](../../aspose.cad/rasterimage/rawlinesize/) { get; } | Gets the raw line size in bytes. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [TransparentColor](../../aspose.cad/rasterimage/transparentcolor/) { get; set; } | Gets the image transparent color. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| virtual [VerticalResolution](../../aspose.cad/rasterimage/verticalresolution/) { get; set; } | Gets or sets the vertical resolution, in pixels per inch, of this `RasterImage`. |
| abstract [Width](../../aspose.cad/image/width/) { get; } | Gets the image width. |
| virtual [XmpData](../../aspose.cad/rasterimage/xmpdata/) { get; set; } | Gets or sets the XMP metadata. |

## Methods

| Name | Description |
| --- | --- |
| abstract [AdjustBrightness](../../aspose.cad/rasterimage/adjustbrightness/)(int) | Adjust of a brightness for image. |
| abstract [AdjustContrast](../../aspose.cad/rasterimage/adjustcontrast/)(float) | Image contrasting |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma/#adjustgamma)(float) | Gamma-correction of an image. |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma/#adjustgamma_1)(float, float, float) | Gamma-correction of an image. |
| abstract [BinarizeBradley](../../aspose.cad/rasterimage/binarizebradley/)(double) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| abstract [BinarizeFixed](../../aspose.cad/rasterimage/binarizefixed/)(byte) | Binarization of an image with predefined threshold |
| abstract [BinarizeOtsu](../../aspose.cad/rasterimage/binarizeotsu/)() | Binarization of an image with Otsu thresholding |
| abstract [CacheData](../../aspose.cad/datastreamsupporter/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| abstract [Crop](../../aspose.cad/rasterimage/crop/#crop)(Rectangle) | Cropping the image. |
| virtual [Crop](../../aspose.cad/rasterimage/crop/#crop_1)(int, int, int, int) | Crop image with shifts. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [Dither](../../aspose.cad/rasterimage/dither/#dither)(DitheringMethod, int) | Performs dithering on the current image. |
| abstract [Dither](../../aspose.cad/rasterimage/dither/#dither_1)(DitheringMethod, int, IColorPalette) | Performs dithering on the current image. |
| virtual [Filter](../../aspose.cad/rasterimage/filter/)(Rectangle, FilterOptionsBase) | Filters the specified rectangle. |
| [GetArgb32Pixel](../../aspose.cad/rasterimage/getargb32pixel/)(int, int) | Gets an image 32-bit ARGB pixel. |
| [GetDefaultArgb32Pixels](../../aspose.cad/rasterimage/getdefaultargb32pixels/)(Rectangle) | Gets the default 32-bit ARGB pixels array. |
| [GetDefaultPixels](../../aspose.cad/rasterimage/getdefaultpixels/)(Rectangle, IPartialArgb32PixelLoader) | Gets the default pixels array using partial pixel loader. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata/#getdefaultrawdata)(Rectangle, RawDataSettings) | Gets the default raw data array. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata/#getdefaultrawdata_1)(Rectangle, IPartialRawDataLoader, RawDataSettings) | Gets the default raw data array using partial pixel loader. |
| [GetPixel](../../aspose.cad/rasterimage/getpixel/)(int, int) | Gets an image pixel. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| abstract [Grayscale](../../aspose.cad/rasterimage/grayscale/)() | Transformation of an image to its grayscale representation |
| [LoadArgb32Pixels](../../aspose.cad/rasterimage/loadargb32pixels/)(Rectangle) | Loads 32-bit ARGB pixels. |
| [LoadCmykPixels](../../aspose.cad/rasterimage/loadcmykpixels/)(Rectangle) | Loads pixels in CMYK format. |
| [LoadPartialArgb32Pixels](../../aspose.cad/rasterimage/loadpartialargb32pixels/)(Rectangle, IPartialArgb32PixelLoader) | Loads 32-bit ARGB pixels partially by packs. |
| [LoadPartialPixels](../../aspose.cad/rasterimage/loadpartialpixels/)(Rectangle, IPartialPixelLoader) | Loads pixels partially by packs. |
| [LoadPixels](../../aspose.cad/rasterimage/loadpixels/)(Rectangle) | Loads pixels. |
| [LoadRawData](../../aspose.cad/rasterimage/loadrawdata/)(Rectangle, RawDataSettings, IPartialRawDataLoader) | Loads raw data. |
| [ReadScanLine](../../aspose.cad/rasterimage/readscanline/)(int) | Reads the whole scan line by the specified scan line index. |
| [ReadScanLineArgb](../../aspose.cad/rasterimage/readscanlineargb/)(int) | Reads the whole scan line by the specified scan line index. |
| abstract [Resize](../../aspose.cad/rasterimage/resize/#resize)(int, int, ImageResizeSettings) | Resizes the image. |
| abstract [Resize](../../aspose.cad/rasterimage/resize/#resize_1)(int, int, ResizeType) | Resizes the image. |
| abstract [Rotate](../../aspose.cad/rasterimage/rotate/)(float, bool, Color) | Rotate image around the center. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveArgb32Pixels](../../aspose.cad/rasterimage/saveargb32pixels/)(Rectangle, int[]) | Saves the 32-bit ARGB pixels. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveCmykPixels](../../aspose.cad/rasterimage/savecmykpixels/)(Rectangle, CmykColor[]) | Saves the pixels. |
| [SavePixels](../../aspose.cad/rasterimage/savepixels/)(Rectangle, Color[]) | Saves the pixels. |
| [SaveRawData](../../aspose.cad/rasterimage/saverawdata/)(byte[], int, Rectangle, RawDataSettings) | Saves the raw data. |
| [SetArgb32Pixel](../../aspose.cad/rasterimage/setargb32pixel/)(int, int, int) | Sets an image 32-bit ARGB pixel for the specified position. |
| virtual [SetPalette](../../aspose.cad/rasterimage/setpalette/)(IColorPalette, bool) | Sets the image palette. |
| [SetPixel](../../aspose.cad/rasterimage/setpixel/)(int, int, Color) | Sets an image pixel for the specified position. |
| virtual [SetResolution](../../aspose.cad/rasterimage/setresolution/)(double, double) | Sets the resolution for this `RasterImage`. |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline/#writescanline)(int, Color[]) | Writes the whole scan line to the specified scan line index. |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline/#writescanline_1)(int, int[]) | Writes the whole scan line to the specified scan line index. |

### See Also

* class [Image](../image/)
* interface [IRasterImageArgb32PixelLoader](../irasterimageargb32pixelloader/)
* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


