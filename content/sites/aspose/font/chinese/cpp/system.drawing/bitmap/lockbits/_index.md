---
title: "System::Drawing::Bitmap::LockBits 方法"
linktitle: "LockBits"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Bitmap::LockBits 方法。将 Bitmap 锁定到系统内存中，在 C++ 中。"
type: docs
weight: 1500
url: /zh/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


将一个 [Bitmap](../) 锁定到系统内存中。

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rect | const Rectangle\& | 指定要锁定的图像区域的矩形 |
| 标志 | Imaging::ImageLockMode | 指定位图的访问级别 |
| 格式 | Imaging::PixelFormat | 此位图的数据格式 |

### ReturnValue

指向 BitmapData 对象的共享指针，该对象包含有关已执行锁定操作的信息

## 另见

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


将一个 [Bitmap](../) 锁定到系统内存中。

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rect | const Rectangle\& | 指定要锁定的图像区域的矩形 |
| 标志 | Imaging::ImageLockMode | 指定位图的访问级别 |
| 格式 | Imaging::PixelFormat | 此位图的数据格式 |
| bitmap_data | const Imaging::BitmapDataPtr\& | 包含有关锁定操作的信息 |

### ReturnValue

指向 BitmapData 对象的共享指针，该对象包含有关已执行锁定操作的信息

## 另见

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
