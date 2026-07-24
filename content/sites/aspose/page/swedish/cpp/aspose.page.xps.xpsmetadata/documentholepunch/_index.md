---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch-klass"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch-klass. Beskriver hålpunkteringskaraktäristiken för utskriften. Varje dokument hålpunkteras separat. Nyckelorden JobHolePunch och DocumentHolePunch är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett PrintTicket‑ eller Print Capabilities‑dokument.  i C++."
type: docs
weight: 1500
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Beskriver hålpunkteringskaraktäristiken för utskriften. Varje dokument hålpunkteras separat. Nyckelorden [JobHolePunch](../jobholepunch/) och [DocumentHolePunch](./) är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett [PrintTicket](../printticket/) eller Print Capabilities‑dokument. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
