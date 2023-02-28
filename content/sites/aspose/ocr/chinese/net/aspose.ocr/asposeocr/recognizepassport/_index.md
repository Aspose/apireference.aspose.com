---
title: AsposeOcr.RecognizePassport
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 识别护照上的文字
type: docs
weight: 210
url: /zh/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

识别护照上的文字。

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| settings | PassportRecognitionSettings | 识别设置[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`PassportRecognitionSettings`](../../passportrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

识别护照上的文字。

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含收据图像的内存流。 |
| settings | PassportRecognitionSettings | 识别设置[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`PassportRecognitionSettings`](../../passportrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


