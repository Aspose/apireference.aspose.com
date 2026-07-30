---
title: "Classe System::Xml::Schema::XmlSchemaDocumentation"
linktitle: "DocumentationXmlSchema"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaDocumentation. Représente l'élément de documentation du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe spécifie des informations à lire ou à utiliser par les humains au sein d'une annotation en C++."
type: docs
weight: 2500
url: /fr/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Représente l'élément **documentation** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe spécifie des informations à lire ou à utiliser par les humains au sein d'une **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Language](./get_language/)() | Renvoie l'attribut **xml:lang**. Celui-ci sert d'indicateur de la langue utilisée dans le contenu. |
| [get_Markup](./get_markup/)() | Renvoie un tableau d'objets [XmlNode](../../system.xml/xmlnode/) qui représentent les nœuds enfants de documentation. |
| [get_Source](./get_source/)() | Renvoie la source de l'Uniform Resource Identifier (URI) des informations. |
| [set_Language](./set_language/)(const String\&) | Définit l'attribut **xml:lang**. Celui-ci sert d'indicateur de la langue utilisée dans le contenu. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Définit un tableau d'objets [XmlNode](../../system.xml/xmlnode/) qui représentent les nœuds enfants de documentation. |
| [set_Source](./set_source/)(const String\&) | Définit la source de l'Uniform Resource Identifier (URI) des informations. |
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
