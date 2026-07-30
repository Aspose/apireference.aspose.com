---
title: "System::Collections::Generic::SortedList classe"
linktitle: "SortedList"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::SortedList classe. Liste triée enveloppant la structure FlatMap. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 4200
url: /fr/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Liste triée enveloppant la structure FlatMap. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Paramètre | Description |
| --- | --- |
| TKey | Type de clé. |
| TValue | Type valeur. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [crbegin](./crbegin/)() const | Obtient un itérateur inverse vers le dernier élément const de la collection (premier en sens inverse). |
| [crend](./crend/)() const | Obtient un itérateur inverse pour un élément const inexistant avant le début de la collection. |
| [get_Capacity](./get_capacity/)() const | Obtient la capacité actuelle de la liste. |
| virtual [get_Keys](./get_keys/)() const | Accède à la collection de clés. |
| virtual [get_Values](./get_values/)() const | Accède à la collection de valeurs. |
| [GetEnumerator](./getenumerator/)() override | Obtient un énumérateur parcourant la liste actuelle. |
| [IndexOfKey](./indexofkey/)(TKey) const | Recherche une clé spécifique. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Recherche une valeur spécifique. |
| [rbegin](./rbegin/)() | Obtient un itérateur inverse vers le dernier élément de la collection (premier en sens inverse). |
| [rbegin](./rbegin/)() const | Obtient un itérateur inverse vers le dernier élément de la collection const (premier en sens inverse). |
| [RemoveAt](./removeat/)(int) | Supprime l'élément à la position spécifiée. |
| [rend](./rend/)() | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection. |
| [rend](./rend/)() const | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection const. |
| [set_Capacity](./set_capacity/)(int) | Définit la capacité de la liste actuelle. |
| [SortedList](./sortedlist/)() | Construit une liste vide. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Construit une liste vide. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Constructeur de copie. |
| [SortedList](./sortedlist/)(const map_t\&) | Constructeur de copie. |
| [SortedList](./sortedlist/)(int) | Construit une liste vide. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [IEnumerablePtr](./ienumerableptr/) | Collection du même type de paires. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Type d'itérateur. |
| [KeyCollection](./keycollection/) | Type de collection de clés. |
| [KVPair](./kvpair/) | Type de paire clé-valeur. |
| [map_t](./map_t/) | Type de données sous-jacent. |
| [Ptr](./ptr/) | Type de pointeur. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
| [this_t](./this_t/) | Ce type. |
| [ValueCollection](./valuecollection/) | Type de collection de valeurs. |

## Voir aussi

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
