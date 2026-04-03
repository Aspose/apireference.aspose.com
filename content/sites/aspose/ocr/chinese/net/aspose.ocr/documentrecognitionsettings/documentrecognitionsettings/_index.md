---
title: DocumentRecognitionSettings
second_title: Aspose.OCR 适用于 .NET API 参考
description: 使用简短的属性集初始化 DocumentRecognitionSettingsaspose.ocr/documentrecognitionsettings 类的新实例。
type: docs
weight: 10
url: /zh/net/aspose.ocr/documentrecognitionsettings/documentrecognitionsettings/
---
## DocumentRecognitionSettings(int, int) {#constructor}

使用简短的属性集初始化 [`DocumentRecognitionSettings`](../../documentrecognitionsettings) 类的新实例。

```csharp
public DocumentRecognitionSettings(int startPage = 0, int pagesNumber = 1)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| startPage | Int32 | 设置识别的起始页。默认值为 0。 |
| pagesNumber | Int32 | 设置多页 PDF 文件的识别页数。 |

### 另请参见

* class [DocumentRecognitionSettings](../../documentrecognitionsettings)
* namespace [Aspose.OCR](../../documentrecognitionsettings)
* assembly [Aspose.OCR](../../../)

---

## DocumentRecognitionSettings(int, int, Language, bool, bool, int) {#constructor_1}

使用完整的属性集初始化 [`DocumentRecognitionSettings`](../../documentrecognitionsettings) 类的新实例。

```csharp
public DocumentRecognitionSettings(int startPage, int pagesNumber, 
    Language language = Language.None, bool detectAreas = true, bool autoSkew = true, 
    int threshold = 0)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| startPage | Int32 | 设置识别的起始页。默认值为 0。 |
| pagesNumber | Int32 | 设置多页 PDF 文件的识别页数。 |
| language | 语言 | 用于 OCR 的语言。 |
| detectAreas | Boolean | 启用自动文本区域检测。 |
| autoSkew | Boolean | 启用自动图像倾斜校正。 |
| threshold | Int32 | 自定义图像二值化阈值。 |

### 另请参见

* enum [Language](../../language)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings)
* namespace [Aspose.OCR](../../documentrecognitionsettings)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
