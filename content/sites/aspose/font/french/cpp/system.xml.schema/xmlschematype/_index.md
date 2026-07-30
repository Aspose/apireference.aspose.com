---
title: "Classe System::Xml::Schema::XmlSchemaType"
linktitle: "XmlSchemaType"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaType. La classe de base pour tous les types simples et les types complexes en C++."
type: docs
weight: 6800
url: /fr/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


La classe de base pour tous les types simples et les types complexes.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Renvoie le type d'objet post-compilation ou le type de données du langage de définition XML [Schema](../) (XSD) intégré, l'élément simpleType ou l'élément complexType. Il s'agit d'une valeur d'ensemble d'informations post-compilation du schéma. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Renvoie la valeur post-compilation du type de base de ce type de schéma. |
| [get_Datatype](./get_datatype/)() | Renvoie la valeur post-compilation du type de données du type complexe. |
| [get_DerivedBy](./get_derivedby/)() | Renvoie les informations post-compilation sur la façon dont cet élément a été dérivé de son type de base. |
| [get_Final](./get_final/)() | Renvoie l'attribut final de la dérivation du type qui indique si d'autres dérivations sont autorisées. |
| [get_FinalResolved](./get_finalresolved/)() | Renvoie l'interprétation post-compilation de la valeur [XmlSchemaType::get_Final](./get_final/). |
| virtual [get_IsMixed](./get_ismixed/)() | Renvoie une valeur indiquant si ce type possède un modèle de contenu mixte. Cet appel n'est valide que pour un type complexe. |
| [get_Name](./get_name/)() | Renvoie le nom du type. |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié du type construit à partir de l'attribut **Name** de ce type. Il s'agit d'une valeur post-compilation du schéma. |
| [get_TypeCode](./get_typecode/)() | Renvoie le [XmlTypeCode](../xmltypecode/) du type. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Renvoie un [XmlSchemaComplexType](../xmlschemacomplextype/) qui représente le type complexe intégré du type complexe spécifié. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Renvoie un [XmlSchemaComplexType](../xmlschemacomplextype/) qui représente le type complexe intégré du type complexe spécifié par son nom qualifié. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Renvoie un [XmlSchemaSimpleType](../xmlschemasimpletype/) qui représente le type simple intégré du type simple spécifié par le nom qualifié. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Renvoie un [XmlSchemaSimpleType](../xmlschemasimpletype/) qui représente le type simple intégré du type simple spécifié. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Renvoie une valeur indiquant si le type de schéma dérivé spécifié est dérivé du type de schéma de base spécifié. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Définit l'attribut final de la dérivation du type qui indique si d'autres dérivations sont autorisées. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Définit une valeur indiquant si ce type possède un modèle de contenu mixte. Cet appel n'est valide que pour un type complexe. |
| [set_Name](./set_name/)(const String\&) | Définit le nom du type. |
| [XmlSchemaType](./xmlschematype/)() | Initialise une nouvelle instance de la classe [XmlSchemaType](./). |
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
