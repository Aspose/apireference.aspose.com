---
title: PdfSaveOptions class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.tex.presentation.pdf/pdfsaveoptions/
is_root: false
---

## PdfSaveOptions class

Class representing options of saving to PDF.



**Inheritance:** [`PdfSaveOptions`](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions) → 
[`SaveOptions`](/tex/python-net/aspose.tex.presentation/saveoptions)



The PdfSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/__init__/#) | Creates new instance of options. |


### Properties
| Property | Description |
| :- | :- |
| [subset_fonts](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/subset_fonts) | Gets/sets the flag indicating whether to subset fonts in output file or not. |
| [rasterize_formulas](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/rasterize_formulas) | Gets/sets the flag that allows to rasterize math formulas. |
| [rasterize_included_graphics](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/rasterize_included_graphics) | Gets/sets the flag that allows to rasterize PS/EPS and/or XPS/OXPS included graphics. |
| [jpeg_quality_level](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/jpeg_quality_level) | The Quality category specifies the level of compression for an image.<br/>Available values are 0 to 100. <br/>The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>0 value results in lowest quality image, while 100 results in highest. |
| [outline_tree_height](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/outline_tree_height) | Specifies the height of the document outline tree to save.<br/>0 - the outline tree will not be converted,<br/>1 - only the first level outline items will be converted,<br/>ans so on. |
| [outline_tree_expansion_level](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/outline_tree_expansion_level) | Specifies up to what level the document outline should be expanded when the PDF file is viewed.<br/>1 - only the first level outline items are shown,<br/>2 - only the first and second level outline items are shown,<br/>and so on.<br/>Default is 1. |
| [text_compression](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/text_compression) | Specifies compression type to be used for all content streams except images.<br/>Default is [`PdfTextCompression.FLATE`](/tex/python-net/aspose.tex.presentation.pdf/pdftextcompression#FLATE). |
| [image_compression](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/image_compression) | Specifies compression type to be used for all images in the document.<br/>Default is [`PdfImageCompression.AUTO`](/tex/python-net/aspose.tex.presentation.pdf/pdfimagecompression#AUTO). |
| [encryption_details](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions/encryption_details) | Gets or sets a encryption details. If not set, then no encryption will be performed. |



### See Also
* module [`aspose.tex.presentation.pdf`](..)
* class [`PdfSaveOptions`](/tex/python-net/aspose.tex.presentation.pdf/pdfsaveoptions)
* class [`SaveOptions`](/tex/python-net/aspose.tex.presentation/saveoptions)
