---
title: Class DocumentNUp
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp class. Describes the output and format of multiple logical pages to a single physical sheet. Each document is compiled separately
type: docs
weight: 960
url: /net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Describes the output and format of multiple logical pages to a single physical sheet. Each document is compiled separately.

```csharp
DocumentNUp
```

and [`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | Adds and option with a |

### See Also

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


