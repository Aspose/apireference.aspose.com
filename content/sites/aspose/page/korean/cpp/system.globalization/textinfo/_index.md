---
title: "System::Globalization::TextInfo 클래스"
linktitle: "TextInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::TextInfo 클래스. 로케일별 텍스트 속성을 정의합니다. 설정 연산은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.globalization/textinfo/
---
## TextInfo class


로케일별 텍스트 속성을 정의합니다. 설정 연산은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class TextInfo : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 정보. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | ANSI 코드 페이지를 가져옵니다. |
| [get_CultureName](./get_culturename/)() const | 문화 이름을 가져옵니다. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | EBCDIC 코드 페이지를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const | 형식이 읽기 전용인지 확인합니다. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | 텍스트가 왼쪽에서 오른쪽으로 쓰여지는지 확인합니다. |
| [get_LCID](./get_lcid/)() const | 로케일 ID를 가져옵니다. |
| virtual [get_ListSeparator](./get_listseparator/)() const | 목록 구분자를 가져옵니다. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Macintosh 코드 페이지를 가져옵니다. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | OEM 코드 페이지를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | 문화의 읽기 전용 버전을 가져옵니다. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | 목록 구분자를 설정합니다. |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI 정보. |
| virtual [ToLower](./tolower/)(char_t) const | 문자를 소문자로 변환합니다. |
| virtual [ToLower](./tolower/)(String) const | 문자열을 소문자로 변환합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| [ToTitleCase](./totitlecase/)(String) const | 문자열을 제목 형식(대문자 약어는 제외)으로 변환합니다. |
| virtual [ToUpper](./toupper/)(char_t) const | 문자를 대문자로 변환합니다. |
| virtual [ToUpper](./toupper/)(String) const | 문자열을 대문자로 변환합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
