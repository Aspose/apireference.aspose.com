---
title: "System::Collections::Generic::IEqualityComparer classe"
linktitle: "IEqualityComparer"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::IEqualityComparer classe. Interface offrant un moyen de comparer deux objets pour l'égalité. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2400
url: /fr/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Interface offrant un moyen de comparer deux objets pour l'égalité. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Type comparé. |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | Informations RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | Obtient le code de hachage pour un objet. |

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
