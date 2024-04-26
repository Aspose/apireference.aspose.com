---
title: Class PsConverterToImageOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Plugins.PsConverterToImageOptions class. Represents PS/EPS to Image converter options for PsConverter plugin
type: docs
weight: 810
url: /net/aspose.page.plugins/psconvertertoimageoptions/
---
## PsConverterToImageOptions class

Represents PS/EPS to Image converter options for [`PsConverter`](../psconverter/) plugin.

```csharp
public sealed class PsConverterToImageOptions : PsConverterOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PsConverterToImageOptions](psconvertertoimageoptions/#constructor)() | Initializes new instance of the `PsConverterToImageOptions` object with default options. |
| [PsConverterToImageOptions](psconvertertoimageoptions/#constructor_1)(ImageFormat) | Initializes new instance of the `PsConverterToImageOptions` object with image format. |
| [PsConverterToImageOptions](psconvertertoimageoptions/#constructor_3)(Size) | Initializes new instance of the `PsConverterToImageOptions` object with a size of the resulting image. |
| [PsConverterToImageOptions](psconvertertoimageoptions/#constructor_2)(ImageFormat, Size) | Initializes new instance of the `PsConverterToImageOptions` object with image format and a size of the resulting image. |

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page.plugins/psconverteroptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [DataCollection](../../aspose.page.plugins/psconverteroptions/datacollection/) { get; } | Returns PsConverterOptions plugin data collection. |
| virtual [Debug](../../aspose.page.plugins/psconverteroptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [Exceptions](../../aspose.page.plugins/psconverteroptions/exceptions/) { get; set; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [ImageFormat](../../aspose.page.plugins/psconvertertoimageoptions/imageformat/) { get; set; } | Gets/sets the image type. |
| [JpegQualityLevel](../../aspose.page.plugins/psconverteroptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| override [OperationName](../../aspose.page.plugins/psconvertertoimageoptions/operationname/) { get; } | Returns operation name. |
| [Resolution](../../aspose.page.plugins/psconvertertoimageoptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [SaveTargetsCollection](../../aspose.page.plugins/psconverteroptions/savetargetscollection/) { get; } | Gets collection of added targets for saving operation results. |
| [Size](../../aspose.page.plugins/psconvertertoimageoptions/size/) { get; set; } | Gets/sets the size of the resulting image. |
| [SmoothingMode](../../aspose.page.plugins/psconvertertoimageoptions/smoothingmode/) { get; set; } | Gets/sets the smoothing mode for rendering image. |
| [SupressErrors](../../aspose.page.plugins/psconverteroptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](../psconverteroptions/exceptions/) list. If false the first error will terminate the program. |

## Methods

| Name | Description |
| --- | --- |
| [AddDataSource](../../aspose.page.plugins/psconverteroptions/adddatasource/)(IDataSource) | Adds new data source to the PsConverter plugin data collection. |
| [AddSaveDataSource](../../aspose.page.plugins/psconverteroptions/addsavedatasource/)(IDataSource) | Adds new data source to the PsConverterOptions plugin data collection. |

### See Also

* class [PsConverterOptions](../psconverteroptions/)
* namespace [Aspose.Page.Plugins](../../aspose.page.plugins/)
* assembly [Aspose.Page](../../)


