---
title: "Méthode System::Xml::XPath::XPathNavigator::MoveToFirst"
linktitle: "MoveToFirst"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathNavigator::MoveToFirst. Déplace le XPathNavigator vers le premier nœud frère du nœud actuel en C++."
type: docs
weight: 5300
url: /fr/cpp/system.xml.xpath/xpathnavigator/movetofirst/
---
## XPathNavigator::MoveToFirst method


Déplace le [XPathNavigator](../) vers le premier nœud frère du nœud actuel.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFirst()
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the first sibling node of the current node; **false** if there is no first sibling, or if the [XPathNavigator](../) is currently positioned on an attribute node. If the [XPathNavigator](../) is already positioned on the first sibling, [XPathNavigator](../) will return **true** and will not move its position. If [XPathNavigator::MoveToFirst](./) returns **false** because there is no first sibling, or if [XPathNavigator](../) is currently positioned on an attribute, the position of the [XPathNavigator](../) is unchanged.

## Voir aussi

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
