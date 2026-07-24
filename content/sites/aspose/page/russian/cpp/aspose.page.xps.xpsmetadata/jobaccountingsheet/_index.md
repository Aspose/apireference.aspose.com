---
title: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet класс"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet класс. Описывает лист учёта, который выводится для задания. Лист учёта должен выводиться с использованием размеров PageMediaSize по умолчанию и типа PageMediaType по умолчанию. Лист учёта должен быть изолирован от остальной части задания. Это означает, что любые варианты отделки или обработки (например, JobDuplex, JobStaple или JobBinding) не должны включать лист учёта. Лист учёта может располагаться как первая, так и последняя страница задания по усмотрению реализующего.  на C++."
type: docs
weight: 4400
url: /ru/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


Описывает лист учёта, который должен быть выведен для задания. Лист учёта должен выводиться с использованием значения по умолчанию [PageMediaSize](../pagemediasize/) и значения по умолчанию [PageMediaType](../pagemediatype/). Лист учёта должен быть изолирован от остальной части задания. Это означает, что любые варианты отделки или обработки (например, **JobDuplex**, **JobStaple** или **JobBinding**) не должны включать лист учёта. Лист учёта может располагаться первой или последней страницей задания по усмотрению реализующего. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
