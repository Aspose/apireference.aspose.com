---
title: ImageHasText
second_title: Aspose.OCR 适用于 .NET API 参考
description: 检查图像是否包含提供的文本片段。
type: docs
weight: 110
url: /zh/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool, bool) {#imagehastext}

检查图像是否包含提供的文本片段。

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true, bool autoSkew = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的路径。 |
| text | String | 用于在图像上搜索的文本片段。 |
| settings | RecognitionSettings | Recognition settings. |
| ignoreCase | Boolean | True - means a case-insensitive search. |
| autoSkew | Boolean | 启用自动图像倾斜校正。 |

### 返回值

如果图像包含文本片段则为 True。否则为 False——图像不包含文本片段。

### 备注

识别图像并可指定[`RecognitionSettings`](../../recognitionsettings)。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 另请参见

* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings, bool) {#imagehastext_1}

检查图像文本是否匹配提供的正则表达式。

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null, 
    bool autoSkew = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的路径。 |
| 正则表达式 | 正则表达式 | 具有提供的模式和选项的 System.Text.RegularExpressions 对象。 |
| settings | RecognitionSettings | Recognition settings. |
| autoSkew | Boolean | 启用自动图像倾斜校正。 |

### 返回值

如果图像文本匹配提供的正则表达式则为 True。

### 备注

识别图像并可指定[`RecognitionSettings`](../../recognitionsettings)。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 另请参见

* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
