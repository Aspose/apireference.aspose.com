---
title: "System::Collections::Generic::_KeyCollection 클래스"
linktitle: "_KeyCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::_KeyCollection 클래스. Dictionary의 키 컬렉션입니다. 컬렉션을 참조하며, 아무것도 복사하지 않습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/)의 키 컬렉션입니다. 컬렉션을 참조하며, 아무것도 복사하지 않습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | 지정된 사전을 참조하는 컬렉션을 초기화합니다. |
| [Contains](./contains/)(const TKey\&) const override | 컨테이너에 항목이 존재하는지 확인합니다. |
| [GetEnumerator](./getenumerator/)() override | 키를 순회하는 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) 메서드를 구현합니다. 지원되지 않습니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [TKey](./tkey/) | 키 유형. |

## 또 보기

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
