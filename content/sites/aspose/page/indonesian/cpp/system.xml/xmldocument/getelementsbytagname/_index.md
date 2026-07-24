---
title: "System::Xml::XmlDocument::GetElementsByTagName metode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::GetElementsByTagName metode. Mengembalikan XmlNodeList yang berisi daftar semua elemen turunan yang cocok dengan XmlDocument::get_LocalName dan XmlNode::get_NamespaceURI yang ditentukan di C++."
type: docs
weight: 3200
url: /id/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Mengembalikan [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan [XmlDocument::get_LocalName](../get_localname/) dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) yang ditentukan.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | LocalName yang akan dicocokkan. Nilai khusus **"*"** cocok dengan semua tag. |
| namespaceURI | String | NamespaceURI yang akan dicocokkan. |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua node yang cocok. Jika tidak ada node yang cocok dengan **localName** dan **namespaceURI** yang ditentukan, koleksi yang dikembalikan akan kosong.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Mengembalikan [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan nama yang ditentukan.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama terkuantisasi yang akan dicocokkan. Nama tersebut dicocokkan dengan nilai **get_Name** dari node yang cocok. Nilai khusus **"*"** cocok dengan semua tag. |

### ReturnValue

Sebuah [XmlNodeList](../../xmlnodelist/) yang berisi daftar semua node yang cocok. Jika tidak ada node yang cocok dengan **name**, koleksi yang dikembalikan akan kosong.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
