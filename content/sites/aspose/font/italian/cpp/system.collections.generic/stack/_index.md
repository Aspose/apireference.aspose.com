---
title: "System::Collections::Generic::Stack class"
linktitle: "Stack"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::Stack class. Dichiarazione in avanti della classe Stack in C++."
type: docs
weight: 4600
url: /it/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Inserisce gli elementi nello stack. |
| virtual [Clear](./clear/)() | Elimina tutti gli elementi dallo stack. |
| virtual [Contains](./contains/)(const T\&) const | Verifica se un elemento specifico è presente nel contenitore; utilizza l'operatore == per il confronto. |
| [data](./data/)() | Accessor interno alla struttura dati. |
| [data](./data/)() const | Accessor interno alla struttura dati. |
| virtual [get_Count](./get_count/)() const | Ottiene il numero di elementi nello stack. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso lo stack corrente. |
| [Peek](./peek/)() | Ottiene l'elemento dalla cima dello stack, ma lo mantiene nello stack. |
| [Pop](./pop/)() | Ottiene l'elemento dalla cima dello stack. |
| [Push](./push/)(const T\&) | Inserisce l'elemento nella cima dello stack. |
| [Stack](./stack/)() | Costruisce uno stack vuoto. |
| [Stack](./stack/)(int) | Costruisce uno stack vuoto. |
| [Stack](./stack/)(IEnumerablePtr) | Costruttore di copia. |
| virtual [ToArray](./toarray/)() | Converte lo stack in un array. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Collezione contenente elementi dello stesso tipo. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [stack_t](./stack_t/) | Informazioni RTTI. |
| [ValueType](./valuetype/) | Tipo valore. |
## Osservazioni


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
  // Crea l'istanza della classe Stack.
  auto stack = MakeObject<Stack<int>>();

  // Riempie lo stack.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Stampa l'ultimo elemento dello stack. Il metodo Peek non rimuove alcun elemento dallo stack.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Stampa l'ultimo elemento dello stack. Il metodo Pop rimuove un elemento dallo stack.
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

## Vedi anche

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
