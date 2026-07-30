---
title: "Classe System::Collections::Generic::List"
linktitle: "List"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::List. Déclaration anticipée de List en C++."
type: docs
weight: 3300
url: /fr/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Spécifique à C++. |
| [Add](./add/)(const T\&) override | Ajoute un élément à la fin de la liste. |
| [AddInitializer](./addinitializer/)(int, const T *) | Ajoute des éléments à la liste; utilisé lors de la traduction des initialiseurs. |
| [AddRange](./addrange/)(IEnumerablePtr) | Ajoute tous les éléments de la collection (ou d'elle-même) à la fin de la liste actuelle. |
| [AsReadOnly](./asreadonly/)() | Obtient une référence en lecture seule à cette collection. |
| [begin](./begin/)() | Obtient l'itérateur du premier élément de la collection. |
| [begin](./begin/)() const | Obtient un itérateur vers le premier élément de la collection qualifiée const. |
| [BinarySearch](./binarysearch/)(const T\&) const | Recherche un élément dans une liste triée. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Recherche un élément dans une liste triée. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Recherche un élément dans une liste triée. |
| [cbegin](./cbegin/)() const | Obtient un itérateur vers le premier élément qualifié const de la collection. |
| [cend](./cend/)() const | Obtient un itérateur pour un élément const-qualifié inexistant situé après la fin de la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments. |
| [Contains](./contains/)(const T\&) const override | Vérifie si l'élément est présent dans la liste. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Crée une liste d'éléments convertis en un type différent. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Copie les éléments de la liste dans les éléments existants du tableau. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Copie tous les éléments dans les éléments existants du tableau. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Copie les éléments à partir de l'index spécifié dans les éléments existants du tableau. |
| [crbegin](./crbegin/)() const | Obtient un itérateur inverse vers le dernier élément const de la collection (premier en sens inverse). |
| [crend](./crend/)() const | Obtient un itérateur inverse pour un élément const inexistant avant le début de la collection. |
| [data](./data/)() | Fonction d'accès à la structure de données sous-jacente. |
| [data](./data/)() const | Fonction d'accès à la structure de données sous-jacente. |
| [end](./end/)() | Obtient un itérateur pour un élément inexistant situé après la fin de la collection. |
| [end](./end/)() const | Obtient un itérateur pour un élément inexistant situé après la fin de la collection const-qualifiée. |
| [Exists](./exists/)(System::Predicate\<T\>) | Vérifie si un élément répondant à un prédicat spécifique existe dans la liste. |
| [Find](./find/)(System::Predicate\<T\>) | Recherche un élément répondant à un prédicat spécifique. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Recherche des éléments répondant à un prédicat spécifique. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Recherche un élément répondant à un prédicat spécifique. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Recherche un élément répondant à un prédicat spécifique. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Recherche un élément répondant à un prédicat spécifique. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Recherche le dernier élément répondant à un prédicat spécifique. |
| [ForEach](./foreach/)(System::Action\<T\>) | Applique une action à tous les éléments de la liste. |
| [get_Capacity](./get_capacity/)() const | Obtient la capacité actuelle de la liste. |
| [get_Count](./get_count/)() const override | Obtient le nombre d'éléments dans la liste actuelle. |
| [GetEnumerator](./getenumerator/)() override | Obtient un énumérateur pour parcourir les éléments de la liste. |
| [GetRange](./getrange/)(int, int) | Crée une tranche de la liste. |
| [idx_get](./idx_get/)(int) const override | Obtient l'élément à une position spécifique. |
| [idx_set](./idx_set/)(int, T) override | Place l'élément à la position spécifiée. |
| [IndexOf](./indexof/)(const T\&) const override | Obtient le premier indice de l'élément spécifique. |
| [IndexOf](./indexof/)(const T\&, int) const | Recherche l'élément spécifique dans la liste. |
| [Insert](./insert/)(int, const T\&) override | Insère l'élément à la position spécifiée. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Insère une plage de données à une position spécifique. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Recherche l'objet spécifié et renvoie l'indice basé sur zéro de la dernière occurrence dans la liste entière. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Recherche l'objet spécifié et renvoie l'indice basé sur zéro de la dernière occurrence dans la plage d'éléments de la [List](./) qui s'étend du premier élément à l'index spécifié. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Recherche l'objet spécifié et renvoie l'indice basé sur zéro de la dernière occurrence dans la plage d'éléments de la [List](./) qui contient le nombre d'éléments spécifié et se termine à l'index spécifié. |
| [List](./list/)() | Crée une liste vide. |
| [List](./list/)(int) | Crée une liste avec une capacité prédéfinie. |
| [List](./list/)(IEnumerablePtr) | Constructeur de copie. |
| [operator[]](./operator[]/)(int) | Fonction d'accès. |
| [operator[]](./operator[]/)(int) const | Fonction d'accès. |
| [rbegin](./rbegin/)() | Obtient un itérateur inverse vers le dernier élément de la collection (premier en sens inverse). |
| [rbegin](./rbegin/)() const | Obtient un itérateur inverse vers le dernier élément de la collection const (premier en sens inverse). |
| [Remove](./remove/)(const T\&) override | Supprime la première occurrence d'un élément spécifique de la liste. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Supprime tous les éléments correspondant à un prédicat spécifique. |
| [RemoveAt](./removeat/)(int) override | Supprime l'élément à la position spécifiée. |
| [RemoveRange](./removerange/)(int, int) | Supprime une tranche de la liste. |
| [rend](./rend/)() | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection. |
| [rend](./rend/)() const | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection const. |
| [Reverse](./reverse/)() | Inverse l'ordre des éléments de la liste entière. |
| [Reverse](./reverse/)(int, int) | Inverse l'ordre des éléments de la tranche de la liste. |
| [set_Capacity](./set_capacity/)(int) | Définit la capacité de la liste. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Trie les éléments de la liste. |
| [Sort](./sort/)() | Trie les éléments de la liste en utilisant le comparateur par défaut. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Trie les éléments de la tranche de la liste. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Trie les éléments de la liste. |
| [ToArray](./toarray/)() const | Convertit la liste en tableau. |
| [TrimExcess](./trimexcess/)() | Ajuste la capacité de la liste à sa taille. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Détermine si chaque élément de la collection correspond aux conditions définies par le prédicat spécifié. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Type d'interface. |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [IEnumerablePtr](./ienumerableptr/) | Conteneur contenant des éléments du même type que nous détenons. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Type d'itérateur. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
| [ValueType](./valuetype/) | Ce type. |
| [vector_t](./vector_t/) | Informations RTTI. |
## Remarques


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Créez la première liste.
  auto list1 = MakeObject<List<int>>();

  // Remplissez la première liste.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Triez la première liste.
  // Les éléments de la première liste seront : {-5, 1, 3, 8}
  list1->Sort();

  // Supprimez l'élément à l'index 2.
  // Les éléments de la première liste seront : {-5, 1, 8}
  list1->RemoveAt(2);

  // Insérez l'élément à l'index 1.
  // Les éléments de la première liste seront : {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Créez la deuxième liste.
  auto list2 = MakeObject<List<int>>();

  // Remplissez la deuxième liste.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Ajoutez des éléments de la deuxième liste à la première.
  list1->AddRange(list2);

  // Imprimez les éléments de la première liste.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Voir aussi

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
