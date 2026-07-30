---
title: "System::TupleFactory classe"
linktitle: "TupleFactory"
second_title: "Aspose.Font pour C++"
description: "System::TupleFactory classe. Fournit des méthodes statiques pour créer des objets tuple en C++."
type: docs
weight: 6500
url: /fr/cpp/system/tuplefactory/
---
## TupleFactory class


Fournit des méthodes statiques pour créer des objets tuple.

```cpp
class TupleFactory
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)(Args...) | Crée un nouvel objet tuple. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Crée un nouveau 8‑tuple. Le 8ᵉ élément est stocké dans [Tuple](../tuple/). |
## Remarques



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

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
