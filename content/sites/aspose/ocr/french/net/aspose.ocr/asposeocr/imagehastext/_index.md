---
title: AsposeOcr.ImageHasText
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Vérifiez si limage contient le fragment de texte fourni.
type: docs
weight: 80
url: /fr/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Vérifiez si l'image contient le fragment de texte fourni.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| text | String | Fragment de texte pour la recherche sur l'image. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |
| ignoreCase | Boolean | True - signifie une recherche insensible à la casse. |

### Return_Value

Vrai si l'image contient un fragment de texte. Faux - l'image ne contient pas de fragment de texte.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Vérifiez si le texte de l'image correspond à l'expression régulière fournie.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath | String | Chemin vers l'image. |
| regex | Regex | Objet System.Text.RegularExpressions avec le modèle et les options fournis. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |

### Return_Value

True si le texte de l'image correspond à l'expression régulière fournie.

### Remarques

Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../../recognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Voir également

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


