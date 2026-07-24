---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Page για C++"
description: "System::Predicate typedef. Αντιπροσωπεύει έναν δείκτη σε ένα predicate - μια εκτελέσιμη οντότητα που δέχεται ένα μοναδικό όρισμα και επιστρέφει μια τιμή bool στην C++."
type: docs
weight: 12500
url: /el/cpp/system/predicate/
---
## Predicate typedef


Αντιπροσωπεύει έναν δείκτη σε ένα predicate - μια εκτελέσιμη οντότητα που δέχεται ένα μοναδικό όρισμα και επιστρέφει τιμή bool.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Παρατηρήσεις



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Συμπληρώστε τον πίνακα.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Δημιουργήστε το predicate που επιστρέφει ένα στοιχείο του πίνακα που είναι μεγαλύτερο από 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Βρείτε το πρώτο στοιχείο του πίνακα χρησιμοποιώντας το δημιουργημένο predicate και εκτυπώστε το.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
