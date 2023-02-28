---
title: Enum DetectAreasMode
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.DetectAreasMode 枚举. 确定用于区域检测的神经网络类型
type: docs
weight: 60
url: /zh/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

确定用于区域检测的神经网络类型。

```csharp
public enum DetectAreasMode
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| NONE | `0` | 不检测段落。 更适合没有图片的简单单栏文档。 |
| DOCUMENT | `1` | 检测段落对文档使用 NN 模型。 更适合多列文档、带有图片或其他非文本对象的文档。 |
| PHOTO | `2` | 检测段落对照片使用 NN 模型。 更适合包含大量图片和其他非文本对象的图像。 |
| COMBINE | `3` | 检测带有文本的段落，然后使用其他 NN 模型检测段落内部的区域。 更适合具有复杂结构的图像。 |
| TABLE | `4` | 检测带有文本的单元格。 具有表格结构的图像的首选模式。 |
| CURVED_TEXT | `5` | 检测线条并识别弯曲图像上的文本。 书籍和杂志页面照片的首选模式。 |

### 评论

用于[`RecognitionSettings`](../recognitionsettings/)指定要识别的图像类型。

### 也可以看看

* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


