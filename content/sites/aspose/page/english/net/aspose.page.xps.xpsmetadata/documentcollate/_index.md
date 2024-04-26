---
title: Class DocumentCollate
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate class. Describes the collating characteristics of the output. All pages in each individual document are collated. DocumentCollate and JobCollateAlldocuments are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcollate
type: docs
weight: 1260
url: /net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

Describes the collating characteristics of the output. All pages in each individual document are collated. DocumentCollate and JobCollateAlldocuments are mutually exclusive. The behavior and implementation of whether both or only one of these keywords is implemented is left to the driver. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |

### See Also

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


