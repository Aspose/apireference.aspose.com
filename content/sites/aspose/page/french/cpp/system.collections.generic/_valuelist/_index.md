---
title: "classe System::Collections::Generic::_ValueList"
linktitle: "_ValueList"
second_title: "Aspose.Page pour C++"
description: "classe System::Collections::Generic::_ValueList. Implémente la liste des valeurs du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implémente la liste des valeurs du dictionnaire. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

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
* Library [Aspose.Page for C++](../../)
