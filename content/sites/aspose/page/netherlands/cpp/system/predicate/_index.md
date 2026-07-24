---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Page voor C++"
description: "System::Predicate typedef. Vertegenwoordigt een pointer naar een predicate - een aanroepbaar entiteit die één argument accepteert en een bool‑waarde retourneert in C++."
type: docs
weight: 12500
url: /nl/cpp/system/predicate/
---
## Predicate typedef


Stelt een pointer naar een predicaat voor - een aanroepbaar entiteit die één argument accepteert en een bool-waarde retourneert.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Opmerkingen



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Vul de array.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Maak de predicate die een array‑element retourneert dat groter is dan 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Vind het eerste element van de array met behulp van de gemaakte predicate en druk het af.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
