---
title: "Classe System::Xml::Schema::XmlSchemaAttribute"
linktitle: "AttributXmlSchema"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaAttribute. Représente l'élément d'attribut du XML Schema tel que spécifié par le Consortium World Wide Web (W3C). Les attributs fournissent des informations supplémentaires pour les autres éléments du document. La balise d'attribut est imbriquée entre les balises de l'élément d'un document pour le schéma. Le document XML affiche les attributs comme des éléments nommés dans la balise d'ouverture d'un élément en C++."
type: docs
weight: 1100
url: /fr/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Représente l'élément **attribute** du XML [Schema](../) tel que spécifié par le Consortium World Wide [Web](../../system.web/) (W3C). Les attributs fournissent des informations supplémentaires pour les autres éléments du document. La balise d'attribut est imbriquée entre les balises de l'élément d'un document pour le schéma. Le document XML affiche les attributs comme des éléments nommés dans la balise d'ouverture d'un élément.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Renvoie un objet [XmlSchemaSimpleType](../xmlschemasimpletype/) représentant le type de l'attribut basé sur la valeur [XmlSchemaAttribute::get_SchemaType](./get_schematype/) ou [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) de l'attribut. |
| [get_AttributeType](./get_attributetype/)() | Renvoie l'objet basé sur la valeur [XmlSchemaAttribute::get_SchemaType](./get_schematype/) ou [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) de l'attribut qui contient l'interprétation post-compilation de la valeur **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | Renvoie la valeur par défaut de l'attribut. |
| [get_FixedValue](./get_fixedvalue/)() | Renvoie la valeur fixe de l'attribut. |
| [get_Form](./get_form/)() | Renvoie la forme de l'attribut. |
| [get_Name](./get_name/)() | Renvoie le nom de l'attribut. |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié de l'attribut. |
| [get_RefName](./get_refname/)() | Renvoie le nom d'un attribut déclaré dans ce schéma (ou dans un autre schéma indiqué par l'espace de noms spécifié). |
| [get_SchemaType](./get_schematype/)() | Renvoie le type d'attribut en tant que type simple. |
| [get_SchemaTypeName](./get_schematypename/)() | Renvoie le nom du type simple défini dans ce schéma (ou dans un autre schéma indiqué par l'espace de noms spécifié). |
| [get_Use](./get_use/)() | Renvoie des informations sur la façon dont l'attribut est utilisé. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Définit la valeur par défaut de l'attribut. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Définit la valeur fixe de l'attribut. |
| [set_Form](./set_form/)(XmlSchemaForm) | Définit la forme de l'attribut. |
| [set_Name](./set_name/)(const String\&) | Définit le nom de l'attribut. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un attribut déclaré dans ce schéma (ou dans un autre schéma indiqué par l'espace de noms spécifié). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit le type d'attribut en tant que type simple. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom du type simple défini dans ce schéma (ou dans un autre schéma indiqué par l'espace de noms spécifié). |
| [set_Use](./set_use/)(XmlSchemaUse) | Définit les informations sur la façon dont l'attribut est utilisé. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Initialise une nouvelle instance de la classe [XmlSchemaAttribute](./). |
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
