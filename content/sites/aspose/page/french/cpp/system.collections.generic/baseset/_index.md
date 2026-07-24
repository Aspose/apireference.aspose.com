---
title: "System::Collections::Generic::BaseSet classe"
linktitle: "BaseSet"
second_title: "Aspose.Page pour C++"
description: "Comment utiliser la classe System::Collections::Generic::BaseSet en C++."
type: docs
weight: 800
url: /fr/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Spécifique à C++. |
| [Add](./add/)(const T\&) override | Ajoute un élément dans l'ensemble. |
| [begin](./begin/)() const | Obtient l'itérateur du premier élément de la collection qualifiée const. |
| [cbegin](./cbegin/)() const | Obtient l'itérateur du premier élément const-qualifié de la collection. |
| [cend](./cend/)() const | Obtient l'itérateur d'un élément const-qualifié inexistant situé après la fin de la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments de l'ensemble. |
| [Contains](./contains/)(const T\&) const override | Vérifie si l'élément est présent dans l'ensemble. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copie le contenu du hachage dans les éléments existants du tableau. |
| [data](./data/)() | Accesseur de la structure de données sous-jacente. |
| [data](./data/)() const | Accesseur de la structure de données sous-jacente. |
| [end](./end/)() const | Obtient l'itérateur d'un élément inexistant situé après la fin de la collection const-qualifiée. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments dans l'ensemble. |
| [GetEnumerator](./getenumerator/)() override | Crée un itérateur. |
| [Remove](./remove/)(const T\&) override | Supprime l'élément de l'ensemble. |
| [TryAdd](./tryadd/)(const T\&) | Ajoute un élément dans l'ensemble. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Interface implémentée. |
| [const_iterator](./const_iterator/) | Type d'itérateur constant. |
| [IEnumerablePtr](./ienumerableptr/) | Pointeur d'interface énumérable. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) pointeur. |
| [iterator](./iterator/) | Type d'itérateur. |
| [set_t](./set_t/) | Type de données sous-jacent. |
| [ThisPtr](./thisptr/) | Type de pointeur. |
| [ThisType](./thistype/) | Type Self. |
| [ValueType](./valuetype/) | Type valeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
