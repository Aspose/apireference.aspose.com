---
title: "Méthode System::Xml::XPath::XPathNodeIterator::get_Current"
linktitle: "get_Current"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathNodeIterator::get_Current. Lorsqu'elle est remplacée dans une classe dérivée, obtient l'objet XPathNavigator pour cet XPathNodeIterator, positionné sur le nœud de contexte actuel en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


Lorsqu'elle est remplacée dans une classe dérivée, obtient l'objet [XPathNavigator](../../xpathnavigator/) pour ce [XPathNodeIterator](../), positionné sur le nœud de contexte actuel.

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

Un objet [XPathNavigator](../../xpathnavigator/) positionné sur le nœud de contexte à partir duquel l'ensemble de nœuds a été sélectionné. La méthode [XPathNodeIterator::MoveNext](../movenext/) doit être appelée pour déplacer le [XPathNodeIterator](../) vers le premier nœud de l'ensemble sélectionné.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
