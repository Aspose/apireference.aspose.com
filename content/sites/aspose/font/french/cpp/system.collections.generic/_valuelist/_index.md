---
title: "System::Collections::Generic::_ValueList classe"
linktitle: "_ValueList"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::_ValueList classe. Implémente la liste des valeurs du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implémente la liste des valeurs du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Paramètre | Description |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Initialise la collection faisant référence au dictionnaire spécifié. |
| virtual [idx_get](./idx_get/)(int) const | Obtient la valeur à la position spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [TValue](./tvalue/) | Type valeur. |

## Voir aussi

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
