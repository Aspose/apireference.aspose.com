---
title: ImageSaveOptions Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Saving.ImageSaveOptions class. Specific options data class
type: docs
weight: 5680
url: /net/aspose.svg.saving/imagesaveoptions/
---
## ImageSaveOptions class

Specific options data class.

```csharp
public class ImageSaveOptions : ImageRenderingOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | Initializes a new instance of the `ImageSaveOptions` class; Png will be used as default image format. |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(*[ImageFormat](../../aspose.svg.rendering.image/imageformat/)*) | Image format [`ImageFormat`](../../aspose.svg.rendering.image/imageformat/) based on initialization |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.svg.rendering/renderingoptions/backgroundcolor/) { get; set; } | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [Compression](../../aspose.svg.rendering.image/imagerenderingoptions/compression/) { get; set; } | Sets or gets Tagged Image File Format (TIFF) [`Compression`](../../aspose.svg.rendering.image/compression/). By default this property is LZW. |
| [Css](../../aspose.svg.rendering/renderingoptions/css/) { get; } | Gets a [`CssOptions`](../../aspose.svg.rendering/cssoptions/) object which is used for configuration of css properties processing. |
| [Format](../../aspose.svg.rendering.image/imagerenderingoptions/format/) { get; set; } | Sets or gets [`ImageFormat`](../../aspose.svg.rendering.image/imageformat/). By default this property is Png. |
| override [HorizontalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/horizontalresolution/) { get; set; } | Sets or gets horizontal resolution for output and internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |
| [PageSetup](../../aspose.svg.rendering/renderingoptions/pagesetup/) { get; } | Gets a page setup object is used for configuration output page-set. |
| [Text](../../aspose.svg.rendering.image/imagerenderingoptions/text/) { get; } | Gets a [`TextOptions`](../../aspose.svg.rendering.image/textoptions/) object which is used for configuration of text rendering. |
| [UseAntialiasing](../../aspose.svg.rendering.image/imagerenderingoptions/useantialiasing/) { get; set; } | Specifies whether to use antialiasing. By default, antialiasing is enabled. |
| override [VerticalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/verticalresolution/) { get; set; } | Sets or gets vertical resolution for output and internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |

### See Also

* class [ImageRenderingOptions](../../aspose.svg.rendering.image/imagerenderingoptions/)
* namespace [Aspose.Svg.Saving](../../aspose.svg.saving/)
* assembly [Aspose.SVG](../../)
