---
title: "System::Xml::XmlDocument::Validate method"
linktitle: "Validasi"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::Validate method. Memvalidasi XmlDocument terhadap skema XML Schema Definition Language (XSD) yang terdapat dalam daftar XmlDocument::get_Schemas di C++."
type: docs
weight: 4300
url: /id/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Memvalidasi [XmlDocument](../) terhadap skema XML [Schema](../../../system.xml.schema/) Definition Language (XSD) yang terdapat dalam daftar [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Objek [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) yang menerima informasi tentang peringatan dan kesalahan validasi skema. |

## Lihat Juga

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Memvalidasi objek [XmlNode](../../xmlnode/) yang ditentukan terhadap skema XML [Schema](../../../system.xml.schema/) Definition Language (XSD) dalam daftar [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Objek [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) yang menerima informasi tentang peringatan dan kesalahan validasi skema. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Objek [XmlNode](../../xmlnode/) yang dibuat dari sebuah [XmlDocument](../) untuk divalidasi. |

## Lihat Juga

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
