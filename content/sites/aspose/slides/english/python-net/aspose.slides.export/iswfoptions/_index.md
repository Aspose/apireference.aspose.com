---
title: ISwfOptions
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 340
url: /python-net/aspose.slides.export/iswfoptions/
---

## ISwfOptions class

Provides options that control how a presentation is saved in SWF format.

The ISwfOptions type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|compressed|Specifies whether the generated SWF document should be compressed or not.<br/>            Default is|
|viewer_included|Specifies whether the generated SWF document should include the integrated document viewer or not.<br/>            Default is|
|show_page_border|Specifies whether border around pages should be shown. Default is true.|
|show_hidden_slides|Specifies whether the generated document should include hidden slides or not.<br/>            Default is|
|show_full_screen|Show/hide fullscreen button. Can be overridden in flashvars. Default is true.|
|show_page_stepper|Show/hide page stepper. Can be overridden in flashvars. Default is true.|
|show_search|Show/hide search section. Can be overridden in flashvars. Default is true.|
|show_top_pane|Show/hide whole top pane. Can be overridden in flashvars. Default is true.|
|show_bottom_pane|Show/hide bottom pane. Can be overridden in flashvars. Default is true.|
|show_left_pane|Show/hide left pane. Can be overridden in flashvars. Default is true.|
|start_open_left_pane|Start with opened left pane. Can be overridden in flashvars. Default is false.|
|enable_context_menu|Enable/disable context menu. Default is true.|
|logo_image_bytes|Image that will be displayed as logo in the top right corner of the viewer.             <br/>            Image should be 32x64 pixels PNG image, otherwise logo can be displayed improperly.|
|logo_link|Gets or sets the full hyperlink address for a logo.<br/>            Has an effect only if a [logo_image_bytes](/slides/python-net/aspose.slides.export/iswfoptions/) is specified.|
|jpeg_quality|Specifies the quality of JPEG images.             <br/>            Default is 95.|
|notes_comments_layouting|Provides options that control how notes and comments is placed in exported document.|
|as_i_save_options|Returns ISaveOptions interface.<br/>            Read-only [ISaveOptions](/slides/python-net/aspose.slides.export/isaveoptions/).|
|warning_callback|Returns or sets an object which receives warnings and decides whether loading process will continue or will be aborted.<br/>            Read/write [IWarningCallback](/slides/python-net/aspose.slides.warnings/iwarningcallback/).|
|progress_callback|Represents a callback object for saving progress updates in percentage. <br/>            See [IProgressCallback](/slides/python-net/aspose.slides/iprogresscallback/).|
|default_regular_font|Returns or sets font used in case source font is not found.<br/>            Read-write string.|

### See Also

* namespace [aspose.slides.export](/slides/python-net/aspose.slides.export/)
* assembly [Aspose.Slides](/slides/python-net/)

