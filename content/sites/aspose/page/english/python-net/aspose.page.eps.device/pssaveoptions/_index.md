---
title: PsSaveOptions class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.page.eps.device/pssaveoptions/
is_root: false
---

## PsSaveOptions class

This class contains options necessary for managing process of converting document to PostScript (PS) or Encapsulated PostScript (EPS) file.



**Inheritance:** [`PsSaveOptions`](/page/python-net/aspose.page.eps.device/pssaveoptions) → 
[`SaveOptions`](/page/python-net/aspose.page/saveoptions)



The PsSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.eps.device/pssaveoptions/__init__/#) | Initializes a new instance of the [`PsSaveOptions`](/page/python-net/aspose.page.eps.device/pssaveoptions) class with default values <br/>for flags SuppressErrors (true) and Debug (false). |
| [__init__](/page/python-net/aspose.page.eps.device/pssaveoptions/__init__/#bool) | Initializes a new instance of the [`PsSaveOptions`](/page/python-net/aspose.page.eps.device/pssaveoptions) class with default values for flag Debug (false). |


### Properties
| Property | Description |
| :- | :- |
| [supress_errors](/page/python-net/aspose.page.eps.device/pssaveoptions/supress_errors) | Specifies whether errors must be suppressed or not.<br/>If true suppressed errors are added to [`SaveOptions.Exceptions`](/page/python-net/aspose.page/saveoptions) list.<br/>If false the first error will terminate the program. |
| [debug](/page/python-net/aspose.page.eps.device/pssaveoptions/debug) | Specifies whether debug information must be printed to standard output stream or not. |
| [additional_fonts_folders](/page/python-net/aspose.page.eps.device/pssaveoptions/additional_fonts_folders) | Specifies additional folders where converter should find fonts for input document.<br/>Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [jpeg_quality_level](/page/python-net/aspose.page.eps.device/pssaveoptions/jpeg_quality_level) | The Quality category specifies the level of compression for an image.<br/>Available values are 0 to 100. <br/>The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>0 value results in lowest quality image, while 100 results in highest. |
| [page_size](/page/python-net/aspose.page.eps.device/pssaveoptions/page_size) | The size of the page. |
| [margins](/page/python-net/aspose.page.eps.device/pssaveoptions/margins) | The margins of the page. |
| [background_color](/page/python-net/aspose.page.eps.device/pssaveoptions/background_color) | The background color. |
| [transparent](/page/python-net/aspose.page.eps.device/pssaveoptions/transparent) | Indicates if background is transparent. |
| [embed_fonts](/page/python-net/aspose.page.eps.device/pssaveoptions/embed_fonts) | Indicates whether to embed used fonts in PS document. |
| [embed_fonts_as](/page/python-net/aspose.page.eps.device/pssaveoptions/embed_fonts_as) | A type of font in which to embed fonts in PS document. |



### See Also
* module [`aspose.page.eps.device`](..)
* class [`PsSaveOptions`](/page/python-net/aspose.page.eps.device/pssaveoptions)
* class [`SaveOptions`](/page/python-net/aspose.page/saveoptions)
