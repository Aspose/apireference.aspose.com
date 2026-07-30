---
title: "Classe System::Xml::Schema::XmlSchemaComplexType"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaComplexType. Représente l'élément complexType du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe définit un type complexe qui détermine l'ensemble des attributs et le contenu d'un élément en C++."
type: docs
weight: 2100
url: /fr/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Représente l'élément **complexType** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe définit un type complexe qui détermine l'ensemble des attributs et le contenu d'un élément.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourne la valeur du composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du type complexe. |
| [get_Attributes](./get_attributes/)() | Retourne la collection d'attributs du type complexe. |
| [get_AttributeUses](./get_attributeuses/)() | Retourne la collection de tous les attributs compilés de ce type complexe et de ses types de base. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Retourne la valeur post-compilation pour **anyAttribute** de ce type complexe et de ses types de base. |
| [get_Block](./get_block/)() | Retourne l'attribut **block**. |
| [get_BlockResolved](./get_blockresolved/)() | Renvoie la valeur après que le type a été compilé vers l'ensemble d'informations post-validation du schéma (infoset). Cette valeur indique comment le type est appliqué lorsque **xsi:type** est utilisé dans le document d'instance. |
| [get_ContentModel](./get_contentmodel/)() | Renvoie le [XmlSchemaContentModel](../xmlschemacontentmodel/) post-compilation de ce type complexe. |
| [get_ContentType](./get_contenttype/)() | Renvoie le modèle de contenu du type complexe qui contient la valeur post-compilation. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Renvoie la particule qui contient la valeur post-compilation de la particule [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | Renvoie l'information qui détermine si l'élément **complexType** peut être utilisé dans le document d'instance. |
| [get_IsMixed](./get_ismixed/)() override | Renvoie l'information qui détermine si le type complexe possède un modèle de contenu mixte (balises dans le contenu). |
| [get_Particle](./get_particle/)() | Renvoie le type de compositeur parmi les classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit la valeur du composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du type complexe. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Définit l'attribut **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Définit le [XmlSchemaContentModel](../xmlschemacontentmodel/) post-compilation de ce type complexe. |
| [set_IsAbstract](./set_isabstract/)(bool) | Définit l'information qui détermine si l'élément **complexType** peut être utilisé dans le document d'instance. |
| [set_IsMixed](./set_ismixed/)(bool) override | Définit l'information qui détermine si le type complexe possède un modèle de contenu mixte (balises dans le contenu). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Définit le type de compositeur parmi les classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Initialise une nouvelle instance de la classe [XmlSchemaComplexType](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
