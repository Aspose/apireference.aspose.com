---
title: Class PreprocessingFilter
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter classe. Classe de base pour les commandes de traitement dimage.
type: docs
weight: 170
url: /fr/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Classe de base pour les commandes de traitement d'image.

Classe de base pour les commandes de traitement d'image.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Constructor |

## Méthodes

| Nom | La description |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Permet l'utilisation d'un réseau de neurones supplémentaire pour améliorer l'image - réduire le bruit. Utile pour les images avec des artefacts de numérisation, des distorsions, des taches, des reflets, des dégradés, des éléments étrangers. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Permet l'utilisation d'un réseau de neurones supplémentaire pour améliorer la partie image - réduire le bruit. Utile pour les images avec des artefacts de numérisation, des distorsions, des taches, des reflets, des dégradés, des éléments étrangers. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Corrige automatiquement les distorsions géométriques de l'image. Extrêmement gourmand en ressources ! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Active la correction automatique de l'inclinaison de l'image. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Active la correction automatique de l'inclinaison de la partie de l'image. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Convertit une image en image noir et blanc. Les images binaires sont des images dont les pixels n'ont que deux valeurs d'intensité possibles. Ils sont normalement affichés en noir et blanc. Numériquement, les deux valeurs sont souvent 0 pour le noir et 255 pour le blanc. Les images binaires sont produites par seuillage automatique d'une image. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Convertit une partie de l'image en image noir et blanc. Les images binaires sont des images dont les pixels n'ont que deux valeurs d'intensité possibles. Ils sont normalement affichés en noir et blanc. Numériquement, les deux valeurs sont souvent 0 pour le noir et 255 pour le blanc. Les images binaires sont produites par seuillage automatique d'une image. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Filtre de correction de contraste. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Filtre de correction de contraste pour la partie de l'image. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | La dilatation ajoute des pixels aux limites des objets dans une image. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | La dilatation ajoute des pixels aux limites des objets dans une partie de l'image. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Inverse automatiquement les couleurs dans une image de document. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Inverse automatiquement les couleurs dans une partie de l'image. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Le filtre médian parcourt chaque élément de l'image et remplace chaque pixel par la médiane de ses pixels voisins. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Le filtre médian parcourt chaque élément de la partie image et remplace chaque pixel par la médiane de ses pixels voisins. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Redimensionner l'image - Résolution d'image ascendante ou descendante. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Redimensionner l'image - Résolution d'image à l'échelle supérieure ou inférieure. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Faire pivoter l'image d'origine. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Faire pivoter une partie de l'image. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Redimensionner l'image - Résolution d'image ascendante ou descendante. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Redimensionner l'image - Résolution d'image à l'échelle supérieure ou inférieure. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Créer une image binaire basée sur la définition d'une valeur seuil sur l'intensité des pixels de l'image d'origine. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Créer une partie binaire de l'image basée sur la définition d'une valeur seuil sur l'intensité des pixels de la partie d'image d'origine. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Convertit une image en image en niveaux de gris. L'image en niveaux de gris a 256 niveaux de lumière dans l'image (0 à 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Ajoutez le nouveau filtre à la collection pour continuer à exécuter toutes les opérations. La cohérence dans la collection est importante. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Pour la réalisation d'interface IEnumable. |

### Voir également

* espace de noms [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* Assemblée [Aspose.OCR](../../)


