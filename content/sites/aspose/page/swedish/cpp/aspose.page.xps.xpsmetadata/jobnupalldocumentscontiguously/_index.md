---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously klass"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously klass. Beskriver utskriften av flera logiska sidor till ett enda fysiskt blad. Alla dokument i jobbet sammanställs kontinuerligt. JobNUpAllDocumentsContiguously och DocumentNUp är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord.  i C++."
type: docs
weight: 5900
url: /sv/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


Beskriver utskriften av flera logiska sidor till ett enda fysiskt blad. Alla dokument i jobbet sammanställs kontinuerligt. [JobNUpAllDocumentsContiguously](./) och [DocumentNUp](../documentnup/) är ömsesidigt uteslutande. Det är upp till drivrutinen att avgöra hur begränsningar hanteras mellan dessa nyckelord. [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously).

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Lägger till ett alternativ med ett **PagesPerSheet** poängegenskapsvärde. Anger antalet logiska sidor per fysiskt blad. |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
