---
title: "System::BoxedValue 클래스"
linktitle: "BoxedValue"
second_title: "C++용 Aspose.Page"
description: "System::BoxedValue 클래스. 박싱된 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하세요."
type: docs
weight: 800
url: /ko/cpp/system/boxedvalue/
---
## BoxedValue class


박싱된 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하세요.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| 매개변수 | 설명 |
| --- | --- |
| T | 클래스가 나타내는 박싱된 값의 타입 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | 지정된 값을 박싱하여 나타내는 객체를 생성합니다. |
| [Equals](./equals/)(ptr) override | 현재 객체와 지정된 객체가 나타내는 박싱된 값의 동일성을 판단합니다. |
| [GetHashCode](./gethashcode/)() const override | 현재 객체에 대한 해시 코드를 반환합니다. |
| [GetType](./gettype/)() const override | 객체의 실제 타입을 가져옵니다. |
| [GetTypeCode](./gettypecode/)() const override | 현재 객체가 나타내는 박싱된 값의 타입을 나타내는 값을 반환합니다. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | 박싱된 객체를 캐스트할 수 있으면 그 숫자 값을 반환하고, 그렇지 않으면 0을 반환합니다. |
| [is](./is/)() const | 현재 객체가 나타내는 박싱된 값의 타입이 **V**인지 판단합니다. |
| [IsBoxedEnum](./isboxedenum/)() override | 현재 객체가 열거형 타입의 박싱된 값을 나타내는지 판단합니다. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | 지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다. 매개변수는 열거 상수 이름 문자열을 해석할 때 대소문자를 무시할지 여부를 지정합니다. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | 지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 나타내는 박싱된 값을 문자열로 변환합니다. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | 지정된 형식 문자열을 사용하여 박싱된 객체를 문자열로 변환합니다. |
| [unbox](./unbox/)() const | 현재 객체가 나타내는 값을 언박싱합니다. |

## 또 보기

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
