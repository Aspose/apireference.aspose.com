---
title: ImageRenderingOptions class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 30
url: /aspose.svg.rendering.image/imagerenderingoptions/
is_root: false
---

## ImageRenderingOptions class

Represents rendering options for [`ImageDevice`](./aspose.svg.rendering.image/imagedevice). This options is used to specify output image format, compression, resolution etc.



**Inheritance:** [`ImageRenderingOptions`](./aspose.svg.rendering.image/imagerenderingoptions) → 
[`RenderingOptions`](./aspose.svg.rendering/renderingoptions)



The ImageRenderingOptions type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](./aspose.svg.rendering.image/imagerenderingoptions/__init__/#) | Initializes a new instance of the [`ImageRenderingOptions`](./aspose.svg.rendering.image/imagerenderingoptions) class; [`ImageFormat.PNG`](./aspose.svg.rendering.image/imageformat#PNG) will be used as default image format. |
| [__init__](./aspose.svg.rendering.image/imagerenderingoptions/__init__/#aspose.svg.rendering.image.ImageFormat) | Initializes a new instance of the [`ImageRenderingOptions`](./aspose.svg.rendering.image/imagerenderingoptions) class with specified image format. |


### Properties
| Property | Description |
| :- | :- |
| [css](./aspose.svg.rendering.image/imagerenderingoptions/css) | Gets a [`CssOptions`](./aspose.svg.rendering/cssoptions) object which is used for configuration of css properties processing. |
| [page_setup](./aspose.svg.rendering.image/imagerenderingoptions/page_setup) | Gets a page setup object is used for configuration output page-set. |
| [horizontal_resolution](./aspose.svg.rendering.image/imagerenderingoptions/horizontal_resolution) | Sets or gets the horizontal resolution for output and internal images, in pixels per inch (dpi). <br/>By default, this property is set to 300 dpi, which is used unless overridden by specific conditions.<br/>The resolution is always applied unless the Page size is set in pixels (px), in which case the default resolution is 96 dpi. |
| [background_color](./aspose.svg.rendering.image/imagerenderingoptions/background_color) | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [vertical_resolution](./aspose.svg.rendering.image/imagerenderingoptions/vertical_resolution) | Sets or gets the vertical resolution for output and internal images, in pixels per inch (dpi). <br/>By default, this property is set to 300 dpi, which is used unless overridden by specific conditions.<br/>The resolution is always applied unless the Page size is set in pixels (px), in which case the default resolution is 96 dpi. |
| [format](./aspose.svg.rendering.image/imagerenderingoptions/format) | Sets or gets [`ImageFormat`](./aspose.svg.rendering.image/imageformat). By default this property is [`ImageFormat.PNG`](./aspose.svg.rendering.image/imageformat#PNG). |
| [compression](./aspose.svg.rendering.image/imagerenderingoptions/compression) | Sets or gets Tagged Image File Format (TIFF) [`Compression`](./aspose.svg.rendering.image/compression). By default this property is [`Compression.LZW`](./aspose.svg.rendering.image/compression#LZW). |
| [text](./aspose.svg.rendering.image/imagerenderingoptions/text) | Gets a [`TextOptions`](./aspose.svg.rendering.image/textoptions) object which is used for configuration of text rendering. |
| [smoothing_mode](./aspose.svg.rendering.image/imagerenderingoptions/smoothing_mode) | Gets or sets the rendering quality for this Graphics. |



### See Also
* module [`aspose.svg.rendering.image`](..)
* class [`Compression`](./aspose.svg.rendering.image/compression)
* class [`CssOptions`](./aspose.svg.rendering/cssoptions)
* class [`ImageDevice`](./aspose.svg.rendering.image/imagedevice)
* class [`ImageFormat`](./aspose.svg.rendering.image/imageformat)
* class [`ImageRenderingOptions`](./aspose.svg.rendering.image/imagerenderingoptions)
* class [`RenderingOptions`](./aspose.svg.rendering/renderingoptions)
* class [`TextOptions`](./aspose.svg.rendering.image/textoptions)
