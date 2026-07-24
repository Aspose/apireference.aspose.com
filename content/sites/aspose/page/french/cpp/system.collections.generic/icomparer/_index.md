---
title: "System::Collections::Generic::IComparer classe"
linktitle: "IComparer"
second_title: "Aspose.Page pour C++"
description: "System::Collections::Generic::IComparer classe. Interface qui compare deux objets selon le sens supérieur-égal-inférieur. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.collections.generic/icomparer/
---
## IComparer class


Interface qui compare deux objets selon le sens supérieur-égal-inférieur. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) fonction. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [args_type](./args_type/) | Informations RTTI. |

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
