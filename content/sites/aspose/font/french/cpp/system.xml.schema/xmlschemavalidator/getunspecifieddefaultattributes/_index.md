---
title: "Méthode System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes. Valide les contraintes d'identité sur les attributs par défaut et remplit la List spécifiée avec des objets XmlSchemaAttribute pour tous les attributs ayant des valeurs par défaut qui n'ont pas encore été validés à l'aide de la méthode XmlSchemaValidator::ValidateAttribute dans le contexte d'élément en C++."
type: docs
weight: 900
url: /fr/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


Valide les contraintes d'identité sur les attributs par défaut et remplit la List spécifiée avec des objets [XmlSchemaAttribute](../../xmlschemaattribute/) pour tous les attributs ayant des valeurs par défaut qui n'ont pas encore été validés à l'aide de la méthode [XmlSchemaValidator::ValidateAttribute](../validateattribute/) dans le contexte d'élément.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | Une List à remplir avec des objets [XmlSchemaAttribute](../../xmlschemaattribute/) pour tous les attributs qui n'ont pas encore été rencontrés lors de la validation dans le contexte d'élément. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
