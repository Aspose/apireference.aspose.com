---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp Klasse"
linktitle: "DocumentNUp"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp Klasse. Beschreibt die Ausgabe und das Format mehrerer logischer Seiten auf einem einzelnen physischen Blatt. Jedes Dokument wird separat zusammengestellt. DocumentNUp und JobNUpAllDocumentsContiguously schließen sich gegenseitig aus. Es liegt am Treiber, die Einschränkungsbehandlung zwischen diesen Schlüsselwörtern zu bestimmen.  in C++."
type: docs
weight: 2000
url: /de/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Beschreibt die Ausgabe und das Format mehrerer logischer Seiten auf einem einzelnen physischen Blatt. Jedes Dokument wird separat zusammengestellt. **[DocumentNUp](./)** und [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) schließen sich gegenseitig aus. Es liegt am Treiber, die Einschränkungsbehandlung zwischen diesen Schlüsselwörtern zu bestimmen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Fügt eine Option mit einem **PagesPerSheet**‑Scored‑Property‑Wert hinzu. Gibt die Anzahl der logischen Seiten pro physischem Blatt an. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
