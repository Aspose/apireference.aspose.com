---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet-klass"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet-klass. Beskriver bannerbladet som ska skrivas ut för ett specifikt dokument. Bannerbladet ska skrivas ut med standard‑PageMediaSize och med standard‑PageMediaType. Bannerbladet bör också vara isolerat från resten av jobbet. Detta innebär att eventuella efterbehandlings‑ eller bearbetningsalternativ (såsom DocumentDuplex, DocumentStaple eller DocumentBinding) inte ska inkludera bannerbladet. Bannerbladet kan vara isolerat eller inte från resten av jobbet. Detta innebär att vissa jobb‑efterbehandlings‑ eller bearbetningsalternativ kan inkludera dokumentets bannerblad. Bannerbladet ska vara det första bladet i dokumentet.  i C++."
type: docs
weight: 400
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Beskriver bannerbladet som ska skrivas ut för ett specifikt dokument. Bannerbladet ska skrivas ut med standard‑[PageMediaSize](../pagemediasize/) och med standard‑[PageMediaType](../pagemediatype/). Bannerbladet bör också vara isolerat från resten av jobbet. Detta innebär att eventuella efterbehandlings‑ eller bearbetningsalternativ (såsom [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), eller [DocumentBinding](../documentbinding/)) inte ska inkludera bannerbladet. Bannerbladet kan vara isolerat eller inte från resten av jobbet. Detta innebär att vissa jobb‑efterbehandlings‑ eller bearbetningsalternativ kan inkludera dokumentets bannerblad. Bannerbladet ska vara det första bladet i dokumentet. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
