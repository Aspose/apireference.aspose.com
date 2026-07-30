---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font pour C++"
description: "System::Predicate typedef. Représente un pointeur vers un prédicat - une entité invoquable qui accepte un seul argument et renvoie une valeur booléenne en C++."
type: docs
weight: 12600
url: /fr/cpp/system/predicate/
---
## Predicate typedef


Représente un pointeur vers un prédicat - une entité invoquable qui accepte un seul argument et renvoie une valeur booléenne.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Remarques



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Remplissez le tableau.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Créez le prédicat qui renvoie un élément du tableau supérieur à 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Trouvez le premier élément du tableau en utilisant le prédicat créé et affichez-le.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
