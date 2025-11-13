---
title: AsposeOCR
second_title: Aspose.OCR for Java API Reference
description: Main class for recognize text from images
type: docs
weight: 10
url: /java/com.aspose.ocr/asposeocr/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.AutoCloseable
```
public class AsposeOCR implements AutoCloseable
```

Main class for recognize text from images.
## Constructors

| Constructor | Description |
| --- | --- |
| [AsposeOCR()](#AsposeOCR) | Public constructor. |
## Fields

| Field | Description |
| --- | --- |
| [DebugMode](#DebugMode) | Enables debug mode. |
| [DebugModeSaveDirectory](#DebugModeSaveDirectory) | Directory where debug results will be saved. |
## Methods

| Method | Description |
| --- | --- |
| [CalculateSkew(OcrInput input)](#CalculateSkew-com.aspose.ocr.OcrInput) | Calculates the skew angles of an images. |
| [CompareImageTexts(String fullPath1, String fullPath2)](#CompareImageTexts-java.lang.String-java.lang.String) | Check if two images contain the same text. |
| [CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings)](#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings) | Check if two images contain the same text. |
| [CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)](#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean) | Check if two images contain the same text. |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage) | Corrects text (replaces misspelled words). |
| [CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath)](#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-java.lang.String) | Corrects text (replaces misspelled words). |
| [DetectDefects(OcrInput input, DefectType defectType)](#DetectDefects-com.aspose.ocr.OcrInput-com.aspose.ocr.models.DefectType) | Automatically find problematic areas of an image that can significantly impact the accuracy of OCR. |
| [DetectDocumentLayout(OcrInput input)](#DetectDocumentLayout-com.aspose.ocr.OcrInput) | Analyzes the image and identifies the different types of content areas within it. |
| [DetectLanguages(OcrInput input)](#DetectLanguages-com.aspose.ocr.OcrInput) | Analyzes the text on the image to determine the languages it is written in. |
| [DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas)](#DetectRectangles-com.aspose.ocr.OcrInput-com.aspose.ocr.models.AreasType-boolean) | Detects text areas on images. |
| [ImageHasText(String fullPath, String text)](#ImageHasText-java.lang.String-java.lang.String) | Check if the image contains the provided text fragment with a case-insensitive search. |
| [ImageHasText(String fullPath, String text, RecognitionSettings settings)](#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings) | Check if the image contains the provided text fragment with a case-insensitive search. |
| [ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase)](#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean) | Check if the image contains the provided text fragment. |
| [ImageHasText(String fullPath, Pattern regex)](#ImageHasText-java.lang.String-java.util.regex.Pattern) | Check if the image text matches the provided regular expression. |
| [ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings)](#ImageHasText-java.lang.String-java.util.regex.Pattern-com.aspose.ocr.RecognitionSettings) | Check if the image text matches the provided regular expression. |
| [ImageTextDiff(String fullPath1, String fullPath2)](#ImageTextDiff-java.lang.String-java.lang.String) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings)](#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)](#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean) | Compare the texts on the two images and return a number representing how similar they are (0 to 1). |
| [Recognize(OcrInput input)](#Recognize-com.aspose.ocr.OcrInput) | Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [Recognize(OcrInput input, RecognitionSettings settings)](#Recognize-com.aspose.ocr.OcrInput-com.aspose.ocr.RecognitionSettings) | Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings)](#RecognizeCarPlate-com.aspose.ocr.OcrInput-com.aspose.ocr.CarPlateRecognitionSettings) | Recognizes car plate with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeCharacters(OcrInput input)](#RecognizeCharacters-com.aspose.ocr.OcrInput) | Detects symbols on images. |
| [RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language)](#RecognizeCharacters-com.aspose.ocr.OcrInput-com.aspose.ocr.models.DetectAreasMode-com.aspose.ocr.models.Language) | Detects symbols on images. |
| [RecognizeFast(OcrInput input)](#RecognizeFast-com.aspose.ocr.OcrInput) | Recognizes text on good quality image. |
| [RecognizeFormula(OcrInput input, boolean detectAreas)](#RecognizeFormula-com.aspose.ocr.OcrInput-boolean) | Recognizes mathematical formulas from the provided input images. |
| [RecognizeHandwrittenText(OcrInput input)](#RecognizeHandwrittenText-com.aspose.ocr.OcrInput) | Recognizes handwritten text on images. |
| [RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings)](#RecognizeIDCard-com.aspose.ocr.OcrInput-com.aspose.ocr.IDCardRecognitionSettings) | Recognizes ID card with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings)](#RecognizeInvoice-com.aspose.ocr.OcrInput-com.aspose.ocr.InvoiceRecognitionSettings) | Recognizes invoice with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [RecognizePassport(OcrInput input, PassportRecognitionSettings settings)](#RecognizePassport-com.aspose.ocr.OcrInput-com.aspose.ocr.PassportRecognitionSettings) | Recognizes passport with the ability to specify. |
| [RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings)](#RecognizeReceipt-com.aspose.ocr.OcrInput-com.aspose.ocr.ReceiptRecognitionSettings) | Recognizes receipts with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64. |
| [SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results)](#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath)](#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--com.aspose.ocr.SpellCheck.SpellCheckLanguage) | Allows to get multipage document from list of RecognitionResult objects with spell-check correction. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String) | Allows to get multipage document from list of RecognitionResult objects. |
| [SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Allows to get multipage document from list of RecognitionResult objects. |
| [close()](#close) |  |
### AsposeOCR() {#AsposeOCR}
```
public AsposeOCR()
```


Public constructor.

### DebugMode {#DebugMode}
```
public static boolean DebugMode
```


Enables debug mode. When enabled, the system saves intermediate image processing results such as preprocessed images and images with drawn text-line rectangles.

### DebugModeSaveDirectory {#DebugModeSaveDirectory}
```
public static String DebugModeSaveDirectory
```


Directory where debug results will be saved. If not set, the current working directory will be used by default.

### CalculateSkew(OcrInput input) {#CalculateSkew-com.aspose.ocr.OcrInput}
```
public ArrayList<SkewOutput> CalculateSkew(OcrInput input)
```


Calculates the skew angles of an images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.models.SkewOutput> - ArrayList of skew angles in degrees [SkewOutput](../../com.aspose.ocr.models/skewoutput/)
### CompareImageTexts(String fullPath1, String fullPath2) {#CompareImageTexts-java.lang.String-java.lang.String}
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
### CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings) {#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings}
```
public boolean CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings)
```


Check if two images contain the same text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |

**Returns:**
boolean - True if images have the same text (90% similarity).
### CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase) {#CompareImageTexts-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean}
```
public boolean CompareImageTexts(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)
```


Check if two images contain the same text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
boolean - True if images have the same text (90% similarity).
### CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language) {#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage}
```
public String CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language)
```


Corrects text (replaces misspelled words).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text for correction. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | Dictionary to use [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/). |

**Returns:**
java.lang.String - Text with replaced words.
### CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath) {#CorrectSpelling-java.lang.String-com.aspose.ocr.SpellCheck.SpellCheckLanguage-java.lang.String}
```
public String CorrectSpelling(String text, SpellCheck.SpellCheckLanguage language, String dictionaryPath)
```


Corrects text (replaces misspelled words).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Text for correction. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | Dictionary to use [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/). |
| dictionaryPath | java.lang.String | Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by comma, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\\n"), a carriage return ("\\r"), or a carriage return immediately followed by a line feed("\\r\\n"). Every word is expected to be in lower case. |

**Returns:**
java.lang.String - Text with replaced words.
### DetectDefects(OcrInput input, DefectType defectType) {#DetectDefects-com.aspose.ocr.OcrInput-com.aspose.ocr.models.DefectType}
```
public ArrayList<DefectOutput> DetectDefects(OcrInput input, DefectType defectType)
```


Automatically find problematic areas of an image that can significantly impact the accuracy of OCR. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |
| defectType | [DefectType](../../com.aspose.ocr.models/defecttype/) | The types of defects to be recognized [DefectType](../../com.aspose.ocr.models/defecttype/). |

**Returns:**
java.util.ArrayList<com.aspose.ocr.DefectOutput> - ArrayList of [DefectOutput](../../com.aspose.ocr/defectoutput/) with detected text areas or lines.
### DetectDocumentLayout(OcrInput input) {#DetectDocumentLayout-com.aspose.ocr.OcrInput}
```
public ArrayList<LayoutOutput> DetectDocumentLayout(OcrInput input)
```


Analyzes the image and identifies the different types of content areas within it. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.models.LayoutOutput> - Detected content areas. ArrayList of [LayoutOutput](../../com.aspose.ocr.models/layoutoutput/)
### DetectLanguages(OcrInput input) {#DetectLanguages-com.aspose.ocr.OcrInput}
```
public ArrayList<LanguageDetectionOutput> DetectLanguages(OcrInput input)
```


Analyzes the text on the image to determine the languages it is written in. This allows to select the most suitable recognition language and helps in further text processing tasks such as spellchecking or translation. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.models.LanguageDetectionOutput> - Returns a list of the most probable languages, ranked by likelihood. ArrayList of [LanguageDetectionOutput](../../com.aspose.ocr.models/languagedetectionoutput/)
### DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas) {#DetectRectangles-com.aspose.ocr.OcrInput-com.aspose.ocr.models.AreasType-boolean}
```
public ArrayList<RectangleOutput> DetectRectangles(OcrInput input, AreasType areasType, boolean isDetectAreas)
```


Detects text areas on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |
| areasType | [AreasType](../../com.aspose.ocr.models/areastype/) | Determinates wich rectangles to return - line or paragraphs. |
| isDetectAreas | boolean | Enable automatic text areas detection. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RectangleOutput> - ArrayList of [RectangleOutput](../../com.aspose.ocr/rectangleoutput/) with detected text areas or lines.
### ImageHasText(String fullPath, String text) {#ImageHasText-java.lang.String-java.lang.String}
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
### ImageHasText(String fullPath, String text, RecognitionSettings settings) {#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings}
```
public boolean ImageHasText(String fullPath, String text, RecognitionSettings settings)
```


Check if the image contains the provided text fragment with a case-insensitive search.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| text | java.lang.String | Text fragment for searching on the image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |

**Returns:**
boolean - True if image contains text fragment. False - image doesn't contains text fragment.
### ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase) {#ImageHasText-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean}
```
public boolean ImageHasText(String fullPath, String text, RecognitionSettings settings, boolean ignoreCase)
```


Check if the image contains the provided text fragment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| text | java.lang.String | Text fragment for searching on the image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
boolean - True if image contains text fragment. False - image doesn't contains text fragment.
### ImageHasText(String fullPath, Pattern regex) {#ImageHasText-java.lang.String-java.util.regex.Pattern}
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
### ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings) {#ImageHasText-java.lang.String-java.util.regex.Pattern-com.aspose.ocr.RecognitionSettings}
```
public boolean ImageHasText(String fullPath, Pattern regex, RecognitionSettings settings)
```


Check if the image text matches the provided regular expression.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Path to the image. |
| regex | java.util.regex.Pattern | java.util.regex.Pattern object with the provided pattern and options. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |

**Returns:**
boolean - True if image text matches the provided regular expression.
### ImageTextDiff(String fullPath1, String fullPath2) {#ImageTextDiff-java.lang.String-java.lang.String}
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
### ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings) {#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings}
```
public float ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings)
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |

**Returns:**
float - 0 means that the texts are completely different; 1 means the texts are identical.
### ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase) {#ImageTextDiff-java.lang.String-java.lang.String-com.aspose.ocr.RecognitionSettings-boolean}
```
public float ImageTextDiff(String fullPath1, String fullPath2, RecognitionSettings settings, boolean ignoreCase)
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath1 | java.lang.String | Path to the first image. |
| fullPath2 | java.lang.String | Path to the second image. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | Recognition settings. |
| ignoreCase | boolean | True - means a case-insensitive search. |

**Returns:**
float - 0 means that the texts are completely different; 1 means the texts are identical.
### Recognize(OcrInput input) {#Recognize-com.aspose.ocr.OcrInput}
```
public OcrOutput Recognize(OcrInput input)
```


Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### Recognize(OcrInput input, RecognitionSettings settings) {#Recognize-com.aspose.ocr.OcrInput-com.aspose.ocr.RecognitionSettings}
```
public OcrOutput Recognize(OcrInput input, RecognitionSettings settings)
```


Recognizes image with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/) | [RecognitionSettings](../../com.aspose.ocr/recognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings) {#RecognizeCarPlate-com.aspose.ocr.OcrInput-com.aspose.ocr.CarPlateRecognitionSettings}
```
public OcrOutput RecognizeCarPlate(OcrInput input, CarPlateRecognitionSettings settings)
```


Recognizes car plate with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings/) | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizeCharacters(OcrInput input) {#RecognizeCharacters-com.aspose.ocr.OcrInput}
```
public ArrayList<CharacterRecognitionResult> RecognizeCharacters(OcrInput input)
```


Detects symbols on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |

**Returns:**
java.util.ArrayList<com.aspose.ocr.models.CharacterRecognitionResult> - ArrayList of [Character](../../com.aspose.ocr.models/character/) with detected symbols data for each image.
### RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language) {#RecognizeCharacters-com.aspose.ocr.OcrInput-com.aspose.ocr.models.DetectAreasMode-com.aspose.ocr.models.Language}
```
public ArrayList<CharacterRecognitionResult> RecognizeCharacters(OcrInput input, DetectAreasMode detectAreasMode, Language language)
```


Detects symbols on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | The container with sources.[OcrInput](../../com.aspose.ocr/ocrinput/) |
| detectAreasMode | [DetectAreasMode](../../com.aspose.ocr.models/detectareasmode/) | Determines the type of neural network used for areas detection. |
| language | [Language](../../com.aspose.ocr.models/language/) | Language used for OCR. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.models.CharacterRecognitionResult> - ArrayList of [Character](../../com.aspose.ocr.models/character/) with detected symbols data.
### RecognizeFast(OcrInput input) {#RecognizeFast-com.aspose.ocr.OcrInput}
```
public ArrayList<String> RecognizeFast(OcrInput input)
```


Recognizes text on good quality image. Doesn't use automatic image skew correction and text areas detection. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/) instance. |

**Returns:**
java.util.ArrayList<java.lang.String> - ArrayList with recognized text.
### RecognizeFormula(OcrInput input, boolean detectAreas) {#RecognizeFormula-com.aspose.ocr.OcrInput-boolean}
```
public OcrOutput RecognizeFormula(OcrInput input, boolean detectAreas)
```


Recognizes mathematical formulas from the provided input images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| detectAreas | boolean | If set to true, automatically detects and isolates formula regions before performing recognition. If false, processes the entire image as a formula. |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - OcrOutput list with images recognition results [OcrOutput](../../com.aspose.ocr/ocroutput/)
### RecognizeHandwrittenText(OcrInput input) {#RecognizeHandwrittenText-com.aspose.ocr.OcrInput}
```
public OcrOutput RecognizeHandwrittenText(OcrInput input)
```


Recognizes handwritten text on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). The container with sources.. |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings) {#RecognizeIDCard-com.aspose.ocr.OcrInput-com.aspose.ocr.IDCardRecognitionSettings}
```
public OcrOutput RecognizeIDCard(OcrInput input, IDCardRecognitionSettings settings)
```


Recognizes ID card with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings/) | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings) {#RecognizeInvoice-com.aspose.ocr.OcrInput-com.aspose.ocr.InvoiceRecognitionSettings}
```
public OcrOutput RecognizeInvoice(OcrInput input, InvoiceRecognitionSettings settings)
```


Recognizes invoice with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings/) | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizePassport(OcrInput input, PassportRecognitionSettings settings) {#RecognizePassport-com.aspose.ocr.OcrInput-com.aspose.ocr.PassportRecognitionSettings}
```
public OcrOutput RecognizePassport(OcrInput input, PassportRecognitionSettings settings)
```


Recognizes passport with the ability to specify. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings/) | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings) {#RecognizeReceipt-com.aspose.ocr.OcrInput-com.aspose.ocr.ReceiptRecognitionSettings}
```
public OcrOutput RecognizeReceipt(OcrInput input, ReceiptRecognitionSettings settings)
```


Recognizes receipts with the ability to specify Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, InputStream, BufferedImage, folder, array, zip archive, URL, base64.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [OcrInput](../../com.aspose.ocr/ocrinput/) | [OcrInput](../../com.aspose.ocr/ocrinput/). instance. |
| settings | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings/) | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings/). |

**Returns:**
[OcrOutput](../../com.aspose.ocr/ocroutput/) - RecognitionResult list with images recognition results [RecognitionResult](../../com.aspose.ocr/recognitionresult/)
### SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results) {#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult}
```
public static void SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, PdfNoImg, Xlsx, Xml, Json, Rtf). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |

### SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath) {#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String}
```
public static void SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, PdfNoImg, Xlsx, Xml, Json, Rtf). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |
| embeddedFontPath | java.lang.String | Optionally. Full path to the user font. |

### SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#SaveMultipageDocument-java.io.OutputStream-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public static void SaveMultipageDocument(OutputStream stream, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, PdfNoImg, Xlsx, Xml, Json, Rtf). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |
| embeddedFontPath | java.lang.String | Optionally. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |

### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--com.aspose.ocr.SpellCheck.SpellCheckLanguage}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, SpellCheck.SpellCheckLanguage language)
```


Allows to get multipage document from list of RecognitionResult objects with spell-check correction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) enum value. |

### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |
| embeddedFontPath | java.lang.String | Optionally. Full path to the user font. |

### SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#SaveMultipageDocument-java.lang.String-com.aspose.ocr.models.Format-java.util.ArrayList-com.aspose.ocr.RecognitionResult--java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public static void SaveMultipageDocument(String fullFileName, Format saveFormat, ArrayList<RecognitionResult> results, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Allows to get multipage document from list of RecognitionResult objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Xml, Json). |
| results | java.util.ArrayList<com.aspose.ocr.RecognitionResult> | List of [RecognitionResult](../../com.aspose.ocr/recognitionresult/). objects. |
| embeddedFontPath | java.lang.String | Optionally. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### close() {#close}
```
public void close()
```