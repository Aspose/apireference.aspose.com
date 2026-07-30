---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction classe"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction classe. Représente l'élément restriction du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe s'applique aux types complexes avec un modèle de contenu complexe dérivé par restriction. Elle restreint le contenu du type complexe à un sous-ensemble du type complexe hérité en C++."
type: docs
weight: 2000
url: /fr/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Représente l'élément **restriction** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe s'applique aux types complexes avec un modèle de contenu complexe dérivé par restriction. Elle restreint le contenu du type complexe à un sous-ensemble du type complexe hérité.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Renvoie le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du modèle de contenu complexe. |
| [get_Attributes](./get_attributes/)() | Renvoie la collection d'attributs du type complexe. Contient les éléments [XmlSchemaAttribute](../xmlschemaattribute/) et [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Renvoie le nom d'un type complexe dont ce type est dérivé par restriction. |
| [get_Particle](./get_particle/)() | Renvoie l'une des classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du modèle de contenu complexe. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un type complexe dont ce type est dérivé par restriction. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Définit l'une des classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Initialise une nouvelle instance de la classe [XmlSchemaComplexContentRestriction](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
