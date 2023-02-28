---
title: AsposeOcr.RecognizeReceipt
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt Text auf dem Bild.
type: docs
weight: 230
url: /de/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

Erkennt Text auf dem Bild.

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| settings | ReceiptRecognitionSettings | Erkennungseinstellungen[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

Erkennt Text auf dem Bild.

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Quittungsbild enthält. |
| settings | ReceiptRecognitionSettings | Erkennungseinstellungen[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


