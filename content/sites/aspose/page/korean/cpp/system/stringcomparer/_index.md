---
title: "System::StringComparer 클래스"
linktitle: "StringComparer"
second_title: "C++용 Aspose.Page"
description: "System::StringComparer 클래스. 다양한 비교 모드를 사용하여 문자열을 비교합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 5900
url: /ko/cpp/system/stringcomparer/
---
## StringComparer class


다양한 비교 모드를 사용하여 문자열을 비교합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 현재 설정을 사용하여 두 문자열을 비교합니다. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | 문화별 비교자를 생성합니다. |
| [Equals](./equals/)(String, String) const override | 현재 설정을 사용하여 두 문자열이 같은지 확인합니다. |
| static [get_CurrentCulture](./get_currentculture/)() | 현재 문화 비교자 싱글톤. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | 현재 문화 대소문자 무시 비교자 싱글톤. |
| static [get_InvariantCulture](./get_invariantculture/)() | 불변 문화 비교자 싱글톤. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | 불변 문화 대소문자 무시 비교자 싱글톤. |
| static [get_Ordinal](./get_ordinal/)() | Ordinal 비교자 싱글톤. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Ordinal 대소문자 무시 비교자 싱글톤. |
| [GetHashCode](./gethashcode/)(String) const override | 문자열의 해시 코드를 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [args_type](./args_type/) | RTTI 정보. |
## 또 보기

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
