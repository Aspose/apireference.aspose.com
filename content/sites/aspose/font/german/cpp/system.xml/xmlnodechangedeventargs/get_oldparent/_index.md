---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent Methode"
linktitle: "get_OldParent"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent Methode. Gibt den Wert von XmlNode::get_ParentNode zurück, bevor die Operation in C++ begann."
type: docs
weight: 600
url: /de/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Gibt den Wert von [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) zurück, bevor die Operation begann.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

Der Wert des **ParentNode** bevor die Operation begann. Diese Methode gibt **nullptr** zurück, wenn der Knoten keinen Elternteil hatte. Für Attributknoten gibt diese Methode den Wert von [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) zurück.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
