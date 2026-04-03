---
title: 保存
second_title: Aspose.OCR 适用于 .NET API 参考
description: 将文档保存为纯文本 PDF 或 Microsoft Word 文档。
type: docs
weight: 120
url: /zh/net/aspose.ocr/recognitionresult/save/
---
## Save(string, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#save_2}

将文档保存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| applySpellingCorrection | Boolean | 设置为 true 可纠正识别结果中出现的拼写错误。 |
| language | SpellCheckLanguage | 拼写检查字典（可选）。 |
| dictionaryPath | String | 可选。用户字典的完整路径，采用 .txt 格式。格式为 [word - space - frequence(number)]。示例：the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(string, SaveFormat, string, PdfOptimizationMode) {#save_3}

将文档保存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(string fullFileName, SaveFormat saveFormat, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#save}

将文档保存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf）。 |
| applySpellingCorrection | Boolean | 设置为 true 可纠正识别结果中出现的拼写错误。 |
| language | SpellCheckLanguage | 拼写检查字典（可选）。 |
| dictionaryPath | String | 可选。用户字典的完整路径，采用 .txt 格式。格式为 [word - space - frequence(number)]。示例：the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

---

## Save(MemoryStream, SaveFormat, string, PdfOptimizationMode) {#save_1}

将文档保存为纯文本、PDF 或 Microsoft Word 文档。

```csharp
public void Save(MemoryStream stream, SaveFormat saveFormat, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf）。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [RecognitionResult](../../recognitionresult)
* namespace [Aspose.OCR](../../recognitionresult)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
