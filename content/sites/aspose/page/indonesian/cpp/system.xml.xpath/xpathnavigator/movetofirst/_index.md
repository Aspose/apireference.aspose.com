---
title: "Metode System::Xml::XPath::XPathNavigator::MoveToFirst"
linktitle: "MoveToFirst"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XPath::XPathNavigator::MoveToFirst. Memindahkan XPathNavigator ke node saudara pertama dari node saat ini dalam C++."
type: docs
weight: 5300
url: /id/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Memindahkan [XPathNavigator](../) ke node saudara pertama dari node saat ini.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## Lihat Juga

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
