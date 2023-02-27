---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter PreprocessingFilter filters  new PreprocessingFilter 0dIn_ 0dIn  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000000000000000000000000000000000000000000000000000000000000000300000000000000000000  PreprocessingFilter.Dilate  Du behöver inte alla. Ställ bara in det du behöver.
type: docs
weight: 100
url: /sv/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn{_ 0dIn) , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,300,000,000,000,000,000,000; ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Hela vägen till bilden. |
| filters | PreprocessingFilter | Bildoptimeringsfilter[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Returvärde

Streama med modifierad bild så att du kan spara eller känna igen den.

### Se även

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Använd bildförbearbetning för att förbättra noggrannheten i OCR. Skapa en lista med filter som kommer att tillämpas på indatabilden i den ordning du anger. exempel för att skapa filter: PreprocessingFilter filters = new PreprocessingFilter 0dIn{_ 0dIn) , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,300,000,000,000,000,000,000; ), PreprocessingFilter.Dilate() }; Du behöver inte alla. Ställ bara in det du behöver.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller bilden. |
| filters | PreprocessingFilter | Bildoptimeringsfilter[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Returvärde

Streama med modifierad bild så att du kan spara eller känna igen den.

### Se även

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


