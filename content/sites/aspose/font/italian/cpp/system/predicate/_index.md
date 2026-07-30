---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font per C++"
description: "System::Predicate typedef. Rappresenta un puntatore a un predicato - un'entità invocabile che accetta un singolo argomento e restituisce un valore bool in C++."
type: docs
weight: 12600
url: /it/cpp/system/predicate/
---
## Predicate typedef


Rappresenta un puntatore a un predicato - un'entità invocabile che accetta un singolo argomento e restituisce un valore bool.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Osservazioni



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Riempire l'array.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Crea il predicato che restituisce un elemento dell'array maggiore di 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Trova il primo elemento dell'array usando il predicato creato e stampalo.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
