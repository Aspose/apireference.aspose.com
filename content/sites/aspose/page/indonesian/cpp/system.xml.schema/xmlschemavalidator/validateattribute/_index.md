---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute metode"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute metode. Memvalidasi nama atribut, URI namespace, dan nilai dalam konteks elemen saat ini dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Memvalidasi nama atribut, URI ruang nama, dan nilai dalam konteks elemen saat ini.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | const String\& | Nama lokal atribut yang akan divalidasi. |
| namespaceUri | const String\& | URI ruang nama atribut yang akan divalidasi. |
| attributeValue | const String\& | Nilai atribut yang akan divalidasi. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur pada validasi atribut yang berhasil. Parameter ini dapat berupa **nullptr**. |

### ReturnValue

Nilai atribut yang divalidasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Memvalidasi nama atribut, URI ruang nama, dan nilai dalam konteks elemen saat ini.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | const String\& | Nama lokal atribut yang akan divalidasi. |
| namespaceUri | const String\& | URI ruang nama atribut yang akan divalidasi. |
| attributeValue | XmlValueGetter | Sebuah callback [XmlValueGetter](../../xmlvaluegetter/) yang digunakan untuk meneruskan nilai atribut sebagai tipe yang kompatibel dengan tipe Bahasa Definisi [Schema](../../) XML (XSD) atribut. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur pada validasi atribut yang berhasil. Parameter ini dapat berupa **nullptr**. |

### ReturnValue

Nilai atribut yang divalidasi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
