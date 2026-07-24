---
title: "System::Collections::Generic::ICollection 클래스"
linktitle: "ICollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::ICollection 클래스. 요소 컬렉션의 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오."
type: docs
weight: 1900
url: /ko/cpp/system.collections.generic/icollection/
---
## ICollection class


요소 컬렉션의 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Add](./add/)(const T\&) | 컬렉션에 요소를 추가합니다. |
| virtual [Clear](./clear/)() | 컬렉션의 모든 요소를 삭제합니다. |
| virtual [Contains](./contains/)(const T\&) const | 컬렉션에 요소가 존재하는지 확인합니다. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | 모든 컬렉션 요소를 기존 배열 요소에 복사합니다. |
| virtual [get_Count](./get_count/)() const | 컬렉션의 요소 개수를 가져옵니다. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | 컬렉션이 읽기 전용인지 확인합니다. |
| [get_SyncRoot](./get_syncroot/)() const | 컬렉션이 동기화되는 객체를 가져옵니다. |
| [ICollection](./icollection/)() | 기본 생성자. |
| [ICollection](./icollection/)(const ICollection\&) | 복사 생성자. |
| [ICollection](./icollection/)(ICollection\&&) | 이동 생성자. |
| [operator=](./operator=/)(ICollection\&&) | 이동 할당 연산자. |
| [operator=](./operator=/)(const ICollection\&) | 이동 할당 연산자. |
| virtual [Remove](./remove/)(const T\&) | 컬렉션에서 요소를 삭제합니다. |
| virtual [~ICollection](./~icollection/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ThisType](./thistype/) | 컬렉션 유형 이름. |
| [ValueType](./valuetype/) | RTTI 정보. |

## 또 보기

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
