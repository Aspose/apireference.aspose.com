---
title: Class DocumentCoverBack
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverBack class. Describes the back ending cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the PageMediaSize and PageMediaType used for the final page of the document. The cover sheet should be integrated into processing options such as DocumentDuplex DocumentNUp as indicated by the Option specified. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverback
type: docs
weight: 930
url: /net/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class

Describes the back (ending) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the [`PageMediaSize`](../pagemediasize/) and [`PageMediaType`](../pagemediatype/) used for the final page of the document. The cover sheet should be integrated into processing options (such as [`DocumentDuplex`](../documentduplex/), [`DocumentNUp`](../documentnup/)) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback

```csharp
public sealed class DocumentCoverBack : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentCoverBack](documentcoverback/)(params CoverBackOption[]) | Creates a new instance. |

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
| class [CoverBackOption](../../aspose.page.xps.xpsmetadata/documentcoverback.coverbackoption) | Describes the `DocumentCoverBack` feature options. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


