---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font für C++"
description: "System::Predicate typedef. Stellt einen Zeiger auf ein Prädikat dar - ein aufrufbares Objekt, das ein einzelnes Argument akzeptiert und in C++ einen booleschen Wert zurückgibt."
type: docs
weight: 12600
url: /de/cpp/system/predicate/
---
## Predicate typedef


Stellt einen Zeiger auf ein Prädikat dar – ein aufrufbares Objekt, das ein einzelnes Argument akzeptiert und einen bool‑Wert zurückgibt.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Hinweise



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Fülle das Array.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Erstelle das Prädikat, das ein Array-Element zurückgibt, das größer als 3 ist.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Finde das erste Element des Arrays mithilfe des erstellten Prädikats und gib es aus.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
