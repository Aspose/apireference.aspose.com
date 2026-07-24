---
title: "System::Collections::Generic::LinkedListNode 클래스"
linktitle: "LinkedListNode"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::LinkedListNode 클래스. 연결 리스트의 노드입니다. 연결 리스트에 래핑된 std::list 반복자에 대한 래퍼를 구현합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 3200
url: /ko/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


연결 리스트의 노드입니다. 연결 리스트에 래핑된 std::list 반복자에 대한 래퍼를 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인자로 전달하십시오.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 저장된 값 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_List](./get_list/)() const | 포함된 리스트를 가져옵니다. |
| [get_Next](./get_next/)() const | 다음 노드를 가져옵니다. |
| [get_Previous](./get_previous/)() const | 이전 노드를 가져옵니다. |
| [get_Value](./get_value/)() const | 저장된 값을 가져옵니다. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | 생성자. |
| [set_Value](./set_value/)(const T\&) | 저장된 값을 설정합니다. |

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
