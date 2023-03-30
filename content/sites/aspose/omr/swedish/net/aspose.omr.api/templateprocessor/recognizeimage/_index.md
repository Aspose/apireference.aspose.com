---
title: TemplateProcessor.RecognizeImage
second_title: Aspose.OMR för .NET API-referens
description: TemplateProcessor metod. Känner igen bilden
type: docs
weight: 30
url: /sv/net/aspose.omr.api/templateprocessor/recognizeimage/
---
## RecognizeImage(string, int) {#recognizeimage_1}

Känner igen bilden

```csharp
public RecognitionResult RecognizeImage(string imagePath, int recognitionThreshold = -100)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imagePath | String | Vägen till bilden att känna igen |
| recognitionThreshold | Int32 | (Valfritt) Igenkänningströskeln i intervallet (0...100). Endast element som fylls över tröskelvärdet kommer att räknas som ifyllda. |

### Returvärde

Erkännanderesultatet

### Se även

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* namnutrymme [Aspose.OMR.Api](../../templateprocessor/)
* hopsättning [Aspose.OMR](../../../)

---

## RecognizeImage(MemoryStream, int) {#recognizeimage}

Känner igen bild från minnet stream

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, int recognitionThreshold = -100)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström av bild. |
| recognitionThreshold | Int32 | (Valfritt) Igenkänningströskeln i intervallet (0...100). Endast element som fylls över tröskelvärdet kommer att räknas som ifyllda. |

### Returvärde

Erkännanderesultatet

### Se även

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* namnutrymme [Aspose.OMR.Api](../../templateprocessor/)
* hopsättning [Aspose.OMR](../../../)


