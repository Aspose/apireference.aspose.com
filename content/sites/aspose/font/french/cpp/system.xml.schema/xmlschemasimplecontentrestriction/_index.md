---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction classe"
linktitle: "RestrictionDeContenuSimpleXmlSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction classe. Représente l'élément de restriction pour le contenu simple du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe peut être utilisée pour dériver des types simples par restriction. De telles dérivations peuvent être utilisées pour restreindre l'intervalle de valeurs de l'élément à un sous-ensemble des valeurs spécifiées dans le type simple hérité en C++."
type: docs
weight: 6100
url: /fr/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Représente l'élément **restriction** pour le contenu simple du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe peut être utilisée pour dériver des types simples par restriction. De telles dérivations peuvent être utilisées pour restreindre l'intervalle de valeurs de l'élément à un sous-ensemble des valeurs spécifiées dans le type simple hérité.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Renvoie un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) à utiliser pour la valeur de l'attribut. |
| [get_Attributes](./get_attributes/)() | Renvoie la collection des [XmlSchemaAttribute](../xmlschemaattribute/) et [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) d'attributs pour le type simple. |
| [get_BaseType](./get_basetype/)() | Renvoie la valeur de base du type simple. |
| [get_BaseTypeName](./get_basetypename/)() | Renvoie le nom du type de données intégré ou du type simple dont ce type est dérivé. |
| [get_Facets](./get_facets/)() | Renvoie une facette [Xml](../../system.xml/)[Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) à utiliser pour la valeur de l'attribut. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit la valeur de base du type simple. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom du type de données intégré ou du type simple dont ce type est dérivé. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleContentRestriction](./). |
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
