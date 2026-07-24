---
title: "System::DynamicWeakPtr 클래스"
linktitle: "DynamicWeakPtr"
second_title: "C++용 Aspose.Page"
description: "System::DynamicWeakPtr 클래스. 저장된 객체의 템플릿 인수 포인터 모드를 추적하고 각 할당 후에 업데이트하는 스마트 포인터 클래스입니다. 이 유형은 다른 객체의 삭제를 관리하는 포인터이며, C++에서는 스택에 할당하고 값이나 const 레퍼런스로 함수에 전달해야 합니다."
type: docs
weight: 2200
url: /ko/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


저장된 객체의 템플릿 인수 포인터 모드를 추적하고 각 할당 후에 업데이트하는 스마트 포인터 클래스입니다. 이 유형은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 값 또는 const 참조로 함수에 전달해야 합니다.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| 매개변수 | 설명 |
| --- | --- |
| Pointee | 유형. |
| trunkMode | 스마트 포인터 자체의 모드, shared 또는 weak. |
| weakLeafs | weak 포인터 모드로 설정되어야 하는 저장된 유형의 템플릿 인수 인덱스. |
## Nested classes

* Class [Reference](./reference/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | null 스마트 포인터를 생성합니다. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | 주어진 객체를 가리키는 스마트 포인터를 생성합니다. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | 스마트 포인터를 복사 생성합니다. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | 스마트 포인터를 복사 생성합니다. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | 스마트 포인터를 복사 생성합니다. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | 스마트 포인터를 이동 생성합니다. |
| [operator=](./operator=/)(SmartPtr_\&&) | 스마트 포인터를 이동 할당합니다. |
| [operator=](./operator=/)(const SmartPtr_\&) | 스마트 포인터를 복사 할당합니다. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | 스마트 포인터를 복사 할당합니다. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | 스마트 포인터를 할당합니다. |
| [operator=](./operator=/)(std::nullptr_t) | 스마트 포인터를 null로 설정합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 스마트 포인터가 null인지 확인합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | 자기 유형 별칭. |
| [Pointee_](./pointee_/) | 가리키는 타입. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) 기본 클래스 별칭. |

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
