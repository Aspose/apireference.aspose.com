---
title: "System::Collections::Generic::_KeyList classe"
linktitle: "_KeyList"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::_KeyList classe. Implémente la liste des clés du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Implémente la liste des clés du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Paramètre | Description |
| --- | --- |
| Dict | [Dictionary](../dictionary/) type. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Initialise la collection faisant référence au dictionnaire spécifié. |
| [Contains](./contains/)(const TKey\&) const override | Vérifie si la clé spécifiée est présente dans la collection. |
| [idx_get](./idx_get/)(int) const override | Obtient la clé à la position spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [TKey](./tkey/) | Type de clé. |

## Voir aussi

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
