---
title: PdfSaveOptions class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.page.eps.device/pdfsaveoptions/
is_root: false
---

## PdfSaveOptions class

This class contains input and output streams and other options necessary for managing conversion process.



**Inheritance:** [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions) → 
[`SaveOptions`](/page/python-net/aspose.page/saveoptions)



The PdfSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.eps.device/pdfsaveoptions/__init__/#) | Initializes a new instance of the [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions) class with default values <br/>for flags SuppressErrors (true) and Debug (false). |
| [__init__](/page/python-net/aspose.page.eps.device/pdfsaveoptions/__init__/#bool) | Initializes a new instance of the [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions) class with default values for flag Debug (false). |
| [__init__](/page/python-net/aspose.page.eps.device/pdfsaveoptions/__init__/#aspose.page.drawing.Size) | Initializes a new instance of the [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions) with<br/>with specified size of the page. |
| [__init__](/page/python-net/aspose.page.eps.device/pdfsaveoptions/__init__/#bool-aspose.page.drawing.Size) | Initializes a new instance of the [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions) class with default values for flag Debug (false) and with specified size of the page. |


### Properties
| Property | Description |
| :- | :- |
| [supress_errors](/page/python-net/aspose.page.eps.device/pdfsaveoptions/supress_errors) | Specifies whether errors must be suppressed or not.<br/>If true suppressed errors are added to [`SaveOptions.Exceptions`](/page/python-net/aspose.page/saveoptions) list.<br/>If false the first error will terminate the program. |
| [size](/page/python-net/aspose.page.eps.device/pdfsaveoptions/size) | Gets/sets the size of the image. |
| [debug](/page/python-net/aspose.page.eps.device/pdfsaveoptions/debug) | Specifies whether debug information must be printed to standard output stream or not. |
| [additional_fonts_folders](/page/python-net/aspose.page.eps.device/pdfsaveoptions/additional_fonts_folders) | Specifies additional folders where converter should find fonts for input document.<br/>Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [jpeg_quality_level](/page/python-net/aspose.page.eps.device/pdfsaveoptions/jpeg_quality_level) | The Quality category specifies the level of compression for an image.<br/>Available values are 0 to 100. <br/>The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>0 value results in lowest quality image, while 100 results in highest. |



### See Also
* module [`aspose.page.eps.device`](..)
* class [`PdfSaveOptions`](/page/python-net/aspose.page.eps.device/pdfsaveoptions)
* class [`SaveOptions`](/page/python-net/aspose.page/saveoptions)
