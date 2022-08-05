---
title: AsposeOcr
second_title: Référence de l'API Aspose.OCR pour .NET
description: API principale pour la bibliothèque Aspose OCR
type: docs
weight: 20
url: /fr/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

API principale pour la bibliothèque Aspose OCR

```csharp
public class AsposeOcr
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | Initialise une nouvelle instance du[`AsposeOcr`](../asposeocr) class. Constructeur vide. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Initialise une nouvelle instance du[`AsposeOcr`](../asposeocr) class. Définissez les caractères autorisés avec la propriété alphabet. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Calcule l'angle d'inclinaison d'une image. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Calcule l'angle d'inclinaison d'une image. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Calcule l'angle d'inclinaison d'une image à partir de l'URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Corrige le texte (remplace les mots mal orthographiés). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Utilisez le prétraitement d'image pour améliorer la précision de l'OCR. Créez une liste de filtres qui seront appliqués à l'image d'entrée dans l'ordre que vous spécifiez. exemple pour créer des filtres : PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6ft. ), PreprocessingFilter.Dilate() }; Vous n'avez pas besoin de tous. Définissez uniquement ce dont vous avez besoin. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Utilisez le prétraitement d'image pour améliorer la précision de l'OCR. Créez une liste de filtres qui seront appliqués à l'image d'entrée dans l'ordre que vous spécifiez. exemple pour créer des filtres : PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6ft. ), PreprocessingFilter.Dilate() }; Vous n'avez pas besoin de tous. Définissez uniquement ce dont vous avez besoin. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Reconnaître le texte d'une image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Prend uniquement en charge DJVU. Ne prend pas en charge d'autres types d'images. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Reconnaît le texte sur l'image.  Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../recognitionsettings) . Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Reconnaître le texte sur l'image avec une bonne qualité. N'utilise pas la correction d'inclinaison et la détection de zones. Fonctionne en mode rapide. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Reconnaître le texte sur l'image avec une bonne qualité. N'utilise pas la correction d'inclinaison et la détection de zones. Fonctionne en mode rapide. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Reconnaît le texte sur l'image fournie par le lien URI. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Reconnaît le texte sur l'image fournie par le lien URI. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Reconnaît une image contenant une seule ligne de texte.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Reconnaît une image contenant une seule ligne de texte.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Reconnaît plusieurs images de la liste avec les paramètres par défaut.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier avec les paramètres par défaut.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Reconnaît plusieurs images de la liste.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`RecognitionSettings`](../recognitionsettings) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`RecognitionSettings`](../recognitionsettings) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Reconnaître le texte d'une image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings) . Prend en charge TIFF (TIF) uniquement. Ne prend pas en charge d'autres types d'images. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult |

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr)
* Assemblée [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
