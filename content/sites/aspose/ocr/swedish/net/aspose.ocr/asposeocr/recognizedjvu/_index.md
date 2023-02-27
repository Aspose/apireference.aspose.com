---
title: AsposeOcr.RecognizeDjvu
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känna igen text från DJVUbild på flera sidor.  Känner igen DJVUfil med möjligheten att specificeraDocumentRecognitionSettings . Stöder endast DJVU. Stöder inte andra bildtyper.
type: docs
weight: 120
url: /sv/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

Känna igen text från DJVU-bild på flera sidor.  Känner igen DJVU-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Stöder endast DJVU. Stöder inte andra bildtyper.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Hela vägen till bilden. |
| settings | DocumentRecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) lista över objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

Känna igen text från DJVU-bild på flera sidor.  Känner igen DJVU-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Stöder endast DJVU. Stöder inte andra bildtyper.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström med DJVU-filen. |
| settings | DocumentRecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) lista över objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


