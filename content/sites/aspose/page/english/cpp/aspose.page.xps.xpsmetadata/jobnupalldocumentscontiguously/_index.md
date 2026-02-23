---
title: Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class
linktitle: JobNUpAllDocumentsContiguously
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class. Describes the output of multiple logical pages to a single physical sheet. All documents in the job are compiled together contiguously. JobNUpAllDocumentsContiguously and DocumentNUp are mutually exclusive. It is up to the driver to determine constraint handling between these keywords.  in C++.'
type: docs
weight: 5900
url: /cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Describes the output of multiple logical pages to a single physical sheet. All documents in the job are compiled together contiguously. [JobNUpAllDocumentsContiguously](./) and [DocumentNUp](../documentnup/) are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Adds and option with a **PagesPerSheet** scored property value. Specifies the number of logical pages per physical sheet. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Creates a new instance. |
## See Also

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
