---
title: Enum DetectAreasMode
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.DetectAreasMode énumération. Détermine le type de réseau neuronal utilisé pour la détection des zones.
type: docs
weight: 60
url: /fr/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Détermine le type de réseau neuronal utilisé pour la détection des zones.

```csharp
public enum DetectAreasMode
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| NONE | `0` | Ne détecte pas les paragraphes. Mieux pour un simple document à une colonne sans images. |
| DOCUMENT | `1` | Détecte les paragraphes en utilisant le modèle NN pour les documents. Mieux pour un document multicolonne, un document avec des images ou avec d'autres objets non textuels. |
| PHOTO | `2` | Détecte les paragraphes utilise le modèle NN pour les photos. Mieux pour une image avec beaucoup d'images et d'autres objets non textuels. |
| COMBINE | `3` | Détecte les paragraphes contenant du texte, puis utilise un autre modèle NN pour détecter les zones à l'intérieur des paragraphes. Mieux pour les images à structure complexe. |
| TABLE | `4` | Détecte les cellules avec du texte. Mode préférable pour les images avec structure de tableau. |
| CURVED_TEXT | `5` | Détecte les lignes et reconnaît le texte sur les images courbes. Mode préféré pour les photos de pages de livres et de magazines. |

### Remarques

Utilisé dans le[`RecognitionSettings`](../recognitionsettings/) pour spécifier le type d'image que vous souhaitez reconnaître.

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


