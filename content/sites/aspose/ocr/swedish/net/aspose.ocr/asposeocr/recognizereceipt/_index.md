---
title: AsposeOcr.RecognizeReceipt
second_title: Aspose.OCR för .NET API-referens
description: AsposeOcr metod. Känner igen text på bild.
type: docs
weight: 230
url: /sv/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

Känner igen text på bild.

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fullPath | String | Vägen till bilden. |
| settings | ReceiptRecognitionSettings | Igenkänningsinställningar[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

Känner igen text på bild.

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | MemoryStream | Minnesström som innehåller kvittobilden. |
| settings | ReceiptRecognitionSettings | Igenkänningsinställningar[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Returvärde

De[`RecognitionResult`](../../recognitionresult/) objekt med bildigenkänningsresultat.

### Anmärkningar

Känner igen bilden med möjligheten att specificera[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Stöder GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Se även

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* namnutrymme [Aspose.OCR](../../asposeocr/)
* hopsättning [Aspose.OCR](../../../)


