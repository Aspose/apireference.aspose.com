---
title: "classe System::Attribute"
linktitle: "Attribut"
second_title: "Aspose.Font pour C++"
description: "classe System::Attribute. Une classe de base pour les attributs personnalisés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system/attribute/
---
## Attribute class


Une classe de base pour les attributs personnalisés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Attribute : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Renvoie un attribut personnalisé d'un type spécifié appliqué au type spécifié. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Renvoie tous les attributs personnalisés appliqués au type spécifié. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
