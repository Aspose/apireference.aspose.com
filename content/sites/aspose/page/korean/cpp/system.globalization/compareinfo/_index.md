---
title: "System::Globalization::CompareInfo 클래스"
linktitle: "CompareInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::CompareInfo 클래스. 문화에 민감한 문자열 비교를 수행합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.globalization/compareinfo/
---
## CompareInfo class


문화에 민감한 문자열 비교를 수행합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class CompareInfo : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | 문자열을 비교합니다. 구현되지 않음. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | 문자열을 비교합니다. Ordinal 및 OrdinalIgnoreCase 모드만 지원됩니다. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | 한 문자열의 일부와 두 번째 문자열의 일부를 비교합니다. 구현되지 않음. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | 문자열 비교 메서드를 사용하여 한 문자열의 끝 부분과 두 번째 문자열의 끝 부분을 비교합니다. 구현되지 않음. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | 한 문자열의 끝 부분과 두 번째 문자열의 끝 부분을 비교합니다. 구현되지 않음. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | 문자열 비교 메서드를 사용하여 한 문자열의 일부와 두 번째 문자열의 일부를 비교합니다. 구현되지 않음. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI 정보. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | 비교기에 연결된 문화의 LCID를 가져옵니다. |
| virtual [get_Name](./get_name/)() const | 비교기에 연결된 문화의 이름을 가져옵니다. |
| [get_Version](./get_version/)() const | 정렬 버전에 대한 정보를 가져옵니다. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | 지정된 어셈블리에서 문자열 비교 메서드를 사용하여 지정된 문화와 연결된 [CompareInfo](./)을 가져옵니다. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | 지정된 어셈블리에서 문자열 비교 메서드를 사용하여 지정된 문화와 연결된 [CompareInfo](./)을 가져옵니다. |
| static [GetCompareInfo](./getcompareinfo/)(int) | 지정된 문화와 연결된 [CompareInfo](./)을 가져옵니다. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | 지정된 문화와 연결된 [CompareInfo](./)을 가져옵니다. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | 지정된 비교 옵션을 기반으로 문자열 해시 코드를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자열에 대한 [SortKey](../sortkey/) 객체를 가져옵니다. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | 지정된 문자열에 대한 [SortKey](../sortkey/) 객체를 가져옵니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | 부분 문자열을 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | 부분 문자열을 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | 부분 문자열을 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | 지정된 문자를 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | 부분 문자열을 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | 지정된 문자를 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | 부분 문자열을 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | 지정된 문자를 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | 지정된 문자를 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | 지정된 문자를 찾습니다. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | 부분 문자열을 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | 지정된 문자를 찾습니다. 오디널 모드만 지원됩니다. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자열이 지정된 접두사로 시작하는지 확인합니다. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | 지정된 문자열이 지정된 접두사로 시작하는지 확인합니다. |
| static [IsSortable](./issortable/)(char16_t) | 지정된 문자가 정렬 가능한지 확인합니다. |
| static [IsSortable](./issortable/)(const String\&) | 지정된 문자열이 정렬 가능한지 확인합니다. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자열이 지정된 접미사로 끝나는지 확인합니다. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | 지정된 문자열이 지정된 접미사로 끝나는지 확인합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | 지정된 부분 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 부분 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | 지정된 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | 지정된 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | 지정된 문자의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자열의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | 지정된 비교 옵션을 사용하여 지정된 문자의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | 지정된 문자의 마지막 발생을 검색합니다. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | 지정된 문자의 마지막 발생을 검색합니다. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
