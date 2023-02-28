---
title: RecognitionSettings.RecognitionSettings
second_title: Aspose.OCR for .NET API 参考
description: RecognitionSettings 构造函数. 初始化一个新的实例RecognitionSettings具有全套属性的类.
type: docs
weight: 10
url: /zh/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

初始化一个新的实例[`RecognitionSettings`](../)具有全套属性的类.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| language | Language | 用于 OCR 的语言。 |
| recognitionAreas | List`1 | 手动设置识别区域。默认情况下为空 - 表示处理整个图像。 |
| detectAreas | Boolean | 启用自动文本区域检测。 |
| autoSkew | Boolean | 启用自动图像倾斜校正。 |
| skewAngle | Single | 设置图像旋转的角度。 |
| recognizeSingleLine | Boolean | 对于单线图像 |
| threshold | Int32 | 自定义图像二值化阈值 |

### 也可以看看

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* 命名空间 [Aspose.OCR](../../recognitionsettings/)
* 部件 [Aspose.OCR](../../../)


