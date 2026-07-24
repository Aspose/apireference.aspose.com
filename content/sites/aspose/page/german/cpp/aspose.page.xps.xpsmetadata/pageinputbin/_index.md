---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin Klasse"
linktitle: "PageInputBin"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin Klasse. Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Seite. Die Schlüsselwörter JobInputBin, DocumentInputBin und PageInputBin schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem PrintTicket- oder Print‑Capabilities-Dokument angegeben werden.  in C++."
type: docs
weight: 10000
url: /de/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Beschreibt das installierte Eingabefach in einem Gerät oder die vollständige Liste der unterstützten Fächer für ein Gerät. Ermöglicht die Angabe des Eingabefachs pro Seite. Die Schlüsselwörter [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) und [PageInputBin](./) schließen sich gegenseitig aus. Beide sollten nicht gleichzeitig in einem [PrintTicket](../printticket/) oder Print‑Capabilities-Dokument angegeben werden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
