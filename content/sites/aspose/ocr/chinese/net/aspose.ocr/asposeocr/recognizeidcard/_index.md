---
title: AsposeOcr.RecognizeIDCard
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 识别身份证上的文字
type: docs
weight: 130
url: /zh/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

识别身份证上的文字。

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| settings | IDCardRecognitionSettings | 识别设置[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

识别身份证上的文字。

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含收据图像的内存流。 |
| settings | IDCardRecognitionSettings | 识别设置[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


