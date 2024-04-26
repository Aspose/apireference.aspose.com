---
title: Class PsConverterOptions
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Plugins.PsConverterOptions class. Represents options for PsConverter plugin
type: docs
weight: 800
url: /net/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class

Represents options for [`PsConverter`](../psconverter/) plugin.

```csharp
public class PsConverterOptions : IPluginOptions
```

## Properties

| Name | Description |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page.plugins/psconverteroptions/additionalfontsfolders/) { get; set; } | Specifies additional folders where converter should find fonts for input document. Default folder are standard fonts folder where OS finds fonts for internal needs. |
| [DataCollection](../../aspose.page.plugins/psconverteroptions/datacollection/) { get; } | Returns PsConverterOptions plugin data collection. |
| virtual [Debug](../../aspose.page.plugins/psconverteroptions/debug/) { get; set; } | Specifies whether debug information must be printed to standard output stream or not. |
| virtual [Exceptions](../../aspose.page.plugins/psconverteroptions/exceptions/) { get; set; } | Returns a list of suppressed conversion errors If !:SuppressErrors is true. |
| [JpegQualityLevel](../../aspose.page.plugins/psconverteroptions/jpegqualitylevel/) { get; set; } | The Quality category specifies the level of compression for an image. Available values are 0 to 100. The lower the number specified, the higher the compression and therefore the lower the quality of the image. 0 value results in lowest quality image, while 100 results in highest. |
| virtual [OperationName](../../aspose.page.plugins/psconverteroptions/operationname/) { get; } | Returns operation name. |
| [SaveTargetsCollection](../../aspose.page.plugins/psconverteroptions/savetargetscollection/) { get; } | Gets collection of added targets for saving operation results. |
| [SupressErrors](../../aspose.page.plugins/psconverteroptions/supresserrors/) { get; set; } | Specifies whether errors must be suppressed or not. If true suppressed errors are added to [`Exceptions`](./exceptions/) list. If false the first error will terminate the program. |

## Methods

| Name | Description |
| --- | --- |
| [AddDataSource](../../aspose.page.plugins/psconverteroptions/adddatasource/)(IDataSource) | Adds new data source to the PsConverter plugin data collection. |
| [AddSaveDataSource](../../aspose.page.plugins/psconverteroptions/addsavedatasource/)(IDataSource) | Adds new data source to the PsConverterOptions plugin data collection. |

### See Also

* interface [IPluginOptions](../ipluginoptions/)
* namespace [Aspose.Page.Plugins](../../aspose.page.plugins/)
* assembly [Aspose.Page](../../)


