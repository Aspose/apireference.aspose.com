---
title: PsConverterToImageOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 110
url: /python-net/aspose.page.plugins/psconvertertoimageoptions/
---

## PsConverterToImageOptions class

Represents PS/EPS to Image converter options for [PsConverter](/page/python-net/aspose.page.plugins/psconverter/) plugin.

**Inheritance:** `PsConverterToImageOptions` → [`PsConverterOptions`](/page/python-net/aspose.page.plugins/psconverteroptions)

The PsConverterToImageOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PsConverterToImageOptions()` | Initializes new instance of the [PsConverterToImageOptions](/page/python-net/aspose.page.plugins/psconvertertoimageoptions/) object with default options. |
| `PsConverterToImageOptions(image_format)` | Initializes a new instance of the PsConverterToImageOptions class |
| `PsConverterToImageOptions(size)` | Initializes a new instance of the PsConverterToImageOptions class |
| `PsConverterToImageOptions(image_format, size)` | Initializes a new instance of the PsConverterToImageOptions class |
## Properties
| Name | Description |
| :- | :- |
| `data_collection` | Returns PsConverterOptions plugin data collection. |
| `save_targets_collection` | Gets collection of added targets for saving operation results. |
| `operation_name` | Returns operation name. |
| `supress_errors` | Specifies whether errors must be suppressed or not.<br/>            If true suppressed errors are added to [None](/page/python-net/aspose.page.plugins/psconverteroptions/) list.<br/>            If false the first error will terminate the program. |
| `debug` | Specifies whether debug information must be printed to standard output stream or not. |
| `additional_fonts_folders` | Specifies additional folders where converter should find fonts for input document.<br/>            Default folder are standard fonts folder where OS finds fonts for internal needs. |
| `jpeg_quality_level` | The Quality category specifies the level of compression for an image.<br/>            Available values are 0 to 100. <br/>            The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>            0 value results in lowest quality image, while 100 results in highest. |
| `image_format` | Gets/sets the image type. |
| `size` | Gets/sets the size of the resulting image. |
| `resolution` | Gets/sets the image resolution. |
| `smoothing_mode` | Gets/sets the smoothing mode for rendering image. |
## Methods
| Name | Description |
| :- | :- |
| `add_data_source(data_source)` | Adds new data source to the PsConverter plugin data collection. |
| `add_save_data_source(save_data_source)` | Adds new data source to the PsConverterOptions plugin data collection. |

### See Also

* module [`aspose.page.plugins`](/page/python-net/aspose.page.plugins/)
* package [`aspose.page`](/page/python-net/)

