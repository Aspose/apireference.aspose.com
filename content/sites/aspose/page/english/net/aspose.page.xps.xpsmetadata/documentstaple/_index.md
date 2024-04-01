---
title: Class DocumentStaple
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentStaple class. Describes the stapling characteristics of the output. Each document is stapled separately. The JobStapleAllDocuments and DocumentStaple keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https//docs.microsoft.com/enus/windows/win32/printdocs/documentstaple
type: docs
weight: 1120
url: /net/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class

Describes the stapling characteristics of the output. Each document is stapled separately. The [`JobStapleAllDocuments`](../jobstaplealldocuments/) and `DocumentStaple` keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple

```csharp
public sealed class DocumentStaple : Staple, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentStaple](documentstaple/)(params StapleOption[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |

### See Also

* class [Staple](../staple/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


