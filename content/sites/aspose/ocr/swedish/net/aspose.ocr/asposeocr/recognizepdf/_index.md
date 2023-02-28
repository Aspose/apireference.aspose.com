---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känna igen text från skannad pdf extrahera bilder.  Känner igen pdffil med möjligheten att specificeraDocumentRecognitionSettings . Stöder endast skannad PDF. Stöder inte sökbar PDF.
type: docs
weight: 220
url: /sv/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Stöder endast skannad PDF. Stöder inte sökbar PDF.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Hela vägen till bilden. |
| settings | DocumentRecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Känna igen text från skannad pdf (extrahera bilder).  Känner igen pdf-fil med möjligheten att specificera[`RecognitionSettings`](../../recognitionsettings/) . Stöder endast skannad PDF. Stöder inte sökbar PDF.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström med pdf-filen. |
| settings | DocumentRecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


