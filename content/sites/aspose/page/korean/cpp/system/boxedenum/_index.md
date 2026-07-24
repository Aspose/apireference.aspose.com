---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "C++용 Aspose.Page"
description: "System::BoxedEnum class. 박싱된 열거형 값을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system/boxedenum/
---
## BoxedEnum class


박싱된 열거형 값을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| 매개변수 | 설명 |
| --- | --- |
| E | 열거형 값의 유형 |
| UT | 열거형 **E**의 기본 형식 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | 지정된 열거형 값을 나타내는 인스턴스를 생성합니다. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | 박싱된 열거형 상수의 값을 64비트 정수 값으로 변환합니다. |
| [IsBoxedEnum](./isboxedenum/)() override | 현재 객체가 열거형 타입의 박싱된 값을 나타내는지 여부를 판단합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 나타내는 박싱된 값을 문자열로 변환합니다. |

## 또 보기

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
