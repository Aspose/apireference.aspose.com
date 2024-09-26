---
title: ImageSaveOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /python-net/aspose.page.eps.device/imagesaveoptions/
---

## ImageSaveOptions class

This class contains options necessary for managing image saving process.

**Inheritance:** `ImageSaveOptions` → [`SaveOptions`](/page/python-net/aspose.page/saveoptions)

The ImageSaveOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `ImageSaveOptions()` | Initializes a new instance of the [ImageSaveOptions](/page/python-net/aspose.page.eps.device/imagesaveoptions/) class with default values <br/>            for flags SuppressErrors (true) and  (false). |
| `ImageSaveOptions(image_format)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(size)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(size, image_format)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(image_format, supress_errors)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(size, supress_errors)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(size, image_format, supress_errors)` | Initializes a new instance of the ImageSaveOptions class |
| `ImageSaveOptions(supress_errors)` | Initializes a new instance of the ImageSaveOptions class |
## Properties
| Name | Description |
| :- | :- |
| `supress_errors` | Specifies whether errors must be suppressed or not.<br/>            If true suppressed errors are added to [None](/page/python-net/aspose.page/saveoptions/) list.<br/>            If false the first error will terminate the program. |
| `size` | Gets/sets the size of the image. |
| `debug` | Specifies whether debug information must be printed to standard output stream or not. |
| `additional_fonts_folders` | Specifies additional folders where converter should find fonts for input document.<br/>            Default folder are standard fonts folder where OS finds fonts for internal needs. |
| `jpeg_quality_level` | The Quality category specifies the level of compression for an image.<br/>            Available values are 0 to 100. <br/>            The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>            0 value results in lowest quality image, while 100 results in highest. |
| `smoothing_mode` | Gets/sets the smoothing mode for rendering image. |
| `resolution` | Gets/sets the image resolution. |
| `image_format` | Gets/sets an image format for resulting image. |
| `try_join_image_fragments` | The flag for combining image fragments into one picture. |

### See Also

* module [`aspose.page.eps.device`](/page/python-net/aspose.page.eps.device/)
* package [`aspose.page`](/page/python-net/)

