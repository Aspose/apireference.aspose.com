---
title: SavePdf
second_title: Aspose.OCR 适用于 .NET API 参考
description: 将所有识别结果保存为可搜索的 PDF 文件，原始图像作为背景。
type: docs
weight: 60
url: /zh/net/aspose.ocr/ocroutput/savepdf/
---
## SavePdf(string, string, PdfOptimizationMode) {#savepdf_1}

将所有识别结果保存为可搜索的 PDF 文件，并将原始图像设置为背景。

```csharp
public void SavePdf(string fullFileName, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

---

## SavePdf(MemoryStream, string, PdfOptimizationMode) {#savepdf}

将所有识别结果保存为内存中的可搜索 PDF 文档，并将原始图像嵌入为背景。

```csharp
public void SavePdf(MemoryStream stream, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
