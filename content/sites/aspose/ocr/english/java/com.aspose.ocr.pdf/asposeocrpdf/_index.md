---
title: AsposeOCRPdf
second_title: Aspose.OCR for Java API Reference
description: 
type: docs
weight: 10
url: /java/com.aspose.ocr.pdf/asposeocrpdf/
---

**Inheritance:**
java.lang.Object
```
public class AsposeOCRPdf
```
## Constructors

| Constructor | Description |
| --- | --- |
| [AsposeOCRPdf()](#AsposeOCRPdf--) |  |
## Methods

| Method | Description |
| --- | --- |
| [RecognizePdf(String fullPath, DocumentRecognitionSettings settings)](#RecognizePdf-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text from scanned PDF (extract images). |
| [RecognizePdf(InputStream stream, DocumentRecognitionSettings settings)](#RecognizePdf-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-) | Recognize text from scanned PDF (extract images). |
| [GetImages(String fullPath, int page)](#GetImages-java.lang.String-int-) |  |
| [GetPagesNumber(String fullPath)](#GetPagesNumber-java.lang.String-) |  |
| [GetImages(InputStream stream, int page)](#GetImages-java.io.InputStream-int-) |  |
| [GetImages(int page)](#GetImages-int-) |  |
| [GetPagesNumber(InputStream stream)](#GetPagesNumber-java.io.InputStream-) |  |
### AsposeOCRPdf() {#AsposeOCRPdf--}
```
public AsposeOCRPdf()
```


### RecognizePdf(String fullPath, DocumentRecognitionSettings settings) {#RecognizePdf-java.lang.String-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizePdf(String fullPath, DocumentRecognitionSettings settings)
```


Recognize text from scanned PDF (extract images). Recognizes pdf file with the ability to specify @see DocumentRecognitionSettings. Supports Scanned PDF only. Doesn't supports Searchable PDF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String | Full path to the image. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - The ArrayList of @see \#RecognitionResult objects with image recognition results.
### RecognizePdf(InputStream stream, DocumentRecognitionSettings settings) {#RecognizePdf-java.io.InputStream-com.aspose.ocr.DocumentRecognitionSettings-}
```
public ArrayList<RecognitionResult> RecognizePdf(InputStream stream, DocumentRecognitionSettings settings)
```


Recognize text from scanned PDF (extract images). Recognizes pdf file with the ability to specify @see DocumentRecognitionSettings. Supports Scanned PDF only. Doesn't supports Searchable PDF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream with the scanned PDF file. |
| settings | [DocumentRecognitionSettings](../../com.aspose.ocr/documentrecognitionsettings) | Recognition settings. |

**Returns:**
java.util.ArrayList<com.aspose.ocr.RecognitionResult> - The ArrayList of @see \#RecognitionResult objects with image recognition results.
### GetImages(String fullPath, int page) {#GetImages-java.lang.String-int-}
```
public ArrayList<Image> GetImages(String fullPath, int page)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String |  |
| page | int |  |

**Returns:**
java.util.ArrayList<java.awt.Image>
### GetPagesNumber(String fullPath) {#GetPagesNumber-java.lang.String-}
```
public int GetPagesNumber(String fullPath)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | java.lang.String |  |

**Returns:**
int
### GetImages(InputStream stream, int page) {#GetImages-java.io.InputStream-int-}
```
public ArrayList<Image> GetImages(InputStream stream, int page)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream |  |
| page | int |  |

**Returns:**
java.util.ArrayList<java.awt.Image>
### GetImages(int page) {#GetImages-int-}
```
public ArrayList<Image> GetImages(int page)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| page | int |  |

**Returns:**
java.util.ArrayList<java.awt.Image>
### GetPagesNumber(InputStream stream) {#GetPagesNumber-java.io.InputStream-}
```
public int GetPagesNumber(InputStream stream)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream |  |

**Returns:**
int
