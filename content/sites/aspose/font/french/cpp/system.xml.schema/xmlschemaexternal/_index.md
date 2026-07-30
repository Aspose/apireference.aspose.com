---
title: "System::Xml::Schema::XmlSchemaExternal classe"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaExternal classe. Fournit des informations sur le schéma inclus en C++."
type: docs
weight: 2800
url: /fr/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Fournit des informations sur le schéma inclus.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Id](./get_id/)() | Renvoie l'identifiant de chaîne. |
| [get_Schema](./get_schema/)() | Renvoie le [XmlSchema](../xmlschema/) pour le schéma référencé. |
| [get_SchemaLocation](./get_schemalocation/)() | Renvoie l'emplacement de l'Uniform Resource Identifier (URI) du schéma, qui indique au processeur de schéma où le schéma réside physiquement. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Renvoie les attributs qualifiés, qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [set_Id](./set_id/)(const String\&) | Définit l'identifiant de chaîne. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Définit le [XmlSchema](../xmlschema/) pour le schéma référencé. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Définit l'emplacement de l'Uniform Resource Identifier (URI) du schéma, qui indique au processeur de schéma où le schéma réside physiquement. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Définit les attributs qualifiés, qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Initialise une nouvelle instance de la classe [XmlSchemaExternal](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
