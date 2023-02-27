---
title: AsposeOcr.RecognizeDjvu
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Text aus mehrseitigem DJVUBild erkennen.  Erkennt DJVUDatei mit der Fähigkeit zur AngabeDocumentRecognitionSettings . Unterstützt nur DJVU. Unterstützt keine anderen Bildtypen.
type: docs
weight: 120
url: /de/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

Text aus mehrseitigem DJVU-Bild erkennen.  Erkennt DJVU-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Unterstützt nur DJVU. Unterstützt keine anderen Bildtypen.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

Text aus mehrseitigem DJVU-Bild erkennen.  Erkennt DJVU-Datei mit der Fähigkeit zur Angabe[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Unterstützt nur DJVU. Unterstützt keine anderen Bildtypen.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstream mit der DJVU-Datei. |
| settings | DocumentRecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Liste von Objekten mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


