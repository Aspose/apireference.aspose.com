---
title: "System::Collections::Generic::SortedDictionary classe"
linktitle: "SortedDictionary"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::SortedDictionary classe. Déclaration anticipée du type dictionnaire trié en C++."
type: docs
weight: 4000
url: /fr/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Déclaration anticipée du type dictionnaire trié.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Obtient le [IComparer<TKey>](../icomparer/) utilisé pour ordonner les éléments du SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Fonction d'accès singleton. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir le dictionnaire actuel. |
| [rbegin](./rbegin/)() | Obtient un itérateur inverse vers le dernier élément de la collection (premier en sens inverse). |
| [rbegin](./rbegin/)() const | Obtient un itérateur inverse vers le dernier élément de la collection const (premier en sens inverse). |
| [rend](./rend/)() | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection. |
| [rend](./rend/)() const | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection const. |
| [SortedDictionary](./sorteddictionary/)() | Construit un dictionnaire vide. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Construit un dictionnaire vide. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Constructeur de copie. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Constructeur de copie. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [IEnumerablePtr](./ienumerableptr/) | Collection d'éléments identiques. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Type d'itérateur. |
| [KeyCollection](./keycollection/) | Type de collection de clés. |
| [KVPair](./kvpair/) | Type de paire clé-valeur. |
| [map_t](./map_t/) | Type de données sous-jacent. |
| [Ptr](./ptr/) | Type de pointeur. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
| [this_t](./this_t/) | Type auto. |
| [ValueCollection](./valuecollection/) | Type de collection de valeurs. |
## Remarques


Classe de dictionnaire trié encapsulant une map STL. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

## Voir aussi

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
