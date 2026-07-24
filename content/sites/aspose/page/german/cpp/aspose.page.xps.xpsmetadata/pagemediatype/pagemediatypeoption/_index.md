---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption Klasse"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption Klasse. Beschreibt die PageMediaType‑Feature‑Optionen in C++."
type: docs
weight: 700
url: /de/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Beschreibt die [PageMediaType](../) Feature‑Optionen.

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Fügt dem Optionsobjekt ein Array von [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) Instanzen hinzu. |
| [Clone](./clone/)() | Klonen Sie diese Optionsinstanz. Die Abkürzung zum Klonkonstruktor. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Erstellt eine neue Instanz. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Klonen Sie diese Optionsinstanz. |
| [SetWeight](./setweight/)(int32_t) | Setzt einen **Weight**‑bewerteten Eigenschaftswert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Archival](./archival/) | Gibt Medien von Archivqualität an. |
| static [AutoSelect](./autoselect/) | Gibt an, dass Medien automatisch ausgewählt werden. |
| static [BackPrintFilm](./backprintfilm/) | Gibt spezielles Rückdruck-Filmmedium an. |
| static [Bond](./bond/) | Gibt Standard-Bond-Medium an. |
| static [CardStock](./cardstock/) | Gibt Standard-Kartenpapier-Medium an. |
| static [Continous](./continous/) | Gibt kontinuierlich zugeführtes Medium an. |
| static [EnvelopePlain](./envelopeplain/) | Gibt Standard-Briefumschlag-Medium an. |
| static [EnvelopeWindow](./envelopewindow/) | Gibt Fenster-Briefumschlag-Medium an. |
| static [Fabric](./fabric/) | Gibt Stoffmedium an. |
| static [HighResolution](./highresolution/) | Gibt spezielles Hochauflösungsmedium an. |
| static [Label](./label/) | Gibt Etikettenmedium an. |
| static [MultiLayerForm](./multilayerform/) | Gibt angebundenes Mehrteiliges-Formular-Medium an. |
| static [MultiPartForm](./multipartform/) | Gibt separates Mehrteiliges-Formular-Medium an. |
| static [None](./none/) | Gibt unbekanntes oder nicht aufgeführtes Medium an. |
| static [Photographic](./photographic/) | Gibt Standard-Fotomedium an. |
| static [PhotographicFilm](./photographicfilm/) | Gibt Film-Fotomedium an. |
| static [PhotographicGlossy](./photographicglossy/) | Gibt glänzendes Fotomedium an. |
| static [PhotographicHighGloss](./photographichighgloss/) | Gibt hochglänzendes Fotomedium an. |
| static [PhotographicMatte](./photographicmatte/) | Gibt mattes Fotomedium an. |
| static [PhotographicSatin](./photographicsatin/) | Gibt Satin-Fotomedium an. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Gibt halbglänzendes Fotomedium an. |
| static [Plain](./plain/) | Gibt Standard-Papiermedium an. |
| static [Screen](./screen/) | Gibt Ausgabe an ein Ausgabedisplay in kontinuierlicher Form an. |
| static [ScreenPaged](./screenpaged/) | Gibt Ausgabe an ein Ausgabedisplay in paginierter Form an. |
| static [Stationary](./stationary/) | Gibt spezielles Schreibwarenmedium an. |
| static [TabStockFull](./tabstockfull/) | Gibt Registerpapier-Medium an, das nicht vorgeschnitten ist (einzelne Register). |
| static [TabStockPreCut](./tabstockprecut/) | Gibt Registerpapier-Medium an, das vorgeschnitten ist (mehrere Register). |
| static [Transparency](./transparency/) | Legt Transparenzmedien fest. |
| static [TShirtTransfer](./tshirttransfer/) | Legt spezielles T‑Shirt‑Transfermedium fest. |
## Siehe auch

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
