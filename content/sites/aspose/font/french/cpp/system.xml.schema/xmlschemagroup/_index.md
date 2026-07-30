---
title: "System::Xml::Schema::XmlSchemaGroup classe"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaGroup classe. Représente l'élément group du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe définit des groupes au niveau du schema qui sont référencés depuis les types complexes. Elle regroupe un ensemble de déclarations d'éléments afin qu'ils puissent être incorporés comme groupe dans les définitions de types complexes en C++."
type: docs
weight: 3100
url: /fr/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Représente l'élément **group** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe définit des groupes au niveau du **schema** qui sont référencés depuis les types complexes. Elle regroupe un ensemble de déclarations d'éléments afin qu'ils puissent être incorporés comme groupe dans les définitions de types complexes.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Name](./get_name/)() | Renvoie le nom du groupe du schéma. |
| [get_Particle](./get_particle/)() | Renvoie l'une des classes [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié du groupe du schéma. |
| [set_Name](./set_name/)(const String\&) | Définit le nom du groupe du schéma. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Définit l'une des classes [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | Initialise une nouvelle instance de la classe [XmlSchemaGroup](./). |
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
