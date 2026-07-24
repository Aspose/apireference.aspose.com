---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class"
linktitle: "DocumentBannerSheet"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Beschrijft het bannerblad dat moet worden uitgegeven voor een specifiek document. Het bannerblad moet worden uitgegeven op de standaard PageMediaSize en met het standaard PageMediaType. Het bannerblad moet ook geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele afwerkings‑ of verwerkingsopties (zoals DocumentDuplex, DocumentStaple of DocumentBinding) het bannerblad niet moeten omvatten. Het bannerblad kan al dan niet geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele taakafwerkings‑ of verwerkingsopties het documentbannerblad kunnen omvatten. Het bannerblad moet verschijnen als het eerste blad van het document.  in C++."
type: docs
weight: 400
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Beschrijft het bannerblad dat moet worden uitgegeven voor een specifiek document. Het bannerblad moet worden uitgegeven op de standaard [PageMediaSize](../pagemediasize/) en met het standaard [PageMediaType](../pagemediatype/). Het bannerblad moet ook geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele afwerkings‑ of verwerkingsopties (zoals [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), of [DocumentBinding](../documentbinding/)) het bannerblad niet moeten omvatten. Het bannerblad kan al dan niet geïsoleerd zijn van de rest van de taak. Dit betekent dat eventuele taakafwerkings‑ of verwerkingsopties het documentbannerblad kunnen omvatten. Het bannerblad moet verschijnen als het eerste blad van het document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
