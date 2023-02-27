---
title: AsposeOcr.RecognizeInvoice
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känner igen text på fakturabild.
type: docs
weight: 180
url: /sv/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Känner igen text på fakturabild.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| settings | InvoiceRecognitionSettings | Igenkänningsinställningar[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Känner igen text på fakturabild.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller kvittobilden. |
| settings | InvoiceRecognitionSettings | Igenkänningsinställningar[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


