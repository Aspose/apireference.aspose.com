---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR voor .NET API-referentie
description: AsposeOcr methode. Gebruik voorbewerking van afbeeldingen om de nauwkeurigheid van OCR te verbeteren. Maak een lijst met filters die worden toegepast op de invoerafbeelding in de volgorde die u opgeeft. voorbeeld om filters te maken PreprocessingFilter filters  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f  PreprocessingFilter.Dilate  Je hebt ze niet allemaal nodig. Stel alleen in wat u nodig heeft.
type: docs
weight: 100
url: /nl/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Gebruik voorbewerking van afbeeldingen om de nauwkeurigheid van OCR te verbeteren. Maak een lijst met filters die worden toegepast op de invoerafbeelding in de volgorde die u opgeeft. voorbeeld om filters te maken: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Je hebt ze niet allemaal nodig. Stel alleen in wat u nodig heeft.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fullPath | String | Volledig pad naar de afbeelding. |
| filters | PreprocessingFilter | Filters voor beeldoptimalisatie[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Winstwaarde

Stream met gewijzigde afbeelding zodat u deze kunt opslaan of herkennen.

### Zie ook

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Gebruik voorbewerking van afbeeldingen om de nauwkeurigheid van OCR te verbeteren. Maak een lijst met filters die worden toegepast op de invoerafbeelding in de volgorde die u opgeeft. voorbeeld om filters te maken: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Je hebt ze niet allemaal nodig. Stel alleen in wat u nodig heeft.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | MemoryStream | Geheugenstroom die de afbeelding bevat. |
| filters | PreprocessingFilter | Filters voor beeldoptimalisatie[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Winstwaarde

Stream met gewijzigde afbeelding zodat u deze kunt opslaan of herkennen.

### Zie ook

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* naamruimte [Aspose.OCR](../../asposeocr/)
* montage [Aspose.OCR](../../../)


