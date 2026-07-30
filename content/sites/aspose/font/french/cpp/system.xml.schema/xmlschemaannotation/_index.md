---
title: "Classe System::Xml::Schema::XmlSchemaAnnotation"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaAnnotation. Représente l'élément d'annotation du World Wide Web Consortium (W3C) en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Représente le World Wide [Web](../../system.web/) Consortium (W3C) **annotation** élément.

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Id](./get_id/)() | Renvoie l'identifiant de chaîne. |
| [get_Items](./get_items/)() | Renvoie la collection **Items** qui est utilisée pour stocker les éléments enfants **appinfo** et **documentation**. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Renvoie les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [set_Id](./set_id/)(const String\&) | Définit l'identifiant de chaîne. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Définit les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Initialise une nouvelle instance de la classe [XmlSchemaAnnotation](./). |
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
