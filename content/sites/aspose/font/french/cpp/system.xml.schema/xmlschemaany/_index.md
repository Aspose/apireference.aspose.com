---
title: "Classe System::Xml::Schema::XmlSchemaAny"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaAny classe. Représente l'élément any du World Wide Web Consortium (W3C) en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Représente l'élément **any** du World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Renvoie les espaces de noms contenant les éléments qui peuvent être utilisés. |
| [get_ProcessContents](./get_processcontents/)() | Renvoie des informations sur la façon dont une application ou un processeur XML doit gérer la validation des documents XML pour les éléments spécifiés par l'élément **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | Définit les espaces de noms contenant les éléments qui peuvent être utilisés. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Définit des informations sur la façon dont une application ou un processeur XML doit gérer la validation des documents XML pour les éléments spécifiés par l'élément **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | Initialise une nouvelle instance de la classe [XmlSchemaAny](./). |
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
