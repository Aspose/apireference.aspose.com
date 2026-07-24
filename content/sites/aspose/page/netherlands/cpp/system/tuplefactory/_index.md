---
title: "System::TupleFactory klasse"
linktitle: "TupleFactory"
second_title: "Aspose.Page voor C++"
description: "System::TupleFactory klasse. Biedt statische methoden voor het maken van tuple-objecten in C++."
type: docs
weight: 6500
url: /nl/cpp/system/tuplefactory/
---
## TupleFactory class


Biedt statische methoden voor het maken van tuple‑objecten.

```cpp
class TupleFactory
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)(Args...) | Maakt een nieuw tuple-object. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Maakt een nieuwe 8-tuple. Het 8e element wordt opgeslagen in [Tuple](../tuple/). |
## Opmerkingen



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

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
