---
title: Class DocumentCoverFront
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverFront class. Describes the front beginning cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the PageMediaSize and PageMediaType used for the first page of the document. The cover sheet should be integrated into processing options such as DocumentDuplex DocumentNUp as indicated by the Option specified. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverfront
type: docs
weight: 890
url: /net/aspose.page.xps.xpsmetadata/documentcoverfront/
---
## DocumentCoverFront class

Describes the front (beginning) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the [`PageMediaSize`](../pagemediasize/) and [`PageMediaType`](../pagemediatype/) used for the first page of the document. The cover sheet should be integrated into processing options (such as [`DocumentDuplex`](../documentduplex/), [`DocumentNUp`](../documentnup/)) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront

```csharp
public sealed class DocumentCoverFront : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentCoverFront](documentcoverfront/)(params CoverFrontOption[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |

## Other Members

| Name | Description |
| --- | --- |
| class [CoverFrontOption](../../aspose.page.xps.xpsmetadata/documentcoverfront.coverfrontoption) | Describes the `DocumentCoverFront` feature options. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


