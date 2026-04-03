---
title: RecognizeImage
second_title: Aspose.OCR 适用于 .NET API 参考
description: 识别图像上的文本。
type: docs
weight: 140
url: /zh/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

识别图像上的文本。

```csharp
public string RecognizeImage(string fullPath)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的路径。 |

### 返回值

已识别的文本。

### 备注

使用自动图像倾斜校正和文本区域检测。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 另请参见

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的路径。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象。

### 备注

识别图像并可指定[`RecognitionSettings`](../../recognitionsettings)。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

识别图像上的文本。

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 包含图像的内存流。 |

### 返回值

已识别的文本。

### 备注

使用自动图像倾斜校正和文本区域检测。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 另请参见

* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

识别图像上的文本。可通过指定 [`RecognitionSettings`](../../recognitionsettings) 来识别图像。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 包含图像的内存流。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| imageData | Byte[] | 以字节数组形式解码的图像。对于 bitsPerPixel > 1，使用 RGB 照明技术。 |
| width | Int32 | 图像宽度。 |
| 高度 | Int32 | 图像高度。 |
| pixelFormat | PixelType | 支持 byte、rgb、bgr、rgba。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象。

### 备注

识别图像并可指定 [`RecognitionSettings`](../../recognitionsettings)。支持行解码字节数据。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* enum [PixelType](../../pixeltype)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| imageData | Color[] | 在 Aspose.Drawing.Color 数组中的解码图像。 |
| width | Int32 | 图像宽度。 |
| 高度 | Int32 | 图像高度。 |
| settings | RecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的 [`RecognitionResult`](../../recognitionresult) 对象。

### 备注

识别图像并可指定 [`RecognitionSettings`](../../recognitionsettings)。支持行解码字节数据。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [RecognitionSettings](../../recognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
