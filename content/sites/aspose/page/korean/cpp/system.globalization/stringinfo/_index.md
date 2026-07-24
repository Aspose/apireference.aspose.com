---
title: "System::Globalization::StringInfo 클래스"
linktitle: "StringInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::StringInfo 클래스. 문자열 부분을 반복하는 Splitter. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2400
url: /ko/cpp/system.globalization/stringinfo/
---
## StringInfo class


문자열 부분을 반복하는 Splitter. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class StringInfo : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | [StringInfo](./) 객체에 포함된 텍스트 항목 수를 가져옵니다. |
| [get_String](./get_string/)() const | [StringInfo](./) 객체의 값을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | 지정된 문자열의 첫 번째 요소를 가져옵니다. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 요소를 가져옵니다. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | 문자열의 문자들을 반복하는 열거자를 생성합니다. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | 지정된 인덱스부터 문자열의 문자들을 반복하는 열거자를 생성합니다. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | 기본 문자, 고위 서러게이트 및 제어 문자들의 인덱스를 가져옵니다. |
| [set_String](./set_string/)(const String\&) | [StringInfo](./) 객체의 값을 설정합니다. |
| [StringInfo](./stringinfo/)() | RTTI 정보. |
| [StringInfo](./stringinfo/)(const String\&) | 생성자. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | 지정된 텍스트 요소부터 마지막 텍스트 요소까지의 텍스트 요소 부분 문자열을 가져옵니다. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | 지정된 텍스트 요소부터 지정된 개수만큼의 텍스트 요소까지의 부분 문자열을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
