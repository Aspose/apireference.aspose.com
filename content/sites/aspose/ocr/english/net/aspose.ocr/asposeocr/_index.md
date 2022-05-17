---
title: AsposeOcr
second_title: Aspose.OCR for .NET API Reference
description: 
type: docs
weight: 20
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
| [AsposeOcr](asposeocr)() | Initializes a new instance of the [`AsposeOcr`](../asposeocr) class. Empty constructor. |
| [AsposeOcr](asposeocr)(string) | Initializes a new instance of the [`AsposeOcr`](../asposeocr) class. Set the allowed characters with alphabet property. |

## Methods

| Name | Description |
| --- | --- |
| [CalculateSkew](calculateskew)(MemoryStream) | Calculates the skew angle of an image. |
| [CalculateSkew](calculateskew)(string) | Calculates the skew angle of an image. |
| [CalculateSkewFromUri](calculateskewfromuri)(string) | Calculates the skew angle of an image from URI. |
| [CorrectSpelling](correctspelling)(string, SpellCheckLanguage, string) | Corrects text (replaces misspelled words). |
| [GetRectangles](getrectangles)(MemoryStream, AreasType, bool) | Detects text areas on image.  Automatic image skew correction is not applied. Support GIF, PNG, JPEG, BMP, TIFF. |
| [GetRectangles](getrectangles)(string, AreasType, bool) | Detects text areas on image.  Automatic image skew correction is not applied. Support GIF, PNG, JPEG, BMP, TIFF. |
| [PreprocessImage](preprocessimage)(MemoryStream, PreprocessingFilter) | Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; You don't need all of them. Set only what you need. |
| [PreprocessImage](preprocessimage)(string, PreprocessingFilter) | Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; You don't need all of them. Set only what you need. |
| [RecognizeDjvu](recognizedjvu)(string, DocumentRecognitionSettings) | Recognize text from multi-page DJVU image.  Recognizes DJVU file with the ability to specify [`DocumentRecognitionSettings`](../documentrecognitionsettings). Supports DJVU only. Doesn't supports other image types. |
| [RecognizeImage](recognizeimage)(MemoryStream) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(string) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(MemoryStream, List&lt;Rectangle&gt;) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(MemoryStream, RecognitionSettings) | Recognizes text on image.  Recognizes image with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeImage](recognizeimage)(string, List&lt;Rectangle&gt;) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(string, RecognitionSettings) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(MemoryStream, bool, bool) | Recognizes text on image. |
| [RecognizeImage](recognizeimage)(string, bool, bool) | Recognizes text on image. |
| [RecognizeImageFromUri](recognizeimagefromuri)(string) | Recognizes text on image provided by URI link. |
| [RecognizeImageFromUri](recognizeimagefromuri)(string, RecognitionSettings) | Recognizes text on image provided by URI link. |
| [RecognizeLine](recognizeline)(MemoryStream) | Recognizes image that contains single line of text.  Automatic image skew correction is not applied. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeLine](recognizeline)(string) | Recognizes image that contains single line of text.  Automatic image skew correction is not applied. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](recognizemultipleimages)(List&lt;string&gt;) | Recognizes multiple images from list with default settings.  Archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](recognizemultipleimages)(string) | Recognizes multiple images packed in ZIP archive or from folder with default settings.  Nested archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](recognizemultipleimages)(List&lt;string&gt;, RecognitionSettings) | Recognizes multiple images from list.  Archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizeMultipleImages](recognizemultipleimages)(string, RecognitionSettings) | Recognizes multiple images packed in ZIP archive or from folder.  Nested archives and folders are not supported. Max amount of processed images is 20. Supports GIF, PNG, JPEG, BMP, TIFF. |
| [RecognizePdf](recognizepdf)(MemoryStream, DocumentRecognitionSettings) | Recognize text from scanned pdf (extract images).  Recognizes pdf file with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports Scanned PDF only. Doesn't supports Searchable PDF. |
| [RecognizePdf](recognizepdf)(string, DocumentRecognitionSettings) | Recognize text from scanned pdf (extract images).  Recognizes pdf file with the ability to specify [`RecognitionSettings`](../recognitionsettings). Supports Scanned PDF only. Doesn't supports Searchable PDF. |
| [RecognizeTiff](recognizetiff)(string, DocumentRecognitionSettings) | Recognize text from multi-page TIFF image.  Recognizes TIFF file with the ability to specify [`DocumentRecognitionSettings`](../documentrecognitionsettings). Supports TIFF (TIF) only. Doesn't supports other image types. |
| static [SaveMultipageDocument](savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | Allows to get multipage document from list of RecognitionResult objects |
| static [SaveMultipageDocument](savemultipagedocument)(string, SaveFormat, List&lt;RecognitionResult&gt;) | Allows to get multipage document from list of RecognitionResult objects |

### See Also

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
