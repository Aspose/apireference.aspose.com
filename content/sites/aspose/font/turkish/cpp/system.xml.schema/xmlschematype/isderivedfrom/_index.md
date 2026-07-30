---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metodu"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metodu. Belirtilen türetilmiş şema tipinin, C++'ta belirtilen temel şema tipinden türetilip türetilmediğini gösteren bir değer döndürür."
type: docs
weight: 1700
url: /tr/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Belirtilen türetilmiş şema tipinin belirtilen temel şema tipinden türetilip türetilmediğini gösteren bir değer döndürür.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Test edilecek türetilmiş [XmlSchemaType](../). |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Türetilmiş [XmlSchemaType](../) ile karşılaştırılacak temel [XmlSchemaType](../). |
| except | XmlSchemaDerivationMethod | Testten hariç tutulacak bir tip türetme yöntemini temsil eden [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) değerlerinden biri. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
