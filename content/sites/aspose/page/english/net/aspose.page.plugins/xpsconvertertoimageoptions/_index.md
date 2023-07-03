---
title: Class XpsConverterToImageOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Plugins.XpsConverterToImageOptions class. Represents XPS to Image converter options for XpsConverter plugin
type: docs
weight: 490
url: /net/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class

Represents XPS to Image converter options for [`XpsConverter`](../xpsconverter/) plugin.

```csharp
public sealed class XpsConverterToImageOptions : XpsConverterOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [XpsConverterToImageOptions](xpsconvertertoimageoptions/#constructor)() | Initializes new instance of the `XpsConverterToImageOptions` object with default options. |
| [XpsConverterToImageOptions](xpsconvertertoimageoptions/#constructor_1)(ImageFormat) | Initializes new instance of the `XpsConverterToImageOptions` object with image format. |
| [XpsConverterToImageOptions](xpsconvertertoimageoptions/#constructor_3)(Size) | Initializes new instance of the `XpsConverterToImageOptions` object with a size of the resulting image. |
| [XpsConverterToImageOptions](xpsconvertertoimageoptions/#constructor_2)(ImageFormat, Size) | Initializes new instance of the `XpsConverterToImageOptions` object with image format and a size of the resulting image. |

## Properties

| Name | Description |
| --- | --- |
| [DataCollection](../../aspose.page.plugins/xpsconverteroptions/datacollection/) { get; } | Returns XpsConverterOptions plugin data collection. |
| [ImageFormat](../../aspose.page.plugins/xpsconvertertoimageoptions/imageformat/) { get; set; } | Gets/sets the image type. |
| [JpegQualityLevel](../../aspose.page.plugins/xpsconverteroptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| override [OperationName](../../aspose.page.plugins/xpsconvertertoimageoptions/operationname/) { get; } | Returns operation name. |
| [PageNumbers](../../aspose.page.plugins/xpsconvertertoimageoptions/pagenumbers/) { get; set; } | Gets/sets the array of numbers of pages in XPS document to convert. If not set all pages will be converted. |
| [Resolution](../../aspose.page.plugins/xpsconvertertoimageoptions/resolution/) { get; set; } | Gets/sets the image resolution. |
| [SaveTargetsCollection](../../aspose.page.plugins/xpsconverteroptions/savetargetscollection/) { get; } | Gets collection of added targets for saving operation results. |
| [Size](../../aspose.page.plugins/xpsconvertertoimageoptions/size/) { get; set; } | Gets/sets the size of the resulting image. |
| [SmoothingMode](../../aspose.page.plugins/xpsconvertertoimageoptions/smoothingmode/) { get; set; } | Gets/sets the smoothing mode for rendering image. |

## Methods

| Name | Description |
| --- | --- |
| [AddDataSource](../../aspose.page.plugins/xpsconverteroptions/adddatasource/)(IDataSource) | Adds new data source to the XpsConverter plugin data collection. |
| [AddSaveDataSource](../../aspose.page.plugins/xpsconverteroptions/addsavedatasource/)(IDataSource) | Adds new data source to the XpsConverterOptions plugin data collection. |

### See Also

* class [XpsConverterOptions](../xpsconverteroptions/)
* namespace [Aspose.Page.Plugins](../../aspose.page.plugins/)
* assembly [Aspose.Page](../../)


