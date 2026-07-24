---
title: "Metode System::Xml::XmlNodeChangedEventArgs::get_NewParent"
linktitle: "get_NewParent"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNodeChangedEventArgs::get_NewParent. Mengembalikan nilai dari XmlNode::get_ParentNode setelah operasi selesai dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


Mengembalikan nilai dari [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) setelah operasi selesai.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

Nilai **ParentNode** setelah operasi selesai. Metode ini mengembalikan **nullptr** jika node sedang dihapus. Untuk node atribut, metode ini mengembalikan nilai [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
