---
title: AsposeOcr.RecognizeReceipt
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît le texte sur limage.
type: docs
weight: 230
url: /fr/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

Reconnaît le texte sur l'image.

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| settings | ReceiptRecognitionSettings | Paramètres de reconnaissance[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

Reconnaît le texte sur l'image.

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image du reçu. |
| settings | ReceiptRecognitionSettings | Paramètres de reconnaissance[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


