---
title: "System::Text::RegularExpressions::GroupCollectionPtr 클래스"
linktitle: "GroupCollectionPtr"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::GroupCollectionPtr 클래스. 그룹 컬렉션 포인터입니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터입니다. C++에서 스택에 할당하고 값이나 const 레퍼런스로 함수에 전달해야 합니다."
type: docs
weight: 500
url: /ko/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | 널 포인터 생성자. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | 형 변환 생성자. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) 접근자. |
## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
