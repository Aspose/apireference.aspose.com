---
title: "Méthode System::Xml::XmlNodeChangedEventArgs::get_NewParent"
linktitle: "get_NewParent"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNodeChangedEventArgs::get_NewParent. Retourne la valeur de XmlNode::get_ParentNode après la fin de l'opération en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Retourne la valeur de [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) après la fin de l'opération.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

La valeur du **ParentNode** après la fin de l'opération. Cette méthode renvoie **nullptr** si le nœud est en cours de suppression. Pour les nœuds attribut, cette méthode renvoie la valeur de [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
