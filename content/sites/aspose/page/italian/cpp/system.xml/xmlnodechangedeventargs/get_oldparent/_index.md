---
title: "Metodo System::Xml::XmlNodeChangedEventArgs::get_OldParent"
linktitle: "get_OldParent"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlNodeChangedEventArgs::get_OldParent. Restituisce il valore di XmlNode::get_ParentNode prima che l'operazione inizi in C++."
type: docs
weight: 600
url: /it/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Restituisce il valore di [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) prima che l'operazione inizi.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

Il valore di **ParentNode** prima che l'operazione inizi. Questo metodo restituisce **nullptr** se il nodo non aveva un genitore. Per i nodi attributo, questo metodo restituisce il valore di [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
