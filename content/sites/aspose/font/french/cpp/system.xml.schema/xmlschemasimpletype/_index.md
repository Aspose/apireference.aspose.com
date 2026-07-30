---
title: "System::Xml::Schema::XmlSchemaSimpleType classe"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleType classe. Représente l'élément simpleType pour un contenu simple provenant du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe définit un type simple. Les types simples peuvent spécifier des informations et des contraintes pour la valeur des attributs ou des éléments à contenu texte uniquement en C++."
type: docs
weight: 6200
url: /fr/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Représente l'élément **simpleType** pour un contenu simple provenant du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe définit un type simple. Les types simples peuvent spécifier des informations et des contraintes pour la valeur des attributs ou des éléments à contenu texte uniquement.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Content](./get_content/)() | Renvoie l'un des [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), ou [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Définit l'un des [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), ou [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleType](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
