---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class"
linktitle: "DocumentStaple"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class. Описывает характеристики скрепления вывода. Каждый документ скрепляется отдельно. Ключевые слова JobStapleAllDocuments и DocumentStaple являются взаимоисключающими. Обработка ограничений между этими ключевыми словами определяется драйвером.  in C++."
type: docs
weight: 2600
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Описывает характеристики скрепления вывода. Каждый документ скрепляется отдельно. Ключевые слова [JobStapleAllDocuments](../jobstaplealldocuments/) и [DocumentStaple](./) являются взаимоисключающими. Обработка ограничений между этими ключевыми словами определяется драйвером. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
