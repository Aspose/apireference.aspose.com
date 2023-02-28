---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 识别图像上的文本
type: docs
weight: 140
url: /zh/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

识别图像上的文本。

```csharp
public string RecognizeImage(string fullPath)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |

### 返回值

识别的文本。

### 评论

使用自动图像倾斜校正和文本区域检测。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

识别图像上的文本。

```csharp
public string RecognizeImage(MemoryStream stream)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含图像的内存流。 |

### 返回值

识别的文本。

### 评论

使用自动图像倾斜校正和文本区域检测。 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

识别图像上的文本。  识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含图像的内存流。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| imageData | Byte[] | 字节数组中的解码图像。使用 bitsPerPixel &gt; 1 的 RGB 照明技术。 |
| width | Int32 | 图像宽度。 |
| height | Int32 | 图像高度。 |
| pixelFormat | PixelType | 支持字节、rgb、bgr、rgba。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/) . 支持行解码字节数据。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| imageData | Color[] | Aspose.Drawing.Color 数组中的解码图像。 |
| width | Int32 | 图像宽度。 |
| height | Int32 | 图像高度。 |
| settings | RecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`RecognitionSettings`](../../recognitionsettings/) . 支持行解码字节数据。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


