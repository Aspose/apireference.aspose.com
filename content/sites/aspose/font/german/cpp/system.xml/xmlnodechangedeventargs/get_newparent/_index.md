---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent Methode"
linktitle: "get_NewParent"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent Methode. Gibt den Wert von XmlNode::get_ParentNode zurück, nachdem die Operation in C++ abgeschlossen ist."
type: docs
weight: 300
url: /de/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Gibt den Wert von [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) zurück, nachdem die Operation abgeschlossen ist.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

Der Wert des **ParentNode** nach Abschluss der Operation. Diese Methode gibt **nullptr** zurück, wenn der Knoten entfernt wird. Für Attributknoten gibt diese Methode den Wert von [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) zurück.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
