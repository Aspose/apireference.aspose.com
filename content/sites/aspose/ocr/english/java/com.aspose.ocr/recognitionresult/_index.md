---
title: RecognitionResult
second_title: Aspose.OCR for Java API Reference
description: The results of the image recognition
type: docs
weight: 26
url: /java/com.aspose.ocr/recognitionresult/
---

**Inheritance:**
java.lang.Object
```
public class RecognitionResult
```

The results of the image recognition. Contains elements with recognition information and methods for result export.
## Constructors

| Constructor | Description |
| --- | --- |
| [RecognitionResult()](#RecognitionResult) | Initializes a new instance of the |
## Fields

| Field | Description |
| --- | --- |
| [language](#language) | The language of the recognized text in the image. |
| [recognitionCharactersList](#recognitionCharactersList) | A set of characters found by the recognition algorithm and arranged in descending order of probability. |
| [recognitionLinesResult](#recognitionLinesResult) | Gets a list of recognition results with a list of rows (Rectangles). |
| [recognitionText](#recognitionText) | Recognition result of all page or one area. |
| [warnings](#warnings) | Gets or sets list of the warnings messages describing non-critical faults appeared during generation. |
## Methods

| Method | Description |
| --- | --- |
| [GetJson()](#GetJson) | Form JSON string with recognition results. |
| [GetKeywords()](#GetKeywords) | Get keywords from pasport (Test mode. |
| [GetXml()](#GetXml) | Form JSON string with recognition results. |
| [SetKeyword(String key, RecognitionResult.LinesResult result)](#SetKeyword-java.lang.String-com.aspose.ocr.RecognitionResult.LinesResult) |  |
| [getSpellCheckCorrectedText()](#getSpellCheckCorrectedText) | Corrects text (replaces misspelled words). |
| [getSpellCheckCorrectedText(SpellCheck.SpellCheckLanguage language)](#getSpellCheckCorrectedText-com.aspose.ocr.SpellCheck.SpellCheckLanguage) | Corrects text (replaces misspelled words). |
| [getSpellCheckErrorList()](#getSpellCheckErrorList) | Find the misspelled words with suggested spellings for a given input text. |
| [getSpellCheckErrorList(SpellCheck.SpellCheckLanguage language)](#getSpellCheckErrorList-com.aspose.ocr.SpellCheck.SpellCheckLanguage) | Find the misspelled words with suggested spellings for a given input text. |
| [save(String fullFileName)](#save-java.lang.String) | Saves the document in the plain text |
| [save(String fullFileName, Format format)](#save-java.lang.String-com.aspose.ocr.models.Format) | Saves the document in the plain text or other document format. |
| [save(String fullFileName, Format format, PdfOptimizationMode optimizePdf)](#save-java.lang.String-com.aspose.ocr.models.Format-com.aspose.ocr.models.PdfOptimizationMode) | Saves the document in the plain text or other document format. |
| [saveSpellCheckCorrectedText(String fullFileName, Format format)](#saveSpellCheckCorrectedText-java.lang.String-com.aspose.ocr.models.Format) | Saves the corrected with English dictionary text in the document in the plain text or Microsoft Word Text Document format. |
| [saveSpellCheckCorrectedText(String fullFileName, Format format, SpellCheck.SpellCheckLanguage language)](#saveSpellCheckCorrectedText-java.lang.String-com.aspose.ocr.models.Format-com.aspose.ocr.SpellCheck.SpellCheckLanguage) | Saves the corrected text in the document in the plain text or other format. |
| [toString()](#toString) |  |
| [useUserDictionary(String dictionaryPath)](#useUserDictionary-java.lang.String) | Allows to use own dictionary for spell-check correction. |

### RecognitionResult() {#RecognitionResult}
```
public RecognitionResult()
```


Initializes a new instance of the

### language {#language}
```
public Language language
```


The language of the recognized text in the image. This value is determined automatically if  Language.AUTO ,  Language.MULTILANGUAGE , or  Language.UNIVERSAL  is selected.

### recognitionCharactersList {#recognitionCharactersList}
```
public ArrayList<char[]> recognitionCharactersList
```


A set of characters found by the recognition algorithm and arranged in descending order of probability.

### recognitionLinesResult {#recognitionLinesResult}
```
public ArrayList<RecognitionResult.LinesResult> recognitionLinesResult
```


Gets a list of recognition results with a list of rows (Rectangles).

### recognitionText {#recognitionText}
```
public String recognitionText
```


Recognition result of all page or one area.

### warnings {#warnings}
```
public ArrayList<String> warnings
```


Gets or sets list of the warnings messages describing non-critical faults appeared during generation.

### GetJson() {#GetJson}
```
public String GetJson()
```


Form JSON string with recognition results.

**Returns:**
java.lang.String - Recognition results as JSON string.
### GetKeywords() {#GetKeywords}
```
public HashMap<String,RecognitionResult.LinesResult> GetKeywords()
```


Get keywords from pasport (Test mode. Works only for USA and MADAGASCAR passports).

**Returns:**
java.util.HashMap<java.lang.String,com.aspose.ocr.RecognitionResult.LinesResult> - Dictionary with keyword as a key and LinesResult as a value.
### GetXml() {#GetXml}
```
public String GetXml()
```


Form JSON string with recognition results.

**Returns:**
java.lang.String - Recognition results as XML string.
### SetKeyword(String key, RecognitionResult.LinesResult result) {#SetKeyword-java.lang.String-com.aspose.ocr.RecognitionResult.LinesResult}
```
public void SetKeyword(String key, RecognitionResult.LinesResult result)
```



### getSpellCheckCorrectedText() {#getSpellCheckCorrectedText}
```
public String getSpellCheckCorrectedText()
```


Corrects text (replaces misspelled words).

**Returns:**
java.lang.String - Corrected recognition results string. Default English dictionary.
### getSpellCheckCorrectedText(SpellCheck.SpellCheckLanguage language) {#getSpellCheckCorrectedText-com.aspose.ocr.SpellCheck.SpellCheckLanguage}
```
public String getSpellCheckCorrectedText(SpellCheck.SpellCheckLanguage language)
```


Corrects text (replaces misspelled words).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | Dictionary to use. |

**Returns:**
java.lang.String - Corrected recognition results string.
### getSpellCheckErrorList() {#getSpellCheckErrorList}
```
public List<SpellCheck.SpellCheckError> getSpellCheckErrorList()
```


Find the misspelled words with suggested spellings for a given input text. Default English dictionary.

**Returns:**
java.util.List<com.aspose.ocr.SpellCheck.SpellCheckError> - ArrayList of SpellCheckError object representing misspelled words with lists suggested correct spellings for the each misspelled word, and with the edit distance.
### getSpellCheckErrorList(SpellCheck.SpellCheckLanguage language) {#getSpellCheckErrorList-com.aspose.ocr.SpellCheck.SpellCheckLanguage}
```
public List<SpellCheck.SpellCheckError> getSpellCheckErrorList(SpellCheck.SpellCheckLanguage language)
```


Find the misspelled words with suggested spellings for a given input text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | Dictionary to use. |

**Returns:**
java.util.List<com.aspose.ocr.SpellCheck.SpellCheckError> - ArrayList of SpellCheckError object representing misspelled words with lists suggested correct spellings for the each misspelled word, and with the edit distance.




### save(String fullFileName) {#save-java.lang.String}
```
public void save(String fullFileName)
```


Saves the document in the plain text

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result |

### save(String fullFileName, Format format) {#save-java.lang.String-com.aspose.ocr.models.Format}
```
public void save(String fullFileName, Format format)
```


Saves the document in the plain text or other document format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result. |
| format | [Format](../../com.aspose.ocr.models/format/) | Document format enum type of Format. |

### save(String fullFileName, Format format, PdfOptimizationMode optimizePdf) {#save-java.lang.String-com.aspose.ocr.models.Format-com.aspose.ocr.models.PdfOptimizationMode}
```
public void save(String fullFileName, Format format, PdfOptimizationMode optimizePdf)
```


Saves the document in the plain text or other document format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result. |
| format | [Format](../../com.aspose.ocr.models/format/) | Document format enum type of Format. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### saveSpellCheckCorrectedText(String fullFileName, Format format) {#saveSpellCheckCorrectedText-java.lang.String-com.aspose.ocr.models.Format}
```
public void saveSpellCheckCorrectedText(String fullFileName, Format format)
```


Saves the corrected with English dictionary text in the document in the plain text or Microsoft Word Text Document format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result. |
| format | [Format](../../com.aspose.ocr.models/format/) | Document format enum type of Format. |

### saveSpellCheckCorrectedText(String fullFileName, Format format, SpellCheck.SpellCheckLanguage language) {#saveSpellCheckCorrectedText-java.lang.String-com.aspose.ocr.models.Format-com.aspose.ocr.SpellCheck.SpellCheckLanguage}
```
public void saveSpellCheckCorrectedText(String fullFileName, Format format, SpellCheck.SpellCheckLanguage language)
```


Saves the corrected text in the document in the plain text or other format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result. |
| format | [Format](../../com.aspose.ocr.models/format/) | Document format enum type of Format. |
| language | [SpellCheckLanguage](../../com.aspose.ocr.spellcheck/spellchecklanguage/) | Dictionary for spell check. |
### useUserDictionary(String dictionaryPath) {#useUserDictionary-java.lang.String}
```
public void useUserDictionary(String dictionaryPath)
```


Allows to use own dictionary for spell-check correction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dictionaryPath | java.lang.String | Full path to the user dictionary (frequency dictionary). Dictionary file format: Plain text file in UTF-8 encoding. Word and Word Frequency are separated by comma, the word is expected in the first column and the frequency in the second column. Every word-frequency-pair in a separate line.A line is defined as a sequence of characters followed by a line feed ("\\n"), a carriage return ("\\r"), or a carriage return immediately followed by a line feed("\\r\\n"). Every word is expected to be in lower case. |
