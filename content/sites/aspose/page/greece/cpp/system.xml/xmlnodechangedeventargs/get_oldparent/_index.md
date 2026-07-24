---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent μέθοδος"
linktitle: "get_OldParent"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent μέθοδος. Επιστρέφει την τιμή του XmlNode::get_ParentNode πριν ξεκινήσει η λειτουργία σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Επιστρέφει την τιμή του [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) πριν ξεκινήσει η λειτουργία.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

Η τιμή του **ParentNode** πριν ξεκινήσει η λειτουργία. Αυτή η μέθοδος επιστρέφει **nullptr** εάν ο κόμβος δεν είχε γονέα. Για κόμβους χαρακτηριστικού, αυτή η μέθοδος επιστρέφει την τιμή του [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
