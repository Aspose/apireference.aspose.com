---
title: "System::DefaultBoxedValue 클래스"
linktitle: "DefaultBoxedValue"
second_title: "C++용 Aspose.Page"
description: "System::DefaultBoxedValue 클래스. BoxedValue 클래스 구현. 공통 코드를 중복하지 않고 BoxingValue 특수화를 선언할 수 있도록 합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 2000
url: /ko/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | [DefaultBoxedValue](./) 클래스를 새 인스턴스로 생성하고, 지정된 값을 나타냅니다. |
| [Equals](./equals/)(ptr) override | 현재 객체와 지정된 객체가 나타내는 박싱된 값의 동일성을 판단합니다. |
| [GetHashCode](./gethashcode/)() const override | 현재 객체에 대한 해시 코드를 반환합니다. |
| [GetType](./gettype/)() const override | 객체의 실제 타입을 가져옵니다. |
| [is](./is/)() const | 현재 객체가 나타내는 박싱된 값의 타입이 **V**인지 판단합니다. |
| [ToString](./tostring/)() const override | 박싱된 값의 문자열 표현을 반환합니다. |
| [unbox](./unbox/)() const | 박싱된 값을 언박싱합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
