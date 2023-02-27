---
title: AsposeOcr.RecognizeInvoice
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît le texte sur limage de la facture.
type: docs
weight: 180
url: /fr/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Reconnaît le texte sur l'image de la facture.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| settings | InvoiceRecognitionSettings | Paramètres de reconnaissance[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Reconnaît le texte sur l'image de la facture.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image du reçu. |
| settings | InvoiceRecognitionSettings | Paramètres de reconnaissance[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


