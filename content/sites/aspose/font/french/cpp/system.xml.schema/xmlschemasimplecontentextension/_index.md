---
title: "classe System::Xml::Schema::XmlSchemaSimpleContentExtension"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Schema::XmlSchemaSimpleContentExtension. Représente l'élément d'extension pour le contenu simple du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe peut être utilisée pour dériver des types simples par extension. De telles dérivations sont utilisées pour étendre le contenu du type simple de l'élément en ajoutant des attributs en C++."
type: docs
weight: 6000
url: /fr/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Représente l'élément **extension** pour le contenu simple du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe peut être utilisée pour dériver des types simples par extension. De telles dérivations sont utilisées pour étendre le contenu du type simple de l'élément en ajoutant des attributs.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Renvoie le [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) à utiliser pour la valeur de l'attribut. |
| [get_Attributes](./get_attributes/)() | Renvoie la collection de [XmlSchemaAttribute](../xmlschemaattribute/) et de [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Renvoie le nom d'un type de données intégré ou d'un type simple à partir duquel ce type est étendu. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit le [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) à utiliser pour la valeur de l'attribut. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un type de données intégré ou d'un type simple à partir duquel ce type est étendu. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleContentExtension](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
