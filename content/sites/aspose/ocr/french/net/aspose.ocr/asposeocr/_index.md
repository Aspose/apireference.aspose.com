---
title: Class AsposeOcr
second_title: Référence de l'API Aspose.OCR pour .NET
description: Aspose.OCR.AsposeOcr classe. API principale pour la bibliothèque Aspose OCR
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
| [AsposeOcr](asposeocr/#constructor)() | Initialise une nouvelle instance du`AsposeOcr` class. Constructeur vide. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | Initialise une nouvelle instance du`AsposeOcr` class. Définissez les caractères autorisés avec la propriété alphabet. |

## Méthodes

| Nom | La description |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | Calcule l'angle d'inclinaison d'une image. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | Calcule l'angle d'inclinaison d'une image. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | Calcule l'angle d'inclinaison d'une image à partir de l'URI. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | Vérifiez si deux images contiennent le même texte. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | Corrige le texte (remplace les mots mal orthographiés). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | Détecte les zones de texte sur l'image.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | Vérifiez si le texte de l'image correspond à l'expression régulière fournie. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | Vérifiez si l'image contient le fragment de texte fourni. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | Comparez les textes des deux images et renvoyez un nombre représentant leur similarité (0 à 1). |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | Utilisez le prétraitement d'image pour améliorer la précision de l'OCR. Créez une liste de filtres qui seront appliqués à l'image d'entrée dans l'ordre que vous spécifiez. exemple pour créer des filtres : PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6ft. ), PreprocessingFilter.Dilate() }; Vous n'avez pas besoin de tous. Définissez uniquement ce dont vous avez besoin. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | Utilisez le prétraitement d'image pour améliorer la précision de l'OCR. Créez une liste de filtres qui seront appliqués à l'image d'entrée dans l'ordre que vous spécifiez. exemple pour créer des filtres : PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6ft. ), PreprocessingFilter.Dilate() }; Vous n'avez pas besoin de tous. Définissez uniquement ce dont vous avez besoin. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | Reconnaît la plaque de la voiture. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | Reconnaît la plaque de la voiture. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | Reconnaître le texte d'une image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Prend uniquement en charge DJVU. Ne prend pas en charge d'autres types d'images. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | Reconnaître le texte d'une image DJVU multipage.  Reconnaît le fichier DJVU avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Prend uniquement en charge DJVU. Ne prend pas en charge d'autres types d'images. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | Reconnaît le texte sur la carte d'identité. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | Reconnaît le texte sur la carte d'identité. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | Reconnaît le texte sur l'image.  Reconnaît l'image avec la possibilité de spécifier[`RecognitionSettings`](../recognitionsettings/) . Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | Reconnaître le texte sur l'image avec une bonne qualité. N'utilise pas la correction d'inclinaison et la détection de zones. Fonctionne en mode rapide. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | Reconnaître le texte sur l'image avec une bonne qualité. N'utilise pas la correction d'inclinaison et la détection de zones. Fonctionne en mode rapide. |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | Reconnaît le texte sur l'image fournie en type base64. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | Reconnaît le texte sur l'image fournie par le lien URI. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | Reconnaît le texte sur l'image de la facture. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | Reconnaît le texte sur l'image de la facture. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | Reconnaît une image contenant une seule ligne de texte.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | Reconnaît une image contenant une seule ligne de texte.  La correction automatique de l'inclinaison de l'image n'est pas appliquée. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | Reconnaît plusieurs images de la liste avec les paramètres par défaut.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier avec les paramètres par défaut.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Reconnaît plusieurs images de la liste.  Les archives et les dossiers ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | Reconnaît plusieurs images emballées dans une archive ZIP ou à partir d'un dossier.  Les archives et les dossiers imbriqués ne sont pas pris en charge. Le nombre maximum d'images traitées est de 20. Prend en charge GIF, PNG, JPEG, BMP, TIFF, JFIF. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | Reconnaît le texte sur les passeports. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | Reconnaît le texte sur les passeports. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`RecognitionSettings`](../recognitionsettings/) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | Reconnaître le texte d'un pdf numérisé (extraire des images).  Reconnaît le fichier pdf avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Prend uniquement en charge les PDF numérisés. Ne prend pas en charge les PDF consultables. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | Reconnaît le texte sur l'image. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | Reconnaître le texte d'une image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Prend en charge TIFF (TIF) uniquement. Ne prend pas en charge d'autres types d'images. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | Reconnaître le texte d'une image TIFF multipage.  Reconnaît le fichier TIFF avec la possibilité de spécifier[`DocumentRecognitionSettings`](../documentrecognitionsettings/) . Prend en charge TIFF (TIF) uniquement. Ne prend pas en charge d'autres types d'images. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Permet d'obtenir un document multipage à partir de la liste des objets RecognitionResult |

## Événements

| Nom | La description |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | Un événement pour suivre la progression de la reconnaissance d'images multipages. |

### Voir également

* espace de noms [Aspose.OCR](../../aspose.ocr/)
* Assemblée [Aspose.OCR](../../)


