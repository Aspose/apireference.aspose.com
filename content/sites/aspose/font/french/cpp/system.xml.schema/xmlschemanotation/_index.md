---
title: "System::Xml::Schema::XmlSchemaNotation classe"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaNotation class. Représente l'élément notation du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Une déclaration de notation XML Schema est une reconstruction des déclarations NOTATION XML 1.0. Le but des notations est de décrire le format des données non-XML au sein d'un document XML en C++."
type: docs
weight: 4800
url: /fr/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Représente l'élément **notation** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Une déclaration **notation** du XML [Schema](../) est une reconstruction des déclarations NOTATION **XML** 1.0. Le but des notations est de décrire le format des données non-XML au sein d'un document XML.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Name](./get_name/)() | Renvoie le nom de la notation. |
| [get_Public](./get_public/)() | Renvoie l'identifiant **public**. |
| [get_System](./get_system/)() | Renvoie l'identifiant **system**. |
| [set_Name](./set_name/)(const String\&) | Définit le nom de la notation. |
| [set_Public](./set_public/)(const String\&) | Définit l'identifiant **public**. |
| [set_System](./set_system/)(const String\&) | Définit l'identifiant **system**. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Initialise une nouvelle instance de la classe [XmlSchemaNotation](./). |
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
