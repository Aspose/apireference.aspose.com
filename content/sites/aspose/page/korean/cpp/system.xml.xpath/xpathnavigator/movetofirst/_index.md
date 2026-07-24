---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst 메서드"
linktitle: "MoveToFirst"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst 메서드. 현재 노드의 첫 번째 형제 노드로 XPathNavigator를 이동합니다 (C++)."
type: docs
weight: 5300
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


현재 노드의 첫 번째 형제 노드로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
