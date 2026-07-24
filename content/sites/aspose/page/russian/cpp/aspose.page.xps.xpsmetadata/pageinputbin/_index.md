---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin класс"
linktitle: "PageInputBin"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin класс. Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет задавать входной лоток для каждой страницы. Ключевые слова JobInputBin, DocumentInputBin и PageInputBin являются взаимно исключающимися. Оба не должны указываться одновременно в документе PrintTicket или Print Capabilities.  в C++."
type: docs
weight: 10000
url: /ru/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Позволяет задавать входной лоток для каждой страницы. Ключевые слова [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) и [PageInputBin](./) являются взаимно исключающимися. Оба не должны указываться одновременно в документе [PrintTicket](../printticket/) или Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
