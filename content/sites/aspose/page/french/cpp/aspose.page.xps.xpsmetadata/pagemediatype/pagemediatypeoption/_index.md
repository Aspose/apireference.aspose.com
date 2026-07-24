---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption classe"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption classe. Décrit les options de fonctionnalité PageMediaType en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


Décrit les options de fonctionnalité [PageMediaType](../).

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Ajoute un tableau d'instances de [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) à l'option. |
| [Clone](./clone/)() | Clone cette instance d'option. Le raccourci vers le constructeur de clonage. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | Crée une nouvelle instance. |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | Clone cette instance d'option. |
| [SetWeight](./setweight/)(int32_t) | Définit une valeur de propriété notée **Weight**. |
## Champs

| Champ | Description |
| --- | --- |
| static [Archival](./archival/) | Spécifie un média de qualité archivistique. |
| static [AutoSelect](./autoselect/) | Spécifie que le Media serait sélectionné automatiquement. |
| static [BackPrintFilm](./backprintfilm/) | Spécifie le support film spécial d'impression arrière. |
| static [Bond](./bond/) | Spécifie le support de papier bond standard. |
| static [CardStock](./cardstock/) | Spécifie le support de papier cartonné standard. |
| static [Continous](./continous/) | Spécifie le support à alimentation continue. |
| static [EnvelopePlain](./envelopeplain/) | Spécifie le support d'enveloppe standard. |
| static [EnvelopeWindow](./envelopewindow/) | Spécifie le support d'enveloppe à fenêtre. |
| static [Fabric](./fabric/) | Spécifie le support en tissu. |
| static [HighResolution](./highresolution/) | Spécifie le support spécial haute résolution. |
| static [Label](./label/) | Spécifie le support d'étiquette. |
| static [MultiLayerForm](./multilayerform/) | Spécifie le support de formulaires multiparties attachés. |
| static [MultiPartForm](./multipartform/) | Spécifie le support de formulaires multiparties séparés. |
| static [None](./none/) | Spécifie un support inconnu ou non répertorié. |
| static [Photographic](./photographic/) | Spécifie le support photographique standard. |
| static [PhotographicFilm](./photographicfilm/) | Spécifie le support photographique sur film. |
| static [PhotographicGlossy](./photographicglossy/) | Spécifie le support photographique brillant. |
| static [PhotographicHighGloss](./photographichighgloss/) | Spécifie le support photographique à haute brillance. |
| static [PhotographicMatte](./photographicmatte/) | Spécifie le support photographique mat. |
| static [PhotographicSatin](./photographicsatin/) | Spécifie le support photographique satiné. |
| static [PhotographicSemiGloss](./photographicsemigloss/) | Spécifie le support photographique semi-brillant. |
| static [Plain](./plain/) | Spécifie le support papier standard. |
| static [Screen](./screen/) | Spécifie la sortie vers un affichage en continu. |
| static [ScreenPaged](./screenpaged/) | Spécifie la sortie vers un affichage en mode paginé. |
| static [Stationary](./stationary/) | Spécifie le support de papeterie spécial. |
| static [TabStockFull](./tabstockfull/) | Spécifie le support de languettes non découpées à l'avance (languettes simples). |
| static [TabStockPreCut](./tabstockprecut/) | Spécifie le support de languettes découpées à l'avance (languettes multiples). |
| static [Transparency](./transparency/) | Spécifie transparency media. |
| static [TShirtTransfer](./tshirttransfer/) | Spécifie specialty T-shirt transfer media. |
## Voir aussi

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
