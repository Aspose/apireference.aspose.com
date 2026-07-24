---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metode"
linktitle: "ValidateElement"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement method. Memvalidasi elemen dalam konteks saat ini di C++."
type: docs
weight: 1700
url: /id/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Memvalidasi elemen dalam konteks saat ini.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | const String\& | Nama lokal elemen yang akan divalidasi. |
| namespaceUri | const String\& | URI namespace elemen yang akan divalidasi. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur setelah validasi nama elemen berhasil. Parameter ini dapat berupa **nullptr**. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Memvalidasi elemen dalam konteks saat ini dengan nilai atribut **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, dan **xsi:NoNamespaceSchemaLocation** yang ditentukan.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | const String\& | Nama lokal elemen yang akan divalidasi. |
| namespaceUri | const String\& | URI namespace elemen yang akan divalidasi. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Sebuah objek [XmlSchemaInfo](../../xmlschemainfo/) yang propertinya diatur setelah validasi nama elemen berhasil. Parameter ini dapat berupa **nullptr**. |
| xsiType | const String\& | Nilai atribut **xsi:Type** dari elemen. Parameter ini dapat berupa **nullptr**. |
| xsiNil | const String\& | Nilai atribut **xsi:Nil** dari elemen. Parameter ini dapat berupa **nullptr**. |
| xsiSchemaLocation | const String\& | Nilai atribut **xsi:SchemaLocation** dari elemen. Parameter ini dapat berupa **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | Nilai atribut **xsi:NoNamespaceSchemaLocation** dari elemen. Parameter ini dapat berupa **nullptr**. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
