---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Beschreibt die vollständige Liste der unterstützten Behälter für das Gerät. Ermöglicht die Angabe des Ausgabebehälters pro Dokument. Die Schlüsselwörter JobOutputBin, DocumentOutputBin und PageOutputBin schließen sich gegenseitig aus; es sollte nur eines in einem PrintTicket‑ oder Print‑Capabilities‑Dokument angegeben werden.  in C++."
type: docs
weight: 2100
url: /de/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Beschreibt die vollständige Liste der unterstützten Behälter für das Gerät. Ermöglicht die Angabe des Ausgabebehälters pro Dokument. Die Schlüsselwörter [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) und [PageOutputBin](../pageoutputbin/) schließen sich gegenseitig aus; es sollte nur eines in einem [PrintTicket](../printticket/) oder Print‑Capabilities‑Dokument angegeben werden. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
