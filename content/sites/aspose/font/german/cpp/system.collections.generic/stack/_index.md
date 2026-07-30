---
title: "System::Collections::Generic::Stack Klasse"
linktitle: "Stack"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::Stack Klasse. Vorwärtsdeklaration der Stack-Klasse in C++."
type: docs
weight: 4600
url: /de/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Fügt Elemente in den Stack ein. |
| virtual [Clear](./clear/)() | Löscht alle Elemente aus dem Stack. |
| virtual [Contains](./contains/)(const T\&) const | Prüft, ob ein bestimmtes Element im Container vorhanden ist; verwendet den Operator == zum Vergleich. |
| [data](./data/)() | Interner Zugriff auf die Datenstruktur. |
| [data](./data/)() const | Interner Zugriff auf die Datenstruktur. |
| virtual [get_Count](./get_count/)() const | Ermittelt die Anzahl der Elemente im Stack. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, um durch den aktuellen Stack zu iterieren. |
| [Peek](./peek/)() | Liefert das Element vom oberen Ende des Stacks, lässt es aber im Stack. |
| [Pop](./pop/)() | Liefert das Element vom oberen Ende des Stacks. |
| [Push](./push/)(const T\&) | Legt das Element am oberen Ende des Stacks ab. |
| [Stack](./stack/)() | Erstellt einen leeren Stack. |
| [Stack](./stack/)(int) | Erstellt einen leeren Stack. |
| [Stack](./stack/)(IEnumerablePtr) | Kopierkonstruktor. |
| virtual [ToArray](./toarray/)() | Konvertiert den Stack in ein Array. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Sammlung, die Elemente desselben Typs enthält. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [stack_t](./stack_t/) | RTTI-Informationen. |
| [ValueType](./valuetype/) | Werttyp. |
## Hinweise


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
  // Erstelle die Instanz der Stack-Klasse.
  auto stack = MakeObject<Stack<int>>();

  // Fülle den Stack.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Gib das letzte Element des Stacks aus. Die Peek-Methode entfernt kein Element aus dem Stack.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Gib das letzte Element des Stacks aus. Die Pop-Methode entfernt ein Element aus dem Stack.
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

## Siehe auch

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
