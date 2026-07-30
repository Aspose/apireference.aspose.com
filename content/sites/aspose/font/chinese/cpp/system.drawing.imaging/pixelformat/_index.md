---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::PixelFormat enum. 指定 C++ 中像素的颜色数据格式。"
type: docs
weight: 2600
url: /zh/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


指定像素的颜色数据格式。

```cpp
enum class PixelFormat
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Indexed | 65536 | 指定像素数据包含颜色索引值，这意味着它们是系统颜色表中颜色的索引。 |
| Gdi | 131072 | 指定像素数据包含 GDI 颜色。 |
| Alpha | 262144 | 指定像素数据包含未预乘的 alpha 值。 |
| PAlpha | 524288 | 指定像素数据包含预乘的 alpha 值。 |
| 扩展 | 1048576 | 已保留。 |
| 规范 | 2097152 | 指定每像素 32 位的像素格式，具有 24 位颜色深度和 8 位 alpha 通道。 |
| 未定义 | 0 | 指定像素格式未定义。 |
| 不关心 | 0 | 像素格式未指定。 |
| Format1bppIndexed | n/a | 指定像素格式为每像素 1 位的索引颜色。 |
| Format4bppIndexed | n/a | 指定像素格式为每像素 4 位的索引颜色。 |
| Format8bppIndexed | n/a | 指定像素格式为每像素 8 位的索引颜色。 |
| Format16bppGrayScale | n/a | 指定像素格式为每像素 16 位。颜色信息指定 65536 种灰度。 |
| Format16bppRgb555 | n/a | 指定像素格式为每像素 16 位，每个红、绿、蓝分量各 5 位，剩余位未使用。 |
| Format16bppRgb565 | n/a | 指定像素格式为每像素 16 位，红色 5 位，绿色 6 位，蓝色 5 位。 |
| Format16bppArgb1555 | n/a | 指定像素格式为每像素 16 位，每个红、绿、蓝分量各 5 位，alpha 为 1 位。 |
| Format24bppRgb | n/a | 指定像素格式为每像素 24 位，红、绿、蓝每个分量 8 位。 |
| Format32bppRgb | n/a | 指定像素格式为每像素 32 位，其中红、绿、蓝每个分量各占 8 位，剩余的 8 位未使用。 |
| Format32bppArgb | n/a | 指定像素格式为每像素 32 位，其中红、绿、蓝每个分量各占 8 位，alpha 占 8 位。 |
| Format32bppPArgb | n/a | 指定像素格式为每像素 32 位，其中红、绿、蓝每个分量各占 8 位，alpha 占 8 位。红、绿、蓝分量会根据 alpha 分量的值进行预乘。 |
| Format48bppRgb | n/a | 指定像素格式为每像素 48 位，其中红、绿、蓝每个分量各占 16 位。 |
| Format64bppArgb | n/a | 指定像素格式为每像素 64 位，其中红、绿、蓝每个分量各占 16 位，alpha 占 16 位。 |
| Format64bppPArgb | n/a | 指定像素格式为每像素 64 位，其中红、绿、蓝每个分量各占 16 位，alpha 占 16 位。红、绿、蓝分量会根据 alpha 分量的值进行预乘。 |
| Format32bppCMYK | n/a | 指定像素格式为每像素 32 位，其中青色、品红、黄色和键色（Key）每个分量各占 8 位。 |
| Max | 16 | 此枚举的最大值。 |

## 另见

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
