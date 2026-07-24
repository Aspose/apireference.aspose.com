---
title: "System::Collections::Generic::Queue class"
linktitle: "Queue"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::Queue class. Δήλωση προώθησης της κλάσης Queue σε C++."
type: docs
weight: 3600
url: /el/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Clear](./clear/)() | Διαγράφει όλα τα στοιχεία στην ουρά. |
| virtual [Contains](./contains/)(const T\&) const | Ελέγχει αν η ουρά περιέχει συγκεκριμένο στοιχείο χρησιμοποιώντας τον τελεστή == για τη σύγκριση των στοιχείων. |
| [data](./data/)() | Πρόσβαση στη βασική δομή δεδομένων. |
| [data](./data/)() const | Πρόσβαση στη βασική δομή δεδομένων. |
| [Dequeue](./dequeue/)() | Αποκτά το στοιχείο από την αρχή της ουράς. |
| [Enqueue](./enqueue/)(const T\&) | Τοποθετεί το στοιχείο στο τέλος της ουράς. |
| virtual [get_Count](./get_count/)() const | Αποκτά τον αριθμό των στοιχείων στην ουρά. |
| [GetEnumerator](./getenumerator/)() override | Αποκτά τον απαριθμητή για επανάληψη μέσω της ουράς. |
| [Peek](./peek/)() | Αποκτά το στοιχείο από την αρχή της ουράς, αλλά δεν το αφαιρεί από την ουρά. |
| [Queue](./queue/)() | Δημιουργεί κενή ουρά. |
| [Queue](./queue/)(int) | Δημιουργεί κενή ουρά. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Κατασκευαστής αντιγραφής. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Κοντέινερ στοιχείων του ίδιου τύπου. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) τύπος. |
| [queue_t](./queue_t/) | Πληροφορίες RTTI. |
| [ValueType](./valuetype/) | Αυτός ο τύπος. |
## Παρατηρήσεις


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
  // Δημιουργήστε το αντίγραφο της κλάσης Queue-class.
  auto queue = MakeObject<Queue<int>>();

  // Γεμίστε την ουρά.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // Εκτυπώστε το πρώτο στοιχείο της ουράς. Η μέθοδος Peek δεν αφαιρεί στοιχείο από την ουρά.
  std::cout << queue->Peek() << std::endl;
  // Εκτυπώστε τα στοιχεία της ουράς.
  PrintItems(queue);

  // Εκτυπώστε το πρώτο στοιχείο της ουράς. Η μέθοδος Dequeue αφαιρεί στοιχείο από την ουρά.
  std::cout << queue->Dequeue() << std::endl;
  // Εκτυπώστε τα στοιχεία της ουράς.
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

## Δείτε επίσης

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
