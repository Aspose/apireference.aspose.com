---
title: "System::Collections::Generic::SimpleEnumerator 클래스"
linktitle: "SimpleEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SimpleEnumerator 클래스. rbegin() 및 rend() 함수를 사용하여 요소를 직접 보유하는 단순 컨테이너용 반복자 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오."
type: docs
weight: 3900
url: /ko/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


rbegin() 및 rend() 함수를 사용하여 요소를 직접 보유하는 단순 컨테이너용 반복자 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| 매개변수 | 설명 |
| --- | --- |
| 컨테이너 | 반복할 컨테이너 유형. |
| Element | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| [get_Current](./get_current/)() const override | '현재' 요소를 가져옵니다. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | 단순 반복자를 생성합니다. |

## 또 보기

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
