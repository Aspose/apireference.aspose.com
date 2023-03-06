---
title: Class SimpleLabeling
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling klas. Een eenvoudige labeling plaatst een label op elke functie.
type: docs
weight: 1700
url: /nl/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Een eenvoudige labeling plaatst een label op elke functie.

```csharp
public class SimpleLabeling : Labeling
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Initialiseert een nieuw exemplaar van het`SimpleLabeling` klasse. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Initialiseert een nieuw exemplaar van het`SimpleLabeling` klasse. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Initialiseert een nieuw exemplaar van het`SimpleLabeling` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Een callback die wordt gebruikt om deze labeling te configureren voordat een functie wordt afgehandeld. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Bepaalt de kleur van de tekst. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Lettertypefamilie om te gebruiken om tekst weer te geven. De standaardwaarde is systeemafhankelijke waarde. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Grootte van de tekst. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Stijl om toe te passen op tekst. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Biedt een manier om de geometrie van het object te vervangen door een geometrie die is aangepast voor labeling. Deze callback wordt de eerste keer daarna aangeroepen[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Standaard is`null` (gebruik objectgeometrie zoals het is). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Kleur van de halo (streek) rond tekst. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Grootte van de halo (lijn) rond tekst. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Attribuutnaam om te gebruiken als bron van labels. Genegeerd als[`LabelExpression`](./labelexpression/) is ingesteld. Ofwel[`LabelAttribute`](./labelattribute/) of[`LabelExpression`](./labelexpression/) moet worden ingesteld voor weergave; InvalidOperationException wordt anders gegooid. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Biedt een manier om labeltekst aan te passen en op te maken. Indien ingesteld, overschrijft[`LabelAttribute`](./labelattribute/) . Ofwel[`LabelAttribute`](./labelattribute/) of[`LabelExpression`](./labelexpression/) moet worden ingesteld voor weergave; InvalidOperationException wordt anders gegooid. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Specificeert het rendergedrag voor meerdelige geometrieën. Standaard isAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Labelplaatsing specificeert hoe labels worden geplaatst ten opzichte van de geometrieën van het object. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Geeft de prioriteit van dit label aan voor het geval het overlapt met een ander label. Het label met lagere prioriteit wordt niet weergegeven. Standaard is 1000. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Kloont deze instantie. |

### Zie ook

* class [Labeling](../labeling/)
* naamruimte [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* montage [Aspose.GIS](../../)


