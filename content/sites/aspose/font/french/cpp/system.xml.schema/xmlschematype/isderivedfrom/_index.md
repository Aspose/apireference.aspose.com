---
title: "Méthode System::Xml::Schema::XmlSchemaType::IsDerivedFrom"
linktitle: "EstDérivéDe"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaType::IsDerivedFrom. Retourne une valeur indiquant si le type de schéma dérivé spécifié est dérivé du type de schéma de base spécifié en C++."
type: docs
weight: 1700
url: /fr/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


Renvoie une valeur indiquant si le type de schéma dérivé spécifié est dérivé du type de schéma de base spécifié.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | Le [XmlSchemaType](../) dérivé à tester. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | Le [XmlSchemaType](../) de base contre lequel tester le [XmlSchemaType](../) dérivé. |
| except | XmlSchemaDerivationMethod | Une des valeurs du [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) représentant une méthode de dérivation de type à exclure du test. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
