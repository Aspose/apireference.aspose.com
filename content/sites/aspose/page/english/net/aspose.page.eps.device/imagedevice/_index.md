---
title: Class ImageDevice
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.Device.ImageDevice class. This class encapsulates rendering of document to image
type: docs
weight: 430
url: /net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

This class encapsulates rendering of document to image.

```csharp
[Obsolete("ImageDevice class is deprecated beginning from 24.3. Please use SaveAsImage method in PsDocument class instead. In 24.6 this class will be entirely hidden")]
public class ImageDevice : Device, IMultiPageDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Initializes new instance of `ImageDevice`. |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | Initializes new instance of `ImageDevice` with specified image format. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | Initializes new instance of `ImageDevice` with specified size of a page. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | Initializes new instance of `ImageDevice` with specified size of a page and image format. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | Current page number. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | Returns resulting images in bytes, one byte array for one page. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | Makes necessary preparation of the device after page has been rendered. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | Initializes numbers of pages to output. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | Returns the name of device type. |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | "Background color" property key. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | "Embed font in document" property key. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | "Fit content to page" property key. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | "Page margins" property key. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | "Page size" property key. |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | "Producer" property value. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | "Transparent" property key. |

### See Also

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assembly [Aspose.Page](../../)


