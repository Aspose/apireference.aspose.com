---
title: "System::Collections::Generic::IList 클래스"
linktitle: "IList"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IList 클래스. 요소들의 인덱스형 컨테이너 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달할 때 사용하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.collections.generic/ilist/
---
## IList class


요소들의 인덱스형 컨테이너 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달할 때 사용하십시오.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | 컬렉션이 고정 크기인지 확인합니다. |
| virtual [idx_get](./idx_get/)(int) const | 지정된 인덱스의 요소를 가져옵니다. |
| virtual [idx_set](./idx_set/)(int, T) | 지정된 인덱스에 요소를 설정합니다. |
| virtual [IndexOf](./indexof/)(const T\&) const | 컨테이너에서 항목이 처음 나타나는 인덱스를 가져옵니다. |
| virtual [Insert](./insert/)(int, const T\&) | 지정된 위치에 요소를 삽입하고, 다른 요소들을 이동시킵니다. |
| virtual [RemoveAt](./removeat/)(int) | 지정된 인덱스의 요소를 제거합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 정보. |
| [ThisType](./thistype/) | 이 유형. |
| [ValueType](./valuetype/) | 값 형식. |

## 또 보기

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
