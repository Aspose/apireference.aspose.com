---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin Klasse"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin Klasse. Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Die Schlüsselwörter JobInputBin, DocumentInputBin und PageInputBin schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket- oder Print‑Capabilities-Dokument angegeben werden.  in C++."
type: docs
weight: 1800
url: /de/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Die Schlüsselwörter [JobInputBin](../jobinputbin/), [DocumentInputBin](./) und [PageInputBin](../pageinputbin/) schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem [PrintTicket](../printticket/) oder Print‑Capabilities-Dokument angegeben werden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
