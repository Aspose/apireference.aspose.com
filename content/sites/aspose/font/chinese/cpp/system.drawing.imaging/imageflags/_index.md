---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ImageFlags enum。表示 C++ 中 Image 对象所表示的像素数据的属性。"
type: docs
weight: 2200
url: /zh/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


表示由 [Image](../../system.drawing/image/) 对象表示的像素数据的属性。

```cpp
enum class ImageFlags
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 |  |
| 可伸缩 | 1 | 可伸缩。 |
| HasAlpha | 2 | 包含 alpha 信息。 |
| HasTranslucent | 4 | alpha 值大于 0 且小于 255。 |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | 像素数据以 RGB 颜色空间表示。 |
| ColorSpaceCmyk | 32 | 像素数据以 CMYK 颜色空间表示。 |
| ColorSpaceGray | 64 | 像素数据为灰度。 |
| ColorSpaceYcbcr | 128 | 像素数据以 YCBCR 颜色空间表示。 |
| ColorSpaceYcck | 256 | 像素数据以 YCCK 颜色空间表示。 |
| HasRealDpi | 4096 | DPI 信息存储在图像中。 |
| HasRealPixelSize | 8192 | 像素的大小存储在图像中。 |
| 只读 | 65536 | 像素数据为只读。 |
| Caching | 131072 | 可以缓存以加快访问速度。 |

## 另见

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
