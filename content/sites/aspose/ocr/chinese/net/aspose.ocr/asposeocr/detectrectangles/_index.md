---
title: DetectRectangles
second_title: Aspose.OCR 适用于 .NET API 参考
description: 检测图像上的文本区域。支持 GIF PNG JPEG BMP TIFF JFIF 流、文件夹、数组和归档。
type: docs
weight: 90
url: /zh/net/aspose.ocr/asposeocr/detectrectangles/
---
## DetectRectangles(OcrInput) {#detectrectangles}

检测图像上的文本区域。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。

```csharp
public List<RectangleOutput> DetectRectangles(OcrInput images)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |

### 返回值

包含检测到的文本区域或行的 [`RectangleOutput`](../../rectangleoutput) 列表。

### 另请参见

* class [RectangleOutput](../../rectangleoutput)
* class [OcrInput](../../ocrinput)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## DetectRectangles(OcrInput, AreasType, bool) {#detectrectangles_1}

检测图像上的文本区域。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF、流、文件夹、数组、压缩包。

```csharp
public List<RectangleOutput> DetectRectangles(OcrInput images, AreasType areasType, 
    bool detectAreas = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含源的容器[`OcrInput`](../../ocrinput)。 |
| areasType | AreasType | 确定返回的矩形类型——行或段落。 |
| detectAreas | Boolean | 启用自动文本区域检测。 |

### 返回值

包含检测到的文本区域或行的 [`RectangleOutput`](../../rectangleoutput) 列表。

### 另请参见

* class [RectangleOutput](../../rectangleoutput)
* class [OcrInput](../../ocrinput)
* enum [AreasType](../../areastype)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
