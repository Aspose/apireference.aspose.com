---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Page para C++"
description: "System::Predicate typedef. Representa un puntero a un predicado - una entidad invocable que acepta un único argumento y devuelve un valor bool en C++."
type: docs
weight: 12500
url: /es/cpp/system/predicate/
---
## Predicate typedef


Representa un puntero a un predicado: una entidad invocable que acepta un único argumento y devuelve un valor booleano.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Observaciones



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Rellena el array.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Crea el predicado que devuelve un elemento del arreglo que es mayor que 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Encuentra el primer elemento del arreglo usando el predicado creado y imprímelo.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
