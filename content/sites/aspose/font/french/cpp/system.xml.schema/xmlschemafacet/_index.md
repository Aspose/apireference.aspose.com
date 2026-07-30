---
title: "System::Xml::Schema::XmlSchemaFacet classe"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaFacet class. Une classe de base pour toutes les facettes utilisées lorsque des types simples sont dérivés par restriction en C++."
type: docs
weight: 2900
url: /fr/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Une classe de base pour toutes les facettes utilisées lorsque les types simples sont dérivés par restriction.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Renvoie des informations indiquant que cette facette est fixe. |
| [get_Value](./get_value/)() | Renvoie l'attribut **value** de la facette. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Définit les informations indiquant que cette facette est fixe. |
| [set_Value](./set_value/)(const String\&) | Définit l'attribut **value** de la facette. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Initialise une nouvelle instance de la classe [XmlSchemaFacet](./). |
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
