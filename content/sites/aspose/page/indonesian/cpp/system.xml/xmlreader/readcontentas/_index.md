---
title: "System::Xml::XmlReader::ReadContentAs metode"
linktitle: "ReadContentAs"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::ReadContentAs method. Membaca konten sebagai objek dari tipe yang ditentukan dalam C++."
type: docs
weight: 3900
url: /id/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Membaca konten sebagai objek dari tipe yang ditentukan.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe nilai yang akan dikembalikan. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Sebuah objek [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan setiap prefiks namespace yang terkait dengan konversi tipe. Misalnya, ini dapat digunakan saat mengonversi objek [XmlQualifiedName](../../xmlqualifiedname/) menjadi **xs:string**. Nilai ini dapat berupa **nullptr**. |

### ReturnValue

Konten teks yang digabungkan atau nilai atribut yang dikonversi ke tipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
