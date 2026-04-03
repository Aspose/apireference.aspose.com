---
title: DetectDefects
second_title: Aspose.OCR 适用于 .NET API 参考
description: 自动查找图像中可能显著影响 OCR 准确性的有问题区域。支持以文件流或像素数组提供的 PNG、JPEG、BMP、TIFF、JFIF 和 GIF 图像。支持批量识别。
type: docs
weight: 60
url: /zh/net/aspose.ocr/asposeocr/detectdefects/
---
## AsposeOcr.DetectDefects method

自动查找图像中可能显著影响 OCR 准确性的有问题区域。支持以文件、流或像素数组形式提供的 PNG、JPEG、BMP、TIFF、JFIF 和 GIF 图像。支持批量识别。

```csharp
public List<DefectOutput> DetectDefects(OcrInput images, DefectType defectType)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 源图像 [`OcrInput`](../../ocrinput) |
| defectType | DefectType | 要识别的缺陷类型 [`DefectType`](../../defecttype) |

### 返回值

检测到的图像缺陷，若未发现缺陷则返回空集合 [`DefectOutput`](../../defectoutput)。

### 另请参见

* class [DefectOutput](../../defectoutput)
* class [OcrInput](../../ocrinput)
* enum [DefectType](../../defecttype)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
