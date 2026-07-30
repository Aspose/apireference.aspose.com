---
title: "System::Xml::XPath::XPathNodeIterator::get_Current metodo"
linktitle: "get_Current"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNodeIterator::get_Current metodo. Quando sovrascritto in una classe derivata, ottiene l'oggetto XPathNavigator per questo XPathNodeIterator, posizionato sul nodo di contesto corrente in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


Quando sovrascritto in una classe derivata, ottiene l'oggetto [XPathNavigator](../../xpathnavigator/) per questo [XPathNodeIterator](../), posizionato sul nodo di contesto corrente.

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

Un oggetto [XPathNavigator](../../xpathnavigator/) posizionato sul nodo di contesto da cui è stato selezionato il set di nodi. Il metodo [XPathNodeIterator::MoveNext](../movenext/) deve essere chiamato per spostare il [XPathNodeIterator](../) al primo nodo del set selezionato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
