---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryCoverBack класс"
linktitle: "JobPrimaryCoverBack"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryCoverBack class. Описывает заднюю (конечную) обложку. Каждый задание будет иметь отдельный основной лист. Обложка должна печататься с использованием PageMediaSize и PageMediaType, применяемых для последней страницы задания. Обложка должна быть интегрирована в параметры обработки (например, JobDuplexAllDocumentsContiguously, JobNUpAllDocumentsContiguously) в соответствии с указанным параметром Option.  in C++."
type: docs
weight: 6600
url: /ru/cpp/aspose.page.xps.xpsmetadata/jobprimarycoverback/
---
## JobPrimaryCoverBack class


Описывает заднюю (конечную) обложку. Каждый задание будет иметь отдельный основной лист. Обложка должна печататься с использованием [PageMediaSize](../pagemediasize/) и [PageMediaType](../pagemediatype/) для последней страницы задания. Обложка должна быть интегрирована в параметры обработки (например, [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/), [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/)) в соответствии с указанным параметром [Option](../option/). [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback).

```cpp
class JobPrimaryCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Методы

| Метод | Описание |
| --- | --- |
| [JobPrimaryCoverBack](./jobprimarycoverback/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryCoverBack::CoverBackOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
