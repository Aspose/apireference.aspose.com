---
title: "System::Collections::Generic::Stack klasse"
linktitle: "Stack"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::Stack klasse. Voorwaartse declaratie van de Stack-klasse in C++."
type: docs
weight: 4600
url: /nl/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Voegt elementen toe aan de stack. |
| virtual [Clear](./clear/)() | Verwijdert alle elementen uit de stack. |
| virtual [Contains](./contains/)(const T\&) const | Controleert of een specifiek item aanwezig is in de container; gebruikt operator == voor vergelijking. |
| [data](./data/)() | Interne gegevensstructuur-toegangsfunctie. |
| [data](./data/)() const | Interne gegevensstructuur-toegangsfunctie. |
| virtual [get_Count](./get_count/)() const | Haalt het aantal elementen in de stack op. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door de huidige stack te itereren. |
| [Peek](./peek/)() | Haalt element van de bovenkant van de stack, maar behoudt het in de stack. |
| [Pop](./pop/)() | Haalt element van de bovenkant van de stack. |
| [Push](./push/)(const T\&) | Plaatst element op de bovenkant van de stack. |
| [Stack](./stack/)() | Construeert een lege stack. |
| [Stack](./stack/)(int) | Construeert een lege stack. |
| [Stack](./stack/)(IEnumerablePtr) | Copy-constructor. |
| virtual [ToArray](./toarray/)() | Converteert de stack naar een array. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Collectie die elementen van hetzelfde type bevat. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [stack_t](./stack_t/) | RTTI-informatie. |
| [ValueType](./valuetype/) | Waarde‑type. |
## Opmerkingen


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
  // Maak een instantie van de Stack-klasse.
  auto stack = MakeObject<Stack<int>>();

  // Vul de stack.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Print het laatste item van de stack. De Peek-methode verwijdert geen item uit de stack.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Print het laatste item van de stack. De Pop-methode verwijdert een item uit de stack.
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

## Zie ook

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
