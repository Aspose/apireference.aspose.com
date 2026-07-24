---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metode"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metode. Mengembalikan nilai yang menunjukkan apakah tipe skema turunan yang ditentukan diturunkan dari tipe skema dasar yang ditentukan dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Mengembalikan nilai yang menunjukkan apakah tipe skema turunan yang ditentukan diturunkan dari tipe skema dasar yang ditentukan.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Tipe [XmlSchemaType](../) turunan yang akan diuji. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Tipe [XmlSchemaType](../) dasar untuk menguji tipe [XmlSchemaType](../) turunan terhadapnya. |
| except | XmlSchemaDerivationMethod | Salah satu nilai [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) yang mewakili metode derivasi tipe yang akan dikecualikan dari pengujian. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
