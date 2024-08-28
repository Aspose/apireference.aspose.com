---
title: Class PageOutputBin
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin class. Describes the full list of supported bins for the device. Allows specification of output bin on a per page basis. The JobOutputBin DocumentOutputBin and PageOutputBin keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2660
url: /net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Describes the full list of supported bins for the device. Allows specification of output bin on a per page basis. The [`JobOutputBin`](../joboutputbin/), [`DocumentOutputBin`](../documentoutputbin/) and `PageOutputBin` keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Creates a new instance. |

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
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


