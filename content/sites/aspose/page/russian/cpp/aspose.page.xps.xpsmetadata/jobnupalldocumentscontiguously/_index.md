---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously class. Описывает вывод нескольких логических страниц на один физический лист. Все документы в задании компилируются вместе последовательно. JobNUpAllDocumentsContiguously и DocumentNUp являются взаимно исключающимися. Обработка ограничений между этими ключевыми словами зависит от драйвера.  в C++."
type: docs
weight: 5900
url: /ru/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Описывает вывод нескольких логических страниц на один физический лист. Все документы в задании компилируются вместе последовательно. [JobNUpAllDocumentsContiguously](./) и [DocumentNUp](../documentnup/) являются взаимно исключающимися. Обработка ограничений между этими ключевыми словами зависит от драйвера. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Добавляет параметр со значением scored‑свойства **PagesPerSheet**. Указывает количество логических страниц на один физический лист. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
