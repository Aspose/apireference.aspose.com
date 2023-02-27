---
title: AsposeOcr.RecognizePassport
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît le texte sur les passeports.
type: docs
weight: 210
url: /fr/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

Reconnaît le texte sur les passeports.

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| settings | PassportRecognitionSettings | Paramètres de reconnaissance[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

Reconnaît le texte sur les passeports.

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image du reçu. |
| settings | PassportRecognitionSettings | Paramètres de reconnaissance[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`PassportRecognitionSettings`](../../passportrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


