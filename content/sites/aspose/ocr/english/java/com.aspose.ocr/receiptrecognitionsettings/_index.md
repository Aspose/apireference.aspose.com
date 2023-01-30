---
title: ReceiptRecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the receipt recognition Contains elements that allow customizing the recognition process
type: docs
weight: 19
url: /java/com.aspose.ocr/receiptrecognitionsettings/
---

**Inheritance:**
java.lang.Object
```
public class ReceiptRecognitionSettings
```

Settings for the receipt recognition Contains elements that allow customizing the recognition process
## Constructors

| Constructor | Description |
| --- | --- |
| [ReceiptRecognitionSettings()](#ReceiptRecognitionSettings--) | Default constructor: set autoSkew true. |
| [ReceiptRecognitionSettings(boolean autoSkew)](#ReceiptRecognitionSettings-boolean-) | Constructor allows to set all options. |
| [ReceiptRecognitionSettings(DocumentRecognitionSettings docSettings)](#ReceiptRecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-) |  |
## Methods

| Method | Description |
| --- | --- |
| [setAutoSkew(boolean autoSkew)](#setAutoSkew-boolean-) | Sets a flag indicating whether automatic receipt skew correction should be enabled. |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.Language-) |  |
| [setIgnoredCharacters(String characters)](#setIgnoredCharacters-java.lang.String-) | Sets blacklist for recognition symbols. |
| [setThreadsCount(int threadsCount)](#setThreadsCount-int-) | Gets or sets the number of threads for processing. |
| [setPreprocessingFilters(PreprocessingFilter preprocessingFilters)](#setPreprocessingFilters-com.aspose.ocr.PreprocessingFilter-) | Allows to prepare the image for OCR by adjusting pre-processing methods. |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-) | Allowed characters set. |
| [setAllowedCharacters(String allowedCharacters)](#setAllowedCharacters-java.lang.String-) | Allowed characters set. |
| [setUpscaleSmallFont(boolean upscaleSmallFont)](#setUpscaleSmallFont-boolean-) | Allows you to use additional algorithms specifically for small font recognition. |
### ReceiptRecognitionSettings() {#ReceiptRecognitionSettings--}
```
public ReceiptRecognitionSettings()
```


Default constructor: set autoSkew true.

### ReceiptRecognitionSettings(boolean autoSkew) {#ReceiptRecognitionSettings-boolean-}
```
public ReceiptRecognitionSettings(boolean autoSkew)
```


Constructor allows to set all options.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoSkew | boolean | True if the image needs alignment. |

### ReceiptRecognitionSettings(DocumentRecognitionSettings docSettings) {#ReceiptRecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ReceiptRecognitionSettings(DocumentRecognitionSettings docSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| docSettings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) |  |

### setAutoSkew(boolean autoSkew) {#setAutoSkew-boolean-}
```
public void setAutoSkew(boolean autoSkew)
```


Sets a flag indicating whether automatic receipt skew correction should be enabled. Enabled (true) by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoSkew | boolean | Detect and rotate if true. |

### setLanguage(Language language) {#setLanguage-com.aspose.ocr.Language-}
```
public void setLanguage(Language language)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | [Language](../../com.aspose.ocr/language) | Sets the language used for OCR. Multi-language (none) by default. |

### setIgnoredCharacters(String characters) {#setIgnoredCharacters-java.lang.String-}
```
public void setIgnoredCharacters(String characters)
```


Sets blacklist for recognition symbols.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| characters | java.lang.String | Characters excluded from recognition. |

### setThreadsCount(int threadsCount) {#setThreadsCount-int-}
```
public void setThreadsCount(int threadsCount)
```


Gets or sets the number of threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| threadsCount | int | the number of threads that will be created for parallel recognition of image fragments. |

### setPreprocessingFilters(PreprocessingFilter preprocessingFilters) {#setPreprocessingFilters-com.aspose.ocr.PreprocessingFilter-}
```
public void setPreprocessingFilters(PreprocessingFilter preprocessingFilters)
```


Allows to prepare the image for OCR by adjusting pre-processing methods.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| preprocessingFilters | [PreprocessingFilter](../../com.aspose.ocr/preprocessingfilter) | contains user preprocessing operations or null. |

### setAllowedCharacters(CharactersAllowedType allowedCharacters) {#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-}
```
public void setAllowedCharacters(CharactersAllowedType allowedCharacters)
```


Allowed characters set. Determines the type of characters allowed for recognition result.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| allowedCharacters | [CharactersAllowedType](../../com.aspose.ocr/charactersallowedtype) | contains enum @see [CharactersAllowedType](../../com.aspose.ocr/charactersallowedtype) value. |

### setAllowedCharacters(String allowedCharacters) {#setAllowedCharacters-java.lang.String-}
```
public void setAllowedCharacters(String allowedCharacters)
```


Allowed characters set. Determines the array of characters allowed for recognition result.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| allowedCharacters | java.lang.String | contains array of characters. |

### setUpscaleSmallFont(boolean upscaleSmallFont) {#setUpscaleSmallFont-boolean-}
```
public void setUpscaleSmallFont(boolean upscaleSmallFont)
```


Allows you to use additional algorithms specifically for small font recognition. Useful for images with small size characters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upscaleSmallFont | boolean | contains boolean value - a upscaleSmallFont is set. |

