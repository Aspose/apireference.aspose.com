---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint classe"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint class. Classe pour les contraintes d'identité : key, keyref et éléments unique en C++."
type: docs
weight: 3400
url: /fr/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Classe pour les contraintes d'identité : les éléments **key**, **keyref** et **unique**.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Fields](./get_fields/)() | Renvoie la collection de champs qui s'appliquent en tant qu'enfants pour le sélecteur d'expression du langage de chemin XML ([XPath](../../system.xml.xpath/)). |
| [get_Name](./get_name/)() | Renvoie le nom de la contrainte d'identité. |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié de la contrainte d'identité, qui contient l'interprétation post-compilation de la valeur **QualifiedName**. |
| [get_Selector](./get_selector/)() | Renvoie l'élément d'expression [XPath](../../system.xml.xpath/) **selector**. |
| [set_Name](./set_name/)(const String\&) | Définit le nom de la contrainte d'identité. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Définit l'élément d'expression [XPath](../../system.xml.xpath/) **selector**. |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Initialise une nouvelle instance de la classe [XmlSchemaIdentityConstraint](./). |
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
