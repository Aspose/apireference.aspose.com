---
title: "System::Xml::XmlElement::GetElementsByTagName method"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlElement::GetElementsByTagName method. Mengembalikan XmlNodeList yang berisi daftar semua elemen turunan yang cocok dengan nilai XmlElement::get_LocalName dan XmlElement::get_NamespaceURI yang ditentukan dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Mengembalikan [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan nilai [XmlElement::get_LocalName](../get_localname/) dan [XmlElement::get_NamespaceURI](../get_namespaceuri/) yang ditentukan.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal yang akan dicocokkan. Asterisk (*) adalah nilai khusus yang cocok dengan semua tag. |
| namespaceURI | String | URI namespace untuk dicocokkan. |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua node yang cocok. Daftar ini kosong jika tidak ada node yang cocok.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Mengembalikan sebuah [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan [XmlElement::get_Name](../get_name/) yang ditentukan.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Tag nama untuk dicocokkan. Ini adalah nama yang memenuhi syarat. Itu dicocokkan dengan nilai **get_Name** dari node yang cocok. Asterisk (*) adalah nilai khusus yang cocok dengan semua tag. |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua node yang cocok. Daftar ini kosong jika tidak ada node yang cocok.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
