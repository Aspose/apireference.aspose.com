---
title: "System::Collections::Generic::DefaultComparer 클래스"
linktitle: "DefaultComparer"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::DefaultComparer 클래스. 기본 비교자 클래스입니다. 값 비교에 operator < 및 operator ==를 사용합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수에 인수로 전달하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


기본 비교자 클래스입니다. 값 비교에 operator < 및 operator ==를 사용합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 비교되는 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI 정보. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 구현된 인터페이스. |
| [ThisType](./thistype/) | 현재 유형. |

## 또 보기

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
