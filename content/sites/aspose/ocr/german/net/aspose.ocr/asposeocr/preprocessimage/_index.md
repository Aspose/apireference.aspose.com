---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Verwenden Sie die Bildvorverarbeitung um die Genauigkeit von OCR zu verbessern. Erstellen Sie eine Liste von Filtern die in der von Ihnen angegebenen Reihenfolge auf das Eingabebild angewendet werden. Beispiel zum Erstellen von Filtern PreprocessingFilterFilter  neuer PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f  PreprocessingFilter.Dilate  Sie brauchen nicht alle. Stellen Sie nur das ein was Sie brauchen.
type: docs
weight: 100
url: /de/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Verwenden Sie die Bildvorverarbeitung, um die Genauigkeit von OCR zu verbessern. Erstellen Sie eine Liste von Filtern, die in der von Ihnen angegebenen Reihenfolge auf das Eingabebild angewendet werden. Beispiel zum Erstellen von Filtern: PreprocessingFilter-Filter = neuer PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Sie brauchen nicht alle. Stellen Sie nur das ein, was Sie brauchen.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Vollständiger Pfad zum Bild. |
| filters | PreprocessingFilter | Bildoptimierungsfilter[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Rückgabewert

Streamen Sie mit geändertem Bild, damit Sie es speichern oder erkennen können.

### Siehe auch

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Verwenden Sie die Bildvorverarbeitung, um die Genauigkeit von OCR zu verbessern. Erstellen Sie eine Liste von Filtern, die in der von Ihnen angegebenen Reihenfolge auf das Eingabebild angewendet werden. Beispiel zum Erstellen von Filtern: PreprocessingFilter-Filter = neuer PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Sie brauchen nicht alle. Stellen Sie nur das ein, was Sie brauchen.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Bild enthält. |
| filters | PreprocessingFilter | Bildoptimierungsfilter[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Rückgabewert

Streamen Sie mit geändertem Bild, damit Sie es speichern oder erkennen können.

### Siehe auch

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


