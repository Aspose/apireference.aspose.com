---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 比较两个图像上的文本并返回一个表示它们相似程度的数字0 到 1
type: docs
weight: 90
url: /zh/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

比较两个图像上的文本并返回一个表示它们相似程度的数字（0 到 1）。

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath1 | String | 第一张图片的路径。 |
| fullPath2 | String | 第二张图片的路径。 |
| settings | RecognitionSettings | 识别设置。 |
| ignoreCase | Boolean | True - 表示不区分大小写的搜索。 |

### 返回值

0 表示文本完全不同； 1 表示文本相同。

### 也可以看看

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


