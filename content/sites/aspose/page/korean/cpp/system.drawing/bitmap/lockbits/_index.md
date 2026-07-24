---
title: "System::Drawing::Bitmap::LockBits 메서드"
linktitle: "LockBits"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Bitmap::LockBits 메서드. 비트맵을 시스템 메모리에 잠급니다 (C++)."
type: docs
weight: 1500
url: /ko/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


시스템 메모리에 [Bitmap](../)을 잠급니다.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rect | const Rectangle\& | 잠글 이미지 영역을 지정하는 사각형 |
| flags | Imaging::ImageLockMode | 비트맵에 대한 접근 수준을 지정합니다 |
| 형식 | Imaging::PixelFormat | 이 비트맵의 데이터 형식 |

### ReturnValue

수행된 잠금 작업에 대한 정보를 포함하는 BitmapData 객체에 대한 공유 포인터

## 또 보기

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


시스템 메모리에 [Bitmap](../)을 잠급니다.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rect | const Rectangle\& | 잠글 이미지 영역을 지정하는 사각형 |
| flags | Imaging::ImageLockMode | 비트맵에 대한 접근 수준을 지정합니다 |
| 형식 | Imaging::PixelFormat | 이 비트맵의 데이터 형식 |
| bitmap_data | const Imaging::BitmapDataPtr\& | 잠금 작업에 대한 정보를 포함합니다 |

### ReturnValue

수행된 잠금 작업에 대한 정보를 포함하는 BitmapData 객체에 대한 공유 포인터

## 또 보기

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
