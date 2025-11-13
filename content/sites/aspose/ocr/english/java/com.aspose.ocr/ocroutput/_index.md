---
title: OcrOutput
second_title: Aspose.OCR for Java API Reference
description: 
type: docs
weight: 21
url: /java/com.aspose.ocr/ocroutput/
---

**Inheritance:**
java.lang.Object, java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList
```
public class OcrOutput extends ArrayList<RecognitionResult>
```
## Constructors

| Constructor | Description |
| --- | --- |
| [OcrOutput()](#OcrOutput) | Initializes a new instance of the OcrOutput class with an empty collection. |
## Methods

| Method | Description |
| --- | --- |

| [getTableData()](#getTableData) | Returns structured table data extracted from all recognized pages. |
| [save(OutputStream stream)](#save-java.io.OutputStream) | Save all recognition results to a memory stream in the specified format. |
| [save(OutputStream stream, Format saveFormat)](#save-java.io.OutputStream-com.aspose.ocr.models.Format) | Save all recognition results to a memory stream in the specified format. |
| [save(OutputStream stream, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#save-java.io.OutputStream-com.aspose.ocr.models.Format-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Save all recognition results to a memory stream in the specified format. |
| [save(String fullFileName)](#save-java.lang.String) | Save all recognition result to a file. |
| [save(String fullFileName, Format saveFormat)](#save-java.lang.String-com.aspose.ocr.models.Format) | Save all recognition result to a file. |
| [save(String fullFileName, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#save-java.lang.String-com.aspose.ocr.models.Format-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Save all recognition result to a file. |
| [savePdf(OutputStream stream)](#savePdf-java.io.OutputStream) | Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background. |
| [savePdf(OutputStream stream, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#savePdf-java.io.OutputStream-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background. |
| [savePdf(String fullFileName)](#savePdf-java.lang.String) | Save all recognition results into a searchable PDF file, with the original images set as the background. |
| [savePdf(String fullFileName, String embeddedFontPath, PdfOptimizationMode optimizePdf)](#savePdf-java.lang.String-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode) | Save all recognition results into a searchable PDF file, with the original images set as the background. |

### getTableData() {#getTableData}
```
public OCRTable getTableData()
```


Returns structured table data extracted from all recognized pages.

Each page contains rows, and each row contains cells with recognized text and optional position information.

**Returns:**
[OCRTable](../../com.aspose.ocr.models/ocrtable/) - an [OCRTable](../../com.aspose.ocr.models/ocrtable/) structure representing all tables in the document


### save(OutputStream stream) {#save-java.io.OutputStream}
```
public void save(OutputStream stream)
```


Save all recognition results to a memory stream in the specified format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |

### save(OutputStream stream, Format saveFormat) {#save-java.io.OutputStream-com.aspose.ocr.models.Format}
```
public void save(OutputStream stream, Format saveFormat)
```


Save all recognition results to a memory stream in the specified format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |

### save(OutputStream stream, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#save-java.io.OutputStream-com.aspose.ocr.models.Format-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public void save(OutputStream stream, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Save all recognition results to a memory stream in the specified format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |
| embeddedFontPath | java.lang.String | Optional. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### save(String fullFileName) {#save-java.lang.String}
```
public void save(String fullFileName)
```


Save all recognition result to a file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |

### save(String fullFileName, Format saveFormat) {#save-java.lang.String-com.aspose.ocr.models.Format}
```
public void save(String fullFileName, Format saveFormat)
```


Save all recognition result to a file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |

### save(String fullFileName, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#save-java.lang.String-com.aspose.ocr.models.Format-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public void save(String fullFileName, Format saveFormat, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Save all recognition result to a file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | [Format](../../com.aspose.ocr.models/format/) | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |
| embeddedFontPath | java.lang.String | Optional. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### savePdf(OutputStream stream) {#savePdf-java.io.OutputStream}
```
public void savePdf(OutputStream stream)
```


Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |

### savePdf(OutputStream stream, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#savePdf-java.io.OutputStream-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public void savePdf(OutputStream stream, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | OutputStream for saving recognition result in the selected format. |
| embeddedFontPath | java.lang.String | Optional. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### savePdf(String fullFileName) {#savePdf-java.lang.String}
```
public void savePdf(String fullFileName)
```


Save all recognition results into a searchable PDF file, with the original images set as the background.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |

### savePdf(String fullFileName, String embeddedFontPath, PdfOptimizationMode optimizePdf) {#savePdf-java.lang.String-java.lang.String-com.aspose.ocr.models.PdfOptimizationMode}
```
public void savePdf(String fullFileName, String embeddedFontPath, PdfOptimizationMode optimizePdf)
```


Save all recognition results into a searchable PDF file, with the original images set as the background.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | java.lang.String | Filename with a path for saving recognition result in the selected format. |
| embeddedFontPath | java.lang.String | Optional. Full path to the user font. |
| optimizePdf | [PdfOptimizationMode](../../com.aspose.ocr.models/pdfoptimizationmode/) | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### size() {#size}
```
public int size()
```




**Returns:**
int
