---
title: AsposeOcr.RecognizePassport
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känner igen text på pass.
type: docs
weight: 210
url: /sv/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

Känner igen text på pass.

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| settings | PassportRecognitionSettings | Igenkänningsinställningar[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

Känner igen text på pass.

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller kvittobilden. |
| settings | PassportRecognitionSettings | Igenkänningsinställningar[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


