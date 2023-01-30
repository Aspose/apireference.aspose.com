---
title: CarPlateRecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the car number recognition Contains elements that allow customizing the recognition process
type: docs
weight: 11
url: /java/com.aspose.ocr/carplaterecognitionsettings/
---

**Inheritance:**
java.lang.Object
```
public class CarPlateRecognitionSettings
```

Settings for the car number recognition Contains elements that allow customizing the recognition process
## Constructors

| Constructor | Description |
| --- | --- |
| [CarPlateRecognitionSettings()](#CarPlateRecognitionSettings--) | Default constructor: set autoSkew true. |
| [CarPlateRecognitionSettings(DocumentRecognitionSettings docSettings)](#CarPlateRecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-) |  |
## Methods

| Method | Description |
| --- | --- |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.Language-) |  |
| [setIgnoredCharacters(String characters)](#setIgnoredCharacters-java.lang.String-) | Sets blacklist for recognition symbols. |
| [setPreprocessingFilters(PreprocessingFilter preprocessingFilters)](#setPreprocessingFilters-com.aspose.ocr.PreprocessingFilter-) | Allows to prepare the image for OCR by adjusting pre-processing methods. |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-) | Allowed characters set. |
### CarPlateRecognitionSettings() {#CarPlateRecognitionSettings--}
```
public CarPlateRecognitionSettings()
```


Default constructor: set autoSkew true.

### CarPlateRecognitionSettings(DocumentRecognitionSettings docSettings) {#CarPlateRecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-}
```
public CarPlateRecognitionSettings(DocumentRecognitionSettings docSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| docSettings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) |  |

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

