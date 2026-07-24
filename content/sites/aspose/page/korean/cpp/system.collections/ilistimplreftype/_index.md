---
title: "System::Collections::IListImplRefType 클래스"
linktitle: "IListImplRefType"
second_title: "C++용 Aspose.Page"
description: "System::Collections::IListImplRefType 클래스. System::Collections::IList 인터페이스를 System::Collections::Generic::List 객체에 구현하는 스텁으로, C++에서 참조 형식에 대한 구현입니다."
type: docs
weight: 1100
url: /ko/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


[System::Collections::IList](../ilist/) 인터페이스를 [System::Collections::Generic::List](../../system.collections.generic/list/) 객체에 구현하는 스텁으로, 참조 형식에 대한 구현입니다.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | 리스트 끝에 요소를 추가합니다. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | 형식 참조를 객체 값으로 변환합니다. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | 리스트에 항목이 존재하는지 확인합니다. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) 메서드 구현은 컬렉션의 요소 수를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) 구현은 컬렉션을 순회하는 열거자를 반환합니다. |
| [idx_get](./idx_get/)(int, int) const override | 지정된 인덱스의 요소를 가져옵니다. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | 새 객체 인스턴스를 생성합니다. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | 컨테이너에서 항목이 처음 나타나는 인덱스를 가져옵니다. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | 지정된 위치에 요소를 삽입하고, 다른 요소들을 이동시킵니다. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | 리스트에서 특정 항목의 첫 번째 인스턴스를 제거합니다. |
| [RemoveAt](./removeat/)(int) override | 지정된 위치의 항목을 제거합니다. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | 객체 값을 특정 형식 참조로 변환합니다. |
## 또 보기

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
