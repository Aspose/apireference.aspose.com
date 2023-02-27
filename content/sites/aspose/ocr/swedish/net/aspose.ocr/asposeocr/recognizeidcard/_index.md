---
title: AsposeOcr.RecognizeIDCard
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känner igen text på IDkort.
type: docs
weight: 130
url: /sv/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

Känner igen text på ID-kort.

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| settings | IDCardRecognitionSettings | Igenkänningsinställningar[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

Känner igen text på ID-kort.

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller kvittobilden. |
| settings | IDCardRecognitionSettings | Igenkänningsinställningar[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


