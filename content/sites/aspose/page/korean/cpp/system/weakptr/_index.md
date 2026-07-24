---
title: "System::WeakPtr 클래스"
linktitle: "WeakPtr"
second_title: "C++용 Aspose.Page"
description: "System::WeakPtr 클래스. System::SmartPtr의 서브클래스로, 생성 시 자신을 약한 모드로 설정합니다. 이 클래스는 set_Mode()가 여전히 접근 가능하기 때문에 인스턴스가 항상 약한 모드에 머무른다는 보장을 하지 않습니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 함수에 값 또는 const 레퍼런스로 전달해야 합니다 C++에서."
type: docs
weight: 7500
url: /ko/cpp/system/weakptr/
---
## WeakPtr class


생성 시 자신을 약한 모드로 설정하는 [System::SmartPtr](../smartptr/)의 서브클래스입니다. 이 클래스는 [set_Mode()](../smartptr/set_mode/)에 여전히 접근할 수 있기 때문에 인스턴스가 항상 약한 모드에 머무른다는 보장을 하지 않습니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 함수에 값 또는 const 레퍼런스로 전달해야 합니다.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 가리키는 객체 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [expired](./expired/)() const | 참조된 객체가 이미 삭제되었는지 확인합니다. |
| [get_weak](./get_weak/)() const | 참조된 객체를 가져옵니다. 포인터가 약한 모드에 있음을 단언합니다. |
| [operator=](./operator=/)(Q\&&) | 약한 포인터에 값을 할당합니다. [SmartPtr_](./smartptr_/)의 특정 할당 연산자를 호출합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 약한 포인터가 null인지 확인합니다. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | null 포인터를 생성합니다. |
| [WeakPtr](./weakptr/)(Pointee_ *) | 주어진 객체에 대한 약한 포인터를 생성합니다. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | ptr이 가리키는 동일한 포인터를 참조하는 약한 포인터를 생성합니다. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | x가 가리키는 동일한 포인터를 참조하는 약한 포인터를 생성합니다. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | 약한 포인터를 복사 생성합니다. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | 약한 포인터를 복사 생성합니다. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | 약한 포인터를 이동 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Pointee_](./pointee_/) | 가리키는 타입. |
| [SmartPtr_](./smartptr_/) | 해당 [SmartPtr](../smartptr/) 클래스에 대한 별칭입니다. |
| [WeakPtr_](./weakptr_/) | 자기 타입에 대한 별칭입니다. |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
