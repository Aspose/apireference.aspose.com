---
title: "System::Drawing::Bitmap::LockBits yöntemi"
linktitle: "LockBits"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Bitmap::LockBits yöntemi. Bir Bitmap'i C++'ta sistem belleğine kilitler."
type: docs
weight: 1500
url: /tr/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Bir [Bitmap](../) nesnesini sistem belleğine kilitler.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rect | const Rectangle\& | Kilitlemek için görüntünün bölgesini belirten bir dikdörtgen |
| bayraklar | Imaging::ImageLockMode | Bitmap'e erişim seviyesini belirtir |
| biçim | Imaging::PixelFormat | Bu bitmap'in veri formatı |

### ReturnValue

Gerçekleştirilen kilitleme işlemi hakkında bilgi içeren bir BitmapData nesnesine ortak gösterici

## Ayrıca Bakınız

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Bir [Bitmap](../) nesnesini sistem belleğine kilitler.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rect | const Rectangle\& | Kilitlemek için görüntünün bölgesini belirten bir dikdörtgen |
| bayraklar | Imaging::ImageLockMode | Bitmap'e erişim seviyesini belirtir |
| biçim | Imaging::PixelFormat | Bu bitmap'in veri formatı |
| bitmap_data | const Imaging::BitmapDataPtr\& | Kilit işlemi hakkında bilgi içerir |

### ReturnValue

Gerçekleştirilen kilitleme işlemi hakkında bilgi içeren bir BitmapData nesnesine ortak gösterici

## Ayrıca Bakınız

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
