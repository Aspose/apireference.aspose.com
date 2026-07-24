---
title: "System::Drawing::Bitmap::LockBits metode"
linktitle: "LockBits"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Bitmap::LockBits metode. Mengunci sebuah Bitmap ke memori sistem dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


Mengunci sebuah [Bitmap](../) ke memori sistem.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rect | const Rectangle\& | Sebuah persegi panjang yang menentukan wilayah gambar yang akan dikunci |
| flags | Imaging::ImageLockMode | Menentukan tingkat akses ke bitmap |
| format | Imaging::PixelFormat | Format data bitmap ini |

### ReturnValue

Pointer bersama ke objek BitmapData yang berisi informasi tentang operasi penguncian yang dilakukan

## Lihat Juga

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


Mengunci sebuah [Bitmap](../) ke memori sistem.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rect | const Rectangle\& | Sebuah persegi panjang yang menentukan wilayah gambar yang akan dikunci |
| flags | Imaging::ImageLockMode | Menentukan tingkat akses ke bitmap |
| format | Imaging::PixelFormat | Format data bitmap ini |
| bitmap_data | const Imaging::BitmapDataPtr\& | Berisi informasi tentang operasi penguncian |

### ReturnValue

Pointer bersama ke objek BitmapData yang berisi informasi tentang operasi penguncian yang dilakukan

## Lihat Juga

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
