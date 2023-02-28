---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känna igen text från flersidig TIFFbild.  Känner igen TIFFfil med möjligheten att specificeraDocumentRecognitionSettings . Stöder endast TIFF TIF. Stöder inte andra bildtyper.
type: docs
weight: 240
url: /sv/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

Känna igen text från flersidig TIFF-bild.  Känner igen TIFF-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Stöder endast TIFF (TIF). Stöder inte andra bildtyper.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

Känna igen text från flersidig TIFF-bild.  Känner igen TIFF-fil med möjligheten att specificera[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Stöder endast TIFF (TIF). Stöder inte andra bildtyper.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström med TIFF-filen. |
| settings | DocumentRecognitionSettings | Igenkänningsinställningar. |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) lista över objekt med bildigenkänningsresultat.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


