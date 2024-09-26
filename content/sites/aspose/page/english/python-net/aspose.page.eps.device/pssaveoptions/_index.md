---
title: PsSaveOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.page.eps.device/pssaveoptions/
---

## PsSaveOptions class

This class contains options necessary for managing process of converting document to PostScript (PS) or Encapsulated PostScript (EPS) file.

**Inheritance:** `PsSaveOptions` → [`SaveOptions`](/page/python-net/aspose.page/saveoptions)

The PsSaveOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PsSaveOptions()` | Initializes a new instance of the [PsSaveOptions](/page/python-net/aspose.page.eps.device/pssaveoptions/) class with default values <br/>            for flags SuppressErrors (true) and Debug (false). |
| `PsSaveOptions(supress_errors)` | Initializes a new instance of the PsSaveOptions class |
## Properties
| Name | Description |
| :- | :- |
| `supress_errors` | Specifies whether errors must be suppressed or not.<br/>            If true suppressed errors are added to [None](/page/python-net/aspose.page/saveoptions/) list.<br/>            If false the first error will terminate the program. |
| `size` | Gets/sets the size of the image. |
| `debug` | Specifies whether debug information must be printed to standard output stream or not. |
| `additional_fonts_folders` | Specifies additional folders where converter should find fonts for input document.<br/>            Default folder are standard fonts folder where OS finds fonts for internal needs. |
| `jpeg_quality_level` | The Quality category specifies the level of compression for an image.<br/>            Available values are 0 to 100. <br/>            The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>            0 value results in lowest quality image, while 100 results in highest. |
| `save_format` | The save format of resulting file. |
| `page_size` | The size of the page. |
| `margins` | The margins of the page. |
| `background_color` | The background color. |
| `transparent` | Indicates if background is transparent. |
| `embed_fonts` | Indicates whether to embed used fonts in PS document. |
| `embed_fonts_as` | A type of font in which to embed fonts in PS document. |

### See Also

* module [`aspose.page.eps.device`](/page/python-net/aspose.page.eps.device/)
* package [`aspose.page`](/page/python-net/)

