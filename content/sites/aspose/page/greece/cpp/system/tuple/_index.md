---
title: "System::Tuple κλάση"
linktitle: "Tuple"
second_title: "Aspose.Page για C++"
description: "System::Tuple κλάση. Κλάση που αντιπροσωπεύει μια δομή δεδομένων πλειάδας. Ο μέγιστος αριθμός στοιχείων είναι 8 σε C++."
type: docs
weight: 6400
url: /el/cpp/system/tuple/
---
## Tuple class


Κλάση που αντιπροσωπεύει μια δομή δεδομένων πλειάδας. Ο μέγιστος αριθμός στοιχείων είναι 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parameter | Περιγραφή |
| --- | --- |
| Παράμετροι | Οι τύποι των στοιχείων της πλειάδας. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Καθορίζει εάν το τρέχον και το καθορισμένο αντικείμενο είναι πανομοιότυπα. |
| [get_Item](./get_item/)() const | Λαμβάνει την τιμή του στοιχείου του αντικειμένου [Tuple](./). |
| [Tuple](./tuple/)(Args...) | Δημιουργεί ένα αντικείμενο πλειάδας. |
## Παρατηρήσεις



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## Δείτε επίσης

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
