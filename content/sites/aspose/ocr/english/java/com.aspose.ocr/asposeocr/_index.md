---
title: AsposeOCR
second_title: Aspose.OCR for Java API Reference
description: Main class for recognize text from images.
type: docs
weight: 10
url: /java/com.aspose.ocr/asposeocr/
---

**Inheritance:**
java.lang.Object
```
public class AsposeOCR
```

Main class for recognize text from images.
## Constructors

| Constructor | Description |
| --- | --- |
| [AsposeOCR()](#AsposeOCR--) | Public constructor. |
| [AsposeOCR(String alphabet)](#AsposeOCR-java.lang.String-) | Public constructor. |
## Methods

| Method | Description |
| --- | --- |
| [CalcSkewImage(String fullPath)](#CalcSkewImage-java.lang.String-) | Calculates the skew angle of an image. |
| [CalcSkewImage(BufferedImage image)](#CalcSkewImage-java.awt.image.BufferedImage-) | Calculates the skew angle of an image. |
| [CalcSkewImageFromUri(String uri)](#CalcSkewImageFromUri-java.lang.String-) | Calculates the skew angle of an image provided by URI link. |
| [PreprocessImage(String fullPath, PreprocessingFilter filters)](#PreprocessImage-java.lang.String-com.aspose.ocr.PreprocessingFilter-) | Use image preprocessing to improve the accuracy of OCR. |
| [PreprocessImage(BufferedImage image, PreprocessingFilter filters)](#PreprocessImage-java.awt.image.BufferedImage-com.aspose.ocr.PreprocessingFilter-) | Use image preprocessing to improve the accuracy of OCR. |
| [RecognizeTiff(String fullPath, DocumentRecognitionSettings settings)](#RecognizeTiff-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text on TIFF encoded images with image skew correction and text areas detection enable in setting by default. |
| [RecognizePdf(String fullPath, DocumentRecognitionSettings settings)](#RecognizePdf-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text from scanned PDF (extract images). |
| [RecognizePageFast(String fullPath)](#RecognizePageFast-java.lang.String-) | Recognizes text on good quality image. |
| [RecognizePage(String fullPath)](#RecognizePage-java.lang.String-) | Recognizes text on image. |
| [RecognizePage(String fullPath, boolean autoSkew)](#RecognizePage-java.lang.String-boolean-) | Recognizing image with automatic detection of text areas and ability to disable image skew correction. |
| [RecognizePage(String fullPath, ArrayList<Rectangle> boxes_)](#RecognizePage-java.lang.String-java.util.ArrayList-java.awt.Rectangle--) | Recognizes text on image. |
| [RecognizePage(String fullPath, RecognitionSettings settings)](#RecognizePage-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Recognizes image with the ability to specify |
| [RecognizeReceipt(String fullPath, ReceiptRecognitionSettings settings)](#RecognizeReceipt-java.lang.String-com.aspose.ocr.ReceiptRecognitionSettings-) | Recognizes receipt with the ability to specify |
| [RecognizeInvoice(String fullPath, InvoiceRecognitionSettings settings)](#RecognizeInvoice-java.lang.String-com.aspose.ocr.InvoiceRecognitionSettings-) | Recognizes text on invoice image with the ability to specify |
| [RecognizeIDCard(String fullPath, IDCardRecognitionSettings settings)](#RecognizeIDCard-java.lang.String-com.aspose.ocr.IDCardRecognitionSettings-) | Recognizes ID Card with the ability to specify |
| [RecognizeCarPlate(String fullPath, CarPlateRecognitionSettings settings)](#RecognizeCarPlate-java.lang.String-com.aspose.ocr.CarPlateRecognitionSettings-) | Recognizes car plate with the ability to specify |
| [RecognizePassport(String fullPath, PassportRecognitionSettings settings)](#RecognizePassport-java.lang.String-com.aspose.ocr.PassportRecognitionSettings-) | Recognizes passport with the ability to specify |
| [RecognizeLine(String fullPath)](#RecognizeLine-java.lang.String-) | Recognizes image that contains single line of text. |
| [RecognizePage(BufferedImage image)](#RecognizePage-java.awt.image.BufferedImage-) | Recognizes text on image. |
| [RecognizePage(BufferedImage image, boolean autoSkew)](#RecognizePage-java.awt.image.BufferedImage-boolean-) | Recognizing image with automatic detection of text areas and ability to disable image skew correction. |
| [RecognizePage(BufferedImage image_, ArrayList<Rectangle> boxes_)](#RecognizePage-java.awt.image.BufferedImage-java.util.ArrayList-java.awt.Rectangle--) | Recognizes text on image. |
| [RecognizePage(BufferedImage image_, RecognitionSettings settings)](#RecognizePage-java.awt.image.BufferedImage-com.aspose.ocr.RecognitionSettings-) | Recognizes image with the ability to specify |
| [RecognizeCarPlate(BufferedImage image_, CarPlateRecognitionSettings settings)](#RecognizeCarPlate-java.awt.image.BufferedImage-com.aspose.ocr.CarPlateRecognitionSettings-) | Recognizes car plate with the ability to specify |
| [RecognizeIDCard(BufferedImage image_, IDCardRecognitionSettings settings)](#RecognizeIDCard-java.awt.image.BufferedImage-com.aspose.ocr.IDCardRecognitionSettings-) | Recognizes ID Card with the ability to specify |
| [RecognizeInvoice(BufferedImage image_, InvoiceRecognitionSettings settings)](#RecognizeInvoice-java.awt.image.BufferedImage-com.aspose.ocr.InvoiceRecognitionSettings-) | Recognizes invoice with the ability to specify |
| [RecognizePassport(BufferedImage image_, PassportRecognitionSettings settings)](#RecognizePassport-java.awt.image.BufferedImage-com.aspose.ocr.PassportRecognitionSettings-) | Recognizes Passport with the ability to specify |
| [RecognizeReceipt(BufferedImage image_, ReceiptRecognitionSettings settings)](#RecognizeReceipt-java.awt.image.BufferedImage-com.aspose.ocr.ReceiptRecognitionSettings-) | Recognizes receipt with the ability to specify |
| [RecognizeTiff(InputStream stream, DocumentRecognitionSettings settings)](#RecognizeTiff-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text on TIFF encoded images with image skew correction and text areas detection enable in setting by default. |
| [RecognizePdf(InputStream stream, DocumentRecognitionSettings settings)](#RecognizePdf-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text from scanned PDF (extract images). |
| [RecognizeLine(BufferedImage image_)](#RecognizeLine-java.awt.image.BufferedImage-) | Recognizes image that contains single line of text. |
| [RecognizeMultiplePages(String path, RecognitionSettings settings)](#RecognizeMultiplePages-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Recognizes multiple images packed in ZIP archive or from folder. |
| [RecognizeMultiplePages(ArrayList<String> files, RecognitionSettings settings)](#RecognizeMultiplePages-java.util.ArrayList-java.lang.String--com.aspose.ocr.RecognitionSettings-) | Recognizes multiple images from ArrayList. |
| [RecognizePageFromUri(String uri)](#RecognizePageFromUri-java.lang.String-) | Recognizes text on image provided by URI link. |
| [RecognizePageFromUri(String uri, RecognitionSettings settings)](#RecognizePageFromUri-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Recognizes text on image provided by URI link. |
| [RecognizePage(int[] pixels, int width, int height, int bitsPerPixel, RecognitionSettings settings)](#RecognizePage-int---int-int-int-com.aspose.ocr.RecognitionSettings-) | Recognizes image with the ability to specify |
| [ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase)](#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-) | Check if the image contains the provided text fragment. |
| [ImageHasText(String fullPath, String text, RecognitionSettings settings)](#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Check if the image contains the provided text fragment with a case-insensitive search. |
| [ImageHasText(String fullPath, String text)](#ImageHasText-java.lang.String-java.lang.String-) | Check if the image contains the provided text fragment with a case-insensitive search. |
| [ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings)](#ImageHasText-java.lang.String-java.util.regex.Pattern-com.aspose.ocr.RecognitionSettings-) | Check if the image text matches the provided regular expression. |
| [ImageHasText(String fullPath, Pattern regex)](#ImageHasText-java.lang.String-java.util.regex.Pattern-) | Check if the image text matches the provided regular expression. |
| [CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)](#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-) | Check if two images contain the same text. |
| [CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings)](#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Check if two images contain the same text. |
| [CompareImageTexts(String fullPath1, String fullPath2)](#CompareImageTexts-java.lang.String-java.lang.String-) | Check if two images contain the same text. |
| [ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)](#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings)](#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [ImageTextDiff(String fullPath1, String fullPath2)](#ImageTextDiff-java.lang.String-java.lang.String-) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [getTextAreas(String fullPath, AreasType areasType, boolean isDetectAreas)](#getTextAreas-java.lang.String-com.aspose.ocr.AreasType-boolean-) | Detects text areas on image. |
| [getTextAreas(BufferedImage image_, AreasType areasType, boolean isDetectAreas)](#getTextAreas-java.awt.image.BufferedImage-com.aspose.ocr.AreasType-boolean-) | Detects text areas on image. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--com.aspose.ocr.SpellCheck.SpellCheckLanguage-) | Allows to get multipage document from list of RecognitionResult objects with spell-check correction. |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-) | Corrects text (replaces misspelled words). |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-java.lang.String-) | Corrects text (replaces misspelled words). |
| [Recognize(OcrInput input, RecognitionSettings settings)](#Recognize-com.aspose.ocr.OcrInput-com.aspose.ocr.RecognitionSettings-) | Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeFast(OcrInput input)](#RecognizeFast-com.aspose.ocr.OcrInput-) | Recognizes text on good quality image. |
| [RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings)](#RecognizeReceipt-com.aspose.ocr.OcrInput-com.aspose.ocr.ReceiptRecognitionSettings-) | Recognizes receipts with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings)](#RecognizeInvoice-com.aspose.ocr.OcrInput-com.aspose.ocr.InvoiceRecognitionSettings-) | Recognizes invoice with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings)](#RecognizeIDCard-com.aspose.ocr.OcrInput-com.aspose.ocr.IDCardRecognitionSettings-) | Recognizes ID card with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings)](#RecognizeCarPlate-com.aspose.ocr.OcrInput-com.aspose.ocr.CarPlateRecognitionSettings-) | Recognizes car plate with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizePassport(OcrInput input, PassportRecognitionSettings settings)](#RecognizePassport-com.aspose.ocr.OcrInput-com.aspose.ocr.PassportRecognitionSettings-) | Recognizes passport with the ability to specify. |
| [CalculateSkew(OcrInput input)](#CalculateSkew-com.aspose.ocr.OcrInput-) | Calculates the skew angles of an images. |
| [DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas)](#DetectRectangles-com.aspose.ocr.OcrInput-com.aspose.ocr.AreasType-boolean-) | Detects text areas on images. |
| [RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language)](#RecognizeCharacters-com.aspose.ocr.OcrInput-com.aspose.ocr.DetectAreasMode-com.aspose.ocr.Language-) | Detects symbols on images. |
| [RecognizeCharacters(OcrInput input)](#RecognizeCharacters-com.aspose.ocr.OcrInput-) | Detects symbols on images. |
### AsposeOCR() {#AsposeOCR--}
```
public AsposeOCR()
```


Public constructor.

### AsposeOCR(String alphabet) {#AsposeOCR-java.lang.String-}
```
public AsposeOCR(String alphabet)
```


Public constructor.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| alphabet | java.lang.String | Narrow alphabet for recognition. |

### CalcSkewImage(String fullPath) {#CalcSkewImage-java.lang.String-}
```
public double CalcSkewImage(String fullPath)
```


Calculates the skew angle of an image.

//\* @param fullPath Path to image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String |  |

**Returns:**
double - Skew angle in degrees.
### CalcSkewImage(BufferedImage image) {#CalcSkewImage-java.awt.image.BufferedImage-}
```
public double CalcSkewImage(BufferedImage image)
```


Calculates the skew angle of an image. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | BufferedImage instance. |

**Returns:**
double - Skew angle in degrees.
### CalcSkewImageFromUri(String uri) {#CalcSkewImageFromUri-java.lang.String-}
```
public double CalcSkewImageFromUri(String uri)
```


Calculates the skew angle of an image provided by URI link.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uri | java.lang.String | URI link to the image. |

**Returns:**
double - Skew angle in degrees.
### PreprocessImage(String fullPath, PreprocessingFilter filters) {#PreprocessImage-java.lang.String-com.aspose.ocr.PreprocessingFilter-}
```
public BufferedImage PreprocessImage(String fullPath, PreprocessingFilter filters)
```


Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter(); filters.add(PreprocessingFilter.ToGrayscale()); filters.add(PreprocessingFilter.Invert()); filters.add(PreprocessingFilter.Threshold(20));

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Full path to the image. |
| filters | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) | Image optimization filters @see [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) |

**Returns:**
java.awt.image.BufferedImage - BufferedImage with modified image so you can save or recognize it.
### PreprocessImage(BufferedImage image, PreprocessingFilter filters) {#PreprocessImage-java.awt.image.BufferedImage-com.aspose.ocr.PreprocessingFilter-}
```
public BufferedImage PreprocessImage(BufferedImage image, PreprocessingFilter filters)
```


Use image preprocessing to improve the accuracy of OCR. Create a list of filters that will be applied to the input image in the order you specify. example to create filters: PreprocessingFilter filters = new PreprocessingFilter(); filters.add(PreprocessingFilter.ToGrayscale()); filters.add(PreprocessingFilter.Invert()); filters.add(PreprocessingFilter.Threshold(20));

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Source BufferedImage. |
| filters | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) | Image optimization filters @see [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) |

**Returns:**
java.awt.image.BufferedImage - BufferedImage with modified image so you can save or recognize it.
### RecognizeTiff(String fullPath, DocumentRecognitionSettings settings) {#RecognizeTiff-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeTiff(String fullPath, DocumentRecognitionSettings settings)
```


Recognize text on TIFF encoded images with image skew correction and text areas detection enable in setting by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | fullPath Path to TIFF image. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - Recognized text.
### RecognizePdf(String fullPath, DocumentRecognitionSettings settings) {#RecognizePdf-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizePdf(String fullPath, DocumentRecognitionSettings settings)
```


Recognize text from scanned PDF (extract images).

Recognizes pdf file with the ability to specify @see DocumentRecognitionSettings. Supports Scanned PDF only. Doesn't supports Searchable PDF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Full path to the image. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - The ArrayList of @see \#RecognitionResult objects with image recognition results.
### RecognizePageFast(String fullPath) {#RecognizePageFast-java.lang.String-}
```
public String RecognizePageFast(String fullPath)
```


Recognizes text on good quality image. Doesn't use automatic image skew correction and text areas detection. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to image. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(String fullPath) {#RecognizePage-java.lang.String-}
```
public String RecognizePage(String fullPath)
```


Recognizes text on image. Uses automatic image skew correction and text areas detection. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to image. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(String fullPath, boolean autoSkew) {#RecognizePage-java.lang.String-boolean-}
```
public String RecognizePage(String fullPath, boolean autoSkew)
```


Recognizing image with automatic detection of text areas and ability to disable image skew correction. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| autoSkew | boolean | Enable automatic image skew correction. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(String fullPath, ArrayList<Rectangle> boxes_) {#RecognizePage-java.lang.String-java.util.ArrayList-java.awt.Rectangle--}
```
public String RecognizePage(String fullPath, ArrayList<Rectangle> boxes_)
```


Recognizes text on image. Recognizes image with ability to specify text areas. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP. Automatic image skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to image. |
| boxes_ | java.util.ArrayList<java.awt.Rectangle> | List of areas to recognize. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(String fullPath, RecognitionSettings settings) {#RecognizePage-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public RecognitionResult RecognizePage(String fullPath, RecognitionSettings settings)
```


Recognizes image with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with image recognition results.
### RecognizeReceipt(String fullPath, ReceiptRecognitionSettings settings) {#RecognizeReceipt-java.lang.String-com.aspose.ocr.ReceiptRecognitionSettings-}
```
public RecognitionResult RecognizeReceipt(String fullPath, ReceiptRecognitionSettings settings)
```


Recognizes receipt with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the receipt. |
| settings | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings) | Receipt recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with image recognition results.
### RecognizeInvoice(String fullPath, InvoiceRecognitionSettings settings) {#RecognizeInvoice-java.lang.String-com.aspose.ocr.InvoiceRecognitionSettings-}
```
public RecognitionResult RecognizeInvoice(String fullPath, InvoiceRecognitionSettings settings)
```


Recognizes text on invoice image with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the invoice. |
| settings | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings) | Invoice recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with invoice recognition results.
### RecognizeIDCard(String fullPath, IDCardRecognitionSettings settings) {#RecognizeIDCard-java.lang.String-com.aspose.ocr.IDCardRecognitionSettings-}
```
public RecognitionResult RecognizeIDCard(String fullPath, IDCardRecognitionSettings settings)
```


Recognizes ID Card with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the ID Card. |
| settings | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings) | ID Card recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with ID Card recognition results.
### RecognizeCarPlate(String fullPath, CarPlateRecognitionSettings settings) {#RecognizeCarPlate-java.lang.String-com.aspose.ocr.CarPlateRecognitionSettings-}
```
public RecognitionResult RecognizeCarPlate(String fullPath, CarPlateRecognitionSettings settings)
```


Recognizes car plate with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the car number image. |
| settings | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings) | Car plate recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with car number recognition results.
### RecognizePassport(String fullPath, PassportRecognitionSettings settings) {#RecognizePassport-java.lang.String-com.aspose.ocr.PassportRecognitionSettings-}
```
public RecognitionResult RecognizePassport(String fullPath, PassportRecognitionSettings settings)
```


Recognizes passport with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the passport image. |
| settings | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings) | Passport recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with passport recognition results.
### RecognizeLine(String fullPath) {#RecognizeLine-java.lang.String-}
```
public String RecognizeLine(String fullPath)
```


Recognizes image that contains single line of text. Automatic image skew correction is not applied. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(BufferedImage image) {#RecognizePage-java.awt.image.BufferedImage-}
```
public String RecognizePage(BufferedImage image)
```


Recognizes text on image. Uses automatic image skew correction and text areas detection. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Source BufferedImage. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(BufferedImage image, boolean autoSkew) {#RecognizePage-java.awt.image.BufferedImage-boolean-}
```
public String RecognizePage(BufferedImage image, boolean autoSkew)
```


Recognizing image with automatic detection of text areas and ability to disable image skew correction. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | BufferedImage instance. |
| autoSkew | boolean | Enable automatic image skew correction. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(BufferedImage image_, ArrayList<Rectangle> boxes_) {#RecognizePage-java.awt.image.BufferedImage-java.util.ArrayList-java.awt.Rectangle--}
```
public String RecognizePage(BufferedImage image_, ArrayList<Rectangle> boxes_)
```


Recognizes text on image. Recognizes image with ability to specify text areas. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP. Automatic image skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| boxes_ | java.util.ArrayList<java.awt.Rectangle> | List of areas to recognize. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePage(BufferedImage image_, RecognitionSettings settings) {#RecognizePage-java.awt.image.BufferedImage-com.aspose.ocr.RecognitionSettings-}
```
public RecognitionResult RecognizePage(BufferedImage image_, RecognitionSettings settings)
```


Recognizes image with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with image recognition results.
### RecognizeCarPlate(BufferedImage image_, CarPlateRecognitionSettings settings) {#RecognizeCarPlate-java.awt.image.BufferedImage-com.aspose.ocr.CarPlateRecognitionSettings-}
```
public RecognitionResult RecognizeCarPlate(BufferedImage image_, CarPlateRecognitionSettings settings)
```


Recognizes car plate with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings) | Car plate recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with car plate recognition results.
### RecognizeIDCard(BufferedImage image_, IDCardRecognitionSettings settings) {#RecognizeIDCard-java.awt.image.BufferedImage-com.aspose.ocr.IDCardRecognitionSettings-}
```
public RecognitionResult RecognizeIDCard(BufferedImage image_, IDCardRecognitionSettings settings)
```


Recognizes ID Card with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings) | ID Card recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with ID Card recognition results.
### RecognizeInvoice(BufferedImage image_, InvoiceRecognitionSettings settings) {#RecognizeInvoice-java.awt.image.BufferedImage-com.aspose.ocr.InvoiceRecognitionSettings-}
```
public RecognitionResult RecognizeInvoice(BufferedImage image_, InvoiceRecognitionSettings settings)
```


Recognizes invoice with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings) | Invoice recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with invoice recognition results.
### RecognizePassport(BufferedImage image_, PassportRecognitionSettings settings) {#RecognizePassport-java.awt.image.BufferedImage-com.aspose.ocr.PassportRecognitionSettings-}
```
public RecognitionResult RecognizePassport(BufferedImage image_, PassportRecognitionSettings settings)
```


Recognizes Passport with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings) | passport recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with passport recognition results.
### RecognizeReceipt(BufferedImage image_, ReceiptRecognitionSettings settings) {#RecognizeReceipt-java.awt.image.BufferedImage-com.aspose.ocr.ReceiptRecognitionSettings-}
```
public RecognitionResult RecognizeReceipt(BufferedImage image_, ReceiptRecognitionSettings settings)
```


Recognizes receipt with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| settings | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings) | Receipt recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with image recognition results.
### RecognizeTiff(InputStream stream, DocumentRecognitionSettings settings) {#RecognizeTiff-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeTiff(InputStream stream, DocumentRecognitionSettings settings)
```


Recognize text on TIFF encoded images with image skew correction and text areas detection enable in setting by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream with TIFF image. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - Recognized text.
### RecognizePdf(InputStream stream, DocumentRecognitionSettings settings) {#RecognizePdf-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizePdf(InputStream stream, DocumentRecognitionSettings settings)
```


Recognize text from scanned PDF (extract images).

Recognizes pdf file with the ability to specify @see DocumentRecognitionSettings. Supports Scanned PDF only. Doesn't supports Searchable PDF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream with the scanned PDF file. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - The ArrayList of @see \#RecognitionResult objects with image recognition results.
### RecognizeLine(BufferedImage image_) {#RecognizeLine-java.awt.image.BufferedImage-}
```
public String RecognizeLine(BufferedImage image_)
```


Recognizes image that contains single line of text. Automatic image skew correction is not applied. Support for GIF, PNG, JPEG, BMP and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |

**Returns:**
java.lang.String - Recognized text.
### RecognizeMultiplePages(String path, RecognitionSettings settings) {#RecognizeMultiplePages-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeMultiplePages(String path, RecognitionSettings settings)
```


Recognizes multiple images packed in ZIP archive or from folder. Nested archives and folders are not supported. Max amount of processed images is 20. Support for GIF, PNG, JPEG, BMP and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Full path to the zip archive (including .zip extension) or to the folder with images. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - Objects with recognition results for each processed image.
### RecognizeMultiplePages(ArrayList<String> files, RecognitionSettings settings) {#RecognizeMultiplePages-java.util.ArrayList-java.lang.String--com.aspose.ocr.RecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeMultiplePages(ArrayList<String> files, RecognitionSettings settings)
```


Recognizes multiple images from ArrayList. Archives and folders are not supported. Max amount of processed images is 20. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| files | java.util.ArrayList<java.lang.String> | Full paths to the images. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - Objects with recognition results for each processed image.
### RecognizePageFromUri(String uri) {#RecognizePageFromUri-java.lang.String-}
```
public String RecognizePageFromUri(String uri)
```


Recognizes text on image provided by URI link. Uses automatic image skew correction and text areas detection. Supports GIF, PNG, JPEG, BMP, JFIF, TIFF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uri | java.lang.String | URI link to the image. |

**Returns:**
java.lang.String - Recognized text.
### RecognizePageFromUri(String uri, RecognitionSettings settings) {#RecognizePageFromUri-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public RecognitionResult RecognizePageFromUri(String uri, RecognitionSettings settings)
```


Recognizes text on image provided by URI link. Support for GIF, PNG, JPEG, BMP, JFIF and WBMP.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uri | java.lang.String | URI link to the image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | RecognizeSettings |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object.
### RecognizePage(int[] pixels, int width, int height, int bitsPerPixel, RecognitionSettings settings) {#RecognizePage-int---int-int-int-com.aspose.ocr.RecognitionSettings-}
```
public RecognitionResult RecognizePage(int[] pixels, int width, int height, int bitsPerPixel, RecognitionSettings settings)
```


Recognizes image with the ability to specify

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixels | int[] | The pixels are represented as 32-bit integer values (rgb). |
| width | int | width of the original image. |
| height | int | height of the original image. |
| bitsPerPixel | int | Supports 1-32 bits. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
[RecognitionResult](../../com.aspose.ocr/recognitionresult) - RecognitionResult object with image recognition results.
### ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase) {#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-}
```
public boolean ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase)
```


Check if the image contains the provided text fragment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| text | java.lang.String | Text fragment for searching on the image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
boolean - True if image contains text fragment. False - image doesn't contains text fragment.
### ImageHasText(String fullPath, String text, RecognitionSettings settings) {#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public boolean ImageHasText(String fullPath, String text, RecognitionSettings settings)
```


Check if the image contains the provided text fragment with a case-insensitive search.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| text | java.lang.String | Text fragment for searching on the image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
boolean - True if image contains text fragment. False - image doesn't contains text fragment.
### ImageHasText(String fullPath, String text) {#ImageHasText-java.lang.String-java.lang.String-}
```
public boolean ImageHasText(String fullPath, String text)
```


Check if the image contains the provided text fragment with a case-insensitive search.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| text | java.lang.String | Text fragment for searching on the image. |

**Returns:**
boolean - True if image contains text fragment. False - image doesn't contains text fragment.
### ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings) {#ImageHasText-java.lang.String-java.util.regex.Pattern-com.aspose.ocr.RecognitionSettings-}
```
public boolean ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings)
```


Check if the image text matches the provided regular expression.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| regex | java.util.regex.Pattern | java.util.regex.Pattern object with the provided pattern and options. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
boolean - True if image text matches the provided regular expression.
### ImageHasText(String fullPath, Pattern regex) {#ImageHasText-java.lang.String-java.util.regex.Pattern-}
```
public boolean ImageHasText(String fullPath, Pattern regex)
```


Check if the image text matches the provided regular expression.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| regex | java.util.regex.Pattern | java.util.regex.Pattern object with the provided pattern and options. |

**Returns:**
boolean - True if image text matches the provided regular expression.
### CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase) {#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-}
```
public boolean CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)
```


Check if two images contain the same text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
boolean - True if images have the same text (90% similarity).
### CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings) {#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public boolean CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings)
```


Check if two images contain the same text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
boolean - True if images have the same text (90% similarity).
### CompareImageTexts(String fullPath1, String fullPath2) {#CompareImageTexts-java.lang.String-java.lang.String-}
```
public boolean CompareImageTexts(String fullPath1, String fullPath2)
```


Check if two images contain the same text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |

**Returns:**
boolean - True if images have the same text (90% similarity).
### ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase) {#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean-}
```
public float ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
float - 0 means that the texts are completely different; 1 means the texts are identical.
### ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings) {#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-}
```
public float ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings)
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | Recognition settings. |

**Returns:**
float - 0 means that the texts are completely different; 1 means the texts are identical.
### ImageTextDiff(String fullPath1, String fullPath2) {#ImageTextDiff-java.lang.String-java.lang.String-}
```
public float ImageTextDiff(String fullPath1, String fullPath2)
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |

**Returns:**
float - 0 means that the texts are completely different; 1 means the texts are identical.
### getTextAreas(String fullPath, AreasType areasType, boolean isDetectAreas) {#getTextAreas-java.lang.String-com.aspose.ocr.AreasType-boolean-}
```
public ArrayList<Rectangle> getTextAreas(String fullPath, AreasType areasType, boolean isDetectAreas)
```


Detects text areas on image. Automatic image skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| areasType | [AreasType](../../com.aspose.ocr/areastype) | Determinate which rectangles to return - line or paragraphs. |
| isDetectAreas | boolean | Enable automatic text areas detection. |

**Returns:**
java.util.ArrayList<java.awt.Rectangle> - ArrayList of detected text areas.
### getTextAreas(BufferedImage image_, AreasType areasType, boolean isDetectAreas) {#getTextAreas-java.awt.image.BufferedImage-com.aspose.ocr.AreasType-boolean-}
```
public ArrayList<Rectangle> getTextAreas(BufferedImage image_, AreasType areasType, boolean isDetectAreas)
```


Detects text areas on image. Automatic image skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image_ | java.awt.image.BufferedImage | BufferedImage instance. |
| areasType | [AreasType](../../com.aspose.ocr/areastype) | Determinate which rectangles to return - line or paragraphs. |
| isDetectAreas | boolean | Enable automatic text areas detection. |

**Returns:**
java.util.ArrayList<java.awt.Rectangle> - ArrayList of detected text areas.
### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr/format) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult). objects. |

### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--com.aspose.ocr.SpellCheck.SpellCheckLanguage-}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language)
```


Allows to get multipage document from list of RecognitionResult objects with spell-check correction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr/format) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult). objects. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage) |  |

### CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language) {#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-}
```
public String CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language)
```


Corrects text (replaces misspelled words).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text for correction. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage) | Dictionary to use [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage). |

**Returns:**
java.lang.String - Text with replaced words.
### CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath) {#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-java.lang.String-}
```
public String CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath)
```


Corrects text (replaces misspelled words).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text for correction. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage) | Dictionary to use [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage). |
| dictionaryPath | java.lang.String | Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by comma, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\\n"), a carriage return ("\\r"), or a carriage return immediately followed by a line feed("\\r\\n"). Every word is expected to be in lower case. |

**Returns:**
java.lang.String - Text with replaced words.
### Recognize(OcrInput input, RecognitionSettings settings) {#Recognize-com.aspose.ocr.OcrInput-com.aspose.ocr.RecognitionSettings-}
```
public ArrayList<RecognitionResult> Recognize(OcrInput input, RecognitionSettings settings)
```


Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings) | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizeFast(OcrInput input) {#RecognizeFast-com.aspose.ocr.OcrInput-}
```
public ArrayList<String> RecognizeFast(OcrInput input)
```


Recognizes text on good quality image. Doesn't use automatic image skew correction and text areas detection. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput) instance. |

**Returns:**
java.util.ArrayList<java.lang.String> - ArrayList with recognized text.
### RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings) {#RecognizeReceipt-com.aspose.ocr.OcrInput-com.aspose.ocr.ReceiptRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings)
```


Recognizes receipts with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings) | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings) {#RecognizeInvoice-com.aspose.ocr.OcrInput-com.aspose.ocr.InvoiceRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings)
```


Recognizes invoice with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings) | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings) {#RecognizeIDCard-com.aspose.ocr.OcrInput-com.aspose.ocr.IDCardRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings)
```


Recognizes ID card with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings) | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings) {#RecognizeCarPlate-com.aspose.ocr.OcrInput-com.aspose.ocr.CarPlateRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings)
```


Recognizes car plate with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings) | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizePassport(OcrInput input, PassportRecognitionSettings settings) {#RecognizePassport-com.aspose.ocr.OcrInput-com.aspose.ocr.PassportRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizePassport(OcrInput input, PassportRecognitionSettings settings)
```


Recognizes passport with the ability to specify. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |
| settings | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings) | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### CalculateSkew(OcrInput input) {#CalculateSkew-com.aspose.ocr.OcrInput-}
```
public ArrayList<SkewOutput> CalculateSkew(OcrInput input)
```


Calculates the skew angles of an images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.SkewOutput> - ArrayList of skew angles in degrees [SkewOutput](../../com.aspose.ocr/skewoutput)
### DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas) {#DetectRectangles-com.aspose.ocr.OcrInput-com.aspose.ocr.AreasType-boolean-}
```
public ArrayList<RectangleOutput> DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas)
```


Detects text areas on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput) |
| areasType | [AreasType](../../com.aspose.ocr/areastype) | Determinates wich rectangles to return - line or paragraphs. |
| isDetectAreas | boolean | Enable automatic text areas detection. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RectangleOutput> - ArrayList of [RectangleOutput](../../com.aspose.ocr/rectangleoutput) with detected text areas or lines.
### RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language) {#RecognizeCharacters-com.aspose.ocr.OcrInput-com.aspose.ocr.DetectAreasMode-com.aspose.ocr.Language-}
```
public ArrayList<CharacterRecognitionResult> RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language)
```


Detects symbols on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput) |
| detectAreasMode | [DetectAreasMode](../../com.aspose.ocr/detectareasmode) | Determines the type of neural network used for areas detection. |
| language | [Language](../../com.aspose.ocr/language) | Language used for OCR. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.CharacterRecognitionResult> - ArrayList of [Character](../../com.aspose.ocr/character) with detected symbols data.
### RecognizeCharacters(OcrInput input) {#RecognizeCharacters-com.aspose.ocr.OcrInput-}
```
public ArrayList<CharacterRecognitionResult> RecognizeCharacters(OcrInput input)
```


Detects symbols on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.CharacterRecognitionResult> - ArrayList of [Character](../../com.aspose.ocr/character) with detected symbols data for each image.
