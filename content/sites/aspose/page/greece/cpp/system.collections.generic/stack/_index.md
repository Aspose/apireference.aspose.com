---
title: "Κλάση System::Collections::Generic::Stack"
linktitle: "Στοίβα"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Collections::Generic::Stack. Προκαταρκτική δήλωση κλάσης Stack σε C++."
type: docs
weight: 4600
url: /el/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | Τοποθετεί στοιχεία στη στοίβα. |
| virtual [Clear](./clear/)() | Διαγράφει όλα τα στοιχεία από τη στοίβα. |
| virtual [Contains](./contains/)(const T\&) const | Ελέγχει αν ένα συγκεκριμένο στοιχείο υπάρχει στο δοχείο· χρησιμοποιεί τον τελεστή == για σύγκριση. |
| [data](./data/)() | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| [data](./data/)() const | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| virtual [get_Count](./get_count/)() const | Λαμβάνει τον αριθμό των στοιχείων στη στοίβα. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή για επανάληψη μέσω της τρέχουσας στοίβας. |
| [Peek](./peek/)() | Λαμβάνει το στοιείο από την κορυφή της στοίβας, αλλά το διατηρεί στη στοίβα. |
| [Pop](./pop/)() | Λαμβάνει το στοιχείο από την κορυφή της στοίβας. |
| [Push](./push/)(const T\&) | Τοποθετεί το στοιχείο στην κορυφή της στοίβας. |
| [Stack](./stack/)() | Δημιουργεί κενή στοίβα. |
| [Stack](./stack/)(int) | Δημιουργεί κενή στοίβα. |
| [Stack](./stack/)(IEnumerablePtr) | Κατασκευαστής αντιγραφής. |
| virtual [ToArray](./toarray/)() | Μετατρέπει τη στοίβα σε πίνακα. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Συλλογή που περιέχει στοιχεία του ίδιου τύπου. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) τύπος. |
| [stack_t](./stack_t/) | Πληροφορίες RTTI. |
| [ValueType](./valuetype/) | Τύπος τιμής. |
## Παρατηρήσεις


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
  // Δημιουργήστε το αντικείμενο της κλάσης Stack.
  auto stack = MakeObject<Stack<int>>();

  // Γεμίστε τη στοίβα.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // Εκτυπώστε το τελευταίο στοιχείο της στοίβας. Η μέθοδος Peek δεν αφαιρεί στοιχείο από τη στοίβα.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // Εκτυπώστε το τελευταίο στοιχείο της στοίβας. Η μέθοδος Pop αφαιρεί ένα στοιχείο από τη στοίβα.
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

## Δείτε επίσης

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
