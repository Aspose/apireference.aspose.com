---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent μέθοδος"
linktitle: "get_NewParent"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent μέθοδος. Επιστρέφει την τιμή του XmlNode::get_ParentNode μετά την ολοκλήρωση της λειτουργίας σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Επιστρέφει την τιμή του [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) μετά την ολοκλήρωση της λειτουργίας.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

Η τιμή του **ParentNode** μετά την ολοκλήρωση της λειτουργίας. Αυτή η μέθοδος επιστρέφει **nullptr** εάν ο κόμβος αφαιρείται. Για κόμβους χαρακτηριστικών, αυτή η μέθοδος επιστρέφει την τιμή του [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
