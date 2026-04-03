---
title: GetRectangles
second_title: Aspose.OCR 适用于 .NET API 参考
description: 检测图像上的文本区域。未应用自动图像倾斜校正。支持 GIF PNG JPEG BMP TIFF JFIF。
type: docs
weight: 70
url: /zh/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

检测图像上的文本区域。未应用自动图像倾斜校正。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的路径。 |
| areasType | AreasType | 确定返回的矩形类型——行或段落。 |
| detectAreas | Boolean | 启用自动文本区域检测。 |

### 返回值

检测到的文本区域或行的列表。

### 另请参见

* enum [AreasType](../../areastype)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

检测图像上的文本区域。未应用自动图像倾斜校正。支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 图像 | MemoryStream | 包含图像的内存流。 |
| areasType | AreasType | 确定返回的矩形类型——行或段落。 |
| detectAreas | Boolean | 启用自动文本区域检测。 |

### 返回值

检测到的文本区域或行的列表。

### 另请参见

* enum [AreasType](../../areastype)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
