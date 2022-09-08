---
title: RecognitionSettings
second_title: Référence de l'API Aspose.OCR pour .NET
description: Paramètres pour la reconnaissance dimage. Contient des éléments qui permettent de personnaliser le processus de reconnaissance.
type: docs
weight: 130
url: /fr/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Paramètres pour la reconnaissance d'image. Contient des éléments qui permettent de personnaliser le processus de reconnaissance.

```csharp
public class RecognitionSettings
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [RecognitionSettings](recognitionsettings)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Initialise une nouvelle instance du[`RecognitionSettings`](../recognitionsettings) classe avec un ensemble complet de propriétés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/recognitionsettings/allowedcharacters) { get; set; } | Jeu de caractères autorisés. Détermine le type de caractères autorisés pour le résultat de la reconnaissance. |
| [AutoContrast](../../aspose.ocr/recognitionsettings/autocontrast) { get; set; } | Permet d'utiliser un algorithme de correction de contraste supplémentaire pour l'image avant la reconnaissance. |
| [AutoDenoising](../../aspose.ocr/recognitionsettings/autodenoising) { get; set; } | Permet l'utilisation d'un réseau de neurones supplémentaire pour améliorer l'image - réduire le bruit. Utile pour les images avec des artefacts de numérisation, des distorsions, des taches, des reflets, des dégradés, des éléments étrangers. |
| [AutoSkew](../../aspose.ocr/recognitionsettings/autoskew) { set; } | Obtient ou définit un indicateur indiquant si la correction automatique de l'inclinaison de l'image doit être activée. Activé (true) par défaut. |
| [DetectAreas](../../aspose.ocr/recognitionsettings/detectareas) { set; } | Obtient ou définit un indicateur indiquant si la détection automatique des zones de texte doit être activée.  Active le module de reconnaissance de la structure du document. Cela prend plus de temps et de mémoire pour traiter une image, mais fournit des résultats plus précis sur les cas complexes. Désactiver (réglé sur faux) pour un traitement d'image plus rapide ou en cas d'images avec une structure simple. |
| [DetectAreasMode](../../aspose.ocr/recognitionsettings/detectareasmode) { get; set; } | Permet de sélectionner le mode optimal pour les zones de type document : document, photo, texte brut, colonne, image. |
| [IgnoredCharacters](../../aspose.ocr/recognitionsettings/ignoredcharacters) { get; set; } | Définit la liste noire des symboles de reconnaissance. |
| [Language](../../aspose.ocr/recognitionsettings/language) { set; } | Obtient ou définit la langue utilisée pour l'OCR.  Détermine l'alphabet utilisé lors de la reconnaissance. Multi-langue par défaut. |
| [LinesFiltration](../../aspose.ocr/recognitionsettings/linesfiltration) { get; set; } | Permet de reconnaître du texte dans les tableaux (régions entourées de lignes). |
| [PreprocessingFilters](../../aspose.ocr/recognitionsettings/preprocessingfilters) { get; set; } | Permet de préparer l'image pour l'OCR en ajustant les méthodes de prétraitement. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas) { set; } | Obtient ou définit la liste des zones de texte à traiter.  Permet de spécifier manuellement les zones avec du texte pour une reconnaissance plus précise. Si des zones personnalisées sont définies[`DetectAreas`](./detectareas) et[`AutoSkew`](./autoskew) les propriétés seront ignorées.  Désactive DetectAreas et AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline) { set; } | Définit la reconnaissance d'image sur une seule ligne. Désactivé (faux) par défaut. Désactiver toutes les étapes de traitement associées au fractionnement en lignes. Définissez ce paramètre sur vrai si votre image ne contient qu'une seule ligne. Désactive les paramètres RecognitionAreas, de sorte que tous les paramètres de zones seront ignorés. |
| [SkewAngle](../../aspose.ocr/recognitionsettings/skewangle) { set; } | Obtient ou définit l'angle en degrés pour la rotation de l'image.  La définition de cette valeur désactivera le[`AutoSkew`](./autoskew) , de sorte que la correction automatique de l'inclinaison ne soit pas appliquée. Zéro par défaut. |
| [ThreadsCount](../../aspose.ocr/recognitionsettings/threadscount) { set; } | Obtient ou définit le nombre de threads pour le traitement. Par défaut, 0 signifie que l'image sera traitée avec un nombre de threads égal à votre nombre de processeurs. ThreadsCount = 1 signifie que l'image sera traitée dans le thread principal. |
| [ThresholdValue](../../aspose.ocr/recognitionsettings/thresholdvalue) { set; } | Obtient ou définit une valeur de seuil personnalisée pour la binarisation de l'image. Plage de 1 à 255. |

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr)
* Assemblée [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
