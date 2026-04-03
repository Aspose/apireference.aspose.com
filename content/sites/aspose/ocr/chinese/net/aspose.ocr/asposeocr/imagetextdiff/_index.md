---
title: ImageTextDiff
second_title: Aspose.OCR 适用于 .NET API 参考
description: 比较两幅图像上的文本，并返回一个表示相似度的数字，范围为 0 到 1。
type: docs
weight: 120
url: /zh/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

比较两幅图像上的文本，并返回表示相似度的数值（0 到 1）。

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true, bool autoSkew = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath1 | String | Path to the first image. |
| fullPath2 | String | Path to the second image. |
| settings | RecognitionSettings | Recognition settings. |
| ignoreCase | Boolean | True - means a case-insensitive search. |
| autoSkew | Boolean | 启用自动图像倾斜校正。 |

### 返回值

0 表示文本完全不同；1 表示文本完全相同。

### 另请参见

* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
