---
title: RasterImage class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 460
url: /aspose.cad/rasterimage/
is_root: false
---

## RasterImage class

Represents a raster image supporting raster graphics operations.



**Inheritance:** [`RasterImage`](/cad/python-net/aspose.cad/rasterimage) → 
[`Image`](/cad/python-net/aspose.cad/image) → 
[`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The RasterImage type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad/rasterimage/disposed) | Gets a value indicating whether this instance is disposed. |
| [data_stream_container](/cad/python-net/aspose.cad/rasterimage/data_stream_container) | Gets the object's data stream. |
| [is_cached](/cad/python-net/aspose.cad/rasterimage/is_cached) | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [bounds](/cad/python-net/aspose.cad/rasterimage/bounds) | Gets the image bounds. |
| [container](/cad/python-net/aspose.cad/rasterimage/container) | Gets the [`Image`](/cad/python-net/aspose.cad/image) container. |
| [height](/cad/python-net/aspose.cad/rasterimage/height) | Gets the image height. |
| [palette](/cad/python-net/aspose.cad/rasterimage/palette) | Gets or sets the color palette. |
| [size](/cad/python-net/aspose.cad/rasterimage/size) | Gets the image size. |
| [width](/cad/python-net/aspose.cad/rasterimage/width) | Gets the image width. |
| [has_background_color](/cad/python-net/aspose.cad/rasterimage/has_background_color) | Gets or sets a value indicating whether image has background color. |
| [background_color](/cad/python-net/aspose.cad/rasterimage/background_color) | Gets or sets a value for the background color. |
| [unit_type](/cad/python-net/aspose.cad/rasterimage/unit_type) | Gets current unit type. |
| [unitless_default_unit_type](/cad/python-net/aspose.cad/rasterimage/unitless_default_unit_type) | Assumed unit type when UnitType is set to Unitless |
| [xmp_data](/cad/python-net/aspose.cad/rasterimage/xmp_data) | Gets or sets the XMP metadata. |
| [raw_indexed_color_converter](/cad/python-net/aspose.cad/rasterimage/raw_indexed_color_converter) | Gets or sets the indexed color converter |
| [raw_custom_color_converter](/cad/python-net/aspose.cad/rasterimage/raw_custom_color_converter) | Gets or sets the custom color converter |
| [raw_fallback_index](/cad/python-net/aspose.cad/rasterimage/raw_fallback_index) | Gets or sets the fallback index to use when palette index is out of bounds |
| [raw_data_settings](/cad/python-net/aspose.cad/rasterimage/raw_data_settings) | Gets the current raw data settings. Note when using these settings the data loads without conversion. |
| [raw_data_format](/cad/python-net/aspose.cad/rasterimage/raw_data_format) | Gets the raw data format. |
| [raw_line_size](/cad/python-net/aspose.cad/rasterimage/raw_line_size) | Gets the raw line size in bytes. |
| [is_raw_data_available](/cad/python-net/aspose.cad/rasterimage/is_raw_data_available) | Gets a value indicating whether raw data loading is available. |
| [bits_per_pixel](/cad/python-net/aspose.cad/rasterimage/bits_per_pixel) | Gets the image bits per pixel count. |
| [horizontal_resolution](/cad/python-net/aspose.cad/rasterimage/horizontal_resolution) | Gets or sets the horizontal resolution, in pixels per inch, of this [`RasterImage`](/cad/python-net/aspose.cad/rasterimage). |
| [vertical_resolution](/cad/python-net/aspose.cad/rasterimage/vertical_resolution) | Gets or sets the vertical resolution, in pixels per inch, of this [`RasterImage`](/cad/python-net/aspose.cad/rasterimage). |
| [has_transparent_color](/cad/python-net/aspose.cad/rasterimage/has_transparent_color) | Gets a value indicating whether image has transparent color. |
| [has_alpha](/cad/python-net/aspose.cad/rasterimage/has_alpha) | Gets a value indicating whether this instance has alpha. |
| [transparent_color](/cad/python-net/aspose.cad/rasterimage/transparent_color) | Gets the image transparent color. |


### Methods
| Method | Description |
| :- | :- |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#) | Saves the image data to the underlying stream. |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#str-aspose.cad.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#io.RawIOBase-aspose.cad.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#io.RawIOBase) | Saves the object's data to the specified stream. |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#str) | Saves the object's data to the specified file location. |
| [save](/cad/python-net/aspose.cad/rasterimage/save/#str-bool) | Saves the object's data to the specified file location. |
| [can_load](/cad/python-net/aspose.cad/rasterimage/can_load/#str) | Determines whether image can be loaded from the specified file path. |
| [can_load](/cad/python-net/aspose.cad/rasterimage/can_load/#str-aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| [can_load](/cad/python-net/aspose.cad/rasterimage/can_load/#io.RawIOBase) | Determines whether image can be loaded from the specified stream. |
| [can_load](/cad/python-net/aspose.cad/rasterimage/can_load/#io.RawIOBase-aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified `load_options`. |
| [get_file_format](/cad/python-net/aspose.cad/rasterimage/get_file_format/#str) | Gets the file format. |
| [get_file_format](/cad/python-net/aspose.cad/rasterimage/get_file_format/#io.RawIOBase) | Gets the file format. |
| [load](/cad/python-net/aspose.cad/rasterimage/load/#str-aspose.cad.LoadOptions) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad/rasterimage/load/#str) | Loads a new image from the specified file. |
| [load](/cad/python-net/aspose.cad/rasterimage/load/#io.RawIOBase-aspose.cad.LoadOptions) | Loads a new image from the specified stream. |
| [load](/cad/python-net/aspose.cad/rasterimage/load/#io.RawIOBase) | Loads a new image from the specified stream. |
| [dither](/cad/python-net/aspose.cad/rasterimage/dither/#aspose.cad.DitheringMethod-int) | Performs dithering on the current image. |
| [dither](/cad/python-net/aspose.cad/rasterimage/dither/#aspose.cad.DitheringMethod-int-aspose.cad.IColorPalette) | Performs dithering on the current image. |
| [resize](/cad/python-net/aspose.cad/rasterimage/resize/#int-int-aspose.cad.ResizeType) | Resizes the image. |
| [resize](/cad/python-net/aspose.cad/rasterimage/resize/#int-int-aspose.cad.ImageResizeSettings) | Resizes the image. |
| [crop](/cad/python-net/aspose.cad/rasterimage/crop/#aspose.cad.Rectangle) | Cropping the image. |
| [crop](/cad/python-net/aspose.cad/rasterimage/crop/#int-int-int-int) | Crop image with shifts. |
| [adjust_gamma](/cad/python-net/aspose.cad/rasterimage/adjust_gamma/#float-float-float) | Gamma-correction of an image. |
| [adjust_gamma](/cad/python-net/aspose.cad/rasterimage/adjust_gamma/#float) | Gamma-correction of an image. |
| [get_default_raw_data](/cad/python-net/aspose.cad/rasterimage/get_default_raw_data/#aspose.cad.Rectangle-aspose.cad.IPartialRawDataLoader-aspose.cad.RawDataSettings) | Gets the default raw data array using partial pixel loader. |
| [get_default_raw_data](/cad/python-net/aspose.cad/rasterimage/get_default_raw_data/#aspose.cad.Rectangle-aspose.cad.RawDataSettings) | Gets the default raw data array. |
| [write_scan_line](/cad/python-net/aspose.cad/rasterimage/write_scan_line/#int-list) | Writes the whole scan line to the specified scan line index. |
| [write_scan_line](/cad/python-net/aspose.cad/rasterimage/write_scan_line/#int-list) | Writes the whole scan line to the specified scan line index. |
| [cache_data](/cad/python-net/aspose.cad/rasterimage/cache_data/#) | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamSupporter.data_stream_container`](/cad/python-net/aspose.cad/datastreamsupporter#data_stream_container). |
| [get_strings](/cad/python-net/aspose.cad/rasterimage/get_strings/#) | Gets all string values from image. |
| [can_save](/cad/python-net/aspose.cad/rasterimage/can_save/#aspose.cad.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [get_default_pixels](/cad/python-net/aspose.cad/rasterimage/get_default_pixels/#aspose.cad.Rectangle-aspose.cad.IPartialArgb32PixelLoader) | Gets the default pixels array using partial pixel loader. |
| [binarize_otsu](/cad/python-net/aspose.cad/rasterimage/binarize_otsu/#) | Binarization of an image with Otsu thresholding |
| [binarize_bradley](/cad/python-net/aspose.cad/rasterimage/binarize_bradley/#float) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| [adjust_brightness](/cad/python-net/aspose.cad/rasterimage/adjust_brightness/#int) | Adjust of a brightness for image. |
| [grayscale](/cad/python-net/aspose.cad/rasterimage/grayscale/#) | Transformation of an image to its grayscale representation |
| [binarize_fixed](/cad/python-net/aspose.cad/rasterimage/binarize_fixed/#byte) | Binarization of an image with predefined threshold |
| [rotate](/cad/python-net/aspose.cad/rasterimage/rotate/#float-bool-aspose.cad.Color) | Rotate image around the center. |
| [adjust_contrast](/cad/python-net/aspose.cad/rasterimage/adjust_contrast/#float) | Image contrasting |
| [get_default_argb_32_pixels](/cad/python-net/aspose.cad/rasterimage/get_default_argb_32_pixels/#aspose.cad.Rectangle) | Gets the default 32-bit ARGB pixels array. |
| [get_argb_32_pixel](/cad/python-net/aspose.cad/rasterimage/get_argb_32_pixel/#int-int) | Gets an image 32-bit ARGB pixel. |
| [get_pixel](/cad/python-net/aspose.cad/rasterimage/get_pixel/#int-int) | Gets an image pixel. |
| [set_argb_32_pixel](/cad/python-net/aspose.cad/rasterimage/set_argb_32_pixel/#int-int-int) | Sets an image 32-bit ARGB pixel for the specified position. |
| [set_pixel](/cad/python-net/aspose.cad/rasterimage/set_pixel/#int-int-aspose.cad.Color) | Sets an image pixel for the specified position. |
| [read_scan_line](/cad/python-net/aspose.cad/rasterimage/read_scan_line/#int) | Reads the whole scan line by the specified scan line index. |
| [read_scan_line_argb](/cad/python-net/aspose.cad/rasterimage/read_scan_line_argb/#int) | Reads the whole scan line by the specified scan line index. |
| [load_partial_argb_32_pixels](/cad/python-net/aspose.cad/rasterimage/load_partial_argb_32_pixels/#aspose.cad.Rectangle-aspose.cad.IPartialArgb32PixelLoader) | Loads 32-bit ARGB pixels partially by packs. |
| [load_partial_pixels](/cad/python-net/aspose.cad/rasterimage/load_partial_pixels/#aspose.cad.Rectangle-aspose.cad.IPartialPixelLoader) | Loads pixels partially by packs. |
| [load_argb_32_pixels](/cad/python-net/aspose.cad/rasterimage/load_argb_32_pixels/#aspose.cad.Rectangle) | Loads 32-bit ARGB pixels. |
| [load_pixels](/cad/python-net/aspose.cad/rasterimage/load_pixels/#aspose.cad.Rectangle) | Loads pixels. |
| [load_cmyk_pixels](/cad/python-net/aspose.cad/rasterimage/load_cmyk_pixels/#aspose.cad.Rectangle) | Loads pixels in CMYK format. |
| [load_raw_data](/cad/python-net/aspose.cad/rasterimage/load_raw_data/#aspose.cad.Rectangle-aspose.cad.RawDataSettings-aspose.cad.IPartialRawDataLoader) | Loads raw data. |
| [save_raw_data](/cad/python-net/aspose.cad/rasterimage/save_raw_data/#bytes-int-aspose.cad.Rectangle-aspose.cad.RawDataSettings) | Saves the raw data. |
| [save_argb_32_pixels](/cad/python-net/aspose.cad/rasterimage/save_argb_32_pixels/#aspose.cad.Rectangle-list) | Saves the 32-bit ARGB pixels. |
| [save_pixels](/cad/python-net/aspose.cad/rasterimage/save_pixels/#aspose.cad.Rectangle-list) | Saves the pixels. |
| [save_cmyk_pixels](/cad/python-net/aspose.cad/rasterimage/save_cmyk_pixels/#aspose.cad.Rectangle-list) | Saves the pixels. |
| [set_resolution](/cad/python-net/aspose.cad/rasterimage/set_resolution/#float-float) | Sets the resolution for this [`RasterImage`](/cad/python-net/aspose.cad/rasterimage). |
| [set_palette](/cad/python-net/aspose.cad/rasterimage/set_palette/#aspose.cad.IColorPalette-bool) | Sets the image palette. |
| [filter](/cad/python-net/aspose.cad/rasterimage/filter/#aspose.cad.Rectangle-aspose.cad.imagefilters.filteroptions.FilterOptionsBase) | Filters the specified rectangle. |



### See Also
* module [`aspose.cad`](..)
* class [`DataStreamSupporter`](/cad/python-net/aspose.cad/datastreamsupporter)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`Image`](/cad/python-net/aspose.cad/image)
* class [`RasterImage`](/cad/python-net/aspose.cad/rasterimage)
