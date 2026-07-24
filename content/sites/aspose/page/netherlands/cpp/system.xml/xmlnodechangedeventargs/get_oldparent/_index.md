---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent methode"
linktitle: "get_OldParent"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent methode. Retourneert de waarde van de XmlNode::get_ParentNode vóór de bewerking begon in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Retourneert de waarde van de [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) vóór de bewerking begon.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

De waarde van de **ParentNode** vóór de bewerking begon. Deze methode retourneert **nullptr** als het knooppunt geen ouder had. Voor attribuutknooppunten retourneert deze methode de waarde van [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
