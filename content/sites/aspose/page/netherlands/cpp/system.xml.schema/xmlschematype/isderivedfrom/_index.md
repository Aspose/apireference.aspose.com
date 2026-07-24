---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom method"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom method. Retourneert een waarde die aangeeft of het opgegeven afgeleide schematype is afgeleid van het opgegeven basistype in C++."
type: docs
weight: 1700
url: /nl/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Retourneert een waarde die aangeeft of het opgegeven afgeleide schematype is afgeleid van het opgegeven basistype.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Het afgeleide [XmlSchemaType](../) om te testen. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Het basistype [XmlSchemaType](../) om het afgeleide [XmlSchemaType](../) tegen te testen. |
| except | XmlSchemaDerivationMethod | Een van de [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) waarden die een type-afleidingsmethode vertegenwoordigen die moet worden uitgesloten van testen. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
