---
title: "classe System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Schema::XmlSchemaAnnotated. La classe de base pour tout élément pouvant contenir des éléments d'annotation en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


La classe de base pour tout élément pouvant contenir des éléments d'annotation.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Renvoie la propriété **annotation**. |
| [get_Id](./get_id/)() | Renvoie l'identifiant de chaîne. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Renvoie les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma actuel. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Définit la propriété **annotation**. |
| [set_Id](./set_id/)(const String\&) | Définit l'identifiant de chaîne. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Définit les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma actuel. |
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
