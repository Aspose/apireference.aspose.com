---
title: "System::Drawing::Font 클래스"
linktitle: "폰트"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Font 클래스. 글꼴 종류, 크기 및 스타일을 포함한 텍스트의 특정 형식을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달할 때 사용하십시오."
type: docs
weight: 700
url: /ko/cpp/system.drawing/font/
---
## Font class


Represents a particular format for text, including font face, size, and style. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Font : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 현재 폰트의 복사본을 반환합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 현재 객체와 지정된 객체가 동일한지 확인합니다. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | 지정된 폰트 스타일을 가진 지정된 기존 폰트를 나타내는 새로운 [Font](./) 클래스 인스턴스를 생성합니다. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | 새로운 [Font](./) 클래스 인스턴스를 생성합니다. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | 새로운 [Font](./) 클래스 인스턴스를 생성합니다. |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | 새로운 [Font](./) 클래스 인스턴스를 생성합니다. |
| [Font](./font/)(const String\&, float, GraphicsUnit) | 새로운 [Font](./) 클래스 인스턴스를 생성합니다. |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | 구현되지 않음. |
| [get_Bold](./get_bold/)() | 현재 객체가 나타내는 폰트에 굵게 스타일이 적용되었는지 확인합니다. |
| [get_FontFamily](./get_fontfamily/)() | 현재 객체가 나타내는 폰트의 폰트 패밀리를 반환합니다. |
| [get_FontStyle](./get_fontstyle/)() | 현재 객체가 나타내는 폰트의 스타일을 반환합니다. |
| [get_GdiCharSet](./get_gdicharset/)() | 현재 객체가 나타내는 폰트에 사용된 GDI 문자 집합을 나타내는 값을 반환합니다. |
| [get_Height](./get_height/)() | 현재 객체가 나타내는 폰트의 줄 간격을 픽셀 단위로 반환합니다. |
| [get_Italic](./get_italic/)() | 현재 객체가 나타내는 글꼴에 이탤릭 스타일이 적용되었는지 확인합니다. |
| [get_Name](./get_name/)() | 현재 객체가 나타내는 글꼴의 얼굴 이름을 반환합니다. |
| [get_OriginalFontName](./get_originalfontname/)() | 글꼴의 원래 지정된 이름을 반환합니다. |
| [get_Size](./get_size/)() | 현재 객체가 나타내는 글꼴의 em 크기를 Unit 속성에서 지정한 단위로 측정하여 반환합니다. |
| [get_SizeInPoints](./get_sizeinpoints/)() | 현재 객체가 나타내는 글꼴의 em 크기를 포인트 단위로 반환합니다. |
| [get_Strikeout](./get_strikeout/)() | 현재 객체가 나타내는 글꼴에 취소선 스타일이 적용되었는지 확인합니다. |
| [get_Style](./get_style/)() | 현재 객체가 나타내는 글꼴의 글꼴 스타일을 반환합니다. |
| [get_Underline](./get_underline/)() | 현재 객체가 나타내는 글꼴에 밑줄 스타일이 적용되었는지 확인합니다. |
| [get_Unit](./get_unit/)() | 현재 객체가 나타내는 글꼴의 측정 단위를 반환합니다. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | 지정된 [Graphics](../graphics/) 객체의 현재 단위로, 현재 객체가 나타내는 글꼴의 줄 간격을 반환합니다. |
| [GetHeight](./getheight/)(float) | 지정된 수직 해상도를 가진 디스플레이 장치에 그려질 때, 현재 객체가 나타내는 글꼴의 높이를 반환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
