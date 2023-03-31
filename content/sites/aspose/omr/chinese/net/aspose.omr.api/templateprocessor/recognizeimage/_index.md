---
title: TemplateProcessor.RecognizeImage
second_title: Aspose.OMR for .NET API 参考
description: TemplateProcessor 方法. 识别图像
type: docs
weight: 30
url: /zh/net/aspose.omr.api/templateprocessor/recognizeimage/
---
## RecognizeImage(string, int) {#recognizeimage_1}

识别图像

```csharp
public RecognitionResult RecognizeImage(string imagePath, int recognitionThreshold = -100)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| imagePath | String | 识别图片的路径 |
| recognitionThreshold | Int32 | （可选）范围 (0..100) 内的识别阈值。 只有填充超过阈值的元素才会被计为已填充。 |

### 返回值

识别结果

### 也可以看看

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 命名空间 [Aspose.OMR.Api](../../templateprocessor/)
* 部件 [Aspose.OMR](../../../)

---

## RecognizeImage(MemoryStream, int) {#recognizeimage}

从内存流中识别图像

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, int recognitionThreshold = -100)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 图像的内存流。 |
| recognitionThreshold | Int32 | （可选）范围 (0..100) 内的识别阈值。 只有填充超过阈值的元素才会被计为已填充。 |

### 返回值

识别结果

### 也可以看看

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 命名空间 [Aspose.OMR.Api](../../templateprocessor/)
* 部件 [Aspose.OMR](../../../)


