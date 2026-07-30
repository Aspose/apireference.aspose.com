---
title: "System::Xml::Schema::XmlSchemaSimpleContent classe"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent class. Représente l'élément simpleContent du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe est destinée aux types simples et complexes avec un modèle de contenu simple en C++."
type: docs
weight: 5900
url: /fr/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Représente l'élément **simpleContent** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe est destinée aux types simples et complexes avec un modèle de contenu simple.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Content](./get_content/)() override | Renvoie l'un des [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) ou [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Renvoie l'un des [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) ou [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
