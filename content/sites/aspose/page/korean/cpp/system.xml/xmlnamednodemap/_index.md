---
title: "System::Xml::XmlNamedNodeMap 클래스"
linktitle: "XmlNamedNodeMap"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap 클래스. C++에서 이름이나 인덱스로 접근할 수 있는 노드 컬렉션을 나타냅니다."
type: docs
weight: 2200
url: /ko/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


이름이나 인덱스로 접근할 수 있는 노드 컬렉션을 나타냅니다.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [begin](./begin/)() const | 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [cbegin](./cbegin/)() const | 컬렉션의 첫 번째 요소에 대한 반복자를 가져옵니다. |
| [cend](./cend/)() const | 컬렉션의 마지막 요소 뒤에 있는 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| [end](./end/)() const | 컬렉션의 마지막 요소 뒤에 있는 존재하지 않는 요소에 대한 반복자를 가져옵니다. |
| virtual [get_Count](./get_count/)() | [XmlNamedNodeMap](./)에 포함된 노드 수를 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | [XmlNamedNodeMap](./)의 노드 컬렉션에 대한 반복을 지원합니다. |
| virtual [GetNamedItem](./getnameditem/)(String) | 지정된 이름의 [XmlNode](../xmlnode/)을 검색합니다. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | 일치하는 [XmlNode::get_LocalName](../xmlnode/get_localname/) 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 값을 가진 노드를 검색합니다. |
| virtual [Item](./item/)(int32_t) | [XmlNamedNodeMap](./)에서 지정된 인덱스에 있는 노드를 검색합니다. |
| virtual [RemoveNamedItem](./removenameditem/)(String) | [XmlNamedNodeMap](./)에서 노드를 제거합니다. |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | 일치하는 [XmlNode::get_LocalName](../xmlnode/get_localname/) 및 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 값을 가진 노드를 제거합니다. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | [XmlNode::get_Name](../xmlnode/get_name/) 값을 사용하여 [XmlNode](../xmlnode/)을 추가합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [iterator](./iterator/) | 반복자 타입. |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
