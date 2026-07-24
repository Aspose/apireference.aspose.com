---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp klass"
linktitle: "DocumentNUp"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp klass. Beskriver utskriften och formatet för flera logiska sidor på ett enda fysiskt ark. Varje dokument kompileras separat. DocumentNUp och JobNUpAllDocumentsContiguously är ömsesidigt uteslutande. Det är upp till drivrutinen att bestämma hur begränsningar hanteras mellan dessa nyckelord.  i C++."
type: docs
weight: 2000
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Beskriver utskriften och formatet för flera logiska sidor på ett enda fysiskt ark. Varje dokument kompileras separat. **[DocumentNUp](./)** och [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) är ömsesidigt uteslutande. Det är upp till drivrutinen att bestämma hur begränsningar hanteras mellan dessa nyckelord. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Lägger till ett alternativ med ett **PagesPerSheet** poängegenskapsvärde. Anger antalet logiska sidor per fysiskt blad. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
