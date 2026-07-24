---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch класс"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch класс. Описывает характеристики пробивки отверстий в выводе. Каждый документ пробивается отдельно. Ключевые слова JobHolePunch и DocumentHolePunch являются взаимно исключающимися. Оба не должны указываться одновременно в документе PrintTicket или Print Capabilities.  в C++."
type: docs
weight: 1500
url: /ru/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Описывает характеристики пробивки отверстий в выводе. Каждый документ пробивается отдельно. Ключевые слова [JobHolePunch](../jobholepunch/) и [DocumentHolePunch](./) являются взаимно исключающимися. Оба не должны указываться одновременно в документе [PrintTicket](../printticket/) или Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
