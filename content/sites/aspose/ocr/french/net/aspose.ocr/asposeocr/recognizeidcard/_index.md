---
title: AsposeOcr.RecognizeIDCard
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Reconnaît le texte sur la carte didentité.
type: docs
weight: 130
url: /fr/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

Reconnaît le texte sur la carte d'identité.

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| settings | IDCardRecognitionSettings | Paramètres de reconnaissance[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

Reconnaît le texte sur la carte d'identité.

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Flux mémoire contenant l'image du reçu. |
| settings | IDCardRecognitionSettings | Paramètres de reconnaissance[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### Return_Value

Le[`RecognitionResult`](../../recognitionresult/) objet avec les résultats de la reconnaissance d'image.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


