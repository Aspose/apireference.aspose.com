---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metodo"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom metodo. Restituisce un valore che indica se il tipo di schema derivato specificato è derivato dal tipo di schema base specificato in C++."
type: docs
weight: 1700
url: /it/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Restituisce un valore che indica se il tipo di schema derivato specificato è derivato dal tipo di schema base specificato.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Il [XmlSchemaType](../) derivato da testare. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Il [XmlSchemaType](../) base contro cui testare il [XmlSchemaType](../) derivato. |
| except | XmlSchemaDerivationMethod | Uno dei valori [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) che rappresentano un metodo di derivazione del tipo da escludere dal test. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
