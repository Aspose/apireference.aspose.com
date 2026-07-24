---
title: "System::IComparable 클래스"
linktitle: "IComparable"
second_title: "C++용 Aspose.Page"
description: "System::IComparable 클래스. 두 객체를 비교하는 메서드를 정의합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 3300
url: /ko/cpp/system/icomparable/
---
## IComparable class


두 객체를 비교하는 메서드를 정의합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 현재 객체와 비교되는 객체들의 타입 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | 현재 객체를 지정된 객체와 비교합니다. |

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
