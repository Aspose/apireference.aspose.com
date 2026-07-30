---
title: "System::Collections::Generic::LinkedList classe"
linktitle: "LinkedList"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::LinkedList classe. Déclaration anticipée de LinkedList en C++."
type: docs
weight: 3100
url: /fr/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Paramètre | Description |
| --- | --- |
| T | Type de valeur contenu. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const T\&) override | Ajoute **element** à la fin de la liste. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Ajoute **element** après **node** de la liste. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Ajoute **newNode** après **node** de la liste. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Ajoute **element** avant **node** de la liste. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Ajoute **newNode** avant **node** de la liste. |
| [AddFirst](./addfirst/)(const T\&) | Ajoute **element** au début de la liste. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Ajoute **newNode** au début de la liste. |
| [AddLast](./addlast/)(const T\&) | Ajoute **element** à la fin de la liste. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Ajoute **newNode** à la fin de la liste. |
| [begin](./begin/)() | Obtient l'itérateur du premier élément de la collection. |
| [begin](./begin/)() const | Obtient un itérateur vers le premier élément de la collection qualifiée const. |
| [cbegin](./cbegin/)() const | Obtient un itérateur vers le premier élément qualifié const de la collection. |
| [cend](./cend/)() const | Obtient un itérateur pour un élément const-qualifié inexistant situé après la fin de la collection. |
| [Clear](./clear/)() override | Supprime tous les éléments de la liste. |
| [Contains](./contains/)(const T\&) const override | Vérifie si **element** est présent dans la liste. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copie les données du conteneur dans les éléments de tableau existants. |
| [crbegin](./crbegin/)() const | Obtient un itérateur inverse vers le dernier élément const de la collection (premier en sens inverse). |
| [crend](./crend/)() const | Obtient un itérateur inverse pour un élément const inexistant avant le début de la collection. |
| [end](./end/)() | Obtient un itérateur pour un élément inexistant situé après la fin de la collection. |
| [end](./end/)() const | Obtient un itérateur pour un élément inexistant situé après la fin de la collection const-qualifiée. |
| [Find](./find/)(const T\&) const | Effectue une recherche en avant d’un **element** dans la liste. |
| [FindLast](./findlast/)(const T\&) const | Effectue une recherche en sens inverse d’un **element** dans la liste. |
| [get_Count](./get_count/)() const override | Obtient le nombre d’éléments dans la liste. |
| [get_First](./get_first/)() const | Obtient le pointeur vers le premier élément de la liste. |
| [get_Last](./get_last/)() const | Obtient le pointeur vers le dernier élément de la liste. |
| [GetEnumerator](./getenumerator/)() override | Obtient l’énumérateur pour parcourir la [LinkedList](./) actuelle. |
| [LinkedList](./linkedlist/)() | Crée une [LinkedList](./) vide. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Constructeur de copie. |
| [rbegin](./rbegin/)() | Obtient un itérateur inverse vers le dernier élément de la collection (premier en sens inverse). |
| [rbegin](./rbegin/)() const | Obtient un itérateur inverse vers le dernier élément de la collection const (premier en sens inverse). |
| [Remove](./remove/)(const T\&) override | Supprime la première occurrence de **element** spécifié de la liste. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Supprime le nœud de la liste. |
| [RemoveFirst](./removefirst/)() | Supprime le premier nœud de la liste. |
| [RemoveLast](./removelast/)() | Supprime le dernier nœud de la liste. |
| [rend](./rend/)() | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection. |
| [rend](./rend/)() const | Obtient un itérateur inverse pour un élément inexistant avant le début de la collection const. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Type d'itérateur inverse const. |
| [iterator](./iterator/) | Type d'itérateur. |
| [list_t](./list_t/) | Type de données sous-jacent. |
| [reverse_iterator](./reverse_iterator/) | Type d'itérateur inverse. |
## Remarques


Conteneur de liste chaînée. Implémente un wrapper sur std::list. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Créez une instance de la classe LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // Remplissez la liste chaînée.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Affichez les éléments de la liste chaînée.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Voir aussi

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
