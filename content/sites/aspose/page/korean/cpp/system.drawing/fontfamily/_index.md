---
title: "System::Drawing::FontFamily 클래스"
linktitle: "FontFamily"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::FontFamily 클래스. 유사한 기본 디자인을 공유하는 글꼴 패밀리 그룹을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.drawing/fontfamily/
---
## FontFamily class


유사한 기본 디자인을 공유하는 글꼴 패밀리 그룹을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class FontFamily : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 현재 [FontFamily](./) 객체의 복사본을 반환합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 현재 객체와 지정된 객체가 동일한지 확인합니다. |
| [FontFamily](./fontfamily/)(const String\&) | [FontFamily](./) 클래스를 새 인스턴스로 생성하여 지정된 이름의 글꼴 패밀리를 나타냅니다. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | 지정된 FontCollection 내에서 지정된 이름을 사용하여 [FontFamily](./)의 새 인스턴스를 생성합니다. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | 지정된 일반 글꼴 패밀리에서 [FontFamily](./)의 새 인스턴스를 생성합니다. |
| static [get_Families](./get_families/)() | 현재 그래픽 컨텍스트와 연결된 모든 [FontFamily](./) 객체를 포함하는 배열을 반환합니다. |
| static [get_GenericMonospace](./get_genericmonospace/)() | 일반 고정폭 글꼴 패밀리를 나타내는 [FontFamily](./) 객체를 반환합니다. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | 일반 산세리프 글꼴 패밀리를 나타내는 [FontFamily](./) 객체를 반환합니다. |
| static [get_GenericSerif](./get_genericserif/)() | 일반 세리프 글꼴 패밀리를 나타내는 [FontFamily](./) 객체를 반환합니다. |
| [get_Name](./get_name/)() const | 현재 객체가 나타내는 글꼴 패밀리의 이름을 반환합니다. |
| [GetCellAscent](./getcellascent/)(FontStyle) | 지정된 글꼴 스타일에 대해 현재 객체가 나타내는 글꼴 패밀리의 셀 상승값을 반환합니다. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | 지정된 글꼴 스타일에 대해 현재 객체가 나타내는 글꼴 패밀리의 셀 하강값을 반환합니다. |
| [GetEmHeight](./getemheight/)(FontStyle) | 지정된 스타일에 대한 글꼴 디자인 단위의 em 사각형 높이를 반환합니다. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | 지정된 글꼴 스타일에 대해 현재 객체가 나타내는 글꼴 패밀리의 줄 간격을 반환합니다. |
| [GetName](./getname/)(int) const | 현재 객체가 나타내는 글꼴 패밀리의 이름을 반환합니다. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | 지정된 글꼴 스타일이 사용 가능한지 확인합니다. |
| virtual [~FontFamily](./~fontfamily/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
