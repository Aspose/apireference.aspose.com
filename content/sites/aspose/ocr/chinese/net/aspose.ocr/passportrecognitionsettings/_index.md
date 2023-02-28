---
title: Class PassportRecognitionSettings
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.PassportRecognitionSettings 班级. 护照识别设置 包含允许自定义识别过程的元素
type: docs
weight: 190
url: /zh/net/aspose.ocr/passportrecognitionsettings/
---
## PassportRecognitionSettings class

护照识别设置。 包含允许自定义识别过程的元素。

```csharp
public class PassportRecognitionSettings : ReceiptRecognitionSettings
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PassportRecognitionSettings](passportrecognitionsettings/)(Language) | 初始化一个新的实例`PassportRecognitionSettings`具有全套属性的类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | 允许的字符集。确定识别结果允许的字符类型。 |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | 获取或设置一个标志，指示是否应启用自动图像倾斜校正。 默认启用 (true)。 |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | 为识别符号设置黑名单。 |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | 获取或设置用于 OCR 的语言。  确定识别时使用的字母表。 默认为多语言。 |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | 允许通过调整预处理方法为 OCR 准备图像。 |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | 获取或设置用于处理的线程数。 默认情况下，0 表示将使用等于处理器数量的线程数处理图像。 ThreadsCount = 1 表示将在主线程中处理图像。 |

### 也可以看看

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


