---
title: "System::Xml::XPath::XPathNavigator::MoveToFirst मेथड"
linktitle: "MoveToFirst"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::MoveToFirst मेथड. XPathNavigator को वर्तमान नोड के पहले सहोदर नोड पर ले जाता है C++ में।"
type: docs
weight: 5300
url: /hi/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


[XPathNavigator](../) को वर्तमान नोड के पहले सहोदर नोड पर ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## संबंधित देखें

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
