---
title: PdfSaveOptions class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 20
url: /python-net/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---

## PdfSaveOptions class

Class for XPS-as-PDF saving options.

**Inheritance:** `PdfSaveOptions` → [`SaveOptions`](/page/python-net/aspose.page/saveoptions)

The PdfSaveOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PdfSaveOptions()` | Creates new instance of options. |
## Properties
| Name | Description |
| :- | :- |
| `supress_errors` | Specifies whether errors must be suppressed or not.<br/>            If true suppressed errors are added to [None](/page/python-net/aspose.page/saveoptions/) list.<br/>            If false the first error will terminate the program. |
| `size` | Gets/sets the size of the image. |
| `debug` | Specifies whether debug information must be printed to standard output stream or not. |
| `convert_fonts_to_ttf` | Specifies whether to save non-TrueType fonts to TTF.<br/>            It significantly decreases the volume of the resulting document in PS to PDF conversion<br/>            and increases the speed of conversion of PS files with a large quantity of text in non-TrueType fonts<br/>            to any output format. However there is small vertical shift of text when converting PostSctipt file to image. |
| `additional_fonts_folders` | Specifies additional folders where converter should find fonts for input document.<br/>            Default folder are standard fonts folder where OS finds fonts for internal needs. |
| `jpeg_quality_level` | The Quality category specifies the level of compression for an image.<br/>            Available values are 0 to 100. <br/>            The lower the number specified, the higher the compression and therefore the lower the quality of the image. <br/>            0 value results in lowest quality image, while 100 results in highest. |
| `page_numbers` | Gets/sets the array of numbers of pages to convert. |
| `outline_tree_height` | Specifies the height of the document outline tree to save.<br/>            0 - the outline tree will not be converted,<br/>            1 - only the first level outline items will be converted,<br/>            ans so on.<br/>            Default is 10. |
| `outline_tree_expansion_level` | Specifies up to what level the document outline should be expanded when the PDF file is opened in a viewer.<br/>            1 - only the first level outline items are shown,<br/>            2 - only the first and second level outline items are shown,<br/>            and so on.<br/>            Default is 1. |
| `text_compression` | Specifies compression type to be used for all content streams except images.<br/>            Default is [FLATE](/page/python-net/aspose.page.xps.presentation.pdf/pdftextcompression/). |
| `image_compression` | Specifies compression type to be used for all images in the document.<br/>            Default is [AUTO](/page/python-net/aspose.page.xps.presentation.pdf/pdfimagecompression/). |
| `encryption_details` | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| `preserve_text` | In XPS, some text elements may contain references to alternate glyph forms<br/>            that do not correspond to any character code in the font.<br/>            If this flag is set to true, the text from such XPS elements is converted to graphic shapes.<br/>            Then the text itself appears transparent on top. This leaves the text of such elements selectable.<br/>            But the side effect is that the output file may be much larger than the original.<br/>            If this flag is set to false, the characters that should be displayed as alternate forms<br/>            are replaced with some other characters that become mapped to the alternate glyph forms.<br/>            Therefore the text, although still selectable, will be modified and likely become unreadable.<br/>            Default is false. |
| `batch_size` | Specifies the size of a portion of pages to pass from node to node. |
| `before_page_saving_event_handlers` | The collection of event handlers that performs modifications to an XPS page just before it is saved. |

### See Also

* module [`aspose.page.xps.presentation.pdf`](/page/python-net/aspose.page.xps.presentation.pdf/)
* package [`aspose.page`](/page/python-net/)

