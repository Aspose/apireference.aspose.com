---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent methode"
linktitle: "get_NewParent"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent methode. Retourneert de waarde van XmlNode::get_ParentNode nadat de bewerking is voltooid in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Retourneert de waarde van de [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) nadat de bewerking is voltooid.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

De waarde van de **ParentNode** nadat de bewerking is voltooid. Deze methode retourneert **nullptr** als het knooppunt wordt verwijderd. Voor attribuutknooppunten retourneert deze methode de waarde van [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
