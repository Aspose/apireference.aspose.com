---
title: AsposeOcr.ImageTextDiff
second_title: Référence de l'API Aspose.OCR pour .NET
description: AsposeOcr méthode. Comparez les textes des deux images et renvoyez un nombre représentant leur similarité 0 à 1.
type: docs
weight: 90
url: /fr/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Comparez les textes des deux images et renvoyez un nombre représentant leur similarité (0 à 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| fullPath1 | String | Chemin vers la première image. |
| fullPath2 | String | Chemin vers la deuxième image. |
| settings | RecognitionSettings | Paramètres de reconnaissance. |
| ignoreCase | Boolean | True - signifie une recherche insensible à la casse. |

### Return_Value

0 signifie que les textes sont complètement différents ; 1 signifie que les textes sont identiques.

### Voir également

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espace de noms [Aspose.OCR](../../asposeocr/)
* Assemblée [Aspose.OCR](../../../)


