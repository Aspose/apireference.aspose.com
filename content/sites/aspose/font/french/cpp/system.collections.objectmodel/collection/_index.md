---
title: "System::Collections::ObjectModel::Collection classe"
linktitle: "Collection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::ObjectModel::Collection. Type de base pour une collection générique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.collections.objectmodel/collection/
---
## Collection class


Type de base pour une collection générique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) fonction. Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Ajoute une valeur au conteneur. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [Collection](./collection/)() | Crée une collection vide. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Vérifie si l'élément est présent dans la collection. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copie les éléments de la collection dans les éléments existants du tableau. |
| [crbegin](./crbegin/)() const | Obtient un itérateur inverse vers le dernier élément const de la collection (premier en sens inverse). |
| [crend](./crend/)() const | Obtient un itérateur inverse pour un élément const inexistant avant le début de la collection. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments. |
| [get_Items](./get_items/)() | Accesseur de la structure de données interne. |
| [get_Items](./get_items/)() const | Accesseur de la structure de données interne. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir la collection. |
| [idx_get](./idx_get/)(int) const override | Obtient la valeur à l'index spécifié. |
| [idx_set](./idx_set/)(int, T) override | Définit la valeur à l'index spécifié. |
| [IndexOf](./indexof/)(const T\&) const override | Recherche un élément dans la collection. |
| [Insert](./insert/)(int, const T\&) override | Insère l'élément à la position spécifiée. |
| [operator[]](./operator[]/)(int) | Obtient la valeur à l'index spécifié. |
| [operator[]](./operator[]/)(int) const | Obtient la valeur à l'index spécifié. |
| [rbegin](./rbegin/)() | Obtient un itérateur inverse vers le dernier élément de la collection (premier en sens inverse). |
| [rbegin](./rbegin/)() const | Obtient un itérateur inverse vers le dernier élément de la collection const (premier en sens inverse). |
| [Remove](./remove/)(const T\&) override | Supprime l'élément spécifié. |
| [RemoveAt](./removeat/)(int) override | Supprime l'élément à la position spécifiée. |
| [rend](./rend/)() | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection. |
| [rend](./rend/)() const | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection const. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Rend les pointeurs stockés faibles (le cas échéant). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Voir aussi

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
