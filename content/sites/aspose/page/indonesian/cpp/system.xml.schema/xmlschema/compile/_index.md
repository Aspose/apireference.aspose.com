---
title: "System::Xml::Schema::XmlSchema::Compile metode"
linktitle: "Kompilasi"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchema::Compile metode. Mengompilasi XML SchemaObject Model (SOM) menjadi informasi skema untuk validasi. Digunakan untuk memeriksa struktur sintaksis dan semantik dari SOM yang dibangun secara programatik. Pemeriksaan validasi semantik dilakukan selama kompilasi dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Mengompilasi XML [Schema](../../)[Object](../../../system/object/) Model (SOM) menjadi informasi skema untuk validasi. Digunakan untuk memeriksa struktur sintaksis dan semantik dari SOM yang dibangun secara programatik. Pemeriksaan validasi semantik dilakukan selama kompilasi.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Penangkap peristiwa validasi yang menerima informasi tentang kesalahan validasi XML [Schema](../../). |

## Lihat Juga

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Mengompilasi XML [Schema](../../)[Object](../../../system/object/) Model (SOM) menjadi informasi skema untuk validasi. Digunakan untuk memeriksa struktur sintaksis dan semantik dari SOM yang dibangun secara programatik. Pemeriksaan validasi semantik dilakukan selama kompilasi.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Penangkap peristiwa validasi yang menerima informasi tentang kesalahan validasi XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | Pengurai [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan namespace yang direferensikan dalam elemen **include** dan **import**. |

## Lihat Juga

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
