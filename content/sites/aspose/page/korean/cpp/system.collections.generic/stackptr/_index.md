---
title: "System::Collections::Generic::StackPtr 클래스"
linktitle: "StackPtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::StackPtr 클래스. 스택 포인터. 이 타입은 다른 객체의 삭제를 관리하는 포인터입니다. 스택에 할당되어야 하며 C++에서 값으로 또는 const 레퍼런스로 함수에 전달되어야 합니다."
type: docs
weight: 4700
url: /ko/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [StackPtr](./stackptr/)() | null 포인터를 생성합니다. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | 특정 스택을 참조하는 포인터를 생성합니다. |

## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
