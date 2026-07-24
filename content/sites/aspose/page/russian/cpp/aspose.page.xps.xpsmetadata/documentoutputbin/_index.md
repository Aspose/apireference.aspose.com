---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin класс"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Описывает полный список поддерживаемых лотков для устройства. Позволяет задавать лоток вывода для каждого документа отдельно. Ключевые слова JobOutputBin, DocumentOutputBin и PageOutputBin являются взаимно исключающимися; только одно должно быть указано в документе PrintTicket или Print Capabilities. на C++."
type: docs
weight: 2100
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Описывает полный список поддерживаемых лотков для устройства. Позволяет задавать лоток вывода для каждого документа отдельно. Ключевые слова [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) и [PageOutputBin](../pageoutputbin/) являются взаимно исключающимися; только одно должно быть указано в документе [PrintTicket](../printticket/) или Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
