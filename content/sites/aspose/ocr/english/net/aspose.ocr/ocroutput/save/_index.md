---
title: Save
second_title: Aspose.OCR for .NET API Reference
description: Save all recognition result to a file.
type: docs
weight: 30
url: /net/aspose.ocr/ocroutput/save/
---
## Save(string, SaveFormat, string, PdfOptimizationMode) {#save_1}

Save all recognition result to a file.

```csharp
public void Save(string fullFileName, SaveFormat saveFormat = SaveFormat.Text, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullFileName | String | Filename with a path for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, string, PdfOptimizationMode) {#save}

Save all recognition results to a memory stream in the specified format.

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat = SaveFormat.Text, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | MemoryStream | MemoryStream for saving recognition result in the selected format. |
| saveFormat | SaveFormat | Document format (Docx, Txt, Pdf, Xlsx, Rtf, Json, Xml, Epub). |
| embeddedFontPath | String | Optionally. Full path to the user font. |
| optimizePdf | PdfOptimizationMode | Reduce the PDF file size by lowering the quality of background images. By default, the original image quality is preserved. |

### See Also

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OCR.dll -->
