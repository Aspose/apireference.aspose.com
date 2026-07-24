---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement metode"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement metode. Memverifikasi apakah konten teks elemen valid sesuai tipe datanya untuk elemen dengan konten sederhana, dan memverifikasi apakah konten elemen saat ini lengkap untuk elemen dengan konten kompleks dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Memverifikasi apakah konten teks elemen valid sesuai tipe datanya untuk elemen dengan konten sederhana, dan memverifikasi apakah konten elemen saat ini lengkap untuk elemen dengan konten kompleks.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur setelah validasi elemen berhasil. Parameter ini dapat berupa **nullptr**. |

### ReturnValue

Nilai teks yang diparsir dan bertipe dari elemen jika elemen memiliki konten sederhana.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Memverifikasi apakah konten teks elemen yang ditentukan valid sesuai tipe datanya.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur setelah validasi konten teks elemen berhasil. Parameter ini dapat berupa **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | Konten teks yang bertipe dari elemen. |

### ReturnValue

Konten sederhana yang diparsir dan bertipe dari elemen.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
