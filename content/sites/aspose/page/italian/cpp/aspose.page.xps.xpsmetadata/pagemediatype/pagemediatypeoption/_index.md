---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption classe"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption classe. Descrive le opzioni della funzionalità PageMediaType in C++."
type: docs
weight: 700
url: /it/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Descrive le opzioni della funzionalità [PageMediaType](../).

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Aggiunge un array di istanze di [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) all'opzione. |
| [Clone](./clone/)() | Clona questa istanza di opzione. La scorciatoia al costruttore di clonazione. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Crea una nuova istanza. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Clona questa istanza di opzione. |
| [SetWeight](./setweight/)(int32_t) | Imposta un valore della proprietà valutata **Weight**. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Archival](./archival/) | Specifica media di qualità archivistica. |
| static [AutoSelect](./autoselect/) | Specifica che i Media sarebbero selezionati automaticamente. |
| static [BackPrintFilm](./backprintfilm/) | Specifica supporto film di stampa posteriore specializzato. |
| static [Bond](./bond/) | Specifica supporto bond standard. |
| static [CardStock](./cardstock/) | Specifica supporto cartoncino standard. |
| static [Continous](./continous/) | Specifica supporto a alimentazione continua. |
| static [EnvelopePlain](./envelopeplain/) | Specifica supporto busta standard. |
| static [EnvelopeWindow](./envelopewindow/) | Specifica supporto busta con finestra. |
| static [Fabric](./fabric/) | Specifica supporto in tessuto. |
| static [HighResolution](./highresolution/) | Specifica supporto specializzato ad alta risoluzione. |
| static [Label](./label/) | Specifica supporto per etichette. |
| static [MultiLayerForm](./multilayerform/) | Specifica supporto per moduli multiparte collegati. |
| static [MultiPartForm](./multipartform/) | Specifica supporto per moduli multiparte separati. |
| static [None](./none/) | Specifica supporto sconosciuto o non elencato. |
| static [Photographic](./photographic/) | Specifica supporto fotografico standard. |
| static [PhotographicFilm](./photographicfilm/) | Specifica supporto fotografico su pellicola. |
| static [PhotographicGlossy](./photographicglossy/) | Specifica supporto fotografico lucido. |
| static [PhotographicHighGloss](./photographichighgloss/) | Specifica supporto fotografico ad alto lucido. |
| static [PhotographicMatte](./photographicmatte/) | Specifica supporto fotografico opaco. |
| static [PhotographicSatin](./photographicsatin/) | Specifica supporto fotografico satinato. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Specifica supporto fotografico semilucido. |
| static [Plain](./plain/) | Specifica supporto carta standard. |
| static [Screen](./screen/) | Specifica l'output a un display di output in forma continua. |
| static [ScreenPaged](./screenpaged/) | Specifica l'output a un display di output in forma paginata. |
| static [Stationary](./stationary/) | Specifica supporto cancelleria specializzata. |
| static [TabStockFull](./tabstockfull/) | Specifica supporto tabulato non pre-tagliato (tabulazioni singole). |
| static [TabStockPreCut](./tabstockprecut/) | Specifica supporto tabulato pre-tagliato (tabulazioni multiple). |
| static [Transparency](./transparency/) | Specifica il supporto trasparente. |
| static [TShirtTransfer](./tshirttransfer/) | Specifica il supporto speciale per trasferimento su magliette. |
## Vedi anche

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
