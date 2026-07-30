---
title: "Classe System::Xml::Schema::XmlSchemaComplexContentExtension"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaComplexContentExtension. Représente l'élément extension du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). Cette classe concerne les types complexes avec un modèle de contenu complexe dérivé par extension. Elle étend le type complexe en ajoutant des attributs ou des éléments en C++."
type: docs
weight: 1900
url: /fr/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Représente l'élément **extension** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe concerne les types complexes avec un modèle de contenu complexe dérivé par extension. Elle étend le type complexe en ajoutant des attributs ou des éléments.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Renvoie le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du modèle de contenu complexe. |
| [get_Attributes](./get_attributes/)() | Renvoie la collection d'attributs pour le contenu complexe. Contient les éléments [XmlSchemaAttribute](../xmlschemaattribute/) et [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Renvoie le nom du type complexe dont ce type est dérivé par extension. |
| [get_Particle](./get_particle/)() | Renvoie l'une des classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Définit le composant [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) du modèle de contenu complexe. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom du type complexe dont ce type est dérivé par extension. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Définit l'une des classes [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Initialise une nouvelle instance de la classe [XmlSchemaComplexContentExtension](./). |
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
