---
title: "Класс Aspose::Page::XPS::XpsMetadata::DocumentInputBin"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::XPS::XpsMetadata::DocumentInputBin. Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Ключевые слова JobInputBin, DocumentInputBin и PageInputBin являются взаимно исключающимися. Оба не должны указываться одновременно в документе PrintTicket или документе возможностей печати.  в C++."
type: docs
weight: 1800
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Описывает установленный входной лоток в устройстве или полный список поддерживаемых лотков для устройства. Ключевые слова [JobInputBin](../jobinputbin/), [DocumentInputBin](./) и [PageInputBin](../pageinputbin/) являются взаимно исключающимися. Оба не должны указываться одновременно в документе [PrintTicket](../printticket/) или документе возможностей печати. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
