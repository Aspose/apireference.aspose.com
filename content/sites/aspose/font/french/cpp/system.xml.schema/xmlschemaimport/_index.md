---
title: "Classe System::Xml::Schema::XmlSchemaImport"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaImport. Représente l'élément **import** du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe est utilisée pour importer des composants de schéma provenant d'autres schémas en C++."
type: docs
weight: 3500
url: /fr/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Représente l'élément **import** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe est utilisée pour importer des composants de schéma provenant d'autres schémas.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Renvoie la valeur **annotation**. |
| [get_Namespace](./get_namespace/)() | Renvoie l'espace de noms cible du schéma importé sous forme de référence Uniform Resource Identifier (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Définit la valeur **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | Définit l'espace de noms cible du schéma importé sous forme de référence Uniform Resource Identifier (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | Initialise une nouvelle instance de la classe [XmlSchemaImport](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
