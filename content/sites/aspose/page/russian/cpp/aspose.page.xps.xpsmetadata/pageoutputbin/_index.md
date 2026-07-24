---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin класс"
linktitle: "PageOutputBin"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin класс. Описывает полный список поддерживаемых лотков для устройства. Позволяет задавать выходной лоток для каждой страницы. Ключевые слова JobOutputBin, DocumentOutputBin и PageOutputBin являются взаимно исключающимися; только одно должно быть указано в документе PrintTicket или Print Capabilities.  в C++."
type: docs
weight: 11400
url: /ru/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Описывает полный список поддерживаемых лотков для устройства. Позволяет задавать выходной лоток для каждой страницы. Ключевые слова [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) и [PageOutputBin](./) являются взаимно исключающимися; только одно должно быть указано в документе [PrintTicket](../printticket/) или Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
