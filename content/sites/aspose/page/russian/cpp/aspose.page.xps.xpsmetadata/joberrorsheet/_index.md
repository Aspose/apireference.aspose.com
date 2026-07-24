---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet класс"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet класс. Описывает вывод листа ошибки. Весь задание будет иметь один лист ошибки. Лист ошибки должен выводиться с размером страницы по умолчанию PageMediaSize и типом носителя по умолчанию PageMediaType. Лист ошибки должен быть изолирован от остальной части задания. Это означает, что любые опции завершения или обработки (например, JobDuplex, JobStaple или JobBinding) не должны включать лист ошибки. Лист ошибки должен быть последним листом задания.  на C++."
type: docs
weight: 5300
url: /ru/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Описывает вывод листа ошибки. Весь задание будет иметь один лист ошибки. Лист ошибки должен выводиться с размером страницы по умолчанию [PageMediaSize](../pagemediasize/) и типом носителя по умолчанию [PageMediaType](../pagemediatype/). Лист ошибки должен быть изолирован от остальной части задания. Это означает, что любые опции завершения или обработки (например, **JobDuplex**, **JobStaple**, или **JobBinding**) не должны включать лист ошибки. Лист ошибки должен быть последним листом задания. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Методы

| Метод | Описание |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
