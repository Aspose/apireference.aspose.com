---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class. Klasse voor XPS-als-PDF opslaanopties in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Klasse voor XPS-als-PDF-opslagopties.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specificeert de grootte van een deel van pagina's dat van node naar node wordt doorgegeven. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | De verzameling van gebeurtenishandlers die wijzigingen uitvoert op een [XPS](../../aspose.page.xps/) pagina vlak voordat deze wordt opgeslagen. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Haalt encryptiedetails op. Indien niet ingesteld, wordt er geen encryptie uitgevoerd. |
| [get_ImageCompression](./get_imagecompression/)() const | Specificeert het compressietype dat voor alle afbeeldingen in het document wordt gebruikt. Standaard is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Specificeert tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand wordt geopend in een viewer. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort. Standaard is 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Specificeert de hoogte van de documentstructuurboom die moet worden opgeslagen. 0 - de structuurboom wordt niet geconverteerd, 1 - alleen de items van het eerste niveau worden geconverteerd, enzovoort. Standaard is 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Haalt op/zet de array met paginanummers die moeten worden geconverteerd. |
| [get_PreserveText](./get_preservetext/)() override | In [XPS](../../aspose.page.xps/) kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Als deze vlag op true wordt gezet, wordt de tekst van dergelijke [XPS](../../aspose.page.xps/)‑elementen geconverteerd naar grafische vormen. Vervolgens verschijnt de tekst zelf transparant erboven. Hierdoor blijft de tekst van dergelijke elementen selecteerbaar. Het neveneffect is echter dat het uitvoerbestand veel groter kan zijn dan het origineel. Als deze vlag op false wordt gezet, worden de tekens die als alternatieve vormen moeten worden weergegeven vervangen door andere tekens die worden gemapt op de alternatieve glyphvormen. Daarom wordt de tekst, hoewel nog steeds selecteerbaar, aangepast en zal waarschijnlijk onleesbaar worden. Standaard is false. |
| [get_TextCompression](./get_textcompression/)() const | Specificeert op welk niveau in de documentstructuur [ApsBookmark](../)‑objecten moeten worden weergegeven. 0 - niet weergegeven. 1 op het eerste niveau enzovoort. Standaard is 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Maakt een nieuwe instantie van opties aan. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specificeert de grootte van een deel van pagina's dat van node naar node wordt doorgegeven. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Stelt encryptiedetails in. Indien niet ingesteld, wordt er geen encryptie uitgevoerd. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Specificeert het compressietype dat voor alle afbeeldingen in het document wordt gebruikt. Standaard is [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Specificeert tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand wordt geopend in een viewer. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort. Standaard is 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Specificeert de hoogte van de documentstructuurboom die moet worden opgeslagen. 0 - de structuurboom wordt niet geconverteerd, 1 - alleen de items van het eerste niveau worden geconverteerd, enzovoort. Standaard is 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Haalt op/zet de array met paginanummers die moeten worden geconverteerd. |
| [set_PreserveText](./set_preservetext/)(bool) override | In [XPS](../../aspose.page.xps/) kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Als deze vlag op true wordt gezet, wordt de tekst van dergelijke [XPS](../../aspose.page.xps/)‑elementen geconverteerd naar grafische vormen. Vervolgens verschijnt de tekst zelf transparant erboven. Hierdoor blijft de tekst van dergelijke elementen selecteerbaar. Het neveneffect is echter dat het uitvoerbestand veel groter kan zijn dan het origineel. Als deze vlag op false wordt gezet, worden de tekens die als alternatieve vormen moeten worden weergegeven vervangen door andere tekens die worden gemapt op de alternatieve glyphvormen. Daarom wordt de tekst, hoewel nog steeds selecteerbaar, aangepast en zal waarschijnlijk onleesbaar worden. Standaard is false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Specificeert op welk niveau in de documentstructuur [ApsBookmark](../)‑objecten moeten worden weergegeven. 0 - niet weergegeven. 1 op het eerste niveau enzovoort. Standaard is 0. |
## Zie ook

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
