---
title: "System::Collections::Generic::QueuePtr 클래스"
linktitle: "QueuePtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::QueuePtr 클래스. 큐 포인터입니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 C++에서 값이나 const 레퍼런스로 함수에 전달해야 합니다."
type: docs
weight: 3700
url: /ko/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [QueuePtr](./queueptr/)() | null 포인터를 생성합니다. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | 특정 큐에 대한 포인터를 생성합니다. |

## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
