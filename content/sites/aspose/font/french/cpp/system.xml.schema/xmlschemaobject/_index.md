---
title: "System::Xml::Schema::XmlSchemaObject classe"
linktitle: "ObjetXmlSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaObject classe. Représente la classe racine pour la hiérarchie du modèle d'objet du schéma Xml et sert de classe de base pour des classes telles que la classe XmlSchema en C++."
type: docs
weight: 5000
url: /fr/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


Représente la classe racine pour la hiérarchie du modèle d'objet du schéma [Xml](../../system.xml/) et sert de classe de base pour des classes telles que la classe [XmlSchema](../xmlschema/).

```cpp
class XmlSchemaObject : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Renvoie le numéro de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [get_LinePosition](./get_lineposition/)() | Renvoie la position de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [get_Namespaces](./get_namespaces/)() | Renvoie le XmlSerializerNamespaces à utiliser avec cet objet de schéma. |
| [get_Parent](./get_parent/)() | Renvoie le parent de cet [XmlSchemaObject](./). |
| [get_SourceUri](./get_sourceuri/)() | Renvoie l'emplacement source du fichier qui a chargé le schéma. |
| [set_LineNumber](./set_linenumber/)(int32_t) | Définit le numéro de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [set_LinePosition](./set_lineposition/)(int32_t) | Définit la position de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Définit les XmlSerializerNamespaces à utiliser avec cet objet schéma. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Définit le parent de cet [XmlSchemaObject](./). |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Définit l'emplacement source du fichier qui a chargé le schéma. |
| [XmlSchemaObject](./xmlschemaobject/)() | Initialise une nouvelle instance de la classe [XmlSchemaObject](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
