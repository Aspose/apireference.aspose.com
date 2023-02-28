---
title: Class PreprocessingFilter
second_title: Aspose.OCR voor .NET API-referentie
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter klas. Basisklasse voor opdrachten voor beeldverwerking.
type: docs
weight: 170
url: /nl/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Basisklasse voor opdrachten voor beeldverwerking.

Basisklasse voor opdrachten voor beeldverwerking.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | De standaard constructeur. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Maakt het gebruik van een extra neuraal netwerk mogelijk om het beeld te verbeteren - ruis verminderen. Nuttig voor afbeeldingen met scanartefacten, vervorming, vlekken, fakkels, verlopen, vreemde elementen. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Maakt het gebruik van een extra neuraal netwerk mogelijk om het beeldgedeelte te verbeteren - ruis verminderen. Nuttig voor afbeeldingen met scanartefacten, vervorming, vlekken, fakkels, verlopen, vreemde elementen. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Corrigeert automatisch geometrische vervormingen in het beeld. Extreem arbeidsintensief! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Schakelt de automatische correctie van scheve afbeeldingen in. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Schakelt de automatische correctie van scheve delen van afbeeldingen in. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Converteert een afbeelding naar een zwart-witafbeelding. Binaire afbeeldingen zijn afbeeldingen waarvan de pixels slechts twee mogelijke intensiteitswaarden hebben. Ze worden normaal weergegeven in zwart-wit. Numeriek zijn de twee waarden vaak 0 voor zwart en 255 voor wit. Binaire afbeeldingen worden geproduceerd door een afbeelding automatisch te drempelen. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Converteert een deel van de afbeelding naar een zwart-witafbeelding. Binaire afbeeldingen zijn afbeeldingen waarvan de pixels slechts twee mogelijke intensiteitswaarden hebben. Ze worden normaal weergegeven in zwart-wit. Numeriek zijn de twee waarden vaak 0 voor zwart en 255 voor wit. Binaire afbeeldingen worden geproduceerd door een afbeelding automatisch te drempelen. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Contrastcorrectiefilter. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Contrastcorrectiefilter voor het gedeelte van de afbeelding. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Dilatatie voegt pixels toe aan de grenzen van objecten in een afbeelding. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Dilatatie voegt pixels toe aan de grenzen van objecten in een deel van de afbeelding. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Keert automatisch kleuren in een documentafbeelding om. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Keert automatisch kleuren in een deel van de afbeelding om. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Het mediaanfilter loopt door elk element van de afbeelding en vervangt elke pixel door de mediaan van de aangrenzende pixels. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Het mediaanfilter loopt door elk element van het afbeeldingsgedeelte en vervangt elke pixel door de mediaan van de aangrenzende pixels. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Afbeelding opnieuw schalen - Beeldresolutie omhoog of omlaag schalen. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Afbeelding opnieuw schalen - Afbeeldingsresolutie omhoog of omlaag schalen. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Originele afbeelding draaien. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Draai een deel van de afbeelding. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Afbeelding opnieuw schalen - Beeldresolutie omhoog of omlaag schalen. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Afbeelding opnieuw schalen - Afbeeldingsresolutie omhoog of omlaag schalen. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Maak een binaire afbeelding op basis van het instellen van een drempelwaarde voor de pixelintensiteit van de originele afbeelding. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Maak een binair deel van de afbeelding op basis van het instellen van een drempelwaarde voor de pixelintensiteit van het originele afbeeldingsdeel. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Converteert een afbeelding naar grijswaardenafbeelding. Grijswaardenafbeelding heeft 256 lichtniveaus in afbeelding (0 tot 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Voeg het nieuwe filter toe aan de verzameling om alle bewerkingen verder uit te voeren. Consistentie in de verzameling is belangrijk. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Voor IEnumarable interface-realisatie. |

### Zie ook

* naamruimte [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* montage [Aspose.OCR](../../)


