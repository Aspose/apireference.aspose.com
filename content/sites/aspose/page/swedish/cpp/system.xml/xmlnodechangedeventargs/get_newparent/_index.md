---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent‑metod"
linktitle: "get_NewParent"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent‑metod. Returnerar värdet av XmlNode::get_ParentNode efter att operationen slutförts i C++."
type: docs
weight: 300
url: /sv/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Returnerar värdet av [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) efter att operationen slutförts.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

Värdet av **ParentNode** efter att operationen slutförts. Denna metod returnerar **nullptr** om noden tas bort. För attributnoder returnerar denna metod värdet av [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
