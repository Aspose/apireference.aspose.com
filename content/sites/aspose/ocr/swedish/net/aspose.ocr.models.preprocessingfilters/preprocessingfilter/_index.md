---
title: Class PreprocessingFilter
second_title: Aspose.OCR för .NET API-referens
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter klass. Basklass för bildbehandlingskommandon.
type: docs
weight: 170
url: /sv/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Basklass för bildbehandlingskommandon.

Basklass för bildbehandlingskommandon.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Constructor |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Möjliggör användningen av ytterligare ett neuralt nätverk för att förbättra bilden - reducera brus. Användbart för bilder med skanningsartefakter, distorsion, fläckar, flare, gradienter, främmande element. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Möjliggör användningen av ytterligare ett neuralt nätverk för att förbättra bilddelen - reducera brus. Användbart för bilder med skanningsartefakter, distorsion, fläckar, flare, gradienter, främmande element. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Korrigerar automatiskt geometriska förvrängningar i bilden. Extremt resurskrävande! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Aktiverar den automatiska snedställningskorrigeringen. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Aktiverar den automatiska snedställningskorrigeringen av bilddelen. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Konverterar en bild till svartvit bild. Binära bilder är bilder vars pixlar bara har två möjliga intensitetsvärden. De visas normalt som svartvita. Numeriskt är de två värdena ofta 0 för svart och 255 för vit. Binära bilder produceras genom automatisk tröskelvärde för en bild. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Konverterar en del av bilden till svartvit bild. Binära bilder är bilder vars pixlar bara har två möjliga intensitetsvärden. De visas normalt som svartvita. Numeriskt är de två värdena ofta 0 för svart och 255 för vit. Binära bilder produceras genom automatisk tröskelvärde för en bild. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Kontrastkorrigeringsfilter. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Kontrastkorrigeringsfilter för delen av bilden. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | Utvidgning lägger till pixlar till gränserna för objekt i en bild. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | Utvidgning lägger till pixlar till gränserna för objekt i en del av bilden. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Inverterar automatiskt färger i en dokumentbild. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Inverterar automatiskt färger i en del av bilden. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Medianfiltret går genom varje element i bilden och ersätter varje pixel med medianvärdet för dess närliggande pixlar. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Medianfiltret går genom varje element i bilddelen och ersätter varje pixel med medianen för dess närliggande pixlar. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Skala om bilden - Uppskala eller minska bildupplösningen. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Skala om bild - Uppskala eller minska bildupplösningen. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Rotera originalbilden. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Rotera en del av bilden. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Skala om bilden - Uppskala eller minska bildupplösningen. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Skala om bild - Uppskala eller minska bildupplösningen. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Skapa en binär bild baserat på att ställa in ett tröskelvärde på pixelintensiteten för originalbilden. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Skapa en binär del av bilden baserat på att ställa in ett tröskelvärde på pixelintensiteten för den ursprungliga bilddelen. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Konverterar en bild till gråskalebild. Gråskalebild har 256 ljusnivåer i bilden (0 till 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Lägg till det nya filtret i samlingen för att köra alla operationer ytterligare. Konsekvens i insamlingen är viktig. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | För realisering av IEnumarable gränssnitt. |

### Se även

* namnutrymme [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* hopsättning [Aspose.OCR](../../)


