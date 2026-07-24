---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType metode"
linktitle: "ChangeType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType metode. Mengonversi nilai yang ditentukan, yang tipenya merupakan salah satu representasi valid dari tipe skema XML yang diwakili oleh XmlSchemaDatatype, ke tipe waktu jalan yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Mengonversi nilai yang ditentukan, yang tipenya merupakan salah satu representasi valid dari tipe skema XML yang diwakili oleh [XmlSchemaDatatype](../), ke tipe waktu jalan yang ditentukan.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | SharedPtr\<Object\> | Nilai input untuk dikonversi ke tipe yang ditentukan. |
| targetType | const TypeInfo\& | Tipe target untuk mengonversi nilai input ke. |

### ReturnValue

Nilai input yang telah dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Mengonversi nilai yang ditentukan, yang tipenya merupakan salah satu representasi valid dari tipe skema XML yang diwakili oleh [XmlSchemaDatatype](../), ke tipe waktu jalan yang ditentukan menggunakan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) jika [XmlSchemaDatatype](../) mewakili tipe **xs:QName** atau tipe yang diturunkan darinya.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | SharedPtr\<Object\> | Nilai input untuk dikonversi ke tipe yang ditentukan. |
| targetType | const TypeInfo\& | Tipe target untuk mengonversi nilai input ke. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Sebuah [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan prefiks namespace. Ini hanya berguna jika [XmlSchemaDatatype](../) mewakili tipe **xs:QName** atau tipe yang diturunkan darinya. |

### ReturnValue

Nilai input yang telah dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
