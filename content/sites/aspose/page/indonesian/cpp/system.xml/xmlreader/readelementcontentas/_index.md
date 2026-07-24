---
title: "System::Xml::XmlReader::ReadElementContentAs method"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::ReadElementContentAs method. Membaca konten elemen sebagai tipe yang diminta dalam C++."
type: docs
weight: 5200
url: /id/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Membaca konten elemen sebagai tipe yang diminta.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe nilai yang akan dikembalikan. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Sebuah objek [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan setiap awalan namespace yang terkait dengan konversi tipe. |

### ReturnValue

Konten elemen yang dikonversi menjadi objek bertipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Memeriksa bahwa nama lokal dan URI namespace yang ditentukan cocok dengan elemen saat ini, kemudian membaca konten elemen sebagai tipe yang diminta.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe nilai yang akan dikembalikan. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Sebuah objek [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan setiap awalan namespace yang terkait dengan konversi tipe. |
| localName | String | Nama lokal elemen. |
| namespaceURI | String | URI namespace elemen. |

### ReturnValue

Konten elemen yang dikonversi menjadi objek bertipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
