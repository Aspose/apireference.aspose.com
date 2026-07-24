---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption klass"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption klass. Beskriver PageMediaType‑funktionsalternativen i C++."
type: docs
weight: 700
url: /sv/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Beskriver [PageMediaType](../) funktionsalternativ.

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Lägger till en array av [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/)‑instanser till alternativet. |
| [Clone](./clone/)() | Klonar detta alternativ‑objekt. Genvägen till kloningskonstruktorn. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Skapar en ny instans. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Klonar detta alternativ‑objekt. |
| [SetWeight](./setweight/)(int32_t) | Ställer in ett **Weight**‑poängsatt egenskapsvärde. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Archival](./archival/) | Anger arkivkvalitetsmedia. |
| static [AutoSelect](./autoselect/) | Anger att Media skulle väljas automatiskt. |
| static [BackPrintFilm](./backprintfilm/) | Anger specialiserat baktryckningsfilmmedia. |
| static [Bond](./bond/) | Anger standardbindemedium. |
| static [CardStock](./cardstock/) | Anger standardkortstockmedia. |
| static [Continous](./continous/) | Anger kontinuerlig matningsmedia. |
| static [EnvelopePlain](./envelopeplain/) | Anger standardkuvertmedia. |
| static [EnvelopeWindow](./envelopewindow/) | Anger fönsterkuvertmedia. |
| static [Fabric](./fabric/) | Anger tygmedia. |
| static [HighResolution](./highresolution/) | Anger specialiserat högupplöst media. |
| static [Label](./label/) | Anger etikettmedia. |
| static [MultiLayerForm](./multilayerform/) | Anger bifogat flerdelsformulärmedia. |
| static [MultiPartForm](./multipartform/) | Anger separat flerdelsformulärmedia. |
| static [None](./none/) | Anger okänt eller olistat media. |
| static [Photographic](./photographic/) | Anger standardfotografiskt media. |
| static [PhotographicFilm](./photographicfilm/) | Anger filmfotografiskt media. |
| static [PhotographicGlossy](./photographicglossy/) | Anger glansigt fotografiskt media. |
| static [PhotographicHighGloss](./photographichighgloss/) | Anger högglansigt fotografiskt media. |
| static [PhotographicMatte](./photographicmatte/) | Anger matt fotografiskt media. |
| static [PhotographicSatin](./photographicsatin/) | Anger satinlikt fotografiskt media. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Anger halvglansigt fotografiskt media. |
| static [Plain](./plain/) | Anger standardpappersmedia. |
| static [Screen](./screen/) | Anger utskrift till en display i kontinuerlig form. |
| static [ScreenPaged](./screenpaged/) | Anger utskrift till en display i sidindelad form. |
| static [Stationary](./stationary/) | Anger specialiserat kontorsmaterialmedia. |
| static [TabStockFull](./tabstockfull/) | Anger flikstockmedia som inte är förskuren (enkla flikar). |
| static [TabStockPreCut](./tabstockprecut/) | Anger flikstockmedia som är förskuren (flera flikar). |
| static [Transparency](./transparency/) | Anger transparensmedia. |
| static [TShirtTransfer](./tshirttransfer/) | Anger specialiserade T-shirt-överföringsmedia. |
## Se även

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
