---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst μέθοδος"
linktitle: "MoveToFirst"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst μέθοδος. Μετακινεί το XPathNavigator στον πρώτο αδελφό κόμβο του τρέχοντος κόμβου σε C++."
type: docs
weight: 5300
url: /el/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Μετακινεί το [XPathNavigator](../) στον πρώτο αδελφό κόμβο του τρέχοντος κόμβου.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## Δείτε επίσης

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
