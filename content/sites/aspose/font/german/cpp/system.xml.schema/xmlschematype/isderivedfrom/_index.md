---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom-Methode"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom-Methode. Gibt einen Wert zurück, der angibt, ob der angegebene abgeleitete Schematyp vom angegebenen Basisschematyp in C++ abgeleitet ist."
type: docs
weight: 1700
url: /de/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Gibt einen Wert zurück, der angibt, ob der angegebene abgeleitete Schematyp vom angegebenen Basisschematyp abgeleitet ist.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Der abgeleitete [XmlSchemaType](../) zum Testen. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Der Basis-[XmlSchemaType](../) zum Testen des abgeleiteten [XmlSchemaType](../). |
| except | XmlSchemaDerivationMethod | Einer der [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)-Werte, der eine Typableitungsmethode darstellt, die vom Testen ausgeschlossen werden soll. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
