---
title: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet class"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet class. يصف ورقة المحاسبة التي يجب إخراجها للوظيفة. يجب إخراج ورقة المحاسبة بحجم PageMediaSize الافتراضي وباستخدام نوع PageMediaType الافتراضي. يجب عزل ورقة المحاسبة عن باقي الوظيفة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل JobDuplex أو JobStaple أو JobBinding) يجب ألا تشمل ورقة المحاسبة. قد تظهر ورقة المحاسبة كأول صفحة أو آخر صفحة للوظيفة وفقًا لتقدير المنفذ''.  in C++."
type: docs
weight: 4400
url: /ar/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


يصف ورقة المحاسبة التي يجب إخراجها للوظيفة. يجب إخراج ورقة المحاسبة باستخدام حجم الصفحة الافتراضي [PageMediaSize](../pagemediasize/) واستخدام نوع وسائط الصفحة الافتراضي [PageMediaType](../pagemediatype/). يجب عزل ورقة المحاسبة عن باقي الوظيفة. هذا يعني أن أي خيارات إنهاء أو معالجة (مثل **JobDuplex**، **JobStaple**، أو **JobBinding**) يجب ألا تشمل ورقة المحاسبة. قد تظهر ورقة المحاسبة كأول أو آخر صفحة في الوظيفة وفقًا لتقدير المنفذ. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | ينشئ مثيلًا جديدًا. |
## انظر أيضًا

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
