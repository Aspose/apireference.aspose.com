---
title: AsposeOcr
second_title: Aspose.OCR for .NET API Reference
description: Main API for Aspose OCR library
type: docs
weight: 10
url: /net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Main API for Aspose OCR library

```csharp
public class AsposeOcr
```

## Constructors

| Name | Description |
| --- | --- |
| [AsposeOcr](asposeocr#constructor)() | Initializes a new instance of the [`AsposeOcr`](../asposeocr) class. Empty constructor. |
| [AsposeOcr](asposeocr#constructor_1)(string) | Initializes a new instance of the [`AsposeOcr`](../asposeocr) class. Set the allowed characters with alphabet property. |

## Methods

| Name | Description |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew)(MemoryStream) | Calculates the skew angle of an image. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew#calculateskew_1)(string) | Calculates the skew angle of an image. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri)(string) | Calculates the skew angle of an image from URI. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Corrects text (replaces misspelled words). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles)(MemoryStream, AreasType, bool) | Detects text areas on image.  Automatic image skew correction is not applied. Support GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles#getrectangles_1)(string, AreasType, bool) | Detects text areas on image.  Automatic image skew correction is not applied. Support GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage)(MemoryStream, PreprocessingFilter) | Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; You don't need all of them. Set only what you need. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage#preprocessimage_1)(string, PreprocessingFilter) | Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; You don't need all of them. Set only what you need. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu)(string, DocumentRecognitionSettings) | Recognize text from multi-page DJVU image.  Recognizes DJVU file with the ability to specify [`DocumentRecognitionSettings`](../documentrecognitionsettings). Supports DJVU only. Doesn't supports other image types. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_4)(MemoryStream) | Recognizes text on image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_6)(string) | Recognizes text on image. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage)(MemoryStream, RecognitionSettings) | Recognizes text on image.  Recognizes image with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage#recognizeimage_1)(string, RecognitionSettings) | Recognizes text on image. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast)(MemoryStream) | Recognize text on the image with good quality. Doesn't use skew correction and areas detection. Works in fast mode. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast#recognizeimagefast_1)(string) | Recognize text on the image with good quality. Doesn't use skew correction and areas detection. Works in fast mode. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri_1)(string) | Recognizes text on image provided by URI link. |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri#recognizeimagefromuri)(string, RecognitionSettings) | Recognizes text on image provided by URI link. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline)(MemoryStream) | Recognizes image that contains single line of text.  Automatic image skew correction is not applied. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline#recognizeline_1)(string) | Recognizes image that contains single line of text.  Automatic image skew correction is not applied. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages)(List&lt;string&gt;) | Recognizes multiple images from list with default settings.  Archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_2)(string) | Recognizes multiple images packed in ZIP archive or from folder with default settings.  Nested archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | Recognizes multiple images from list.  Archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages#recognizemultipleimages_3)(string, RecognitionSettings) | Recognizes multiple images packed in ZIP archive or from folder.  Nested archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Recognize text from scanned pdf (extract images).  Recognizes pdf file with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports Scanned PDF only. Doesn't supports Searchable PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf#recognizepdf_1)(string, DocumentRecognitionSettings) | Recognize text from scanned pdf (extract images).  Recognizes pdf file with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports Scanned PDF only. Doesn't supports Searchable PDF. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff)(string, DocumentRecognitionSettings) | Recognize text from multi-page TIFF image.  Recognizes TIFF file with the ability to specify [`DocumentRecognitionSettings`](../documentrecognitionsettings). Supports TIFF (TIF) only. Doesn't supports other image types. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Allows to get multipage document from list of RecognitionResult objects |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Allows to get multipage document from list of RecognitionResult objects |

### See Also

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
