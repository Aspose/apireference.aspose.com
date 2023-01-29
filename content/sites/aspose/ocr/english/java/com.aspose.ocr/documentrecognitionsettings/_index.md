---
title: DocumentRecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the pdf recognition.
type: docs
weight: 12
url: /java/com.aspose.ocr/documentrecognitionsettings/
---

**Inheritance:**
java.lang.Object
```
public class DocumentRecognitionSettings
```

Settings for the pdf recognition. Contains elements that allow customizing the recognition process.
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentRecognitionSettings(int pagesNumber)](#DocumentRecognitionSettings-int-) | Initializes a new instance of the @see \#DocumentRecognitionSettings class with default properties. |
| [DocumentRecognitionSettings(int startPage, int pagesNumber)](#DocumentRecognitionSettings-int-int-) | Initializes a new instance of the @see \#DocumentRecognitionSettings class with short set of properties. |
| [DocumentRecognitionSettings(int startPage, int pagesNumber, Language language, boolean detectAreas, boolean autoSkew, int threshold)](#DocumentRecognitionSettings-int-int-com.aspose.ocr.Language-boolean-boolean-int-) | Initializes a new instance of the @see \#DocumentRecognitionSettings class with full set of properties. |
## Methods

| Method | Description |
| --- | --- |
| [setDetectAreas(boolean detectAreas)](#setDetectAreas-boolean-) |  |
| [setAutoSkew(boolean autoSkew)](#setAutoSkew-boolean-) |  |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.Language-) |  |
| [setThresholdValue(int thresholdValue)](#setThresholdValue-int-) |  |
| [setIgnoredCharacters(String ignoredCharacters)](#setIgnoredCharacters-java.lang.String-) |  |
| [setLinesFiltration(boolean linesFiltration)](#setLinesFiltration-boolean-) |  |
| [setStartPage(int startPage)](#setStartPage-int-) |  |
| [setPagesNumber(int pagesNumber)](#setPagesNumber-int-) |  |
| [setThreadsCount(int threadsCount)](#setThreadsCount-int-) | Gets or sets the number of threads for processing. |
| [setAutoContrast(boolean autoContrast)](#setAutoContrast-boolean-) | Allows using an additional contrast correction algorithm for the image before recognition. |
| [setAutoDenoising(boolean autoDenoising)](#setAutoDenoising-boolean-) | Enables the use of an additional neural network to improve the image - reduce noise. |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-) | Allowed characters set. |
| [setAllowedCharacters(String allowedCharacters)](#setAllowedCharacters-java.lang.String-) | Allowed characters set. |
| [setDetectAreasMode(DetectAreasMode detectAreasMode)](#setDetectAreasMode-com.aspose.ocr.DetectAreasMode-) | Determines the type of neural network used for areas detection. |
| [setSkew(double skew)](#setSkew-double-) | Sets angle in degrees for image rotation. |
| [setUpscaleSmallFont(boolean upscaleSmallFont)](#setUpscaleSmallFont-boolean-) | Allows you to use additional algorithms specifically for small font recognition. |
| [getStartPage()](#getStartPage--) | First page in pdf file to extract images. |
| [getPagesNumber()](#getPagesNumber--) | Total amount of pages from pdf file to extract i,ages (start with startPage). |
### DocumentRecognitionSettings(int pagesNumber) {#DocumentRecognitionSettings-int-}
```
public DocumentRecognitionSettings(int pagesNumber)
```


Initializes a new instance of the @see \#DocumentRecognitionSettings class with default properties. Demands to set pagesNumber. Set 0 to recognize all pages in document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pagesNumber | int | Set the number of pages for recognition multipage pdf file. |

### DocumentRecognitionSettings(int startPage, int pagesNumber) {#DocumentRecognitionSettings-int-int-}
```
public DocumentRecognitionSettings(int startPage, int pagesNumber)
```


Initializes a new instance of the @see \#DocumentRecognitionSettings class with short set of properties.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPage | int | Set the first page for recognition. |
| pagesNumber | int | Set the number of pages for recognition multipage pdf file. |

### DocumentRecognitionSettings(int startPage, int pagesNumber, Language language, boolean detectAreas, boolean autoSkew, int threshold) {#DocumentRecognitionSettings-int-int-com.aspose.ocr.Language-boolean-boolean-int-}
```
public DocumentRecognitionSettings(int startPage, int pagesNumber, Language language, boolean detectAreas, boolean autoSkew, int threshold)
```


Initializes a new instance of the @see \#DocumentRecognitionSettings class with full set of properties.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPage | int | Set the first page for recognition. 0 by default. |
| pagesNumber | int | Set the number of pages for recognition multipage pdf file. |
| language | [Language](../../com.aspose.ocr/language) | Language used for OCR. |
| detectAreas | boolean | Enable automatic text areas detection. |
| autoSkew | boolean | Enable automatic image skew correction. |
| threshold | int | Custom image binarization threshold |

### setDetectAreas(boolean detectAreas) {#setDetectAreas-boolean-}
```
public void setDetectAreas(boolean detectAreas)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| detectAreas | boolean |  |

### setAutoSkew(boolean autoSkew) {#setAutoSkew-boolean-}
```
public void setAutoSkew(boolean autoSkew)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoSkew | boolean |  |

### setLanguage(Language language) {#setLanguage-com.aspose.ocr.Language-}
```
public void setLanguage(Language language)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | [Language](../../com.aspose.ocr/language) |  |

### setThresholdValue(int thresholdValue) {#setThresholdValue-int-}
```
public void setThresholdValue(int thresholdValue)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| thresholdValue | int |  |

### setIgnoredCharacters(String ignoredCharacters) {#setIgnoredCharacters-java.lang.String-}
```
public void setIgnoredCharacters(String ignoredCharacters)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| ignoredCharacters | java.lang.String |  |

### setLinesFiltration(boolean linesFiltration) {#setLinesFiltration-boolean-}
```
public void setLinesFiltration(boolean linesFiltration)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| linesFiltration | boolean |  |

### setStartPage(int startPage) {#setStartPage-int-}
```
public void setStartPage(int startPage)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPage | int |  |

### setPagesNumber(int pagesNumber) {#setPagesNumber-int-}
```
public void setPagesNumber(int pagesNumber)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pagesNumber | int |  |

### setThreadsCount(int threadsCount) {#setThreadsCount-int-}
```
public void setThreadsCount(int threadsCount)
```


Gets or sets the number of threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| threadsCount | int | the number of threads that will be created for parallel recognition of image fragments. |

### setAutoContrast(boolean autoContrast) {#setAutoContrast-boolean-}
```
public void setAutoContrast(boolean autoContrast)
```


Allows using an additional contrast correction algorithm for the image before recognition.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoContrast | boolean | contains boolean value - a contrast correction filter is set. |

### setAutoDenoising(boolean autoDenoising) {#setAutoDenoising-boolean-}
```
public void setAutoDenoising(boolean autoDenoising)
```


Enables the use of an additional neural network to improve the image - reduce noise. Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoDenoising | boolean | contains boolean value - a denoising is set. |

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
| allowedCharacters | java.lang.String | contains array. |

### setDetectAreasMode(DetectAreasMode detectAreasMode) {#setDetectAreasMode-com.aspose.ocr.DetectAreasMode-}
```
public void setDetectAreasMode(DetectAreasMode detectAreasMode)
```


Determines the type of neural network used for areas detection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| detectAreasMode | [DetectAreasMode](../../com.aspose.ocr/detectareasmode) | contains enum @see [DetectAreasMode](../../com.aspose.ocr/detectareasmode) value. |

### setSkew(double skew) {#setSkew-double-}
```
public void setSkew(double skew)
```


Sets angle in degrees for image rotation. Zero by default. Setting this value will disable the [setAutoSkew(boolean)](../../com.aspose.ocr/documentrecognitionsettings\#setAutoSkew-boolean-) property, so that auto skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| skew | double | Rotate image on specified angle. |

### setUpscaleSmallFont(boolean upscaleSmallFont) {#setUpscaleSmallFont-boolean-}
```
public void setUpscaleSmallFont(boolean upscaleSmallFont)
```


Allows you to use additional algorithms specifically for small font recognition. Useful for images with small size characters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upscaleSmallFont | boolean | contains boolean value - a upscaleSmallFont is set. |

### getStartPage() {#getStartPage--}
```
public int getStartPage()
```


First page in pdf file to extract images.

**Returns:**
int - start page
### getPagesNumber() {#getPagesNumber--}
```
public int getPagesNumber()
```


Total amount of pages from pdf file to extract i,ages (start with startPage).

**Returns:**
int - pages amount for recognition
