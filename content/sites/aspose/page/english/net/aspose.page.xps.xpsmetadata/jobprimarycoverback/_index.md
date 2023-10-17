---
title: Class JobPrimaryCoverBack
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryCoverBack class. Describes the back ending cover sheet. Each job will have a separate primary sheet. The cover sheet should be printed on the PageMediaSize and PageMediaType used for the final page of the job. The cover sheet should be integrated into processing options such as JobDuplexAllDocumentsContiguously JobNUpAllDocumentsContiguously as indicated by the Option specified. https//docs.microsoft.com/enus/windows/win32/printdocs/jobprimarycoverback
type: docs
weight: 1730
url: /net/aspose.page.xps.xpsmetadata/jobprimarycoverback/
---
## JobPrimaryCoverBack class

Describes the back (ending) cover sheet. Each job will have a separate primary sheet. The cover sheet should be printed on the [`PageMediaSize`](../pagemediasize/) and [`PageMediaType`](../pagemediatype/) used for the final page of the job. The cover sheet should be integrated into processing options (such as [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/), [`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/)) as indicated by the Option specified. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback

```csharp
public sealed class JobPrimaryCoverBack : Feature, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [JobPrimaryCoverBack](jobprimarycoverback/)(params CoverBackOption[]) | Creates a new instance. |

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
| class [CoverBackOption](../../aspose.page.xps.xpsmetadata/jobprimarycoverback.coverbackoption) | Describes the `JobPrimaryCoverBack` feature options. |

### See Also

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)


