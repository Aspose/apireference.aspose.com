---
title: RecognizeMultipleImages
second_title: Aspose.OCR 适用于 .NET API 参考
description: 识别列表中的多张图像。存档和文件夹不受支持。最大处理图像数量为 20。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。
type: docs
weight: 200
url: /zh/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

识别列表中的多张图像。存档和文件夹不受支持。最大处理图像数量为 20。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 文件 | List`1 | 图像的完整路径。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含每个已处理图像的识别结果的 [`RecognitionResult`](../../recognitionresult) 对象数组。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

使用默认设置识别列表中的多张图像。存档和文件夹不受支持。最大处理图像数量为 20。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 文件 | List`1 | 图像的完整路径。 |

### 返回值

包含每个已处理图像的识别结果的 [`RecognitionResult`](../../recognitionresult) 对象数组。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

识别打包在 ZIP 存档或文件夹中的多张图像。嵌套的存档和文件夹不受支持。最大处理图像数量为 20。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | String | ZIP 存档的完整路径（包括 .zip 扩展名）或图像文件夹的完整路径。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含每个已处理图像的识别结果的 [`RecognitionResult`](../../recognitionresult) 对象数组。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

使用默认设置识别打包在 ZIP 存档或文件夹中的多张图像。嵌套的存档和文件夹不受支持。最大处理图像数量为 20。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | String | ZIP 存档的完整路径（包括 .zip 扩展名）或图像文件夹的完整路径。 |

### 返回值

包含每个已处理图像的识别结果的 [`RecognitionResult`](../../recognitionresult) 对象数组。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
