---
title: AsposeOcr
second_title: Aspose.OCR 适用于 .NET API 参考
description: Aspose OCR 库的主要 API
type: docs
weight: 20
url: /zh/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR 库的主要 API

```csharp
public class AsposeOcr : IDisposable
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [AsposeOcr](asposeocr)() | 初始化一个新的 [`AsposeOcr`](../asposeocr) 类实例。空构造函数。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew)(OcrInput) | 计算图像的倾斜角度。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、归档。 |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts)(string, string, RecognitionSettings, bool) | 检查两幅图像是否包含相同的文本。 |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling)(string, SpellCheckLanguage, string) | 纠正文本（替换拼写错误的单词）。 |
| [DetectDefects](../../aspose.ocr/asposeocr/detectdefects)(OcrInput, DefectType) | 自动查找图像中可能显著影响 OCR 准确性的有问题区域。支持以文件、流或像素数组形式提供的 PNG、JPEG、BMP、TIFF、JFIF 和 GIF 图像。支持批量识别。 |
| [DetectDocumentLayout](../../aspose.ocr/asposeocr/detectdocumentlayout)(OcrInput) | 分析图像并识别其中不同类型的内容区域。支持来自文件、流和像素数组的 PNG、JPEG、BMP、TIFF、JFIF 和 GIF 图像。可批量处理文件夹和压缩包。 |
| [DetectLanguages](../../aspose.ocr/asposeocr/detectlanguages)(OcrInput) | 分析图像上的文本以确定其所使用的语言。这使得能够选择最合适的识别语言，并有助于后续的文本处理任务，如拼写检查或翻译。 |
| [DetectRectangles](../../aspose.ocr/asposeocr/detectrectangles#detectrectangles)(OcrInput) | 检测图像上的文本区域。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [DetectRectangles](../../aspose.ocr/asposeocr/detectrectangles#detectrectangles_1)(OcrInput, AreasType, bool) | 检测图像上的文本区域。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [Dispose](../../aspose.ocr/asposeocr/dispose)() | 清除识别资源。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext#imagehastext_1)(string, Regex, RecognitionSettings, bool) | 检查图像文本是否匹配提供的正则表达式。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext#imagehastext)(string, string, RecognitionSettings, bool, bool) | 检查图像是否包含提供的文本片段。 |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff)(string, string, RecognitionSettings, bool, bool) | 比较两幅图像上的文本，并返回表示相似度的数值（0 到 1）。 |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize)(OcrInput) | 识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。 |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_1)(OcrInput, AsposeOcrPresets) | 使用预定义的预设配置识别给定 OCR 输入中的文本。 |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_2)(OcrInput, RecognitionSettings) | 识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。 |
| [Recognize](../../aspose.ocr/asposeocr/recognize#recognize_3)(OcrInput, RecognitionSettings, CancellationToken) | 识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。 |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate#recognizecarplate)(OcrInput) | 识别车牌上的文本。 |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate#recognizecarplate_1)(OcrInput, CarPlateRecognitionSettings) | 识别车牌上的文本。 |
| [RecognizeCharacters](../../aspose.ocr/asposeocr/recognizecharacters#recognizecharacters)(OcrInput) | 检测图像上的符号。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [RecognizeCharacters](../../aspose.ocr/asposeocr/recognizecharacters#recognizecharacters_1)(OcrInput, DetectAreasMode, Language) | 检测图像上的符号。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [RecognizeFast](../../aspose.ocr/asposeocr/recognizefast)(OcrInput) | 识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。 |
| [RecognizeFormula](../../aspose.ocr/asposeocr/recognizeformula)(OcrInput, bool) | 识别提供的输入图像中的数学公式。 |
| [RecognizeFormulaAI](../../aspose.ocr/asposeocr/recognizeformulaai)(OcrInput) | 使用 AI 识别提供的输入图像中的数学公式。 |
| [RecognizeHandwrittenText](../../aspose.ocr/asposeocr/recognizehandwrittentext)(OcrInput) | 识别图像上的手写文本。 |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard#recognizeidcard)(OcrInput) | 识别身份证上的文本。 |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard#recognizeidcard_1)(OcrInput, IDCardRecognitionSettings) | 识别身份证上的文本。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice#recognizeinvoice)(OcrInput) | 识别发票上的文本。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice#recognizeinvoice_1)(OcrInput, InvoiceRecognitionSettings) | 识别发票上的文本。 |
| [RecognizeLines](../../aspose.ocr/asposeocr/recognizelines#recognizelines)(OcrInput) | 识别包含单行文本的图像。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [RecognizeLines](../../aspose.ocr/asposeocr/recognizelines#recognizelines_1)(OcrInput, RecognitionSettings) | 识别包含单行文本的图像。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。 |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport#recognizepassport)(OcrInput) | 识别护照上的文本。 |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport#recognizepassport_1)(OcrInput, PassportRecognitionSettings) | 识别护照上的文本。 |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt#recognizereceipt)(OcrInput) | 识别收据上的文本。 |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt#recognizereceipt_1)(OcrInput, ReceiptRecognitionSettings) | 识别收据上的文本。 |
| [RecognizeTables](../../aspose.ocr/asposeocr/recognizetables)(OcrInput, Language) | 检测表格和结构，识别文本单元格。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_1)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) | 允许从 RecognitionResult 对象列表中获取多页文档 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_3)(string, SaveFormat, List&lt;RecognitionResult&gt;, string, PdfOptimizationMode) | 允许从 RecognitionResult 对象列表中获取多页文档 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | 允许从 RecognitionResult 对象列表中获取多页文档 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument#savemultipagedocument_2)(string, SaveFormat, List&lt;RecognitionResult&gt;, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | 允许从 RecognitionResult 对象列表中获取多页文档 |

## 字段

| 名称 | 描述 |
| --- | --- |
| static [DebugMode](../../aspose.ocr/asposeocr/debugmode) | 启用调试模式。启用后，系统会保存中间图像处理结果，例如预处理图像和绘制了文本行矩形的图像。 |
| static [DebugModeSaveDirectory](../../aspose.ocr/asposeocr/debugmodesavedirectory) | 调试结果将保存的目录。如果未设置，默认使用当前工作目录。 |

## 事件

| 名称 | 描述 |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress) | 用于跟踪多页图像识别进度的事件。 |

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
