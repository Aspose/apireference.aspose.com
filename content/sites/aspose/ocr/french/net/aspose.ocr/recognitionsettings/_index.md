---
title: Class RecognitionSettings
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.RecognitionSettings classe. Paramètres pour la reconnaissance dimage. Contient des éléments qui permettent de personnaliser le processus de reconnaissance.
type: docs
weight: 240
url: /fr/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Paramètres pour la reconnaissance d'image. Contient des éléments qui permettent de personnaliser le processus de reconnaissance.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Initialise une nouvelle instance du`RecognitionSettings`classe avec un ensemble complet de propriétés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Jeu de caractères autorisés. Détermine le type de caractères autorisés pour le résultat de la reconnaissance. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Permet d'utiliser un algorithme de correction de contraste supplémentaire pour l'image avant la reconnaissance. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Permet l'utilisation d'un réseau de neurones supplémentaire pour améliorer l'image - réduire le bruit. Utile pour les images avec des artefacts de numérisation, des distorsions, des taches, des reflets, des dégradés, des éléments étrangers. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Obtient ou définit un indicateur indiquant si la correction automatique de l'inclinaison de l'image doit être activée. Activé (true) par défaut. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Permet de sélectionner le mode optimal pour les zones de type document : document, photo, texte brut, colonne, image. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Définit la liste noire des symboles de reconnaissance. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Obtient ou définit la langue utilisée pour l'OCR.  Détermine l'alphabet utilisé lors de la reconnaissance. Multi-langue par défaut. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Permet de reconnaître du texte dans les tableaux (régions entourées de lignes). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Permet de préparer l'image pour l'OCR en ajustant les méthodes de prétraitement. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Obtient ou définit la liste des zones de texte à traiter.  Permet de spécifier manuellement les zones avec du texte pour une reconnaissance plus précise. Si des zones personnalisées sont définiesDetectAreas et!:AutoSkew les propriétés seront ignorées.  Désactive DetectAreas et AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Définit la reconnaissance d'image sur une seule ligne. Désactivé (faux) par défaut. Désactiver toutes les étapes de traitement associées au fractionnement en lignes. Définissez ce paramètre sur vrai si votre image ne contient qu'une seule ligne. Désactive les paramètres RecognitionAreas, de sorte que tous les paramètres de zones seront ignorés. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Obtient ou définit l'angle en degrés pour la rotation de l'image.  La définition de cette valeur désactivera le[`AutoSkew`](../baserecognitionsettings/autoskew/) , de sorte que la correction automatique de l'inclinaison ne soit pas appliquée. Zéro par défaut. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Obtient ou définit le nombre de threads pour le traitement. Par défaut, 0 signifie que l'image sera traitée avec un nombre de threads égal à votre nombre de processeurs. ThreadsCount = 1 signifie que l'image sera traitée dans le thread principal. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Obtient ou définit une valeur de seuil personnalisée pour la binarisation de l'image. Plage de 1 à 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Vous permet d'utiliser des algorithmes supplémentaires spécifiquement pour la reconnaissance des petites polices. Utile pour les images avec des caractères de petite taille. |

### Voir également

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


