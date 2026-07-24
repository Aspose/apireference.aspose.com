---
title: "System::Xml::Schema::XmlSchemaSet::Schemas metode"
linktitle: "Skema"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::Schema::XmlSchemaSet::Schemas. Mengembalikan koleksi semua skema definisi bahasa XML Schema (XSD) dalam XmlSchemaSet di C++."
type: docs
weight: 1600
url: /id/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Mengembalikan koleksi semua skema definisi bahasa XML [Schema](../../) (XSD) dalam [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Objek IList yang berisi semua skema yang telah ditambahkan ke [XmlSchemaSet](../). Jika tidak ada skema yang ditambahkan ke [XmlSchemaSet](../), koleksi kosong dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Mengembalikan koleksi semua skema definisi bahasa XML [Schema](../../) (XSD) dalam [XmlSchemaSet](../) yang termasuk dalam namespace yang diberikan.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| targetNamespace | String | Properti skema **targetNamespace**. |

### ReturnValue

Objek IList yang berisi semua skema yang telah ditambahkan ke [XmlSchemaSet](../) yang termasuk dalam namespace yang diberikan. Jika tidak ada skema yang ditambahkan ke [XmlSchemaSet](../), koleksi kosong dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
