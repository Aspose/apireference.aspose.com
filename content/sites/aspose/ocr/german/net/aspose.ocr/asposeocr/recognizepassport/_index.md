---
title: AsposeOcr.RecognizePassport
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt Text auf Pässen.
type: docs
weight: 210
url: /de/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

Erkennt Text auf Pässen.

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| settings | PassportRecognitionSettings | Erkennungseinstellungen[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

Erkennt Text auf Pässen.

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Quittungsbild enthält. |
| settings | PassportRecognitionSettings | Erkennungseinstellungen[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


