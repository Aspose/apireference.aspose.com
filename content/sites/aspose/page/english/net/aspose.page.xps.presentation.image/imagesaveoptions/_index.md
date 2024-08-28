---
title: Class ImageSaveOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Presentation.Image.ImageSaveOptions class. Basic class for XPSasimage saving options
type: docs
weight: 680
url: /net/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class

Basic class for XPS-as-image saving options.

```csharp
public abstract class ImageSaveOptions : SaveOptions, IEventBasedModificationOptions, 
    IPipelineOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/)() | Creates new instance of options. |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [BatchSize](../../aspose.page.xps.presentation.image/imagesaveoptions/batchsize/) { get; set; } | Specifies the size of a portion of pages to pass from node to node. |
| [BeforePageSavingEventHandlers](../../aspose.page.xps.presentation.image/imagesaveoptions/beforepagesavingeventhandlers/) { get; } | The collection of event handlers that performs modifications to an XPS page just before it is saved. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [ImageSize](../../aspose.page.xps.presentation.image/imagesaveoptions/imagesize/) { get; set; } | Gets/sets the size of the output images in pixels. |
| [InterpolationMode](../../aspose.page.xps.presentation.image/imagesaveoptions/interpolationmode/) { get; set; } | Gets/sets the interpolation mode. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| [PageNumbers](../../aspose.page.xps.presentation.image/imagesaveoptions/pagenumbers/) { get; set; } | Gets/sets the array of numbers of pages to convert. |
| [Resolution](../../aspose.page.xps.presentation.image/imagesaveoptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [Size](../../aspose.page/saveoptions/size/) { get; set; } | Gets/sets the size of the image. |
| [SmoothingMode](../../aspose.page.xps.presentation.image/imagesaveoptions/smoothingmode/) { get; set; } | Gets/sets the smoothing mode. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. If false the first error will terminate the program. |
| [TextRenderingHint](../../aspose.page.xps.presentation.image/imagesaveoptions/textrenderinghint/) { get; set; } | Gets/sets the text rendering hint. |

### See Also

* class [SaveOptions](../../aspose.page/saveoptions/)
* interface [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* interface [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* namespace [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* assembly [Aspose.Page](../../)


