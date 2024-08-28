---
title: Class DocumentOutputBin
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin class. Describes the full list of supported bins for the device. Allows specification of output bin on a per document basis. The JobOutputBin DocumentOutputBin and PageOutputBin keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 1070
url: /net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Describes the full list of supported bins for the device. Allows specification of output bin on a per document basis. The [`JobOutputBin`](../joboutputbin/), `DocumentOutputBin` and [`PageOutputBin`](../pageoutputbin/) keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/), or a [`Property`](../property/) instance. |

### See Also

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


