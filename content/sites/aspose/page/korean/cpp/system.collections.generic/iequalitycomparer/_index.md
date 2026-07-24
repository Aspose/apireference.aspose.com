---
title: "System::Collections::Generic::IEqualityComparer 클래스"
linktitle: "IEqualityComparer"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IEqualityComparer 클래스. 두 객체를 동등성으로 비교할 수 있는 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 2400
url: /ko/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


두 객체를 동등성으로 비교할 수 있는 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 비교되는 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI 정보. |
| virtual [GetHashCode](./gethashcode/)(T) const | 객체의 해시 코드를 가져옵니다. |

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
