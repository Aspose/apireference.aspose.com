---
title: "System::Globalization::IdnMapping 클래스"
linktitle: "IdnMapping"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::IdnMapping 클래스. IdnMapping은 이름을 Punycode로 매핑하는 데 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1300
url: /ko/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | [IdnMapping](./) 객체 두 개를 비교합니다. |
| [get_AllowUnassigned](./get_allowunassigned/)() const | 작업에 사용된 할당되지 않은 코드 포인트가 있는지 여부를 나타내는 플래그를 가져옵니다. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | 작업에 사용된 표준 명명 규칙이 있는지 여부를 나타내는 플래그를 가져옵니다. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) 유니코드 도메인 이름을 ASCII 등가물로 변환합니다. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) 유니코드 도메인 이름을 ASCII 등가물로 변환합니다. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) 유니코드 도메인 이름을 ASCII 등가물로 변환합니다. |
| [GetHashCode](./gethashcode/)() const override | 현재 [IdnMapping](./) 객체의 해시 코드를 가져옵니다. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ASCII 도메인 이름을 유니코드 등가물로 변환합니다. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ASCII 도메인 이름을 유니코드 등가물로 변환합니다. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ASCII 도메인 이름을 유니코드 등가물로 변환합니다. |
| [IdnMapping](./idnmapping/)() | RTTI 정보. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | 작업에 사용되는 할당되지 않은 코드 포인트가 있는지 나타내는 플래그를 설정합니다. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | 작업에 표준 명명 규칙이 사용되는지 나타내는 플래그를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
