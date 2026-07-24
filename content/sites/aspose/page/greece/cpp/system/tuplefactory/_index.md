---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Page για C++"
description: "System::TupleFactory class. Παρέχει στατικές μεθόδους για τη δημιουργία αντικειμένων tuple σε C++."
type: docs
weight: 6500
url: /el/cpp/system/tuplefactory/
---
## TupleFactory class


Παρέχει στατικές μεθόδους για τη δημιουργία αντικειμένων πλειάδας.

```cpp
class TupleFactory
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)(Args...) | Δημιουργεί ένα νέο αντικείμενο tuple. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Δημιουργεί ένα νέο 8-tuple. Το 8ο στοιχείο αποθηκεύεται μέσα στο [Tuple](../tuple/). |
## Παρατηρήσεις



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::TupleFactory::Create(256, 16, 64);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 256
Item 2: 16
Item 3: 64
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
