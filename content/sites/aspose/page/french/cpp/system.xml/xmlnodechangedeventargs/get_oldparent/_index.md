---
title: "Méthode System::Xml::XmlNodeChangedEventArgs::get_OldParent"
linktitle: "get_OldParent"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNodeChangedEventArgs::get_OldParent. Retourne la valeur de XmlNode::get_ParentNode avant le début de l'opération en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Retourne la valeur de [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) avant le début de l'opération.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

La valeur du **ParentNode** avant le début de l'opération. Cette méthode renvoie **nullptr** si le nœud n'avait pas de parent. Pour les nœuds d'attribut, cette méthode renvoie la valeur de [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
