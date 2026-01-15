---
title: InvoiceRecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the invoice recognition Contains elements that allow customizing the recognition process
type: docs
weight: 17
url: /java/com.aspose.ocr/invoicerecognitionsettings/
---

**Inheritance:**
java.lang.Object, [com.aspose.ocr.ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings/)
```
public class InvoiceRecognitionSettings extends ReceiptRecognitionSettings
```

Settings for the invoice recognition Contains elements that allow customizing the recognition process
## Constructors

| Constructor | Description |
| --- | --- |
| [InvoiceRecognitionSettings()](#InvoiceRecognitionSettings) | Default constructor: set autoSkew true. |
## Methods

| Method | Description |
| --- | --- |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.models.CharactersAllowedType) | Allowed characters set. |
| [setAllowedCharacters(String allowedCharacters)](#setAllowedCharacters-java.lang.String) | Allowed characters set. |
| [setAutomaticColorInversion(boolean automaticColorInversion)](#setAutomaticColorInversion-boolean) | Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them. |
| [setIgnoredCharacters(String characters)](#setIgnoredCharacters-java.lang.String) | Sets blacklist for recognition symbols. |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.models.Language) |  |
| [setLanguageDetectionLevel(LanguageDetectionLevel languageDetectionLevel)](#setLanguageDetectionLevel-com.aspose.ocr.models.LanguageDetectionLevel) | Specifies the level of language detection for text recognition. |
| [setThreadsCount(int threadsCount)](#setThreadsCount-int) | Gets or sets the number of threads for processing. |
| [setUpscaleSmallFont(boolean upscaleSmallFont)](#setUpscaleSmallFont-boolean) | Allows you to use additional algorithms specifically for small font recognition. |
### InvoiceRecognitionSettings() {#InvoiceRecognitionSettings}
```
public InvoiceRecognitionSettings()
```


Default constructor: set autoSkew true.



### setAllowedCharacters(CharactersAllowedType allowedCharacters) {#setAllowedCharacters-com.aspose.ocr.models.CharactersAllowedType}
```
public void setAllowedCharacters(CharactersAllowedType allowedCharacters)
```


Allowed characters set. Determines the type of characters allowed for recognition result.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| allowedCharacters | [CharactersAllowedType](../../com.aspose.ocr.models/charactersallowedtype/) | contains enum @see [CharactersAllowedType](../../com.aspose.ocr.models/charactersallowedtype/) value. |

### setAllowedCharacters(String allowedCharacters) {#setAllowedCharacters-java.lang.String}
```
public void setAllowedCharacters(String allowedCharacters)
```


Allowed characters set. Determines the array of characters allowed for recognition result.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| allowedCharacters | java.lang.String | contains array of characters. |

### setAutomaticColorInversion(boolean automaticColorInversion) {#setAutomaticColorInversion-boolean}
```
public void setAutomaticColorInversion(boolean automaticColorInversion)
```


Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| automaticColorInversion | boolean | contains boolean value - a automaticColorInversion is set. |

### setIgnoredCharacters(String characters) {#setIgnoredCharacters-java.lang.String}
```
public void setIgnoredCharacters(String characters)
```


Sets blacklist for recognition symbols.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| characters | java.lang.String | Characters excluded from recognition. |

### setLanguage(Language language) {#setLanguage-com.aspose.ocr.models.Language}
```
public void setLanguage(Language language)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | [Language](../../com.aspose.ocr.models/language/) | Sets the language used for OCR. Multi-language (none) by default. |

### setLanguageDetectionLevel(LanguageDetectionLevel languageDetectionLevel) {#setLanguageDetectionLevel-com.aspose.ocr.models.LanguageDetectionLevel}
```
public void setLanguageDetectionLevel(LanguageDetectionLevel languageDetectionLevel)
```


Specifies the level of language detection for text recognition. Works only if the selected language is Language.MULTILANGUAGE, Language.AUTO, or Language.UNIVERSAL. This process is time-consuming and significantly slows down the overall recognition.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| languageDetectionLevel | [LanguageDetectionLevel](../../com.aspose.ocr.models/languagedetectionlevel/) | enum value to set level (Paragraph, Word, Page). |

### setThreadsCount(int threadsCount) {#setThreadsCount-int}
```
public void setThreadsCount(int threadsCount)
```


Gets or sets the number of threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| threadsCount | int | the number of threads that will be created for parallel recognition of image fragments. |

### setUpscaleSmallFont(boolean upscaleSmallFont) {#setUpscaleSmallFont-boolean}
```
public void setUpscaleSmallFont(boolean upscaleSmallFont)
```


Allows you to use additional algorithms specifically for small font recognition. Useful for images with small size characters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upscaleSmallFont | boolean | contains boolean value - a upscaleSmallFont is set. |
