---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst метод"
linktitle: "MoveToFirst"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst метод. Перемещает XPathNavigator к первому соседнему узлу текущего узла в C++."
type: docs
weight: 5300
url: /ru/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Перемещает [XPathNavigator](../) к первому соседнему узлу текущего узла.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## См. также

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
