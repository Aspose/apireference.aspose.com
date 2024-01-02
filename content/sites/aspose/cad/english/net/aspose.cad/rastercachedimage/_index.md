---
title: Class RasterCachedImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.RasterCachedImage class. Represents a raster image supporting raster graphics operations. This image caches pixel data when required
type: docs
weight: 36840
url: /net/aspose.cad/rastercachedimage/
---
## RasterCachedImage class

Represents a raster image supporting raster graphics operations. This image caches pixel data when required.

```csharp
public abstract class RasterCachedImage : RasterImage
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| abstract [BitsPerPixel](../../aspose.cad/rasterimage/bitsperpixel/) { get; } | Gets the image bits per pixel count. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| virtual [Depth](../../aspose.cad/image/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| virtual [HasAlpha](../../aspose.cad/rasterimage/hasalpha/) { get; } | Gets a value indicating whether this instance has alpha. |
| virtual [HasTransparentColor](../../aspose.cad/rasterimage/hastransparentcolor/) { get; set; } | Gets a value indicating whether image has transparent color. |
| abstract [Height](../../aspose.cad/image/height/) { get; } | Gets the image height. |
| virtual [HorizontalResolution](../../aspose.cad/rasterimage/horizontalresolution/) { get; set; } | Gets or sets the horizontal resolution, in pixels per inch, of this [`RasterImage`](../rasterimage/). |
| [IsCached](../../aspose.cad/rastercachedimage/iscached/) { get; } | Gets a value indicating whether image data is cached currently. |
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
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| virtual [VerticalResolution](../../aspose.cad/rasterimage/verticalresolution/) { get; set; } | Gets or sets the vertical resolution, in pixels per inch, of this [`RasterImage`](../rasterimage/). |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| abstract [Width](../../aspose.cad/image/width/) { get; } | Gets the image width. |
| virtual [XmpData](../../aspose.cad/rasterimage/xmpdata/) { get; set; } | Gets or sets the XMP metadata. |

## Methods

| Name | Description |
| --- | --- |
| override [AdjustBrightness](../../aspose.cad/rastercachedimage/adjustbrightness/)(int) | Adjust of a brightness for image. |
| override [AdjustContrast](../../aspose.cad/rastercachedimage/adjustcontrast/)(float) | Image contrasting |
| override [AdjustGamma](../../aspose.cad/rastercachedimage/adjustgamma/#adjustgamma)(float) | Gamma-correction of an image. |
| override [AdjustGamma](../../aspose.cad/rastercachedimage/adjustgamma/#adjustgamma_1)(float, float, float) | Gamma-correction of an image. |
| override [BinarizeBradley](../../aspose.cad/rastercachedimage/binarizebradley/)(double) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| override [BinarizeFixed](../../aspose.cad/rastercachedimage/binarizefixed/)(byte) | Binarization of an image with predefined threshold |
| override [BinarizeOtsu](../../aspose.cad/rastercachedimage/binarizeotsu/)() | Binarization of an image with Otsu thresholding |
| [CacheData](../../aspose.cad/rastercachedimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| override [Crop](../../aspose.cad/rastercachedimage/crop/#crop)(Rectangle) | Cropping the image. |
| virtual [Crop](../../aspose.cad/rasterimage/crop/)(int, int, int, int) | Crop image with shifts. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [Dither](../../aspose.cad/rasterimage/dither/)(DitheringMethod, int) | Performs dithering on the current image. |
| override [Dither](../../aspose.cad/rastercachedimage/dither/#dither_1)(DitheringMethod, int, IColorPalette) | Performs dithering on the current image. |
| virtual [Filter](../../aspose.cad/rasterimage/filter/)(Rectangle, FilterOptionsBase) | Filters the specified rectangle. |
| [GetArgb32Pixel](../../aspose.cad/rasterimage/getargb32pixel/)(int, int) | Gets an image 32-bit ARGB pixel. |
| [GetDefaultArgb32Pixels](../../aspose.cad/rasterimage/getdefaultargb32pixels/)(Rectangle) | Gets the default 32-bit ARGB pixels array. |
| [GetDefaultPixels](../../aspose.cad/rasterimage/getdefaultpixels/)(Rectangle, IPartialArgb32PixelLoader) | Gets the default pixels array using partial pixel loader. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata/)(Rectangle, RawDataSettings) | Gets the default raw data array. |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata/)(Rectangle, IPartialRawDataLoader, RawDataSettings) | Gets the default raw data array using partial pixel loader. |
| [GetPixel](../../aspose.cad/rasterimage/getpixel/)(int, int) | Gets an image pixel. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| override [Grayscale](../../aspose.cad/rastercachedimage/grayscale/)() | Transformation of an image to its grayscale representation |
| [LoadArgb32Pixels](../../aspose.cad/rasterimage/loadargb32pixels/)(Rectangle) | Loads 32-bit ARGB pixels. |
| [LoadCmykPixels](../../aspose.cad/rasterimage/loadcmykpixels/)(Rectangle) | Loads pixels in CMYK format. |
| [LoadPartialArgb32Pixels](../../aspose.cad/rasterimage/loadpartialargb32pixels/)(Rectangle, IPartialArgb32PixelLoader) | Loads 32-bit ARGB pixels partially by packs. |
| [LoadPartialPixels](../../aspose.cad/rasterimage/loadpartialpixels/)(Rectangle, IPartialPixelLoader) | Loads pixels partially by packs. |
| [LoadPixels](../../aspose.cad/rasterimage/loadpixels/)(Rectangle) | Loads pixels. |
| [LoadRawData](../../aspose.cad/rasterimage/loadrawdata/)(Rectangle, RawDataSettings, IPartialRawDataLoader) | Loads raw data. |
| [ReadScanLine](../../aspose.cad/rasterimage/readscanline/)(int) | Reads the whole scan line by the specified scan line index. |
| [ReadScanLineArgb](../../aspose.cad/rasterimage/readscanlineargb/)(int) | Reads the whole scan line by the specified scan line index. |
| [Resize](../../aspose.cad/rastercachedimage/resize/#resize)(int, int, ImageResizeSettings) | Resizes the image. |
| [Resize](../../aspose.cad/rastercachedimage/resize/#resize_1)(int, int, ResizeType) | Resizes the image. |
| override [Rotate](../../aspose.cad/rastercachedimage/rotate/)(float, bool, Color) | Rotate image around the center. |
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
| virtual [SetResolution](../../aspose.cad/rasterimage/setresolution/)(double, double) | Sets the resolution for this [`RasterImage`](../rasterimage/). |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline/)(int, Color[]) | Writes the whole scan line to the specified scan line index. |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline/)(int, int[]) | Writes the whole scan line to the specified scan line index. |

### See Also

* class [RasterImage](../rasterimage/)
* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


