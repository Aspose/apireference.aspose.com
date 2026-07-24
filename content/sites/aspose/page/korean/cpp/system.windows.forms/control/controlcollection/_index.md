---
title: "System::Windows::Forms::Control::ControlCollection 클래스"
linktitle: "ControlCollection"
second_title: "C++용 Aspose.Page"
description: "System::Windows::Forms::Control::ControlCollection 클래스. 컨트롤 컬렉션. C++에서는 구현되지 않음."
type: docs
weight: 200
url: /ko/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


컨트롤 컬렉션. 구현되지 않음.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | 컬렉션에 컨트롤을 추가합니다. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | 여러 컨트롤을 컬렉션에 추가합니다. |
| [Clear](./clear/)() override | 컬렉션에서 모든 컨트롤을 삭제합니다. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | 특정 컨트롤이 컬렉션에 존재하는지 확인합니다. |
| virtual [ContainsKey](./containskey/)(System::String) const | 특정 이름을 가진 컨트롤이 컬렉션에 존재하는지 확인합니다. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | 생성자. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | 컬렉션 내용을 기존 배열 요소에 복사합니다. |
| [Find](./find/)(const System::String\&, bool) const | 컬렉션에서 지정된 이름의 컨트롤을 찾습니다. 필요에 따라 포함된 컨트롤의 컬렉션을 재귀적으로 확인합니다. |
| [get_Count](./get_count/)() const override | 컬렉션에 있는 컨트롤 수를 가져옵니다. |
| [get_Owner](./get_owner/)() const | 컬렉션 소유 컨트롤을 가져옵니다. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | 특정 컨트롤을 찾습니다. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | 특정 컨트롤을 찾습니다. |
| [GetEnumerator](./getenumerator/)() override | 컬렉션을 반복하기 위한 열거자를 가져옵니다. |
| [idx_get](./idx_get/)(int) const override | 인덱스별 접근자. |
| virtual [idx_get](./idx_get/)(System::String) const | 이름별 접근자. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | 인덱스별 접근자. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | 이름별 접근자. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | 컬렉션에서 컨트롤을 찾습니다. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | 컬렉션에서 지정된 이름의 컨트롤을 찾습니다. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | 컬렉션에 컨트롤을 삽입합니다. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | 컬렉션에서 컨트롤을 제거합니다. |
| [RemoveAt](./removeat/)(int) override | 컬렉션에서 컨트롤을 제거합니다. |
| virtual [RemoveByKey](./removebykey/)(System::String) | 컬렉션에서 컨트롤을 제거합니다. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | 컨트롤을 새 위치로 이동합니다. |
## 또 보기

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
