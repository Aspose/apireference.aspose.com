---
title: 识别
second_title: Aspose.OCR 适用于 .NET API 参考
description: 识别图像/文档上的文本。支持 GIF PNG JPEG BMP TIFF JFIF 流、目录、数组、存档。
type: docs
weight: 130
url: /zh/net/aspose.ocr/asposeocr/recognize/
---
## Recognize(OcrInput) {#recognize}

识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。

```csharp
public OcrOutput Recognize(OcrInput images)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象列表。

### 另请参见

* class [OcrOutput](../../ocroutput)
* class [OcrInput](../../ocrinput)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## Recognize(OcrInput, AsposeOcrPresets) {#recognize_1}

使用预定义的预设配置识别给定 OCR 输入中的文本。

```csharp
public OcrOutput Recognize(OcrInput images, AsposeOcrPresets preset)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 图像 | OcrInput | OCR 输入数据（图像、PDF 等）。 |
| 预设 | AsposeOcrPresets | 所选 OCR 预设包含识别设置。 |

### 返回值

包含识别结果的 [`OcrOutput`](../../ocroutput) 对象。

### 备注

该方法会根据预设自动选择适当的识别流水线。如果预设包含自定义设置，则会使用这些设置而非默认设置。

### 另请参见

* class [OcrOutput](../../ocroutput)
* class [OcrInput](../../ocrinput)
* class [AsposeOcrPresets](../../asposeocrpresets)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## Recognize(OcrInput, RecognitionSettings, CancellationToken) {#recognize_3}

识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。

```csharp
public OcrOutput Recognize(OcrInput images, RecognitionSettings settings, 
    CancellationToken cancellationToken)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |
| settings | RecognitionSettings | 识别设置 [`RecognitionSettings`](../../recognitionsettings)。 |
| cancellationToken | CancellationToken | CancellationToken 对象。 |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象列表。

### 另请参见

* class [OcrOutput](../../ocroutput)
* class [OcrInput](../../ocrinput)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## Recognize(OcrInput, RecognitionSettings) {#recognize_2}

识别图像/文档上的文本。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、目录、数组、压缩包。

```csharp
public OcrOutput Recognize(OcrInput images, RecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |
| settings | RecognitionSettings | 识别设置 [`RecognitionSettings`](../../recognitionsettings)。 |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象列表。

### 另请参见

* class [OcrOutput](../../ocroutput)
* class [OcrInput](../../ocrinput)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
