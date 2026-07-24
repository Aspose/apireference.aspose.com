---
title: "System::BoxedValueBase 클래스"
linktitle: "BoxedValueBase"
second_title: "C++용 Aspose.Page"
description: "System::BoxedValueBase 클래스. 박싱된 값을 나타내는 파생 클래스의 인터페이스를 정의하고 몇몇 기본 메서드를 구현하는 기반 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


박싱된 값을 나타내는 파생 클래스의 인터페이스를 정의하고 몇몇 기본 메서드를 구현하는 기반 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class BoxedValueBase : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | 현재 객체가 나타내는 박싱된 값의 타입을 나타내는 값을 반환합니다. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | 현재 객체가 나타내는 박싱된 값을 64비트 정수값으로 변환합니다. |
| virtual [IsBoxedEnum](./isboxedenum/)() | 현재 객체가 열거형 타입의 박싱된 값을 나타내는지 판단합니다. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다. 매개변수는 열거 상수 이름 문자열을 해석할 때 대소문자를 무시할지 여부를 지정합니다. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | 지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다. |
| [ToString](./tostring/)(const System::String\&) const | 지정된 형식 문자열을 사용하여 박싱된 객체를 문자열로 변환합니다. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) 메서드와 유사합니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
