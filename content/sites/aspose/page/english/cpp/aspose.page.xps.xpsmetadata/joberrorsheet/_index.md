---
title: Aspose::Page::XPS::XpsMetadata::JobErrorSheet class
linktitle: JobErrorSheet
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::JobErrorSheet class. Describes the error sheet output. The entire job will have a single error sheet. The error sheet should be output on the default PageMediaSize and using the default PageMediaType. The error sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as JobDuplex, JobStaple, or JobBinding) should not include the error sheet. The error sheet should occur as the final sheet of the job.  in C++.'
type: docs
weight: 5300
url: /cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Describes the error sheet output. The entire job will have a single error sheet. The error sheet should be output on the default [PageMediaSize](../pagemediasize/) and using the default [PageMediaType](../pagemediatype/). The error sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as **JobDuplex**, **JobStaple**, or **JobBinding**) should not include the error sheet. The error sheet should occur as the final sheet of the job. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Methods

| Method | Description |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
