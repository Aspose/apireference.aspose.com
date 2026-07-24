---
title: "System::Net::Http::Headers::NameValueHeaderValue 클래스"
linktitle: "NameValueHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue 클래스. 헤더에서 사용할 키/값 쌍을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1400
url: /ko/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


헤더에서 사용할 키/값 쌍을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | 지정된 이름으로 컬렉션에서 NameValueHeaderValue 클래스 인스턴스를 찾습니다. |
| [get_Name](./get_name/)() | 현재 인스턴스의 이름을 반환합니다. |
| [get_Value](./get_value/)() | 현재 인스턴스의 값을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | 컬렉션 항목 전체의 해시 코드를 반환합니다. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | 지정된 인덱스부터 전달된 문자열을 [NameValueHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | 지정된 인덱스부터 전달된 문자열을 [NameValueHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | 지정된 인덱스부터 전달된 문자열을 NameValueHeaderValue-class 인스턴스들의 컬렉션으로 변환하고, 파싱된 부분 문자열의 길이를 반환합니다. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | 지정된 인덱스부터 값의 길이를 반환합니다. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | 새 인스턴스를 생성합니다. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | 새 인스턴스를 생성합니다. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | 새 인스턴스를 생성합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [NameValueHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [set_Value](./set_value/)(String) | 현재 인스턴스의 값을 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | NameValueHeaderValue-class 인스턴스들의 컬렉션에 대한 문자열 표현을 반환합니다. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | NameValueHeaderValue-class 인스턴스들의 컬렉션에 대한 문자열 표현을 반환합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | 전달된 문자열을 [NameValueHeaderValue](./) 클래스의 인스턴스로 변환을 시도합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
