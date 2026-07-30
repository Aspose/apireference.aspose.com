---
title: "Classe System::Xml::Schema::XmlSchemaElement"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaElement. Représente l'élément element du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe est la classe de base pour tous les types de particules et est utilisée pour décrire un élément dans un document XML en C++."
type: docs
weight: 2600
url: /fr/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


Représente l'élément **element** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe est la classe de base pour tous les types de particules et est utilisée pour décrire un élément dans un document XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Block](./get_block/)() | Renvoie une dérivation **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | Renvoie l'interprétation post-compilation de la valeur **Block**. |
| [get_Constraints](./get_constraints/)() | Renvoie la collection de contraintes sur l'élément. |
| [get_DefaultValue](./get_defaultvalue/)() | Renvoie la valeur par défaut de l'élément si son contenu est un type simple ou si le contenu de l'élément est **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | Renvoie un objet [XmlSchemaType](../xmlschematype/) représentant le type de l'élément basé sur les valeurs [XmlSchemaElement::get_SchemaType](./get_schematype/) ou [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) de l'élément. |
| [get_ElementType](./get_elementtype/)() | Renvoie un objet basé sur le [XmlSchemaElement](./) ou le [XmlSchemaElement](./) de l'élément, qui contient l'interprétation post‑compilation de la valeur **ElementType**. |
| [get_Final](./get_final/)() | Renvoie la valeur **Final** pour indiquer qu'aucune dérivation supplémentaire n'est autorisée. |
| [get_FinalResolved](./get_finalresolved/)() | Renvoie l'interprétation post‑compilation de la valeur **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | Renvoie la valeur fixe. |
| [get_Form](./get_form/)() | Renvoie la forme de l'élément. |
| [get_IsAbstract](./get_isabstract/)() | Renvoie des informations indiquant si l'élément peut être utilisé dans un document d'instance. |
| [get_IsNillable](./get_isnillable/)() | Renvoie des informations indiquant si **xsi:nil** peut apparaître dans les données d'instance. Indique si une valeur nil explicite peut être assignée à l'élément. |
| [get_Name](./get_name/)() | Renvoie le nom de l'élément. |
| [get_QualifiedName](./get_qualifiedname/)() | Renvoie le nom qualifié réel de l'élément donné. |
| [get_RefName](./get_refname/)() | Renvoie le nom de référence d'un élément déclaré dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [get_SchemaType](./get_schematype/)() | Renvoie le type de l'élément. Il peut s'agir d'un type complexe ou d'un type simple. |
| [get_SchemaTypeName](./get_schematypename/)() | Renvoie le nom d'un type de données intégré défini dans ce schéma ou dans un autre schéma indiqué par l'espace de noms spécifié. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Renvoie le nom d'un élément qui est substitué par cet élément. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Définit une dérivation **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Définit la valeur par défaut de l'élément si son contenu est un type simple ou si le contenu de l'élément est **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Définit la valeur **Final** pour indiquer qu'aucune dérivation supplémentaire n'est autorisée. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Définit la valeur fixe. |
| [set_Form](./set_form/)(XmlSchemaForm) | Définit la forme de l'élément. |
| [set_IsAbstract](./set_isabstract/)(bool) | Définit des informations indiquant si l'élément peut être utilisé dans un document d'instance. |
| [set_IsNillable](./set_isnillable/)(bool) | Définit des informations indiquant si **xsi:nil** peut apparaître dans les données d'instance. Indique si une valeur nil explicite peut être assignée à l'élément. |
| [set_Name](./set_name/)(const String\&) | Définit le nom de l'élément. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom de référence d'un élément déclaré dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Définit le type de l'élément. Il peut s'agir d'un type complexe ou d'un type simple. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un type de données intégré défini dans ce schéma ou dans un autre schéma indiqué par l'espace de noms spécifié. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un élément qui est substitué par cet élément. |
| [XmlSchemaElement](./xmlschemaelement/)() | Initialise une nouvelle instance de la classe [XmlSchemaElement](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
