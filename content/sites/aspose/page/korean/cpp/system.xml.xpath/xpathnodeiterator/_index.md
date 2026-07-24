---
title: "System::Xml::XPath::XPathNodeIterator 클래스"
linktitle: "XPathNodeIterator"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNodeIterator 클래스. C++에서 선택된 노드 집합에 대한 반복자를 제공합니다."
type: docs
weight: 600
url: /ko/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


선택된 노드 집합에 대한 반복자를 제공합니다.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Clone](./clone/)() | 파생 클래스에서 재정의될 때, 이 [XPathNodeIterator](./) 객체의 복제본을 반환합니다. |
| virtual [get_Count](./get_count/)() | 선택된 노드 집합에서 마지막 노드의 인덱스를 반환합니다. |
| virtual [get_Current](./get_current/)() | 파생 클래스에서 재정의될 때, 현재 컨텍스트 노드에 위치한 이 [XPathNodeIterator](./)에 대한 [XPathNavigator](../xpathnavigator/) 객체를 가져옵니다. |
| virtual [get_CurrentPosition](./get_currentposition/)() | 파생 클래스에서 재정의될 때, 선택된 노드 집합에서 현재 위치의 인덱스를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 선택된 노드 집합을 반복하기 위한 IEnumerator 객체를 반환합니다. |
| virtual [MoveNext](./movenext/)() | 파생 클래스에서 재정의될 때, [XPathNodeIterator::get_Current](./get_current/) 메서드가 반환하는 [XPathNavigator](../xpathnavigator/) 객체를 선택된 노드 집합의 다음 노드로 이동시킵니다. |
| [XPathNodeIterator](./xpathnodeiterator/)() | [XPathNodeIterator](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
