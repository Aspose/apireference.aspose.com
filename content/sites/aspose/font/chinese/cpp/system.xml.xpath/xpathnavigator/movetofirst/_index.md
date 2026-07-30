---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst 方法"
linktitle: "MoveToFirst"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst 方法。将 XPathNavigator 移动到当前节点的第一个兄弟节点（在 C++ 中）。"
type: docs
weight: 5300
url: /zh/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


将 [XPathNavigator](../) 移动到当前节点的第一个兄弟节点。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## 另见

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
