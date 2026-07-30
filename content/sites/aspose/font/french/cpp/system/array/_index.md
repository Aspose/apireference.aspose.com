---
title: "Classe System::Array"
linktitle: "Tableau"
second_title: "Aspose.Font pour C++"
description: "Classe System::Array. Classe qui représente une structure de données tableau. Les objets de cette classe ne doivent être alloués qu'en utilisant les fonctions System::MakeArray() et System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 200
url: /fr/cpp/system/array/
---
## Array class


Classe qui représente une structure de données tableau. Les objets de cette classe ne doivent être alloués qu'en utilisant les fonctions [System::MakeArray()](../makearray/) et [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type des éléments d'un tableau |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Non pris en charge car le tableau représenté par l'objet actuel est en lecture seule. |
| [Array](./array/)() | Construit un tableau vide. |
| [Array](./array/)(int, const T\&) | Constructeur de remplissage. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Constructeur de remplissage. |
| [Array](./array/)(int, const T) | Constructeur de remplissage. |
| [Array](./array/)(vector_t\&&) | Constructeur de déplacement. |
| [Array](./array/)(const vector_t\&) | Constructeur de copie. |
| [Array](./array/)(const std::vector\<Q\>\&) | Construit un objet [Array](./) et le remplit avec des valeurs copiées depuis un objet std::vector dont le type des valeurs est le même que **T** mais différent de **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | Construit un objet [Array](./) et le remplit avec des valeurs déplacées depuis un objet std::vector dont le type des valeurs est le même que **T** mais différent de **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Construit un objet [Array](./) et le remplit avec des valeurs provenant de la liste d'initialisation spécifiée contenant des éléments de type **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Construit un objet [Array](./) et le remplit avec des valeurs provenant du tableau spécifié contenant des éléments de type **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Construit un objet [Array](./) et le remplit avec des valeurs provenant de la liste d'initialisation spécifiée contenant des éléments de type bool. |
| [begin](./begin/)() | Renvoie un itérateur vers le premier élément du conteneur. Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](./end/). |
| [begin](./begin/)() const | Renvoie un itérateur vers le premier élément du conteneur const-qualifié. Si le conteneur est vide, l'itérateur renvoyé sera égal à [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Effectue une recherche binaire dans le tableau trié. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | NON IMPLEMENTÉ. |
| [cbegin](./cbegin/)() const | Renvoie un itérateur vers le premier élément const-qualifié du conteneur. Si le conteneur est vide, l'itérateur renvoyé sera égal à [cend()](./cend/). |
| [cend](./cend/)() const | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [Clear](./clear/)() override | Non pris en charge car le tableau représenté par l'objet actuel est en lecture seule. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Remplace **count** valeurs à partir de l'index **startIndex** dans le tableau spécifié par des valeurs par défaut. |
| [Clone](./clone/)() | Clone le tableau. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copie une plage d'éléments depuis un [System.Array](./) à partir de la source spécifiée. |
| [Contains](./contains/)(const T\&) const override | Détermine si l'élément spécifié se trouve dans le tableau. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Construit un nouvel objet [Array](./) et le remplit avec les éléments du tableau spécifié convertis en type **OutputType** à l'aide du délégué de conversion spécifié. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Construit un nouvel objet [Array](./) et le remplit avec les éléments du tableau spécifié convertis en type **OutputType** à l'aide de l'objet fonction de conversion spécifié. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Copie le nombre spécifié d'éléments du tableau source vers le tableau de destination. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Copie le nombre spécifié d'éléments de la vue du tableau source vers le tableau de destination. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Copie le nombre spécifié d'éléments du tableau source vers la vue du tableau de destination. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Copie le nombre spécifié d'éléments de la vue du tableau source vers la vue du tableau de destination. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Copie le nombre spécifié d'éléments du tableau source sur la pile vers le tableau de destination. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Copie le nombre spécifié d'éléments du tableau source vers le tableau de destination sur la pile. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Copie le nombre spécifié d'éléments du tableau source sur la pile vers le tableau de destination sur la pile. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans la vue du tableau de destination. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans la vue du tableau de destination. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments du tableau source sur la pile à partir de l'index spécifié vers la position spécifiée dans le tableau de destination. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments du tableau source sur la pile à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copie tous les éléments du tableau actuel vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Copie tous les éléments du tableau actuel vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Copie tous les éléments de la vue du tableau actuel vers la vue du tableau de destination spécifiée. Les éléments sont insérés dans la vue du tableau de destination à partir de l'index spécifié par l'argument dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Copie un nombre spécifié d'éléments du tableau actuel à partir de la position spécifiée vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Copie un nombre spécifié d'éléments du tableau actuel à partir de la position spécifiée vers la vue du tableau de destination spécifiée. Les éléments sont insérés dans la vue du tableau de destination à partir de l'index spécifié par l'argument dstIndex. |
| [Count](./count/)() const | Renvoie un nombre qui représente le nombre total de tous les éléments dans toutes les dimensions du tableau. |
| [crbegin](./crbegin/)() const | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur renvoyé est égal à [crend()](./crend/). |
| [crend](./crend/)() const | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| [data](./data/)() | Renvoie une référence à la structure de données interne utilisée pour stocker les éléments du tableau. |
| [data](./data/)() const | Renvoie une référence constante à la structure de données interne utilisée pour stocker les éléments du tableau. |
| [data_ptr](./data_ptr/)() | Renvoie un pointeur brut vers le début du tampon mémoire où les éléments du tableau sont stockés. |
| [data_ptr](./data_ptr/)() const | Renvoie un pointeur brut constant vers le début du tampon mémoire où les éléments du tableau sont stockés. |
| [end](./end/)() | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| [end](./end/)() const | Renvoie un itérateur vers l'élément suivant le dernier élément du conteneur const-qualifié. Cet élément sert de repère ; tenter d'y accéder entraîne un comportement indéfini. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Détermine si l'objet [Array](./) spécifié contient un élément qui satisfait les exigences du prédicat spécifié. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Recherche le premier élément dans le tableau spécifié qui satisfait les conditions du prédicat spécifié. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Récupère tous les éléments qui correspondent aux conditions définies par le prédicat spécifié. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Recherche le premier élément dans le tableau spécifié qui satisfait les conditions du prédicat spécifié. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Exécute l'action spécifiée sur chaque élément du tableau spécifié. |
| [get_Count](./get_count/)() const override | Renvoie la taille du tableau. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Indique si le tableau est en lecture seule. |
| [get_Length](./get_length/)() const | Renvoie un entier 32 bits qui représente le nombre total de tous les éléments dans toutes les dimensions du tableau. |
| [get_LongLength](./get_longlength/)() const | Renvoie un entier 64 bits qui représente le nombre total de tous les éléments dans toutes les dimensions du tableau. |
| [get_Rank](./get_rank/)() const | NON IMPLEMENTÉ. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un pointeur vers l'objet [Enumerator](./enumerator/) qui fournit l'interface IEnumerator aux éléments du tableau représenté par l'objet actuel. |
| [GetLength](./getlength/)(int) | Renvoie le nombre d'éléments dans la dimension spécifiée. |
| [GetLongLength](./getlonglength/)(int) | Renvoie le nombre d'éléments dans la dimension spécifiée sous forme d'entier 64 bits. |
| [GetLowerBound](./getlowerbound/)(int) const | Renvoie la borne inférieure de la dimension spécifiée. |
| [GetSizeTLength](./getsizetlength/)() const | Renvoie une variable std::size_t qui représente le nombre total de tous les éléments dans toutes les dimensions du tableau. |
| [GetUpperBound](./getupperbound/)(int) | Renvoie la borne supérieure de la dimension spécifiée. |
| [idx_get](./idx_get/)(int) const override | Renvoie l'élément à l'index spécifié. |
| [idx_set](./idx_set/)(int, T) override | Définit la valeur spécifiée comme l'élément du tableau à l'index spécifié. |
| [IndexOf](./indexof/)(const T\&) const override | Détermine l'index de la première occurrence de l'élément spécifié dans le tableau. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Détermine l'index de la première occurrence de l'élément spécifié dans le tableau. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Détermine l'index de la première occurrence de l'élément spécifié dans le tableau à partir de l'index spécifié. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Détermine l'index de la première occurrence de l'élément spécifié dans une plage d'éléments du tableau définie par l'index de départ et le nombre d'éléments dans la plage. |
| [Init](./init/)(const T) | Remplit le tableau représenté par l'objet actuel avec les valeurs du tableau spécifié. |
| [Initialize](./initialize/)() | Remplit le tableau avec les objets construits par défaut du type **T**. |
| [Insert](./insert/)(int, const T\&) override | Non pris en charge car le tableau représenté par l'objet actuel est en lecture seule. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Détermine l'index de la dernière occurrence de l'élément spécifié dans une plage d'éléments du tableau définie par l'index de départ et le nombre d'éléments dans la plage. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Détermine l'index de la dernière occurrence de l'élément spécifié dans le tableau à partir de l'index spécifié. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Détermine l'index de la dernière occurrence de l'élément spécifié dans le tableau. |
| [Max](./max/)() const | Trouve le plus grand élément du tableau en utilisant [operator<()](../operator_/) pour comparer les éléments. |
| [Min](./min/)() const | Trouve le plus petit élément du tableau en utilisant [operator<()](../operator_/) pour comparer les éléments. |
| [operator[]](./operator[]/)(int) | Renvoie un élément à l'index spécifié. |
| [operator[]](./operator[]/)(int) const | Renvoie un élément à l'index spécifié. |
| [rbegin](./rbegin/)() | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur retourné est égal à [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Renvoie un itérateur inverse vers le premier élément du conteneur inversé. Il correspond au dernier élément du conteneur non inversé. Si le conteneur est vide, l'itérateur retourné est égal à [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Non pris en charge car le tableau représenté par l'objet actuel est en lecture seule. |
| [RemoveAt](./removeat/)(int) override | Non pris en charge car le tableau représenté par l'objet actuel est en lecture seule. |
| [rend](./rend/)() | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| [rend](./rend/)() const | Renvoie un itérateur inverse vers l'élément suivant le dernier élément du conteneur inversé. Il correspond à l'élément précédant le premier élément du conteneur non inversé. Cet élément sert de repère, tenter d'y accéder entraîne un comportement indéfini. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Modifie la taille du tableau spécifié à la valeur spécifiée ou crée un nouveau tableau avec la taille spécifiée. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Inverse les éléments du tableau spécifié. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Inverse une plage d'éléments dans le tableau spécifié. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Fait que le tableau traite les pointeurs stockés comme faibles (le cas échéant). |
| [SetValue](./setvalue/)(const T\&, int) | Définit la valeur de l'élément à l'index spécifié. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Trie les éléments du tableau spécifié en utilisant le comparateur par défaut. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Trie une plage d'éléments du tableau spécifié en utilisant le comparateur par défaut. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Trie les éléments du tableau spécifié en utilisant le comparateur spécifié. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | NON IMPLEMENTÉ. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Trie deux tableaux, l'un contenant les clés et l'autre les éléments correspondants, en fonction des valeurs du tableau contenant les clés, dont les éléments sont comparés à l'aide de l'opérateur <. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Trie deux tableaux, l'un contenant les clés et l'autre les éléments correspondants, en fonction des valeurs du tableau contenant les clés, dont les éléments sont comparés à l'aide du comparateur par défaut. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Détermine si tous les éléments du tableau spécifié satisfont les conditions définies par le prédicat spécifié. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [EnumerablePtr](./enumerableptr/) | Un alias pour le type de pointeur partagé pointant vers un objet IEnumerable contenant des éléments de type **T**. |
| [EnumeratorPtr](./enumeratorptr/) | Un alias pour le type de pointeur partagé pointant vers un objet IEnumerator contenant des éléments de type **T**. |
| [iterator](./iterator/) | Type d'itérateur. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
| [UnderlyingType](./underlyingtype/) | Alias pour le type utilisé pour représenter chaque élément du tableau. |
| [ValueType](./valuetype/) | Alias pour le type des éléments du tableau. |
## Remarques



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crée et remplit le tableau.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Affiche les éléments du tableau.
  Print(arrayPtr);

  // Trie les éléments du tableau par ordre croissant.
  Array<int32_t>::Sort(arrayPtr);

  // Affiche les éléments du tableau.
  Print(arrayPtr);

  // Affiche le nombre d'éléments du tableau.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Affiche l'index de l'élément qui vaut 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Redimensionne le tableau.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Affiche les éléments du tableau.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## Voir aussi

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
