---
title: Aspose::Page::XPS::XpsMetadata::JobAccountingSheet class
linktitle: JobAccountingSheet
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobAccountingSheet class. Describes the accounting sheet to be output for the job. The accounting sheet should be output on the default PageMediaSize and using the default PageMediaType. The accounting sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as JobDuplex, JobStaple, or JobBinding) should not include the accounting sheet. The accounting sheet may occur as the first or last page of the job at the implementer''s discretion.  in C++.'
type: docs
weight: 4400
url: /cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Describes the accounting sheet to be output for the job. The accounting sheet should be output on the default [PageMediaSize](../pagemediasize/) and using the default [PageMediaType](../pagemediatype/). The accounting sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as **JobDuplex**, **JobStaple**, or **JobBinding**) should not include the accounting sheet. The accounting sheet may occur as the first or last page of the job at the implementer's discretion. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Methods

| Method | Description |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
