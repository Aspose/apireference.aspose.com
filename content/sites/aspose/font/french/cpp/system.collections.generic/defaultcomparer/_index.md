---
title: "System::Collections::Generic::DefaultComparer classe"
linktitle: "DefaultComparer"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::DefaultComparer classe. Classe de comparateur par défaut. Utilise les opérateurs < et == pour comparer les valeurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Classe de comparateur par défaut. Utilise les opérateurs < et == pour comparer les valeurs. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type comparé. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | Informations RTTI. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Interface implémentée. |
| [ThisType](./thistype/) | Type actuel. |

## Voir aussi

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
