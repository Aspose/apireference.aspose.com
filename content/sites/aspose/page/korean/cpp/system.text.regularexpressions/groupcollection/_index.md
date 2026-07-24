---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::GroupCollection 클래스. 단일 매치에서 캡처 그룹의 목록입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


단일 매치에서 캡처 그룹의 목록입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | 컬렉션에 요소 추가를 비활성화합니다. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | 그룹을 컬렉션에 추가합니다. |
| [Clear](./clear/)() override | 컬렉션에서 요소 삭제를 비활성화합니다. |
| [get_Item](./get_item/)(int) const | [Group](../group/) 접근자. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) 접근자. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | 생성자. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) 접근자. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) 접근자. |
| [IsReadOnly](./isreadonly/)() const | 컬렉션을 읽기 전용으로 표시합니다. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) 접근자. |
| [operator[]](./operator[]/)(int) | [Group](../group/) 접근자. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) 접근자. |
| [Remove](./remove/)(const GroupPtr\&) override | 컬렉션에서 요소 제거를 비활성화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 클래스. |
## 또 보기

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
