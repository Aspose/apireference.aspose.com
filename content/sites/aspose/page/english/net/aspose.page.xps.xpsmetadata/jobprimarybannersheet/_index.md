---
title: Class JobPrimaryBannerSheet
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet class. Describes the banner sheet to be output for the job. The banner sheet should be output on the default PageMediaSize and using the default PageMediaType. The banner sheet should be isolated from the remainder of the job. This means that any finishing or processing options such as JobDuplexAllDocumentsContiguously JobStapleAllDocuments or JobBindAllDocuments should not include the banner sheet. The banner sheet should occur as the first sheet of the job
type: docs
weight: 1690
url: /net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

Describes the banner sheet to be output for the job. The banner sheet should be output on the default [`PageMediaSize`](../pagemediasize/) and using the default [`PageMediaType`](../pagemediatype/). The banner sheet should be isolated from the remainder of the job. This means that any finishing or processing options (such as [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/), [`JobStapleAllDocuments`](../jobstaplealldocuments/), or [`JobBindAllDocuments`](../jobbindalldocuments/)) should not include the banner sheet. The banner sheet should occur as the first sheet of the job.

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | Creates a new instance. |

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
| class [BannerSheetOption](../../aspose.page.xps.xpsmetadata/jobprimarybannersheet.bannersheetoption) | Represents options of the `JobPrimaryBannerSheet` feature. |

### See Also

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


