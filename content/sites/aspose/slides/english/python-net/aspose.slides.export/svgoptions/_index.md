---
title: SVGOptions
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 480
url: /python-net/aspose.slides.export/svgoptions/
---

## SVGOptions class

Represents an SVG options.

The SVGOptions type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|SVGOptions()|Initializes a new instance of the SVGOptions class.|
|SVGOptions(link_embed_controller)|Initializes a new instance of the SVGOptions class|
## Properties
| Name | Description |
| :- | :- |
|warning_callback|Returns of sets an object which receives warnings and decides whether loading process will continue or will be aborted.<br/>            Read/write [IWarningCallback](/slides/python-net/aspose.slides.warnings/iwarningcallback/).|
|progress_callback|Represents a callback object for saving progress updates in percentage.<br/>            See [IProgressCallback](/slides/python-net/aspose.slides/iprogresscallback/).|
|default_regular_font|Returns or sets font used in case source font is not found.<br/>            Read-write string.|
|use_frame_size|Determines whether the text frame will be included in a rendering area or not.<br/>            Read/write bool.<br/>            Default value is false.|
|use_frame_rotation|Determines whether to perform the specified rotation of the shape when rendering or not.<br/>            Read/write bool.<br/>            Default value is true.|
|vectorize_text|Determines whether the text on a slide will be saved as graphics.<br/>            Read/write bool.|
|metafile_rasterization_dpi|Returns or sets the lower resolution limit for metafile rasterization.<br/>            Read/write|
|disable_3d_text|Determines whether the 3D text is disabled in SVG.<br/>            Read/write bool.|
|disable_gradient_split|Disables splitting FromCornerX and FromCenter gradients.<br/>            Read/write bool.|
|disable_line_end_cropping|SVG 1.1 lacks ability to define insets for markers.<br/>            Aspose.Slides SVG writing engine has workaround for that problem:<br/>            it crops end of line with arrow, so, line doesn't overlap markers.<br/>            This option switches off such behavior.<br/>            Read/write bool.|
|default|Returns default settings.<br/>            Read-only [SVGOptions](/slides/python-net/aspose.slides.export/svgoptions/).|
|simple|Returns settings for simpliest and smallest SVG file generation.<br/>            Read-only [SVGOptions](/slides/python-net/aspose.slides.export/svgoptions/).|
|wysiwyg|Returns settings for most accurate SVG file generation.<br/>            Read-only [SVGOptions](/slides/python-net/aspose.slides.export/svgoptions/).|
|jpeg_quality|Determines JPEG encoding quality.<br/>            Read/write|
|shape_formatting_controller|Returns and sets a callback interface which allows user to control shape conversion.<br/>            Read/write [ISvgShapeFormattingController](/slides/python-net/aspose.slides.export/isvgshapeformattingcontroller/).|
|pictures_compression|Represents the pictures compression level|
|delete_pictures_cropped_areas|A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped <br/>            parts will removed, if false they will be serialized in the document (which can possible lead to a <br/>            larger file)|
|external_fonts_handling|Determines a way of handling externally loaded fonts.<br/>            Read/write [SvgExternalFontsHandling](/slides/python-net/aspose.slides.export/svgexternalfontshandling/).|
|as_i_save_options|Returns ISaveOptions interface.<br/>            Read-only [ISaveOptions](/slides/python-net/aspose.slides.export/isaveoptions/).|

### See Also

* namespace [aspose.slides.export](/slides/python-net/aspose.slides.export/)
* assembly [Aspose.Slides](/slides/python-net/)

