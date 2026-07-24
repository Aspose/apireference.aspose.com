---
title: "System::Collections::CollectionBase 클래스"
linktitle: "CollectionBase"
second_title: "C++용 Aspose.Page"
description: "System::Collections::CollectionBase 클래스. C++에서 강력히 형식이 지정된 컬렉션을 위한 추상 기본 클래스를 제공합니다."
type: docs
weight: 300
url: /ko/cpp/system.collections/collectionbase/
---
## CollectionBase class


강력히 타입이 지정된 컬렉션을 위한 추상 기본 클래스를 제공합니다.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 컬렉션 요소의 유형 |
## Nested classes

* Class [ListImpl](./listimpl/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clear](./clear/)() | 컬렉션 인스턴스에서 모든 객체를 제거합니다. 이 메서드는 재정의할 수 없습니다. |
| [get_Capacity](./get_capacity/)() | 컬렉션이 포함할 수 있는 요소 수를 반환합니다. |
| [get_Count](./get_count/)() | 컬렉션 인스턴스에 포함된 요소 수를 반환합니다. 이 메서드는 재정의할 수 없습니다. |
| [GetEnumerator](./getenumerator/)() override | 컬렉션 인스턴스를 순회하는 열거자를 반환합니다. |
| [RemoveAt](./removeat/)(int32_t) | 컬렉션 인스턴스의 지정된 인덱스에 있는 요소를 제거합니다. 이 메서드는 재정의할 수 없습니다. |
| [set_Capacity](./set_capacity/)(int32_t) | 컬렉션이 포함할 수 있는 요소 수를 설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |

## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
