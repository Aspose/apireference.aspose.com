---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::BitmapData class. 비트맵 이미지의 속성 집합을 나타냅니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


비트맵 이미지의 속성 집합을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수를 인수로 전달하십시오.

```cpp
class BitmapData : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Height](./get_height/)() const | 이미지의 높이를 픽셀 단위로 반환합니다. |
| [get_PixelFormat](./get_pixelformat/)() const | 비트맵 이미지의 픽셀 형식을 반환합니다. |
| [get_Scan0](./get_scan0/)() const | 비트맵에서 첫 번째 픽셀 데이터의 주소를 반환합니다. |
| [get_Stride](./get_stride/)() const | 이미지의 스트라이드 너비(바이트)를 반환합니다. |
| [get_Width](./get_width/)() const | 이미지의 너비를 픽셀 단위로 반환합니다. |
| [set_Height](./set_height/)(int) | 이미지의 높이를 픽셀 단위로 설정합니다. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | 비트맵 이미지의 픽셀 형식을 설정합니다. |
| [set_Scan0](./set_scan0/)(IntPtr) | 비트맵에서 첫 번째 픽셀 데이터의 주소를 설정합니다. |
| [set_Stride](./set_stride/)(int) | 이미지의 스트라이드 너비(바이트)를 설정합니다. |
| [set_Width](./set_width/)(int) | 이미지의 너비를 픽셀 단위로 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
