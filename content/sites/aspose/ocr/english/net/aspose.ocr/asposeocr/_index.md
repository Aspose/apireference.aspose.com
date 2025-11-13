---
title: AsposeOcr
second_title: Aspose.OCR for .NET API Reference
description: Main API for Aspose OCR library
type: docs
weight: 20
url: /net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Main API for Aspose OCR library

```csharp
public class AsposeOcr : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [AsposeOcr](asposeocr)() | Initializes a new instance of the [`AsposeOcr`](../asposeocr) class. Empty constructor. |

## Methods

| Name | Description |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew)(OcrInput) | Calculates the skew angles of an images. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts)(string, string, RecognitionSettings, bool) | Check if two images contain the same text. |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | Corrects text (replaces misspelled words). |
| [DetectDefects](../../aspose.ocr/asposeocr/detectdefects)(OcrInput, DefectType) | Automatically find problematic areas of an image that can significantly impact the accuracy of OCR. Supports PNG, JPEG, BMP, TIFF, JFIF, and GIF images provided as a file, stream, or pixel array. Supports bulk recognition. |
| [DetectDocumentLayout](../../aspose.ocr/asposeocr/detectdocumentlayout)(OcrInput) | Analyzes the image and identifies the different types of content areas within it. Supports PNG, JPEG, BMP, TIFF, JFIF, and GIF images from files, streams, and pixel arrays. Can bulk process folders and archives. |
| [DetectLanguages](../../aspose.ocr/asposeocr/detectlanguages)(OcrInput) | Analyzes the text on the image to determine the languages it is written in. This allows to select the most suitable recognition language and helps in further text processing tasks such as spellchecking or translation. |
| [Dispose](../../aspose.ocr/asposeocr/dispose)() | Clear resources for recognition. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext#imagehastext_1)(string, Regex, RecognitionSettings, bool) | Check if the image text matches the provided regular expression. |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext#imagehastext)(string, string, RecognitionSettings, bool, bool) | Check if the image contains the provided text fragment. |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff)(string, string, RecognitionSettings, bool, bool) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize)(OcrInput) | Recognizes text on images / documents. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives. |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_1)(OcrInput, AsposeOcrPresets) | Recognizes text from the given OCR input using a predefined preset configuration. |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_2)(OcrInput, RecognitionSettings) | Recognizes text on images / documents. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives. |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_3)(OcrInput, RecognitionSettings, CancellationToken) | Recognizes text on images / documents. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate#recognizecarplate)(OcrInput) | Recognizes text on car plate. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate#recognizecarplate_1)(OcrInput, CarPlateRecognitionSettings) | Recognizes text on car plate. |
| [RecognizeCharacters](../../aspose.ocr/asposeocr/recognizecharacters#recognizecharacters)(OcrInput) | Detects symbols on images. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives. |
| [RecognizeCharacters](../../aspose.ocr/asposeocr/recognizecharacters#recognizecharacters_1)(OcrInput, DetectAreasMode, Language) | Detects symbols on images. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives. |
| [RecognizeFast](../../aspose.ocr/asposeocr/recognizefast)(OcrInput) | Recognizes text on images / documents. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, directory, arrays, archives. |
| [RecognizeFormula](../../aspose.ocr/asposeocr/recognizeformula)(OcrInput, bool) | Recognizes mathematical formulas from the provided input images. |
| [RecognizeHandwrittenText](../../aspose.ocr/asposeocr/recognizehandwrittentext)(OcrInput) | Recognizes handwritten text on images. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard#recognizeidcard)(OcrInput) | Recognizes text on ID card. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard#recognizeidcard_1)(OcrInput, IDCardRecognitionSettings) | Recognizes text on ID card. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice#recognizeinvoice)(OcrInput) | Recognizes text on invoices. |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice#recognizeinvoice_1)(OcrInput, InvoiceRecognitionSettings) | Recognizes text on invoices. |
| [RecognizeLines](../../aspose.ocr/asposeocr/recognizelines#recognizelines)(OcrInput) | Recognizes images that contain single line of text. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives. |
| [RecognizeLines](../../aspose.ocr/asposeocr/recognizelines#recognizelines_1)(OcrInput, RecognitionSettings) | Recognizes images that contain single line of text. Supports GIF, PNG, JPEG, BMP, TIFF, JFIF, stream, folder, arrays, archives. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport#recognizepassport)(OcrInput) | Recognizes text on passport. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport#recognizepassport_1)(OcrInput, PassportRecognitionSettings) | Recognizes text on passport. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt#recognizereceipt)(OcrInput) | Recognizes text on receipts. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt#recognizereceipt_1)(OcrInput, ReceiptRecognitionSettings) | Recognizes text on receipts. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_3)(string, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_2)(string, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects |

## Fields

| Name | Description |
| --- | --- |
| static [DebugMode](../../aspose.ocr/asposeocr/debugmode) | Enables debug mode. When enabled, the system saves intermediate image processing results such as preprocessed images and images with drawn text-line rectangles. |
| static [DebugModeSaveDirectory](../../aspose.ocr/asposeocr/debugmodesavedirectory) | Directory where debug results will be saved. If not set, the current working directory will be used by default. |

## Events

| Name | Description |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress) | An event to track the progress of multi-page image recognition. |

### See Also

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
