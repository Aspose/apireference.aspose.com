---
title: "System::Drawing::StringFormat 클래스"
linktitle: "StringFormat"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::StringFormat 클래스. 텍스트 레이아웃 정보, 디스플레이 조작 및 OpenType 기능을 캡슐화합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.drawing/stringformat/
---
## StringFormat class


텍스트 레이아웃 정보, 디스플레이 조작 및 OpenType 기능을 캡슐화합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class StringFormat : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 현재 객체의 정확한 복사본을 반환합니다. |
| [get_Alignment](./get_alignment/)() const | 문자열의 수평 정렬을 나타내는 값을 반환합니다. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | 지역 숫자가 서구 숫자로 대체될 때 사용되는 언어를 나타내는 값을 반환합니다. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | 숫자 대체 방법을 반환합니다. |
| [get_FormatFlags](./get_formatflags/)() const | 현재 객체가 나타내는 문자열 형식을 지정하는 [StringFormatFlags](../stringformatflags/)의 비트별 조합을 반환합니다. |
| static [get_GenericDefault](./get_genericdefault/)() | [StringFormat](./) 객체를 반환하며, 이는 일반적인 기본 형식을 나타냅니다. |
| static [get_GenericTypographic](./get_generictypographic/)() | [StringFormat](./) 객체를 반환하며, 이는 일반적인 타이포그래픽 형식을 나타냅니다. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | 핫키 접두사가 표시되는 방식을 나타내는 값을 반환합니다. |
| [get_LineAlignment](./get_linealignment/)() const | 문자열의 수직 정렬을 나타내는 값을 반환합니다. |
| [get_Trimming](./get_trimming/)() const | 문자열이 잘리는 방식을 나타내는 값을 반환합니다. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | [CharacterRange](../characterrange/) 배열의 크기를 가져옵니다. |
| [GetTabStops](./gettabstops/)(float\&) const | 현재 [StringFormat](./) 객체의 탭 정지를 반환합니다. |
| [set_Alignment](./set_alignment/)(StringAlignment) | 문자열의 수평 정렬을 설정합니다. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | 문자열 형식 플래그를 설정합니다. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | 핫키 접두사가 표시되는 방식을 지정하는 값을 설정합니다. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | 문자열의 수직 정렬을 설정합니다. |
| [set_Trimming](./set_trimming/)(StringTrimming) | 문자열이 잘리는 방식을 지정하는 값을 설정합니다. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | 숫자 대체 언어 및 방법을 설정합니다. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | MeasureCharacterRanges() 메서드 호출로 측정된 문자 범위를 나타내는 [CharacterRange](../characterrange/) 객체 배열을 설정합니다. |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | 현재 [StringFormat](./) 객체의 탭 정지를 설정합니다. |
| [StringFormat](./stringformat/)() | [StringFormat](./) 클래스의 새 인스턴스를 생성합니다. |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | 지정된 형식 플래그와 언어를 사용하여 [StringFormat](./) 클래스의 새 인스턴스를 생성합니다. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | 복사 생성자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
