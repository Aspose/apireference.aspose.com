---
title: "classe System::Collections::Generic::IList"
linktitle: "IList"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::IList. Interface d'un conteneur indexé d'éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.collections.generic/ilist/
---
## IList class


Interface d'un conteneur indexé d'éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en argument.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Vérifie si la collection a une taille fixe. |
| virtual [idx_get](./idx_get/)(int) const | Obtient l'élément à l'index spécifié. |
| virtual [idx_set](./idx_set/)(int, T) | Définit l'élément à l'index spécifié. |
| virtual [IndexOf](./indexof/)(const T\&) const | Obtient l'index de la première apparition de l'élément dans le conteneur. |
| virtual [Insert](./insert/)(int, const T\&) | Insère l'élément à la position spécifiée, en décalant les autres éléments. |
| virtual [RemoveAt](./removeat/)(int) | Supprime l'élément à l'index spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Informations RTTI. |
| [ThisType](./thistype/) | Ce type. |
| [ValueType](./valuetype/) | Type valeur. |

## Voir aussi

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
