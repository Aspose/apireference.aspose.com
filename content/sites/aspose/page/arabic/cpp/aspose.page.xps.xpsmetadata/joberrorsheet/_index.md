---
title: "فئة Aspose::Page::XPS::XpsMetadata::JobErrorSheet"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::XpsMetadata::JobErrorSheet. يصف إخراج ورقة الخطأ. سيتضمن العمل بالكامل ورقة خطأ واحدة. يجب إخراج ورقة الخطأ على حجم الصفحة الافتراضي PageMediaSize وباستخدام نوع الصفحة الافتراضي PageMediaType. يجب عزل ورقة الخطأ عن باقي العمل. وهذا يعني أن أي خيارات إنهاء أو معالجة (مثل JobDuplex أو JobStaple أو JobBinding) يجب ألا تشمل ورقة الخطأ. يجب أن تكون ورقة الخطأ هي الورقة النهائية في العمل.  بلغة C++."
type: docs
weight: 5300
url: /ar/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


يصف إخراج ورقة الخطأ. سيتضمن العمل بالكامل ورقة خطأ واحدة. يجب إخراج ورقة الخطأ على [PageMediaSize](../pagemediasize/) الافتراضي وباستخدام [PageMediaType](../pagemediatype/) الافتراضي. يجب عزل ورقة الخطأ عن باقي العمل. وهذا يعني أن أي خيارات إنهاء أو معالجة (مثل **JobDuplex**، **JobStaple**، أو **JobBinding**) يجب ألا تشمل ورقة الخطأ. يجب أن تكون ورقة الخطأ هي الورقة النهائية في العمل. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
