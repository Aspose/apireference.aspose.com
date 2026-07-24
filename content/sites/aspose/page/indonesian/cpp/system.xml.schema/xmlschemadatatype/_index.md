---
title: "Kelas System::Xml::Schema::XmlSchemaDatatype"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaDatatype. Kelas XmlSchemaDatatype adalah kelas abstrak untuk memetakan tipe bahasa definisi XML Schema (XSD) ke tipe runtime dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


Kelas [XmlSchemaDatatype](./) adalah kelas abstrak untuk memetakan tipe bahasa definisi XML [Schema](../) (XSD) ke tipe runtime.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Mengonversi nilai yang ditentukan, yang tipenya merupakan salah satu representasi valid dari tipe skema XML yang diwakili oleh [XmlSchemaDatatype](./), ke tipe runtime yang ditentukan. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Mengonversi nilai yang ditentukan, yang tipenya merupakan salah satu representasi valid dari tipe skema XML yang diwakili oleh [XmlSchemaDatatype](./), ke tipe runtime yang ditentukan menggunakan [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) jika [XmlSchemaDatatype](./) mewakili tipe **xs:QName** atau tipe yang diturunkan darinya. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Ketika dioverride dalam kelas turunan, mendapatkan tipe untuk **string** sebagaimana ditentukan dalam spesifikasi XML 1.0 Konsorsium World Wide [Web](../../system.web/) (W3C). |
| virtual [get_TypeCode](./get_typecode/)() | Mengembalikan nilai [XmlTypeCode](../xmltypecode/) untuk tipe sederhana. |
| virtual [get_ValueType](./get_valuetype/)() | Ketika dioverride dalam kelas turunan, mendapatkan tipe dari item. |
| virtual [get_Variety](./get_variety/)() | Mengembalikan nilai [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) untuk tipe sederhana. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Metode ini selalu mengembalikan **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Ketika dioverride dalam kelas turunan, memvalidasi **string** yang ditentukan terhadap tipe sederhana bawaan atau yang didefinisikan pengguna. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
