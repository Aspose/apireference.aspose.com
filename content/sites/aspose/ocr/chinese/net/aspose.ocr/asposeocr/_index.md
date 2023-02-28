---
title: Class AsposeOcr
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.AsposeOcr 班级. Aspose OCR 库的主要 API
type: docs
weight: 20
url: /zh/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR 库的主要 API

```csharp
public class AsposeOcr
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | 初始化一个新的实例`AsposeOcr`class. 空构造函数. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | 初始化一个新的实例`AsposeOcr` class. 使用 alphabet property. 设置允许的字符 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | 计算图像的倾斜角度。 |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | 计算图像的倾斜角度。 |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | 根据 URI. 计算图像的倾斜角度 |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | 检查两个图像是否包含相同的文本。 |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | 更正文本（替换拼写错误的单词）。 |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | 检测图像上的文本区域。  不应用自动图像倾斜校正。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | 检测图像上的文本区域。  不应用自动图像倾斜校正。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | 检查图像文本是否与提供的正则表达式匹配。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | 检查图像是否包含提供的文本片段。 |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | 比较两个图像上的文本并返回一个表示它们相似程度的数字（0 到 1）。 |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | 使用图像预处理来提高 OCR 的准确性。 创建将按照您指定的顺序应用于输入图像的过滤器列表。 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f.Scale) ), PreprocessingFilter.Dilate() }; 你不需要全部。只设置你需要的。 |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | 使用图像预处理来提高 OCR 的准确性。 创建将按照您指定的顺序应用于输入图像的过滤器列表。 , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f.Scale) ), PreprocessingFilter.Dilate() }; 你不需要全部。只设置你需要的。 |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | 识别车牌。 |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | 识别车牌。 |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | 从多页 DJVU 图像中识别文本。  识别具有指定能力的 DJVU 文件[`DocumentRecognitionSettings`](../documentrecognitionsettings/). 仅支持 DJVU。不支持其他图像类型。 |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | 从多页 DJVU 图像中识别文本。  识别具有指定能力的 DJVU 文件[`DocumentRecognitionSettings`](../documentrecognitionsettings/). 仅支持 DJVU。不支持其他图像类型。 |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | 识别身份证上的文字。 |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | 识别身份证上的文字。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | 识别图像上的文本。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | 识别图像上的文本。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | 识别图像上的文本。  识别具有指定能力的图像[`RecognitionSettings`](../recognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | 识别图像上的文本。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | 识别图像上的文本。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | 识别图像上的文本。 |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | 以良好的质量识别图像上的文本。不使用歪斜校正和区域检测。在快速模式下工作。 |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | 以良好的质量识别图像上的文本。不使用歪斜校正和区域检测。在快速模式下工作。 |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | 识别以 base64 类型提供的图像上的文本。 |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | 识别由 URI 链接提供的图像上的文本。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | 识别发票图像上的文本。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | 识别发票图像上的文本。 |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | 识别包含单行文本的图像。  不应用自动图像倾斜校正。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | 识别包含单行文本的图像。  不应用自动图像倾斜校正。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | 使用默认设置从列表中识别多个图像。  不支持存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | 识别打包在 ZIP 存档中或来自具有默认设置的文件夹的多个图像。  不支持嵌套存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | 从列表中识别多个图像。  不支持存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | 识别打包在 ZIP 存档或文件夹中的多个图像。  不支持嵌套存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。 |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | 识别护照上的文字。 |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | 识别护照上的文字。 |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | 从扫描的 pdf 中识别文本（提取图像）。  识别具有指定能力的 pdf 文件[`RecognitionSettings`](../recognitionsettings/). 仅支持扫描的 PDF。不支持可搜索的 PDF. |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | 从扫描的 pdf 中识别文本（提取图像）。  识别具有指定能力的 pdf 文件[`DocumentRecognitionSettings`](../documentrecognitionsettings/). 仅支持扫描的 PDF。不支持可搜索的 PDF. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | 识别图像上的文本。 |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | 识别图像上的文本。 |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | 从多页 TIFF 图像中识别文本。  识别具有指定能力的 TIFF 文件[`DocumentRecognitionSettings`](../documentrecognitionsettings/). 仅支持 TIFF (TIF)。不支持其他图像类型。 |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | 从多页 TIFF 图像中识别文本。  识别具有指定能力的 TIFF 文件[`DocumentRecognitionSettings`](../documentrecognitionsettings/). 仅支持 TIFF (TIF)。不支持其他图像类型。 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | 允许从 RecognitionResult 对象列表中获取多页文档 |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | 允许从 RecognitionResult 对象列表中获取多页文档 |

## 活动

| 姓名 | 描述 |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | 跟踪多页图片识别进度的事件。 |

### 也可以看看

* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


