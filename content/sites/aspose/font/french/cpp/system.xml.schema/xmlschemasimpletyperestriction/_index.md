---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction classe"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction classe. Représente l'élément restriction pour les types simples du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe peut être utilisée pour restreindre l'élément simpleType en C++."
type: docs
weight: 6500
url: /fr/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Représente l'élément **restriction** pour les types simples du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe peut être utilisée pour restreindre l'élément **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Renvoie des informations sur le type de base. |
| [get_BaseTypeName](./get_basetypename/)() | Renvoie le nom du type de base qualifié. |
| [get_Facets](./get_facets/)() | Renvoie une facette [Xml](../../system.xml/)[Schema](../). |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit des informations sur le type de base. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom du type de base qualifié. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
