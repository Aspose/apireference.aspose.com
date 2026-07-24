---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsElement 클래스. C++에서 일반 XPS 요소 기능을 캡슐화하는 클래스입니다."
type: docs
weight: 900
url: /ko/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


일반 [XPS](../../aspose.page.xps/) 요소 기능을 캡슐화하는 클래스입니다.

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [begin](./begin/)() | 컬렉션의 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [begin](./begin/)() const | 컬렉션의 const 한정 인스턴스에서 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 const 한정 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션의 마지막 const 한정 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | 컬렉션의 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| [end](./end/)() const | 컬렉션의 const 한정 인스턴스에서 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| [get_Count](./get_count/)() | 자식 요소의 수를 반환합니다. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | 다음 인터페이스인 [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/)의 구현입니다. |
| [idx_get](./idx_get/)(int32_t) | 인덱스 *i* 로 요소의 자식에 접근을 제공합니다. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 컬렉션의 const 한정 인스턴스에서 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 컬렉션의 첫 번째 요소(있는 경우)를 가리키는 반복자를 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 컬렉션의 const 한정 인스턴스에서 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 컬렉션의 마지막 요소(있는 경우) 바로 뒤를 가리키는 반복자를 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [iterator](./iterator/) | 반복자 타입. |
| [iterator_holder_type](./iterator_holder_type/) | 현재 컬렉션에서 반복자 유형으로 사용되는 반복자 유형을 가진 컬렉션 타입입니다. |
| [virtualized_iterator](./virtualized_iterator/) | 가상화된 타입입니다. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 가상화된 요소 타입입니다. |
## 또 보기

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
