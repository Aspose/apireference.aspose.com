---
title: "System::Collections::Generic::_KeyList 클래스"
linktitle: "_KeyList"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::_KeyList 클래스. 사전의 키 목록을 구현합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.collections.generic/_keylist/
---
## _KeyList class


사전의 키 목록을 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| 매개변수 | 설명 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 유형. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | 지정된 사전을 참조하는 컬렉션을 초기화합니다. |
| [Contains](./contains/)(const TKey\&) const override | 지정된 키가 컬렉션에 존재하는지 확인합니다. |
| [idx_get](./idx_get/)(int) const override | 지정된 위치의 키를 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [TKey](./tkey/) | 키 유형. |

## 또 보기

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
