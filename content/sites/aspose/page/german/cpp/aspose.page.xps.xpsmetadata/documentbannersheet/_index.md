---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Beschreibt das Bannerblatt, das für ein bestimmtes Dokument ausgegeben werden soll. Das Bannerblatt sollte auf der Standard‑PageMediaSize und mit dem Standard‑PageMediaType ausgegeben werden. Das Bannerblatt sollte außerdem vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss‑ oder Verarbeitungsoptionen (wie DocumentDuplex, DocumentStaple oder DocumentBinding) das Bannerblatt einschließen sollten. Das Bannerblatt kann vom Rest des Auftrags isoliert sein oder nicht. Das bedeutet, dass Abschluss‑ oder Verarbeitungsoptionen des Auftrags das Dokumenten‑Bannerblatt einschließen können. Das Bannerblatt sollte als erstes Blatt des Dokuments erscheinen.  in C++."
type: docs
weight: 400
url: /de/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Beschreibt das Bannerblatt, das für ein bestimmtes Dokument ausgegeben werden soll. Das Bannerblatt sollte auf der Standard‑[PageMediaSize](../pagemediasize/) und mit dem Standard‑[PageMediaType](../pagemediatype/) ausgegeben werden. Das Bannerblatt sollte außerdem vom Rest des Auftrags isoliert sein. Das bedeutet, dass keine Abschluss‑ oder Verarbeitungsoptionen (wie [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), oder [DocumentBinding](../documentbinding/)) das Bannerblatt einschließen sollten. Das Bannerblatt kann vom Rest des Auftrags isoliert sein oder nicht. Das bedeutet, dass Abschluss‑ oder Verarbeitungsoptionen des Auftrags das Dokumenten‑Bannerblatt einschließen können. Das Bannerblatt sollte als erstes Blatt des Dokuments erscheinen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
