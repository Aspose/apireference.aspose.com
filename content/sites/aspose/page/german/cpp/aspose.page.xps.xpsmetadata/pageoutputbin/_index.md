---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class"
linktitle: "PageOutputBin"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class. Beschreibt die vollständige Liste der unterstützten Behälter für das Gerät. Ermöglicht die Angabe des Ausgabebehälters pro Seite. Die Schlüsselwörter JobOutputBin, DocumentOutputBin und PageOutputBin schließen sich gegenseitig aus; es sollte nur eines in einem PrintTicket oder einem Print‑Capabilities‑Dokument angegeben werden.  in C++."
type: docs
weight: 11400
url: /de/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Beschreibt die vollständige Liste der unterstützten Behälter für das Gerät. Ermöglicht die Angabe des Ausgabebehälters pro Seite. Die Schlüsselwörter [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) und [PageOutputBin](./) schließen sich gegenseitig aus; es sollte nur eines in einem [PrintTicket](../printticket/) oder Print‑Capabilities‑Dokument angegeben werden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
