---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent metodo"
linktitle: "get_NewParent"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent metodo. Restituisce il valore di XmlNode::get_ParentNode dopo il completamento dell'operazione in C++."
type: docs
weight: 300
url: /it/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Restituisce il valore di [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) dopo il completamento dell'operazione.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

Il valore del **ParentNode** dopo il completamento dell'operazione. Questo metodo restituisce **nullptr** se il nodo viene rimosso. Per i nodi attributo, questo metodo restituisce il valore di [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
