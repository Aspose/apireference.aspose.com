---
title: "System::Xml::Schema::XmlSchemaAttributeGroup classe"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup classe. Représente l'élément attributeGroup du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). AttributesGroups fournit un mécanisme pour regrouper un ensemble de déclarations d'attributs afin qu'elles puissent être incorporées comme groupe dans les définitions de types complexes en C++."
type: docs
weight: 1200
url: /fr/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Représente l'élément **attributeGroup** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). AttributesGroups fournit un mécanisme pour regrouper un ensemble de déclarations d'attributs afin qu'elles puissent être incorporées comme groupe dans les définitions de types complexes.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Renvoie le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du groupe d'attributs. |
| [get_Attributes](./get_attributes/)() | Renvoie la collection d'attributs du groupe d'attributs. Contient les éléments [XmlSchemaAttribute](../xmlschemaattribute/) et [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Renvoie le nom du groupe d'attributs. |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié du groupe d'attributs. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Renvoie la propriété du groupe d'attributs redéfinie du XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du groupe d'attributs. |
| [set_Name](./set_name/)(const String\&) | Définit le nom du groupe d'attributs. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Initialise une nouvelle instance de la classe [XmlSchemaAttributeGroup](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
