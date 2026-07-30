---
title: "System::Xml::Schema::XmlSchemaChoice classe"
linktitle: "ChoixXmlSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaChoice classe. Représente l'élément choice (compositeur) du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). Le choice ne permet qu'un seul de ses enfants d'apparaître dans une instance en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Représente l'élément **choice** (compositeur) du XML [Schema](../) tel que spécifié par le Consortium World Wide [Web](../../system.web/) (W3C). Le **choice** ne permet qu'un seul de ses enfants d'apparaître dans une instance.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Items](./get_items/)() override | Renvoie la collection des éléments contenus dans le compositeur (**choice**) : [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), ou [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Initialise une nouvelle instance de la classe [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
