---
title: "System::Drawing::Imaging::ImageFormat 클래스"
linktitle: "ImageFormat"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ImageFormat 클래스. 이미지의 파일 형식을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


이미지의 파일 형식을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ImageFormat : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | 현재 객체와 지정된 객체가 나타내는 이미지 형식이 동일한지 판단합니다. |
| static [get_Bmp](./get_bmp/)() | 비트맵 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Emf](./get_emf/)() | 향상된 메타파일 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Exif](./get_exif/)() | 교환 가능한 [Image](../../system.drawing/image/) 파일(Exif) 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Gif](./get_gif/)() | [Graphics](../../system.drawing/graphics/) 인터체인지 포맷(GIF) 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| [get_Guid](./get_guid/)() const | 현재 객체가 나타내는 이미지 형식과 연결된 GUID를 반환합니다. |
| static [get_Icon](./get_icon/)() | [Windows](../../system.windows/) 아이콘 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Jpeg](./get_jpeg/)() | Joint Photographic Experts Group(JPEG) 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_MemoryBmp](./get_memorybmp/)() | 메모리 내 비트맵 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Png](./get_png/)() | W3C 포터블 네트워크 [Graphics](../../system.drawing/graphics/)(PNG) 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Tiff](./get_tiff/)() | Tagged [Image](../../system.drawing/image/) 파일 포맷(TIFF) 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| static [get_Wmf](./get_wmf/)() | [Windows](../../system.windows/) 메타파일(WMF) 이미지 형식을 나타내는 [ImageFormat](./) 객체에 대한 공유 포인터를 반환합니다. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | 지정된 GUID와 연결된 이미지 형식 포맷을 나타내는 [ImageFormat](./) 클래스의 인스턴스를 생성합니다. |
| virtual [ToString](./tostring/)() const | 이 [ImageFormat](./) 객체를 사람이 읽을 수 있는 문자열로 변환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
