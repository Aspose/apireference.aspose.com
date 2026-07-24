---
title: "System::Collections::Generic::ISet 클래스"
linktitle: "ISet"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::ISet 클래스. 고유한 요소 집합을 포함하는 컬렉션의 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2700
url: /ko/cpp/system.collections.generic/iset/
---
## ISet class


고유한 요소 집합을 포함하는 컬렉션의 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | 요소 그룹을 제거합니다. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | 다른 컨테이너에 존재하지 않는 요소를 제거합니다. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | 현재 집합이 다른 컨테이너의 엄격한 부분집합인지 확인합니다. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | 현재 집합이 다른 컨테이너의 엄격한 초집합인지 확인합니다. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | 현재 집합이 다른 컨테이너의 부분집합인지 확인합니다. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | 현재 집합이 다른 컨테이너의 초집합인지 확인합니다. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | 집합이 다른 컨테이너와 겹치는지 확인합니다. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | 집합과 컨테이너가 동일한 요소를 포함하는지 확인합니다. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | 두 컨테이너의 대칭 차집합을 계산합니다. 두 컨테이너 모두에 존재하는 모든 요소를 제거하면서, 동시에 **other**에 존재하지만 현재 집합에 없는 모든 요소를 추가합니다. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | 지정된 컬렉션에서 현재 집합에 아직 존재하지 않는 요소를 추가합니다. |
| virtual [~ISet](./~iset/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI 정보. |

## 또 보기

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
