---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Text aus mehrseitigem TIFFBild erkennen.  Erkennt TIFFDatei mit der Fähigkeit zur AngabeDocumentRecognitionSettings . Unterstützt nur TIFF TIF. Unterstützt keine anderen Bildtypen.
type: docs
weight: 240
url: /de/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

Text aus mehrseitigem TIFF-Bild erkennen.  Erkennt TIFF-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Unterstützt nur TIFF (TIF). Unterstützt keine anderen Bildtypen.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Vollständiger Pfad zum Bild. |
| settings | DocumentRecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Liste von Objekten mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

Text aus mehrseitigem TIFF-Bild erkennen.  Erkennt TIFF-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Unterstützt nur TIFF (TIF). Unterstützt keine anderen Bildtypen.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom mit der TIFF-Datei. |
| settings | DocumentRecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Liste von Objekten mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


