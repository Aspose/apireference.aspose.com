---
title: PdfSaveOptions class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
is_root: false
---

## PdfSaveOptions class

Class for XPS-as-PDF saving options.



**Inheritance:** [`PdfSaveOptions`](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions) → 
[`SaveOptions`](/page/python-net/aspose.page/saveoptions)



The PdfSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/__init__/#) | Creates new instance of options. |


### Properties
| Property | Description |
| :- | :- |
| [supress_errors](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/supress_errors) | Specifies whether errors must be suppressed or not.<br/>If true suppressed errors are added to [`SaveOptions.Exceptions`](/page/python-net/aspose.page/saveoptions) list.<br/>If false the first error will terminate the program. |
| [debug](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/debug) | Specifies whether debug information must be printed to standard output stream or not. |
| [additional_fonts_folders](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/additional_fonts_folders) | Specifies additional folders where converter should find fonts for input document.<br/>Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [jpeg_quality_level](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/jpeg_quality_level) | The Quality category specifies the level of compression for an image.<br/>Available values are 0 to 100. <br/>The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>0 value results in lowest quality image, while 100 results in highest. |
| [page_numbers](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/page_numbers) | Gets/sets the array of numbers of pages to convert. |
| [outline_tree_height](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/outline_tree_height) | Specifies the height of the document outline tree to save.<br/>0 - the outline tree will not be converted,<br/>1 - only the first level outline items will be converted,<br/>ans so on.<br/>Default is 10. |
| [outline_tree_expansion_level](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/outline_tree_expansion_level) | Specifies up to what level the document outline should be expanded when the PDF file is opened in a viewer.<br/>1 - only the first level outline items are shown,<br/>2 - only the first and second level outline items are shown,<br/>and so on.<br/>Default is 1. |
| [text_compression](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/text_compression) | Specifies compression type to be used for all content streams except images.<br/>Default is [`PdfTextCompression.FLATE`](/page/python-net/aspose.page.xps.presentation.pdf/pdftextcompression#FLATE). |
| [image_compression](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/image_compression) | Specifies compression type to be used for all images in the document.<br/>Default is [`PdfImageCompression.AUTO`](/page/python-net/aspose.page.xps.presentation.pdf/pdfimagecompression#AUTO). |
| [encryption_details](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/encryption_details) | Gets or sets a encryption details. If not set, then no encryption will be performed. |



### See Also
* module [`aspose.page.xps.presentation.pdf`](..)
* class [`PdfSaveOptions`](/page/python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions)
* class [`SaveOptions`](/page/python-net/aspose.page/saveoptions)
