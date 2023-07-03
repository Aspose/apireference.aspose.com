---
title: Class DocumentBannerSheet
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet class. Describes the banner sheet to be output for a particular document. The banner sheet should be output on the default PageMediaSize and using the default PageMediaType. The banner sheet should be also isolated from the remainder of the job. This means that any finishing or processing options such as DocumentDuplex DocumentStaple or DocumentBinding should not include the banner sheet. The banner sheet may or may not be isolated from the remainder of the job. This means that any job finishing or processing options may include the document banner sheet. The banner sheet should occur as the first sheet of the document. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 750
url: /net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Describes the banner sheet to be output for a particular document. The banner sheet should be output on the default [`PageMediaSize`](../pagemediasize/) and using the default [`PageMediaType`](../pagemediatype/). The banner sheet should be also isolated from the remainder of the job. This means that any finishing or processing options (such as [`DocumentDuplex`](../documentduplex/), [`DocumentStaple`](../documentstaple/), or [`DocumentBinding`](../documentbinding/)) should not include the banner sheet. The banner sheet may or may not be isolated from the remainder of the job. This means that any job finishing or processing options, may include the document banner sheet. The banner sheet should occur as the first sheet of the document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Creates a new instance. |

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
| class [BannerSheetOption](../../aspose.page.xps.xpsmetadata/documentbannersheet.bannersheetoption) | Represents options of the `DocumentBannerSheet` feature. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


