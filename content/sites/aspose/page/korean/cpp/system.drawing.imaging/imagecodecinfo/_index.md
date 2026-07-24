---
title: "System::Drawing::Imaging::ImageCodecInfo 클래스"
linktitle: "ImageCodecInfo"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ImageCodecInfo 클래스. 이미지 코덱에 대한 정보를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


이미지 코덱에 대한 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class ImageCodecInfo : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | 현재 객체가 나타내는 코덱 형식과 연결된 GUID를 반환합니다. |
| [get_MimeType](./get_mimetype/)() | 현재 객체가 나타내는 코덱의 멀티퍼포스 인터넷 메일 확장(MIME) 유형을 반환합니다. |
| static [GetImageDecoders](./getimagedecoders/)() | 지원되는 이미지 디코더를 나타내는 [ImageCodecInfo](./) 객체 배열을 반환합니다. |
| static [GetImageEncoders](./getimageencoders/)() | 지원되는 이미지 인코더를 나타내는 [ImageCodecInfo](./) 객체 배열을 반환합니다. |
| [set_FormatID](./set_formatid/)(const Guid\&) | 현재 객체가 나타내는 코덱 형식과 연결된 GUID를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
