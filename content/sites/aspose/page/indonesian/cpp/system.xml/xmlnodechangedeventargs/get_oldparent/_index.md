---
title: "Metode System::Xml::XmlNodeChangedEventArgs::get_OldParent"
linktitle: "get_OldParent"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNodeChangedEventArgs::get_OldParent. Mengembalikan nilai dari XmlNode::get_ParentNode sebelum operasi dimulai dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


Mengembalikan nilai dari [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) sebelum operasi dimulai.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

Nilai **ParentNode** sebelum operasi dimulai. Metode ini mengembalikan **nullptr** jika node tidak memiliki induk. Untuk node atribut, metode ini mengembalikan nilai [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
