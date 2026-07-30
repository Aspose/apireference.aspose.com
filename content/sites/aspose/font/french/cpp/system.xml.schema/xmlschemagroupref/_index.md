---
title: "System::Xml::Schema::XmlSchemaGroupRef classe"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaGroupRef classe. Représente l'élément group avec l'attribut ref du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe est utilisée au sein des types complexes qui référencent un groupe défini au niveau du schema en C++."
type: docs
weight: 3300
url: /fr/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Représente l'élément **group** avec l'attribut **ref** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe est utilisée au sein des types complexes qui référencent un **group** défini au niveau du **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Particle](./get_particle/)() | Renvoie l'une des classes [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) ou [XmlSchemaSequence](../xmlschemasequence/), qui contient l'interprétation post-compilation de la valeur **Particle**. |
| [get_RefName](./get_refname/)() | Renvoie le nom d'un groupe défini dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un groupe défini dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Initialise une nouvelle instance de la classe [XmlSchemaGroupRef](./). |
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
