---
title: "System::Xml::XmlNode::idx_get metode"
linktitle: "idx_get"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNode::idx_get metode. Mengembalikan elemen anak pertama dengan nilai XmlNode::get_LocalName dan XmlNode::get_NamespaceURI yang ditentukan dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Mengembalikan elemen anak pertama dengan nilai [XmlNode::get_LocalName](../get_localname/) dan [XmlNode::get_NamespaceURI](../get_namespaceuri/) yang ditentukan.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localname | String | Nama lokal elemen. |
| ns | String | URI namespace elemen. |

### ReturnValue

Elemen [XmlElement](../../xmlelement/) pertama dengan **localname** dan **ns** yang cocok. Mengembalikan **nullptr** jika tidak ada kecocokan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Mengembalikan elemen anak pertama dengan [XmlNode::get_Name](../get_name/) yang ditentukan.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lengkap elemen yang akan diambil. |

### ReturnValue

Elemen [XmlElement](../../xmlelement/) pertama yang cocok dengan nama yang ditentukan. Mengembalikan **nullptr** jika tidak ada kecocokan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
