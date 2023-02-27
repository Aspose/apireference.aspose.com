---
title: AsposeOcr.RecognizeMultipleImages
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 从列表中识别多个图像  不支持存档和文件夹 处理图像的最大数量为 20 支持 GIFPNGJPEGBMPTIFFJFIF
type: docs
weight: 200
url: /zh/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

从列表中识别多个图像。  不支持存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| files | List`1 | 图像的完整路径。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

阵列的[`RecognitionResult`](../../recognitionresult/)每个处理过的图像具有识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

使用默认设置从列表中识别多个图像。  不支持存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| files | List`1 | 图像的完整路径。 |

### 返回值

阵列的[`RecognitionResult`](../../recognitionresult/)每个处理过的图像具有识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

识别打包在 ZIP 存档或文件夹中的多个图像。  不支持嵌套存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | zip 存档（包括 .zip 扩展名）或包含图像的文件夹的完整路径。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

阵列的[`RecognitionResult`](../../recognitionresult/)每个处理过的图像具有识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

识别打包在 ZIP 存档中或来自具有默认设置的文件夹的多个图像。  不支持嵌套存档和文件夹。 处理图像的最大数量为 20。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | zip 存档（包括 .zip 扩展名）或包含图像的文件夹的完整路径。 |

### 返回值

阵列的[`RecognitionResult`](../../recognitionresult/)每个处理过的图像具有识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


