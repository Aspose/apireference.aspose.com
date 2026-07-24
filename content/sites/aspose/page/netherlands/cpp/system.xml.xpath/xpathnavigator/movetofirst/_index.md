---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst-methode"
linktitle: "MoveToFirst"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst methode. Verplaatst de XPathNavigator naar het eerste broeder‑ of zusterknooppunt van het huidige knooppunt in C++."
type: docs
weight: 5300
url: /nl/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Verplaatst de [XPathNavigator](../) naar het eerste broeder‑ of zusterknooppunt van het huidige knooppunt.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## Zie ook

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
