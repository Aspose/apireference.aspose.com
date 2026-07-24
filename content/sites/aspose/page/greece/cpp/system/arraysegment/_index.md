---
title: "Κλάση System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Page για C++"
description: "Κλάση System::ArraySegment. Αντιπροσωπεύει ένα τμήμα του μονοδιάστατου πίνακα. Αυτός ο τύπος πρέπει να εκχωρείται στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 300
url: /el/cpp/system/arraysegment/
---
## ArraySegment class


Αντιπροσωπεύει ένα τμήμα του μονοδιάστατου πίνακα. Αυτός ο τύπος πρέπει να εκχωρείται στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Ο τύπος των στοιχείων του τμήματος του πίνακα. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Αναλογία της μεθόδου C# [Object.GetHashCode()](../object/gethashcode/). Ενεργοποιεί τη δημιουργία κατακερματισμού προσαρμοσμένων αντικειμένων. |
## Παρατηρήσεις



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Δημιουργήστε και γεμίστε τον πίνακα.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Δημιουργήστε το τμήμα του πίνακα που περιέχει ολόκληρο τον πίνακα.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Εκτυπώστε τα στοιχεία του τμήματος του πίνακα.
  Print(fullArray);

  // Δημιουργήστε το τμήμα του πίνακα.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Εκτυπώστε τα στοιχεία του τμήματος του πίνακα.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
