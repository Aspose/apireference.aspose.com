---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 检查图像是否包含提供的文本片段
type: docs
weight: 80
url: /zh/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

检查图像是否包含提供的文本片段。

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| text | String | 用于搜索图像的文本片段。 |
| settings | RecognitionSettings | 识别设置。 |
| ignoreCase | Boolean | True - 表示不区分大小写的搜索。 |

### 返回值

如果图像包含文本片段，则为真。 False - 图像不包含文本片段。

### 评论

识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

检查图像文本是否与提供的正则表达式匹配。

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| regex | Regex | 具有提供的模式和选项的 System.Text.RegularExpressions 对象。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

如果图像文本与提供的正则表达式匹配，则为真。

### 评论

识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


