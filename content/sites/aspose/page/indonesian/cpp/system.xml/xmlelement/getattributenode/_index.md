---
title: "System::Xml::XmlElement::GetAttributeNode metode"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlElement::GetAttributeNode metode. Mengembalikan XmlAttribute dengan nama lokal dan URI ruang nama yang ditentukan dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Mengembalikan [XmlAttribute](../../xmlattribute/) dengan nama lokal dan URI ruang nama yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal atribut. |
| namespaceURI | String | Namespace URI atribut. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) yang ditentukan atau **nullptr** jika atribut yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Mengembalikan [XmlAttribute](../../xmlattribute/) dengan nama yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama atribut yang akan diambil. Ini adalah nama yang memenuhi syarat. Nama ini dicocokkan dengan nilai **get_Name** dari node yang cocok. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) yang ditentukan atau **nullptr** jika atribut yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
