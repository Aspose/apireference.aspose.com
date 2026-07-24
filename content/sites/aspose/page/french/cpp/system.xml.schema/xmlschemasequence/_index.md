---
title: "System::Xml::Schema::XmlSchemaSequence classe"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Schema::XmlSchemaSequence classe. Représente l'élément de séquence (compositeur) du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). La séquence exige que les éléments du groupe apparaissent dans l'ordre spécifié au sein de l'élément contenant en C++."
type: docs
weight: 5700
url: /fr/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Représente l'élément **sequence** (compositeur) du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Le **sequence** exige que les éléments du groupe apparaissent dans l'ordre spécifié au sein de l'élément contenant.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Items](./get_items/)() override | Les éléments contenus dans le compositeur. Collection de [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) ou [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Initialise une nouvelle instance de la classe [XmlSchemaSequence](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
