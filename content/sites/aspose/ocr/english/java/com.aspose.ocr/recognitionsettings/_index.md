---
title: RecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the image recognition Contains elements that allow customizing the recognition process
type: docs
weight: 24
url: /java/com.aspose.ocr/recognitionsettings/
---

**Inheritance:**
java.lang.Object
```
public class RecognitionSettings
```

Settings for the image recognition Contains elements that allow customizing the recognition process
## Constructors

| Constructor | Description |
| --- | --- |
| [RecognitionSettings()](#RecognitionSettings--) | Default constructor: set recognitionAreas null, detectAreas true, autoSkew true, recognizeSingleLine false. |
| [RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean detectAreas, boolean autoSkew, boolean recognizeSingleLine)](#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--boolean-boolean-boolean-) | Constructor allows to set all options. |
| [RecognitionSettings(ArrayList<Rectangle> recognitionAreas)](#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--) | Constructor allows to set recognitionAreas. |
| [RecognitionSettings(boolean detectAreas, boolean autoSkew)](#RecognitionSettings-boolean-boolean-) | Constructor allows to set detectAreas and autoSkew. |
| [RecognitionSettings(boolean recognizeSingleLine)](#RecognitionSettings-boolean-) | Constructor allows to set recognizeSingleLine. |
| [RecognitionSettings(DocumentRecognitionSettings docSettings)](#RecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-) |  |
| [RecognitionSettings(ReceiptRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.ReceiptRecognitionSettings-) |  |
| [RecognitionSettings(InvoiceRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.InvoiceRecognitionSettings-) |  |
| [RecognitionSettings(IDCardRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.IDCardRecognitionSettings-) |  |
| [RecognitionSettings(PassportRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.PassportRecognitionSettings-) |  |
| [RecognitionSettings(CarPlateRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.CarPlateRecognitionSettings-) |  |
## Methods

| Method | Description |
| --- | --- |
| [setRecognitionAreas(ArrayList<Rectangle> recognitionAreas)](#setRecognitionAreas-java.util.ArrayList-java.awt.Rectangle--) | Sets the list of text areas for processing. |
| [setDetectAreas(boolean detectAreas)](#setDetectAreas-boolean-) | Sets a flag indicating whether automatic text areas detection should be enabled. |
| [setLinesFiltration(boolean linesFiltration)](#setLinesFiltration-boolean-) | Allows to recognize text in the tables (regions surrounded lines). |
| [setAutoSkew(boolean autoSkew)](#setAutoSkew-boolean-) | Sets a flag indicating whether automatic image skew correction should be enabled. |
| [setRecognizeSingleLine(boolean recognizeSingleLine)](#setRecognizeSingleLine-boolean-) | Sets single-line image recognition. |
| [setSkew(double skew)](#setSkew-double-) | Sets angle in degrees for image rotation. |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.Language-) |  |
| [setIgnoredCharacters(String characters)](#setIgnoredCharacters-java.lang.String-) | Sets blacklist for recognition symbols. |
| [setThresholdValue(int threshold)](#setThresholdValue-int-) | Sets custom threshold value for image binarization. |
| [setThreadsCount(int threadsCount)](#setThreadsCount-int-) | Gets or sets the number of threads for processing. |
| [setPreprocessingFilters(PreprocessingFilter preprocessingFilters)](#setPreprocessingFilters-com.aspose.ocr.PreprocessingFilter-) | Allows to prepare the image for OCR by adjusting pre-processing methods. |
| [setAutoContrast(boolean autoContrast)](#setAutoContrast-boolean-) | Allows using an additional contrast correction algorithm for the image before recognition. |
| [setAutoDenoising(boolean autoDenoising)](#setAutoDenoising-boolean-) | Enables the use of an additional neural network to improve the image - reduce noise. |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-) | Allowed characters set. |
| [setAllowedCharacters(String allowedCharacters)](#setAllowedCharacters-java.lang.String-) | Allowed characters set. |
| [setDetectAreasMode(DetectAreasMode detectAreasMode)](#setDetectAreasMode-com.aspose.ocr.DetectAreasMode-) | Determines the type of neural network used for areas detection. |
| [setUpscaleSmallFont(boolean upscaleSmallFont)](#setUpscaleSmallFont-boolean-) | Allows you to use additional algorithms specifically for small font recognition. |
### RecognitionSettings() {#RecognitionSettings--}
```
public RecognitionSettings()
```


Default constructor: set recognitionAreas null, detectAreas true, autoSkew true, recognizeSingleLine false.

### RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean detectAreas, boolean autoSkew, boolean recognizeSingleLine) {#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--boolean-boolean-boolean-}
```
public RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean detectAreas, boolean autoSkew, boolean recognizeSingleLine)
```


Constructor allows to set all options.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognitionAreas | java.util.ArrayList<java.awt.Rectangle> | Rectangles for recognition. |
| detectAreas | boolean | False for recognition as one area, true for dividing into areas before recognition. |
| autoSkew | boolean | True if the image needs alignment. |
| recognizeSingleLine | boolean | True if the image contains only one line. |

### RecognitionSettings(ArrayList<Rectangle> recognitionAreas) {#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--}
```
public RecognitionSettings(ArrayList<Rectangle> recognitionAreas)
```


Constructor allows to set recognitionAreas. Default values in this case: detectAreas - false, autoSkew = false, recognizeSingleLine - false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognitionAreas | java.util.ArrayList<java.awt.Rectangle> | Rectangles for recognition. |

### RecognitionSettings(boolean detectAreas, boolean autoSkew) {#RecognitionSettings-boolean-boolean-}
```
public RecognitionSettings(boolean detectAreas, boolean autoSkew)
```


Constructor allows to set detectAreas and autoSkew. Default values in this case: recognizeSingleLine - false, recognitionAreas - null.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| detectAreas | boolean | False for recognition as one area, true for dividing into areas before recognition. |
| autoSkew | boolean | True if the image needs alignment. |

### RecognitionSettings(boolean recognizeSingleLine) {#RecognitionSettings-boolean-}
```
public RecognitionSettings(boolean recognizeSingleLine)
```


Constructor allows to set recognizeSingleLine. Default values in this case: detectAreas - false, autoSkew = false, recognitionAreas - null.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognizeSingleLine | boolean | True if the image contains only one line. |

### RecognitionSettings(DocumentRecognitionSettings docSettings) {#RecognitionSettings-com.aspose.ocr.DocumentRecognitionSettings-}
```
public RecognitionSettings(DocumentRecognitionSettings docSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| docSettings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) |  |

### RecognitionSettings(ReceiptRecognitionSettings recSettings) {#RecognitionSettings-com.aspose.ocr.ReceiptRecognitionSettings-}
```
public RecognitionSettings(ReceiptRecognitionSettings recSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recSettings | [ReceiptRecognitionSettings](../../com.aspose.ocr/receiptrecognitionsettings) |  |

### RecognitionSettings(InvoiceRecognitionSettings recSettings) {#RecognitionSettings-com.aspose.ocr.InvoiceRecognitionSettings-}
```
public RecognitionSettings(InvoiceRecognitionSettings recSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recSettings | [InvoiceRecognitionSettings](../../com.aspose.ocr/invoicerecognitionsettings) |  |

### RecognitionSettings(IDCardRecognitionSettings recSettings) {#RecognitionSettings-com.aspose.ocr.IDCardRecognitionSettings-}
```
public RecognitionSettings(IDCardRecognitionSettings recSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recSettings | [IDCardRecognitionSettings](../../com.aspose.ocr/idcardrecognitionsettings) |  |

### RecognitionSettings(PassportRecognitionSettings recSettings) {#RecognitionSettings-com.aspose.ocr.PassportRecognitionSettings-}
```
public RecognitionSettings(PassportRecognitionSettings recSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recSettings | [PassportRecognitionSettings](../../com.aspose.ocr/passportrecognitionsettings) |  |

### RecognitionSettings(CarPlateRecognitionSettings recSettings) {#RecognitionSettings-com.aspose.ocr.CarPlateRecognitionSettings-}
```
public RecognitionSettings(CarPlateRecognitionSettings recSettings)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recSettings | [CarPlateRecognitionSettings](../../com.aspose.ocr/carplaterecognitionsettings) |  |

### setRecognitionAreas(ArrayList<Rectangle> recognitionAreas) {#setRecognitionAreas-java.util.ArrayList-java.awt.Rectangle--}
```
public void setRecognitionAreas(ArrayList<Rectangle> recognitionAreas)
```


Sets the list of text areas for processing. Allows to manually specify the areas with text for more accurate recognition. If custom areas are set [setDetectAreas(boolean)](../../com.aspose.ocr/recognitionsettings\#setDetectAreas-boolean-) and [setAutoSkew(boolean)](../../com.aspose.ocr/recognitionsettings\#setAutoSkew-boolean-) properties will be ignored. Disables DetectAreas and AutoSkew.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognitionAreas | java.util.ArrayList<java.awt.Rectangle> | Rectangles for recognition. |

### setDetectAreas(boolean detectAreas) {#setDetectAreas-boolean-}
```
public void setDetectAreas(boolean detectAreas)
```


Sets a flag indicating whether automatic text areas detection should be enabled. Enables Document Structure Recognition module. This takes more time and memory to process an image, but provides more accurate results on complex cases. Disable (set to false) for faster image processing or in case of images with simple structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| detectAreas | boolean | Detect and split if true. |

### setLinesFiltration(boolean linesFiltration) {#setLinesFiltration-boolean-}
```
public void setLinesFiltration(boolean linesFiltration)
```


Allows to recognize text in the tables (regions surrounded lines).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| linesFiltration | boolean | false - allows increase performance and don't detect tables and remove lines; otherwise - true. Disabled (false) by default. |

### setAutoSkew(boolean autoSkew) {#setAutoSkew-boolean-}
```
public void setAutoSkew(boolean autoSkew)
```


Sets a flag indicating whether automatic image skew correction should be enabled. Enabled (true) by default.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| autoSkew | boolean | Detect and rotate if true. |

### setRecognizeSingleLine(boolean recognizeSingleLine) {#setRecognizeSingleLine-boolean-}
```
public void setRecognizeSingleLine(boolean recognizeSingleLine)
```


Sets single-line image recognition. Disabled (false) by default. Disable all the processing steps associated with splitting into lines. Set this parameter to true if your image contains only one line. Disables [setRecognitionAreas(ArrayList)](../../com.aspose.ocr/recognitionsettings\#setRecognitionAreas-ArrayList-) settings, so all areas settings will be ignored.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognizeSingleLine | boolean | True for single-line image |

### setSkew(double skew) {#setSkew-double-}
```
public void setSkew(double skew)
```


Sets angle in degrees for image rotation. Zero by default. Setting this value will disable the [setAutoSkew(boolean)](../../com.aspose.ocr/recognitionsettings\#setAutoSkew-boolean-) property, so that auto skew correction is not applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| skew | double | Rotate image on specified angle. |

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

### setThresholdValue(int threshold) {#setThresholdValue-int-}
```
public void setThresholdValue(int threshold)
```


Sets custom threshold value for image binarization.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| threshold | int | Range from 1 to 255. |

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
| allowedCharacters | java.lang.String | contains array of characters. |

### setDetectAreasMode(DetectAreasMode detectAreasMode) {#setDetectAreasMode-com.aspose.ocr.DetectAreasMode-}
```
public void setDetectAreasMode(DetectAreasMode detectAreasMode)
```


Determines the type of neural network used for areas detection.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| detectAreasMode | [DetectAreasMode](../../com.aspose.ocr/detectareasmode) | contains enum @see [DetectAreasMode](../../com.aspose.ocr/detectareasmode) value. |

### setUpscaleSmallFont(boolean upscaleSmallFont) {#setUpscaleSmallFont-boolean-}
```
public void setUpscaleSmallFont(boolean upscaleSmallFont)
```


Allows you to use additional algorithms specifically for small font recognition. Useful for images with small size characters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upscaleSmallFont | boolean | contains boolean value - a upscaleSmallFont is set. |

