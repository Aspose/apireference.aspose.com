---
title: "Classe System::Xml::Schema::XmlSchema"
linktitle: "XmlSchema"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchema. Une représentation en mémoire d'un schéma XML, telle que spécifiée par le World Wide Web Consortium (W3C) et en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Une représentation en mémoire d'un [Schema](../) XML, telle que spécifiée par le World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) et [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Compile le modèle XML [Schema](../)[Object](../../system/object/) (SOM) en informations de schéma pour la validation. Utilisé pour vérifier la structure syntaxique et sémantique du SOM construit programmatiquement. La vérification de validation sémantique est effectuée lors de la compilation. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Compile le modèle XML [Schema](../)[Object](../../system/object/) (SOM) en informations de schéma pour la validation. Utilisé pour vérifier la structure syntaxique et sémantique du SOM construit programmatiquement. La vérification de validation sémantique est effectuée lors de la compilation. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Renvoie la forme des attributs déclarés dans l'espace de noms cible du schéma. |
| [get_AttributeGroups](./get_attributegroups/)() | Renvoie la valeur post‑schema‑compilation de tous les groupes d'attributs globaux du schéma. |
| [get_Attributes](./get_attributes/)() | Renvoie la valeur post‑schema‑compilation de tous les attributs du schéma. |
| [get_BlockDefault](./get_blockdefault/)() | Renvoie l'attribut **blockDefault** qui définit la valeur par défaut de l'attribut **block** sur les éléments et les types complexes dans le **targetNamespace** du schéma. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Renvoie la forme des éléments déclarés dans l'espace de noms cible du schéma. |
| [get_Elements](./get_elements/)() | Renvoie la valeur post‑schema‑compilation de tous les éléments du schéma. |
| [get_FinalDefault](./get_finaldefault/)() | Renvoie l'attribut **finalDefault** qui définit la valeur par défaut de l'attribut **final** sur les éléments et les types complexes dans l'espace de noms cible du schéma. |
| [get_Groups](./get_groups/)() | Renvoie la valeur post‑schema‑compilation de tous les groupes du schéma. |
| [get_Id](./get_id/)() | Renvoie l'ID de chaîne. |
| [get_Includes](./get_includes/)() | Renvoie la collection des schémas inclus et importés. |
| [get_IsCompiled](./get_iscompiled/)() | Indique si le schéma a été compilé. |
| [get_Items](./get_items/)() | Renvoie la collection des éléments du schéma et est utilisée pour ajouter de nouveaux types d'éléments au niveau de l'élément **schema**. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Renvoie le numéro de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Renvoie la position de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Renvoie le XmlSerializerNamespaces à utiliser avec cet objet de schéma. |
| [get_Notations](./get_notations/)() | Renvoie la valeur post‑schema‑compilation de toutes les notations du schéma. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Renvoie le parent de cet [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | Renvoie la valeur post‑schema‑compilation de tous les types de schéma du schéma. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Renvoie l'emplacement source du fichier qui a chargé le schéma. |
| [get_TargetNamespace](./get_targetnamespace/)() | Renvoie l'Uniform Resource Identifier (URI) de l'espace de noms cible du schéma. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Renvoie les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [get_Version](./get_version/)() | Renvoie la version du schéma. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Lit un XML [Schema](../) à partir du [IO::TextReader](../../system.io/textreader/) fourni. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Lit un XML [Schema](../) à partir du flux fourni. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Lit un XML [Schema](../) à partir du [XmlReader](../../system.xml/xmlreader/) fourni. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Définit la forme des attributs déclarés dans l'espace de noms cible du schéma. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Définit l'attribut **blockDefault** qui définit la valeur par défaut de l'attribut **block** sur les éléments et les types complexes dans le **targetNamespace** du schéma. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Définit la forme des éléments déclarés dans l'espace de noms cible du schéma. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Définit l'attribut **finalDefault** qui définit la valeur par défaut de l'attribut **final** sur les éléments et les types complexes dans l'espace de noms cible du schéma. |
| [set_Id](./set_id/)(const String\&) | Définit l'ID de chaîne. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Définit le numéro de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Définit la position de ligne dans le fichier auquel l'élément **schema** fait référence. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Définit les XmlSerializerNamespaces à utiliser avec cet objet schéma. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Définit le parent de cet [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Définit l'emplacement source du fichier qui a chargé le schéma. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Définit l'Uniform Resource Identifier (URI) de l'espace de noms cible du schéma. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Définit les attributs qualifiés qui n'appartiennent pas à l'espace de noms cible du schéma. |
| [set_Version](./set_version/)(const String\&) | Définit la version du schéma. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Écrit le XML [Schema](../) dans le flux de données fourni. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Écrit le XML [Schema](../) dans le flux fourni en utilisant le [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) spécifié. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Écrit le XML [Schema](../) dans le [IO::TextWriter](../../system.io/textwriter/) fourni. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Écrit le XML [Schema](../) dans le TextWriter fourni. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Écrit le XML [Schema](../) dans le [XmlWriter](../../system.xml/xmlwriter/) fourni. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Écrit le XML [Schema](../) dans le [XmlWriter](../../system.xml/xmlwriter/) fourni. |
| [XmlSchema](./xmlschema/)() | Initialise une nouvelle instance de la classe [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Initialise une nouvelle instance de la classe [XmlSchemaObject](../xmlschemaobject/). |
## Champs

| Champ | Description |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | L'espace de noms d'instance du schéma XML. Ce champ est constant. |
| static [Namespace](./namespace/) | L'espace de noms du schéma XML. Ce champ est constant. |
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
