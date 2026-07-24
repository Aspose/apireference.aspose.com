---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue 클래스"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue 클래스. 헤더에서 사용할 매개변수가 포함된 키/값 쌍을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1500
url: /ko/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


헤더에서 사용할 매개변수가 포함된 키/값 쌍을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Parameters](./get_parameters/)() | RTTI 정보. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 지정된 인덱스부터 전달된 문자열을 [NameValueWithParametersHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | 새 인스턴스를 생성합니다. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | 새 인스턴스를 생성합니다. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | 새 인스턴스를 생성합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [NameValueWithParametersHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | 전달된 문자열을 [NameValueWithParametersHeaderValue](./) 클래스의 인스턴스로 변환하려 시도합니다. |
## 또 보기

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
