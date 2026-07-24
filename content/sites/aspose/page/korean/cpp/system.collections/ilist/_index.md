---
title: "System::Collections::IList 클래스"
linktitle: "IList"
second_title: "C++용 Aspose.Page"
description: "System::Collections::IList 클래스. IList는 인덱스로 개별 접근이 가능한 비제네릭 객체 컬렉션을 나타냅니다 (C++)."
type: docs
weight: 1000
url: /ko/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | 목록 끝에 항목을 추가합니다. |
| virtual [Clear](./clear/)() | 목록의 모든 항목을 제거합니다. |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | 목록에 항목이 있는지 확인합니다. |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | 목록이 고정 크기인지 여부를 나타내는 값을 가져옵니다. |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI 정보. |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | 지정된 항목의 첫 번째 인덱스를 가져옵니다. |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | 지정된 인덱스에 항목을 목록에 삽입합니다. |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | 목록에서 지정된 항목의 첫 번째 인스턴스를 제거합니다. |
| virtual [RemoveAt](./removeat/)(int) | 지정된 인덱스에서 목록의 항목을 제거합니다. |
## 또 보기

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
