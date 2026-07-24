---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class. Beschreibt die Locher‑Eigenschaften der Ausgabe. Jedes Dokument wird separat gelocht. Die Schlüsselwörter JobHolePunch und DocumentHolePunch schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket oder Print‑Capabilities‑Dokument angegeben werden.  in C++."
type: docs
weight: 1500
url: /de/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Beschreibt die Locher‑Eigenschaften der Ausgabe. Jedes Dokument wird separat gelocht. Die Schlüsselwörter [JobHolePunch](../jobholepunch/) und [DocumentHolePunch](./) schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem [PrintTicket](../printticket/) oder Print‑Capabilities‑Dokument angegeben werden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
