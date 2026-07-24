---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously klasse"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously klasse. Beschrijft de uitvoer van meerdere logische pagina's naar één fysiek vel. Alle documenten in de taak worden aaneengesloten samengevoegd. JobNUpAllDocumentsContiguously en DocumentNUp zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels voor beperkingen tussen deze sleutelwoorden te bepalen.  in C++."
type: docs
weight: 5900
url: /nl/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Beschrijft de uitvoer van meerdere logische pagina's naar één fysiek vel. Alle documenten in de taak worden aaneengesloten samengevoegd. [JobNUpAllDocumentsContiguously](./) en [DocumentNUp](../documentnup/) zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels voor beperkingen tussen deze sleutelwoorden te bepalen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Voegt een optie toe met een **PagesPerSheet** scored property‑waarde. Geeft het aantal logische pagina's per fysiek vel op. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
