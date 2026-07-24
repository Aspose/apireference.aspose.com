---
title: "System::Xml::XmlElement::RemoveAttributeNode method"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlElement::RemoveAttributeNode method. Menghapus XmlAttribute yang ditentukan dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Menghapus [XmlAttribute](../../xmlattribute/) yang ditentukan.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Node [XmlAttribute](../../xmlattribute/) yang akan dihapus. Jika atribut yang dihapus memiliki nilai default, nilai tersebut akan langsung diganti. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) yang dihapus atau **nullptr** jika **oldAttr** bukan node atribut dari [XmlElement](../).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Menghapus [XmlAttribute](../../xmlattribute/) yang ditentukan oleh nama lokal dan namespace URI. (Jika atribut yang dihapus memiliki nilai default, nilai tersebut akan langsung diganti).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal atribut. |
| namespaceURI | String | Namespace URI atribut. |

### ReturnValue

[XmlAttribute](../../xmlattribute/) yang dihapus atau **nullptr** jika [XmlElement](../) tidak memiliki node atribut yang cocok.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
