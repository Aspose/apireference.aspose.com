---
title: "System::Collections::Generic::_KeyCollection classe"
linktitle: "_KeyCollection"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::_KeyCollection classe. Collection des clés du Dictionary''. Référence la collection, ne copie rien. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Collection des clés du [Dictionary](../dictionary/). Référence la collection, ne copie rien. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Initialise la collection faisant référence au dictionnaire spécifié. |
| [Contains](./contains/)(const TKey\&) const override | Vérifie si l'élément est présent dans le conteneur. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur parcourant les clés. |
| [idx_get](./idx_get/)(int) const override | Implémente la méthode [IList](../ilist/). Non pris en charge. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [TKey](./tkey/) | Type de clé. |

## Voir aussi

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
