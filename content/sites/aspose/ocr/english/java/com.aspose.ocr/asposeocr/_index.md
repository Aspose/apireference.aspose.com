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
## Methods

| Method | Description |
| --- | --- |
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
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--com.aspose.ocr.SpellCheck.SpellCheckLanguage-) | Allows to get multipage document from list of RecognitionResult objects with spell-check correction. |
| [SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results)](#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--) | Allows to get multipage document from list of RecognitionResult objects. |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-) | Corrects text (replaces misspelled words). |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-java.lang.String-) | Corrects text (replaces misspelled words). |
| [Recognize(OcrInput input, RecognitionSettings settings)](#Recognize-com.aspose.ocr.OcrInput-com.aspose.ocr.RecognitionSettings-) | Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [Recognize(OcrInput input)](#Recognize-com.aspose.ocr.OcrInput-) | Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeStreetPhoto(OcrInput input)](#RecognizeStreetPhoto-com.aspose.ocr.OcrInput-) | Recognizes text on street photos. |
| [RecognizeFast(OcrInput input)](#RecognizeFast-com.aspose.ocr.OcrInput-) | Recognizes text on good quality image. |
| [RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings)](#RecognizeReceipt-com.aspose.ocr.OcrInput-com.aspose.ocr.ReceiptRecognitionSettings-) | Recognizes receipts with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings)](#RecognizeInvoice-com.aspose.ocr.OcrInput-com.aspose.ocr.InvoiceRecognitionSettings-) | Recognizes invoice with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings)](#RecognizeIDCard-com.aspose.ocr.OcrInput-com.aspose.ocr.IDCardRecognitionSettings-) | Recognizes ID card with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings)](#RecognizeCarPlate-com.aspose.ocr.OcrInput-com.aspose.ocr.CarPlateRecognitionSettings-) | Recognizes car plate with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizePassport(OcrInput input, PassportRecognitionSettings settings)](#RecognizePassport-com.aspose.ocr.OcrInput-com.aspose.ocr.PassportRecognitionSettings-) | Recognizes passport with the ability to specify. |
| [RecognizeHandwrittenText(OcrInput input)](#RecognizeHandwrittenText-com.aspose.ocr.OcrInput-) | Recognizes handwritten text on images. |
| [CalculateSkew(OcrInput input)](#CalculateSkew-com.aspose.ocr.OcrInput-) | Calculates the skew angles of an images. |
| [DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas)](#DetectRectangles-com.aspose.ocr.OcrInput-com.aspose.ocr.AreasType-boolean-) | Detects text areas on images. |
| [RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language)](#RecognizeCharacters-com.aspose.ocr.OcrInput-com.aspose.ocr.DetectAreasMode-com.aspose.ocr.Language-) | Detects symbols on images. |
| [RecognizeCharacters(OcrInput input)](#RecognizeCharacters-com.aspose.ocr.OcrInput-) | Detects symbols on images. |
### AsposeOCR() {#AsposeOCR--}
```
public AsposeOCR()
```


Public constructor.

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
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage) | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage) enum value. |

### SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results) {#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--}
```
public static void SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr/format) | Document format (Docx, Txt, Pdf, PdfNoImg, Xlsx, Xml, Json, Rtf). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult). objects. |

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
### Recognize(OcrInput input) {#Recognize-com.aspose.ocr.OcrInput-}
```
public ArrayList<RecognitionResult> Recognize(OcrInput input)
```


Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). instance. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult)
### RecognizeStreetPhoto(OcrInput input) {#RecognizeStreetPhoto-com.aspose.ocr.OcrInput-}
```
public ArrayList<RecognitionResult> RecognizeStreetPhoto(OcrInput input)
```


Recognizes text on street photos. Extract text from street photos, traffic camera images, ID cards, driver licenses, and other images with sparse text and noisy/colored backgrounds. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). The container with sources.. |

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
### RecognizeHandwrittenText(OcrInput input) {#RecognizeHandwrittenText-com.aspose.ocr.OcrInput-}
```
public ArrayList<RecognitionResult> RecognizeHandwrittenText(OcrInput input)
```


Recognizes handwritten text on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput) | [OcrInput](../../com.aspose.ocr/ocrinput). The container with sources.. |

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
