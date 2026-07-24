---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate класс"
linktitle: "DocumentCollate"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Описывает характеристики сортировки вывода. Все страницы в каждом отдельном документе сортируются. DocumentCollate и JobCollateAlldocuments являются взаимно исключающимися. Поведение и реализация того, реализованы ли оба или только один из этих ключевых слов, оставляются на усмотрение драйвера.  in C++."
type: docs
weight: 800
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Описывает характеристики сортировки вывода. Все страницы в каждом отдельном документе сортируются. [DocumentCollate](./) и JobCollateAlldocuments являются взаимно исключающимися. Поведение и реализация того, реализованы ли оба или только один из этих ключевых слов, оставляются на усмотрение драйвера. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
