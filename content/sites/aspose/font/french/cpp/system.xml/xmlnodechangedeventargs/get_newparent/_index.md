---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent méthode"
linktitle: "get_NewParent"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent méthode. Retourne la valeur de XmlNode::get_ParentNode après que l'opération soit terminée en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Retourne la valeur de [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) après que l'opération soit terminée.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

La valeur du **ParentNode** après que l'opération soit terminée. Cette méthode retourne **nullptr** si le nœud est en cours de suppression. Pour les nœuds d'attribut, cette méthode retourne la valeur de [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
