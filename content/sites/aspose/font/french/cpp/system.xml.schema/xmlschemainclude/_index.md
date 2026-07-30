---
title: "System::Xml::Schema::XmlSchemaInclude class"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaInclude class. Représente l'élément include du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe est utilisée pour inclure des déclarations et des définitions provenant d'un schéma externe. Les déclarations et définitions incluses sont alors disponibles pour le traitement dans le schéma contenant en C++."
type: docs
weight: 3600
url: /fr/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


Représente l'élément **include** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe est utilisée pour inclure des déclarations et des définitions provenant d'un schéma externe. Les déclarations et définitions incluses sont alors disponibles pour le traitement dans le schéma contenant.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Renvoie la valeur **annotation**. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Définit la valeur **annotation**. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Initialise une nouvelle instance de la classe [XmlSchemaInclude](./). |
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
