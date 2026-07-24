---
title: "System::Collections::Specialized::NameValueCollection 클래스"
linktitle: "NameValueCollection"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Specialized::NameValueCollection 클래스. C++에서 키 또는 인덱스로 접근할 수 있는 연관된 String 키와 String 값의 컬렉션입니다."
type: docs
weight: 200
url: /ko/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


키 또는 인덱스로 접근할 수 있는 연관된 [String](../../system/string/) 키와 [String](../../system/string/) 값의 컬렉션.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const String\&) override | [ICollection](../../system.collections/icollection/) 메서드 재정의 - 구현되지 않음. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | 지정된 [NameValueCollection](./)의 항목을 현재 컬렉션에 복사합니다. |
| virtual [Add](./add/)(const String\&, const String\&) | 지정된 이름과 값으로 항목을 추가합니다. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const String\&) const override | 컬렉션에 항목이 존재하는지 확인합니다. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | 컬렉션 요소를 기존 배열 요소에 복사합니다. |
| virtual [Get](./get/)(const String\&) | 지정된 키와 연관된 값을 가져옵니다. |
| virtual [get_AllKeys](./get_allkeys/)() | 모든 키를 가져옵니다. |
| [get_Count](./get_count/)() const override | 키/값 쌍의 수를 가져옵니다. |
| virtual [get_Keys](./get_keys/)() | 모든 키를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 컬렉션을 반복하기 위한 열거자를 가져옵니다. |
| virtual [GetValues](./getvalues/)(const String\&) | 지정된 키와 연관된 값을 가져옵니다. |
| [HasKeys](./haskeys/)() | null이 아닌 키를 포함하고 있는지 여부를 나타내는 값을 [NameValueCollection](./)에서 가져옵니다. |
| [idx_get](./idx_get/)(const String\&) | 지정된 인덱스의 값을 가져옵니다. |
| [idx_set](./idx_set/)(const String\&, const String\&) | 항목의 값을 설정합니다. |
| [NameValueCollection](./namevaluecollection/)() | 비어 있는 [NameValueCollection](./) 클래스의 새 인스턴스를 초기화합니다. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | 지정된 [NameValueCollection](./)의 항목을 새 [NameValueCollection](./)으로 복사합니다. |
| [Remove](./remove/)(const String\&) override | 특정 항목을 제거합니다. |
| virtual [Set](./set/)(const String\&, const String\&) | 항목의 값을 설정합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## 또 보기

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
