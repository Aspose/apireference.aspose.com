---
title: Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class
linktitle: JobPrimaryBannerSheet
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet class. Describes the banner sheet to be output for the job. The banner sheet should be output on the default PageMediaSize and using the default PageMediaType. The banner sheet should be isolated from the remainder of the job. This means that any finishing or processing options (such as JobDuplexAllDocumentsContiguously, JobStapleAllDocuments, or JobBindAllDocuments) should not include the banner sheet. The banner sheet should occur as the first sheet of the job in C++.'
type: docs
weight: 6400
url: /cpp/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class


Describes the banner sheet to be output for the job. The banner sheet should be output on the default [PageMediaSize](../pagemediasize/) and using the default [PageMediaType](../pagemediatype/). The banner sheet should be isolated from the remainder of the job. This means that any finishing or processing options (such as [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/), [JobStapleAllDocuments](../jobstaplealldocuments/), or [JobBindAllDocuments](../jobbindalldocuments/)) should not include the banner sheet. The banner sheet should occur as the first sheet of the job.

```cpp
class JobPrimaryBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                              public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Methods

| Method | Description |
| --- | --- |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryBannerSheet::BannerSheetOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
