---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Kontrollera om bilden innehåller det medföljande textfragmentet.
type: docs
weight: 80
url: /sv/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Kontrollera om bilden innehåller det medföljande textfragmentet.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| text | String | Textfragment för sökning på bilden. |
| settings | RecognitionSettings | Igenkänningsinställningar. |
| ignoreCase | Boolean | Sant – betyder en sökning som inte är skiftlägeskänslig. |

### Returvärde

Sant om bilden innehåller textfragment. Falskt - bilden innehåller inte textfragment.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Kontrollera om bildtexten matchar det angivna reguljära uttrycket.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| regex | Regex | System.Text.RegularExpressions-objekt med det angivna mönstret och alternativen. |
| settings | RecognitionSettings | Igenkänningsinställningar. |

### Returvärde

Sant om bildtexten matchar det angivna reguljära uttrycket.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


