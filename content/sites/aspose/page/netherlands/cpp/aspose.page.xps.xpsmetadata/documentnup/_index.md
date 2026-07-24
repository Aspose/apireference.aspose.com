---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp klasse"
linktitle: "DocumentNUp"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp klasse. Beschrijft de uitvoer en het formaat van meerdere logische pagina's op één fysiek blad. Elk document wordt afzonderlijk samengesteld. DocumentNUp en JobNUpAllDocumentsContiguously zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels voor deze sleutelwoorden te bepalen. in C++."
type: docs
weight: 2000
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Beschrijft de uitvoer en het formaat van meerdere logische pagina's op één fysiek blad. Elk document wordt afzonderlijk samengesteld. **[DocumentNUp](./)** en [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels voor deze sleutelwoorden te bepalen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Voegt een optie toe met een **PagesPerSheet** scored property‑waarde. Geeft het aantal logische pagina's per fysiek vel op. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
