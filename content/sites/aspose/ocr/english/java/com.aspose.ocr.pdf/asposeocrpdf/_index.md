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
