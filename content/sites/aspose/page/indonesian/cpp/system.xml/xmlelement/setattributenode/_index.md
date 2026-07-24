---
title: "System::Xml::XmlElement::SetAttributeNode metode"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlElement::SetAttributeNode metode. Menambahkan XmlAttribute yang ditentukan di C++."
type: docs
weight: 2700
url: /id/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Menambahkan [XmlAttribute](../../xmlattribute/) yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Node [XmlAttribute](../../xmlattribute/) yang akan ditambahkan ke koleksi atribut untuk elemen ini. |

### ReturnValue

Jika atribut menggantikan atribut yang ada dengan nama yang sama, [XmlAttribute](../../xmlattribute/) lama dikembalikan; jika tidak, **nullptr** dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Menambahkan [XmlAttribute](../../xmlattribute/) yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal atribut. |
| namespaceURI | String | Namespace URI atribut. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) yang akan ditambahkan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
