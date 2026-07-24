---
title: "Método System::Xml::XPath::XPathNavigator::MoveToFirst"
linktitle: "MoveToFirst"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XPath::XPathNavigator::MoveToFirst. Mueve el XPathNavigator al primer nodo hermano del nodo actual en C++."
type: docs
weight: 5300
url: /es/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Mueve el [XPathNavigator](../) al primer nodo hermano del nodo actual.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## Ver también

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
