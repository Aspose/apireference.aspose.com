---
title: AsposeOcr.CompareImageTexts
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 检查两个图像是否包含相同的文本
type: docs
weight: 50
url: /zh/net/aspose.ocr/asposeocr/compareimagetexts/
---
## AsposeOcr.CompareImageTexts method

检查两个图像是否包含相同的文本。

```csharp
public bool CompareImageTexts(string fullPath1, string fullPath2, 
    RecognitionSettings settings = null, bool ignoreCase = true)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath1 | String | 第一张图片的路径。 |
| fullPath2 | String | 第二张图片的路径。 |
| settings | RecognitionSettings | 识别设置。 |
| ignoreCase | Boolean | True - 表示不区分大小写的搜索。 |

### 返回值

如果图像具有相同的文本（相似度为 90%）则为真。

### 也可以看看

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


