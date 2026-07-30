---
title: "Classe System::Xml::Schema::XmlSchemaParticle"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaParticle. Une classe de base pour cela est la classe de base pour tous les types de particules (p. ex. XmlSchemaAny) en C++."
type: docs
weight: 5400
url: /fr/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Une classe de base pour cela est la classe de base pour tous les types de particules (p. ex. [XmlSchemaAny](../xmlschemaany/)).

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Renvoie le nombre maximal de fois que la particule peut se produire. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Renvoie le nombre sous forme de chaîne. Nombre maximal de fois que la particule peut se produire. |
| [get_MinOccurs](./get_minoccurs/)() | Renvoie le nombre minimal de fois que la particule peut se produire. |
| [get_MinOccursString](./get_minoccursstring/)() | Renvoie le nombre sous forme de chaîne. Le nombre minimal de fois que la particule peut se produire. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Définit le nombre maximal de fois que la particule peut se produire. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Définit le nombre sous forme de chaîne. Nombre maximal de fois que la particule peut se produire. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Définit le nombre minimal de fois que la particule peut se produire. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Définit le nombre comme une valeur de chaîne. Le nombre minimum de fois où la particule peut apparaître. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Initialise une nouvelle instance de la classe [XmlSchemaParticle](./). |
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
