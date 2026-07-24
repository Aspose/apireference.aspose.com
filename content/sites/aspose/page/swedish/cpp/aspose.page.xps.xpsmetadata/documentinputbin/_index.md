---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin-klass"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin-klass. Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödjade behållare för en enhet. Nyckelorden JobInputBin, DocumentInputBin och PageInputBin är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett PrintTicket- eller Print Capabilities-dokument.  i C++."
type: docs
weight: 1800
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödjade behållare för en enhet. Nyckelorden [JobInputBin](../jobinputbin/), [DocumentInputBin](./) och [PageInputBin](../pageinputbin/) är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett [PrintTicket](../printticket/) eller Print Capabilities-dokument. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
