---
title: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex класс"
linktitle: "DocumentDuplex"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentDuplex class. Описывает характеристики дуплекса вывода. Функция дуплекса позволяет печатать с обеих сторон носителя. Каждый документ дуплексируется отдельно. DocumentDuplex и JobDuplexAllDocumentsContiguously являются взаимно исключающимися. Обработка ограничений между этими ключевыми словами определяется драйвером.  in C++."
type: docs
weight: 1400
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Описывает характеристики дуплекса вывода. Функция дуплекса позволяет печатать с обеих сторон носителя. Каждый документ дуплексируется отдельно. [DocumentDuplex](./) и [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) являются взаимно исключающимися. Обработка ограничений между этими ключевыми словами определяется драйвером. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
