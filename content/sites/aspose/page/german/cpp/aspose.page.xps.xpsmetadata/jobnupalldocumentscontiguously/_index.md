---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously Klasse"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously Klasse. Beschreibt die Ausgabe mehrerer logischer Seiten auf ein einzelnes physisches Blatt. Alle Dokumente im Auftrag werden zusammenhängend zusammengefasst. JobNUpAllDocumentsContiguously und DocumentNUp schließen sich gegenseitig aus. Es liegt am Treiber, die Einschränkungsbehandlung zwischen diesen Schlüsselwörtern zu bestimmen.  in C++."
type: docs
weight: 5900
url: /de/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Beschreibt die Ausgabe mehrerer logischer Seiten auf ein einzelnes physisches Blatt. Alle Dokumente im Auftrag werden zusammenhängend zusammengefasst. [JobNUpAllDocumentsContiguously](./) und [DocumentNUp](../documentnup/) schließen sich gegenseitig aus. Es liegt am Treiber, die Einschränkungsbehandlung zwischen diesen Schlüsselwörtern zu bestimmen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Fügt eine Option mit einem **PagesPerSheet**‑Scored‑Property‑Wert hinzu. Gibt die Anzahl der logischen Seiten pro physischem Blatt an. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
