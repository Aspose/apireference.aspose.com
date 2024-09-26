---
title: PdfSaveOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 20
url: /python-net/aspose.page.eps.device/pdfsaveoptions/
---

## PdfSaveOptions class

This class contains input and output streams and other options necessary for managing conversion process.

**Inheritance:** `PdfSaveOptions` → [`SaveOptions`](/page/python-net/aspose.page/saveoptions)

The PdfSaveOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PdfSaveOptions()` | Initializes a new instance of the [PdfSaveOptions](/page/python-net/aspose.page.eps.device/pdfsaveoptions/) class with default values <br/>            for flags SuppressErrors (true) and Debug (false). |
| `PdfSaveOptions(supress_errors)` | Initializes a new instance of the PdfSaveOptions class |
| `PdfSaveOptions(size)` | Initializes a new instance of the PdfSaveOptions class |
| `PdfSaveOptions(supress_errors, size)` | Initializes a new instance of the PdfSaveOptions class |
## Properties
| Name | Description |
| :- | :- |
| `supress_errors` | Specifies whether errors must be suppressed or not.<br/>            If true suppressed errors are added to [None](/page/python-net/aspose.page/saveoptions/) list.<br/>            If false the first error will terminate the program. |
| `size` | Gets/sets the size of the image. |
| `debug` | Specifies whether debug information must be printed to standard output stream or not. |
| `additional_fonts_folders` | Specifies additional folders where converter should find fonts for input document.<br/>            Default folder are standard fonts folder where OS finds fonts for internal needs. |
| `jpeg_quality_level` | The Quality category specifies the level of compression for an image.<br/>            Available values are 0 to 100. <br/>            The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>            0 value results in lowest quality image, while 100 results in highest. |

### See Also

* module [`aspose.page.eps.device`](/page/python-net/aspose.page.eps.device/)
* package [`aspose.page`](/page/python-net/)

