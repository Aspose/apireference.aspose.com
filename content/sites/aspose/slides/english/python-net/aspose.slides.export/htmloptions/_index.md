---
title: HtmlOptions
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 90
url: /python-net/aspose.slides.export/htmloptions/
---

## HtmlOptions class

Represents a HTML exporting options.

The HtmlOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|HtmlOptions(link_embed_controller)|Initializes a new instance of the HtmlOptions class|
|HtmlOptions()|Creates a new HtmlOptions object for saving into single HTML file.|
## Properties
| Name | Description |
| :- | :- |
|warning_callback|Returns of sets an object which receives warnings and decides whether loading process will continue or will be aborted.<br/>            Read/write [IWarningCallback](/slides/python-net/aspose.slides.warnings/iwarningcallback/).|
|progress_callback|Represents a callback object for saving progress updates in percentage.<br/>            See [IProgressCallback](/slides/python-net/aspose.slides/iprogresscallback/).|
|default_regular_font|Returns or sets font used in case source font is not found.<br/>            Read-write string.|
|notes_comments_layouting|Provides options that control how notes and comments is placed in exported document.|
|show_hidden_slides|Specifies whether the generated document should include hidden slides or not.<br/>            Default is|
|html_formatter|Returns or sets HTML template.<br/>            Read/write [IHtmlFormatter](/slides/python-net/aspose.slides.export/ihtmlformatter/).|
|slide_image_format|Returns or sets slide image format options.<br/>            Read/write [ISlideImageFormat](/slides/python-net/aspose.slides.export/islideimageformat/).|
|jpeg_quality|Returns or sets a value determining the quality of the JPEG images inside PDF document.<br/>            Read/write int.|
|pictures_compression|Represents the pictures compression level|
|delete_pictures_cropped_areas|A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped <br/>            parts will removed, if false they will be serialized in the document (which can possible lead to a <br/>            larger file)|
|svg_responsive_layout|True to exclude width and height attributes from svg container - that will make layout responsive. False - otherwise.<br/>            Read/write bool.|
|as_i_save_options|Returns ISaveOptions interface.<br/>            Read-only [ISaveOptions](/slides/python-net/aspose.slides.export/isaveoptions/).|

### See Also

* namespace [aspose.slides.export](/slides/python-net/aspose.slides.export/)
* assembly [Aspose.Slides](/slides/python-net/)

