---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent metodo"
linktitle: "get_OldParent"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent metodo. Restituisce il valore di XmlNode::get_ParentNode prima dell'inizio dell'operazione in C++."
type: docs
weight: 600
url: /it/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Restituisce il valore di [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) prima dell'inizio dell'operazione.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

Il valore del **ParentNode** prima dell'inizio dell'operazione. Questo metodo restituisce **nullptr** se il nodo non aveva un genitore. Per i nodi attributo, questo metodo restituisce il valore di [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
