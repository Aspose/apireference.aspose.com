---
title: SaveMultipageDocument
second_title: Aspose.OCR 适用于 .NET API 参考
description: 允许从 RecognitionResult 对象列表中获取多页文档
type: docs
weight: 280
url: /zh/net/aspose.ocr/asposeocr/savemultipagedocument/
---
## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) {#savemultipagedocument_3}

允许从 RecognitionResult 对象列表中获取多页文档

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| results | List`1 | [`RecognitionResult`](../../recognitionresult) 对象列表。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#savemultipagedocument_2}

允许从 RecognitionResult 对象列表中获取多页文档

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullFileName | String | 用于保存识别结果的文件名（含路径），采用所选格式。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| results | List`1 | [`RecognitionResult`](../../recognitionresult) 对象列表。 |
| applySpellingCorrection | Boolean | 设置为 true 可纠正识别结果中出现的拼写错误。 |
| language | SpellCheckLanguage | 拼写检查字典（可选）。 |
| dictionaryPath | String | 可选。用户字典的完整路径，采用 .txt 格式。格式为 [word - space - frequence(number)]。示例：the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) {#savemultipagedocument_1}

允许从 RecognitionResult 对象列表中获取多页文档

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results, string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| results | List`1 | [`RecognitionResult`](../../recognitionresult) 对象列表。 |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) {#savemultipagedocument}

允许从 RecognitionResult 对象列表中获取多页文档

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results, bool applySpellingCorrection, 
    SpellCheckLanguage language = SpellCheckLanguage.Eng, string dictionaryPath = null, 
    string embeddedFontPath = null, 
    PdfOptimizationMode optimizePdf = PdfOptimizationMode.MAXIMUM_QUALITY)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 用于以所选格式保存识别结果的 MemoryStream。 |
| saveFormat | SaveFormat | 文档格式（Docx、Txt、Pdf、Xlsx、Rtf、Json、Xml）。 |
| results | List`1 | [`RecognitionResult`](../../recognitionresult) 对象列表。 |
| applySpellingCorrection | Boolean | 设置为 true 可纠正识别结果中出现的拼写错误。 |
| language | SpellCheckLanguage | 拼写检查字典（可选）。 |
| dictionaryPath | String | 可选。用户字典的完整路径，采用 .txt 格式。格式为 [word - space - frequence(number)]。示例：the 23135851162\nthat 3400031103\n |
| embeddedFontPath | String | 可选。用户字体的完整路径。 |
| optimizePdf | PdfOptimizationMode | 通过降低背景图像的质量来减小 PDF 文件大小。默认情况下，保留原始图像质量。 |

### 另请参见

* enum [SaveFormat](../../saveformat)
* class [RecognitionResult](../../recognitionresult)
* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage)
* enum [PdfOptimizationMode](../../pdfoptimizationmode)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
