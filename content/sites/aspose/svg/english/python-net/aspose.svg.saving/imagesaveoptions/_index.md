---
title: ImageSaveOptions class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.saving/imagesaveoptions/
is_root: false
---

## ImageSaveOptions class

Specific options data class.



**Inheritance:** [`ImageSaveOptions`](/svg/python-net/aspose.svg.saving/imagesaveoptions) → 
[`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions) → 
[`RenderingOptions`](/svg/python-net/aspose.svg.rendering/renderingoptions)



The ImageSaveOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/svg/python-net/aspose.svg.saving/imagesaveoptions/__init__/#) | Initializes a new instance of the [`ImageSaveOptions`](/svg/python-net/aspose.svg.saving/imagesaveoptions) class; [`ImageFormat.PNG`](/svg/python-net/aspose.svg.rendering.image/imageformat#PNG) will be used as default image format. |
| [__init__](/svg/python-net/aspose.svg.saving/imagesaveoptions/__init__/#aspose.svg.rendering.image.ImageFormat) | Image format [`ImageFormat`](/svg/python-net/aspose.svg.rendering.image/imageformat) based on initialization |


### Properties
| Property | Description |
| :- | :- |
| [css](/svg/python-net/aspose.svg.saving/imagesaveoptions/css) | Gets a [`CssOptions`](/svg/python-net/aspose.svg.rendering/cssoptions) object which is used for configuration of css properties processing. |
| [page_setup](/svg/python-net/aspose.svg.saving/imagesaveoptions/page_setup) | Gets a page setup object is used for configuration output page-set. |
| [horizontal_resolution](/svg/python-net/aspose.svg.saving/imagesaveoptions/horizontal_resolution) | Sets or gets the horizontal resolution for output and internal images, in pixels per inch (dpi). <br/>By default, this property is set to 300 dpi, which is used unless overridden by specific conditions.<br/>The resolution is always applied unless the Page size is set in pixels (px), in which case the default resolution is 96 dpi. |
| [background_color](/svg/python-net/aspose.svg.saving/imagesaveoptions/background_color) | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [vertical_resolution](/svg/python-net/aspose.svg.saving/imagesaveoptions/vertical_resolution) | Sets or gets the vertical resolution for output and internal images, in pixels per inch (dpi). <br/>By default, this property is set to 300 dpi, which is used unless overridden by specific conditions.<br/>The resolution is always applied unless the Page size is set in pixels (px), in which case the default resolution is 96 dpi. |
| [format](/svg/python-net/aspose.svg.saving/imagesaveoptions/format) | Sets or gets [`ImageFormat`](/svg/python-net/aspose.svg.rendering.image/imageformat). By default this property is [`ImageFormat.PNG`](/svg/python-net/aspose.svg.rendering.image/imageformat#PNG). |
| [compression](/svg/python-net/aspose.svg.saving/imagesaveoptions/compression) | Sets or gets Tagged Image File Format (TIFF) [`Compression`](/svg/python-net/aspose.svg.rendering.image/compression). By default this property is [`Compression.LZW`](/svg/python-net/aspose.svg.rendering.image/compression#LZW). |
| [text](/svg/python-net/aspose.svg.saving/imagesaveoptions/text) | Gets a [`TextOptions`](/svg/python-net/aspose.svg.rendering.image/textoptions) object which is used for configuration of text rendering. |
| [smoothing_mode](/svg/python-net/aspose.svg.saving/imagesaveoptions/smoothing_mode) | Gets or sets the rendering quality for this Graphics. |



### See Also
* module [`aspose.svg.saving`](..)
* class [`Compression`](/svg/python-net/aspose.svg.rendering.image/compression)
* class [`CssOptions`](/svg/python-net/aspose.svg.rendering/cssoptions)
* class [`ImageFormat`](/svg/python-net/aspose.svg.rendering.image/imageformat)
* class [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions)
* class [`ImageSaveOptions`](/svg/python-net/aspose.svg.saving/imagesaveoptions)
* class [`RenderingOptions`](/svg/python-net/aspose.svg.rendering/renderingoptions)
* class [`TextOptions`](/svg/python-net/aspose.svg.rendering.image/textoptions)
