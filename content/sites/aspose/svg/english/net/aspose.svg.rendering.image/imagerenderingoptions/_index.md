---
title: ImageRenderingOptions Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Image.ImageRenderingOptions class. Represents rendering options for ImageDevice. This options is used to specify output image format compression resolution etc
type: docs
weight: 4560
url: /net/aspose.svg.rendering.image/imagerenderingoptions/
---
## ImageRenderingOptions class

Represents rendering options for [`ImageDevice`](../imagedevice/). This options is used to specify output image format, compression, resolution etc.

```csharp
public class ImageRenderingOptions : RenderingOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageRenderingOptions](imagerenderingoptions/#constructor)() | Initializes a new instance of the `ImageRenderingOptions` class; Png will be used as default image format. |
| [ImageRenderingOptions](imagerenderingoptions/#constructor_1)(ImageFormat) | Initializes a new instance of the `ImageRenderingOptions` class with specified image format. |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.svg.rendering/renderingoptions/backgroundcolor/) { get; set; } | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [Compression](../../aspose.svg.rendering.image/imagerenderingoptions/compression/) { get; set; } | Sets or gets Tagged Image File Format (TIFF) [`Compression`](../compression/). By default this property is LZW. |
| [Css](../../aspose.svg.rendering/renderingoptions/css/) { get; } | Gets a [`CssOptions`](../../aspose.svg.rendering/cssoptions/) object which is used for configuration of css properties processing. |
| [Format](../../aspose.svg.rendering.image/imagerenderingoptions/format/) { get; set; } | Sets or gets [`ImageFormat`](../imageformat/). By default this property is Png. |
| override [HorizontalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/horizontalresolution/) { get; set; } | Sets or gets horizontal resolution for output and internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |
| [PageSetup](../../aspose.svg.rendering/renderingoptions/pagesetup/) { get; } | Gets a page setup object is used for configuration output page-set. |
| [SmoothingMode](../../aspose.svg.rendering.image/imagerenderingoptions/smoothingmode/) { get; set; } | Gets or sets the rendering quality for this Graphics. |
| [Text](../../aspose.svg.rendering.image/imagerenderingoptions/text/) { get; } | Gets a [`TextOptions`](../textoptions/) object which is used for configuration of text rendering. |
| override [VerticalResolution](../../aspose.svg.rendering.image/imagerenderingoptions/verticalresolution/) { get; set; } | Sets or gets vertical resolution for output and internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |

### See Also

* class [RenderingOptions](../../aspose.svg.rendering/renderingoptions/)
* namespace [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../)
