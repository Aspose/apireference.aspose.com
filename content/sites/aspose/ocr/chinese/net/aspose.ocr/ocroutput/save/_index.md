---
title: 保存
second_title: Aspose.OCR 适用于 .NET API 参考
description: 将所有识别结果保存到文件中。
type: docs
weight: 50
url: /zh/net/aspose.ocr/ocroutput/save/
---
## Save(string, SaveFormat, string, PdfOptimizationMode) {#save_1}

将所有识别结果保存到文件中。

```csharp
public void Save(string fullFileName, SaveFormat saveFormat = SaveFormat.Text, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml、Epub）。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, string, PdfOptimizationMode) {#save}

将所有识别结果以指定格式保存到内存流中。

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat = SaveFormat.Text, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml、Epub）。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [OcrOutput](../../ocroutput)
* namespace [Aspose.OCR](../../ocroutput)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
