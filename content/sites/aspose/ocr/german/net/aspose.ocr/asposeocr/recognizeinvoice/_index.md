---
title: AsposeOcr.RecognizeInvoice
second_title: Aspose.OCR für .NET-API-Referenz
description: AsposeOcr methode. Erkennt Text auf Rechnungsbild.
type: docs
weight: 180
url: /de/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Erkennt Text auf Rechnungsbild.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fullPath | String | Pfad zum Bild. |
| settings | InvoiceRecognitionSettings | Erkennungseinstellungen[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Erkennt Text auf Rechnungsbild.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | MemoryStream | Speicherstrom, der das Quittungsbild enthält. |
| settings | InvoiceRecognitionSettings | Erkennungseinstellungen[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Rückgabewert

Der[`RecognitionResult`](../../recognitionresult/) Objekt mit Bilderkennungsergebnissen.

### Bemerkungen

Erkennt Bild mit der Fähigkeit zur Angabe[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Unterstützt GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Siehe auch

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* namensraum [Aspose.OCR](../../asposeocr/)
* Montage [Aspose.OCR](../../../)


