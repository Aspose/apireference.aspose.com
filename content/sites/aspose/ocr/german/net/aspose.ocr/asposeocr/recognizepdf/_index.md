---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Text aus gescanntem PDF erkennen Bilder extrahieren.  Erkennt eine PDFDatei mit der Möglichkeit zur AngabeDocumentRecognitionSettings . Unterstützt nur gescannte PDFs. Unterstützt kein durchsuchbares PDF.
type: docs
weight: 220
url: /de/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Text aus gescanntem PDF erkennen (Bilder extrahieren).  Erkennt eine PDF-Datei mit der Möglichkeit zur Angabe[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Unterstützt nur gescannte PDFs. Unterstützt kein durchsuchbares PDF.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Vollständiger Pfad zum Bild. |
| settings | DocumentRecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Text aus gescanntem PDF erkennen (Bilder extrahieren).  Erkennt eine PDF-Datei mit der Möglichkeit zur Angabe[`RecognitionSettings`](../../recognitionsettings/) . Unterstützt nur gescannte PDFs. Unterstützt kein durchsuchbares PDF.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom mit der pdf-Datei. |
| settings | DocumentRecognitionSettings | Erkennungseinstellungen. |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


