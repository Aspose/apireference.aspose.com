---
title: Class ImageDevice
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Presentation.Image.ImageDevice class. Class incapsulating image composing device
type: docs
weight: 1000
url: /net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Class incapsulating image composing device.

```csharp
[Obsolete("ImageDevice class is deprecated beginning from 24.3. Please use SaveAsImage method in XpsDocument class instead. In 24.6 this class will be entirely hidden")]
public class ImageDevice : Device, IMultiPageDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Creates the new instance. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Creates the new instance with specified media size. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Returns the absolute number of the current page within the document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Returns the relative number of the current page within the current partition. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Returns the resulting images byte arrays. The first dimension is for inner documents and the second one is for pages within inner documents. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Accomplishes the page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Accomplished the document partition. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Initializes numbers of pages to output. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Starts a new page with the specifies title. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Starts a new page with the specified width and height. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Starts a new document partition. |
| override [ToString](../../aspose.page/device/tostring/)() | Returns the name of device type. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Updates the current page parameters. |

### See Also

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* namespace [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* assembly [Aspose.Page](../../)


