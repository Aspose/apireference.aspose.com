---
title: "System::Xml::XPath::XPathNodeIterator::get_Current 메서드"
linktitle: "get_Current"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNodeIterator::get_Current 메서드. 파생 클래스에서 재정의될 경우, 현재 컨텍스트 노드에 위치한 이 XPathNodeIterator에 대한 XPathNavigator 객체를 가져옵니다 (C++)."
type: docs
weight: 400
url: /ko/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


파생 클래스에서 재정의될 경우, 현재 컨텍스트 노드에 위치한 이 [XPathNodeIterator](../)에 대한 [XPathNavigator](../../xpathnavigator/) 객체를 가져옵니다.

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

노드 집합이 선택된 컨텍스트 노드에 위치한 [XPathNavigator](../../xpathnavigator/) 객체입니다. 선택된 집합의 첫 번째 노드로 이동하려면 [XPathNodeIterator::MoveNext](../movenext/) 메서드를 호출해야 합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
