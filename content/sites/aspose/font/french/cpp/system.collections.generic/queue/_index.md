---
title: "System::Collections::Generic::Queue classe"
linktitle: "Queue"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::Queue classe. Déclaration anticipée de la classe Queue en C++."
type: docs
weight: 3600
url: /fr/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clear](./clear/)() | Supprime tous les éléments de la queue. |
| virtual [Contains](./contains/)(const T\&) const | Vérifie si la queue contient un élément spécifique en utilisant l'opérateur == pour comparer les éléments. |
| [data](./data/)() | Accesseur de la structure de données sous-jacente. |
| [data](./data/)() const | Accesseur de la structure de données sous-jacente. |
| [Dequeue](./dequeue/)() | Obtient l'élément du début de la queue. |
| [Enqueue](./enqueue/)(const T\&) | Place l'élément à la fin de la queue. |
| virtual [get_Count](./get_count/)() const | Obtient le nombre d'éléments dans la queue. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir la queue. |
| [Peek](./peek/)() | Obtient l'élément du début de la queue, mais ne le supprime pas de la queue. |
| [Queue](./queue/)() | Construit une queue vide. |
| [Queue](./queue/)(int) | Construit une queue vide. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Constructeur de copie. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Conteneur d'éléments du même type. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [queue_t](./queue_t/) | Informations RTTI. |
| [ValueType](./valuetype/) | Ce type. |
## Remarques


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Créez l'instance de la classe Queue.
  auto queue = MakeObject<Queue<int>>();

  // Remplissez la queue.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Affichez le premier élément de la queue. La méthode Peek ne supprime pas d'élément de la queue.
  std::cout << queue->Peek() << std::endl;
  // Affichez les éléments de la queue.
  PrintItems(queue);

  // Affichez le premier élément de la queue. La méthode Dequeue supprime un élément de la queue.
  std::cout << queue->Dequeue() << std::endl;
  // Affichez les éléments de la queue.
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## Voir aussi

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
