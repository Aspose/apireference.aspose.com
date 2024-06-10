---
title: RecognitionSettings
second_title: Aspose.OCR for Java API Reference
description: Settings for the image recognition.
type: docs
weight: 29
url: /java/com.aspose.ocr/recognitionsettings/
---

**Inheritance:**
java.lang.Object
```
public class RecognitionSettings
```

Settings for the image recognition. Contains elements that allow customizing the recognition process.
## Constructors

| Constructor | Description |
| --- | --- |
| [RecognitionSettings()](#RecognitionSettings--) | Default constructor: set recognitionAreas null, linesFiltration false, autoSkew false, recognizeSingleLine false. |
| [RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean recognizeSingleLine)](#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--boolean-) | Constructor allows to set all options. |
| [RecognitionSettings(boolean recognizeSingleLine)](#RecognitionSettings-boolean-) | Constructor allows to set recognizeSingleLine. |
| [RecognitionSettings(ReceiptRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.ReceiptRecognitionSettings-) |  |
| [RecognitionSettings(InvoiceRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.InvoiceRecognitionSettings-) |  |
| [RecognitionSettings(IDCardRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.IDCardRecognitionSettings-) |  |
| [RecognitionSettings(PassportRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.PassportRecognitionSettings-) |  |
| [RecognitionSettings(CarPlateRecognitionSettings recSettings)](#RecognitionSettings-com.aspose.ocr.CarPlateRecognitionSettings-) |  |
## Methods

| Method | Description |
| --- | --- |
| [setRecognitionAreas(ArrayList<Rectangle> recognitionAreas)](#setRecognitionAreas-java.util.ArrayList-java.awt.Rectangle--) | Sets the list of text areas for processing. |
| [setLinesFiltration(boolean linesFiltration)](#setLinesFiltration-boolean-) | Allows to recognize text in the tables (regions surrounded lines). |
| [setRecognizeSingleLine(boolean recognizeSingleLine)](#setRecognizeSingleLine-boolean-) | Sets single-line image recognition. |
| [setLanguage(Language language)](#setLanguage-com.aspose.ocr.Language-) |  |
| [setIgnoredCharacters(String characters)](#setIgnoredCharacters-java.lang.String-) | Sets blacklist for recognition symbols. |
| [setThreadsCount(int threadsCount)](#setThreadsCount-int-) | Gets or sets the number of threads for processing. |
| [setAllowedCharacters(CharactersAllowedType allowedCharacters)](#setAllowedCharacters-com.aspose.ocr.CharactersAllowedType-) | Allowed characters set. |
| [setAllowedCharacters(String allowedCharacters)](#setAllowedCharacters-java.lang.String-) | Allowed characters set. |
| [setDetectAreasMode(DetectAreasMode detectAreasMode)](#setDetectAreasMode-com.aspose.ocr.DetectAreasMode-) | Determines the type of neural network used for areas detection. |
| [setUpscaleSmallFont(boolean upscaleSmallFont)](#setUpscaleSmallFont-boolean-) | Allows you to use additional algorithms specifically for small font recognition. |
| [setAutomaticColorInversion(boolean automaticColorInversion)](#setAutomaticColorInversion-boolean-) | Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them. |
### RecognitionSettings() {#RecognitionSettings--}
```
public RecognitionSettings()
```


Default constructor: set recognitionAreas null, linesFiltration false, autoSkew false, recognizeSingleLine false.

### RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean recognizeSingleLine) {#RecognitionSettings-java.util.ArrayList-java.awt.Rectangle--boolean-}
```
public RecognitionSettings(ArrayList<Rectangle> recognitionAreas, boolean recognizeSingleLine)
```


Constructor allows to set all options.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognitionAreas | java.util.ArrayList<java.awt.Rectangle> | Rectangles for recognition. |
| recognizeSingleLine | boolean | True if the image contains only one line. |

### RecognitionSettings(boolean recognizeSingleLine) {#RecognitionSettings-boolean-}
```
public RecognitionSettings(boolean recognizeSingleLine)
```


Constructor allows to set recognizeSingleLine. Default values in this case: detectAreas - false, autoSkew = false, recognitionAreas - null.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognizeSingleLine | boolean | True if the image contains only one line. |

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


Sets the list of text areas for processing. Allows to manually specify the areas with text for more accurate recognition. If custom areas are set [setDetectAreasMode(DetectAreasMode)](../../com.aspose.ocr/recognitionsettings\#setDetectAreasMode-DetectAreasMode-) (DetectAreasMode)\} not NONE or [PreprocessingFilter.AutoSkew()](../../com.aspose.ocr/preprocessingfilter\#AutoSkew--) (boolean)\} properties will be ignored. Disables DetectAreas and AutoSkew.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognitionAreas | java.util.ArrayList<java.awt.Rectangle> | Rectangles for recognition. |

### setLinesFiltration(boolean linesFiltration) {#setLinesFiltration-boolean-}
```
public void setLinesFiltration(boolean linesFiltration)
```


Allows to recognize text in the tables (regions surrounded lines).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| linesFiltration | boolean | false - allows increase performance and don't detect tables and remove lines; otherwise - true. Disabled (false) by default. |

### setRecognizeSingleLine(boolean recognizeSingleLine) {#setRecognizeSingleLine-boolean-}
```
public void setRecognizeSingleLine(boolean recognizeSingleLine)
```


Sets single-line image recognition. Disabled (false) by default. Disable all the processing steps associated with splitting into lines. Set this parameter to true if your image contains only one line. Disables [setRecognitionAreas(ArrayList)](../../com.aspose.ocr/recognitionsettings\#setRecognitionAreas-ArrayList-) settings, so all areas settings will be ignored.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recognizeSingleLine | boolean | True for single-line image |

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
| allowedCharacters | java.lang.String | contains string of characters. |

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
| upscaleSmallFont | boolean | contains boolean value - an upscaleSmallFont is set. |

### setAutomaticColorInversion(boolean automaticColorInversion) {#setAutomaticColorInversion-boolean-}
```
public void setAutomaticColorInversion(boolean automaticColorInversion)
```


Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| automaticColorInversion | boolean | contains boolean value - a automaticColorInversion is set. True by default. |

