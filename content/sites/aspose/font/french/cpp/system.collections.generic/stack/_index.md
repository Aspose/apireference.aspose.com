---
title: "Classe System::Collections::Generic::Stack"
linktitle: "Pile"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::Stack. Déclaration anticipée de la classe Stack en C++."
type: docs
weight: 4600
url: /fr/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Place des éléments dans la pile. |
| virtual [Clear](./clear/)() | Supprime tous les éléments de la pile. |
| virtual [Contains](./contains/)(const T\&) const | Vérifie si un élément spécifique est présent dans le conteneur ; utilise l'opérateur == pour la comparaison. |
| [data](./data/)() | Accesseur de la structure de données interne. |
| [data](./data/)() const | Accesseur de la structure de données interne. |
| virtual [get_Count](./get_count/)() const | Obtient le nombre d'éléments dans la pile. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir la pile actuelle. |
| [Peek](./peek/)() | Obtient l'élément du sommet de la pile, mais le conserve dans la pile. |
| [Pop](./pop/)() | Obtient l'élément du sommet de la pile. |
| [Push](./push/)(const T\&) | Place l'élément du sommet de la pile. |
| [Stack](./stack/)() | Construit une pile vide. |
| [Stack](./stack/)(int) | Construit une pile vide. |
| [Stack](./stack/)(IEnumerablePtr) | Constructeur de copie. |
| virtual [ToArray](./toarray/)() | Convertit la pile en tableau. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Collection contenant des éléments du même type. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [stack_t](./stack_t/) | Informations RTTI. |
| [ValueType](./valuetype/) | Type valeur. |
## Remarques


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Crée l'instance de la classe Stack.
  auto stack = MakeObject<Stack<int>>();

  // Remplit la pile.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Affiche le dernier élément de la pile. La méthode Peek ne supprime pas d'élément de la pile.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Affiche le dernier élément de la pile. La méthode Pop supprime un élément de la pile.
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## Voir aussi

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
