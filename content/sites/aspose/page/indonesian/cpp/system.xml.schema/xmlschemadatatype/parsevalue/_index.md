---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue metode"
linktitle: "ParseValue"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue metode. Ketika dioverride dalam kelas turunan, memvalidasi string yang ditentukan terhadap tipe sederhana bawaan atau yang didefinisikan pengguna dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


Ketika dioverride dalam kelas turunan, memvalidasi **string** yang ditentukan terhadap tipe sederhana bawaan atau yang didefinisikan pengguna.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | String | **string** untuk divalidasi terhadap tipe sederhana. |
| nameTable | SharedPtr\<XmlNameTable\> | [XmlNameTable](../../../system.xml/xmlnametable/) yang digunakan untuk atomisasi saat mengurai **string** jika objek [XmlSchemaDatatype](../) ini mewakili tipe **xs:NCName**. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | Objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang digunakan saat mengurai **string** jika objek [XmlSchemaDatatype](../) ini mewakili tipe **xs:QName**. |

### ReturnValue

Sebuah [Object](../../../system/object/) yang dapat di-cast dengan aman ke tipe yang dikembalikan oleh pemanggilan [XmlSchemaDatatype::get_ValueType](../get_valuetype/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
