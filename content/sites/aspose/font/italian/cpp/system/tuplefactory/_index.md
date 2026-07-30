---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Font per C++"
description: "System::TupleFactory class. Fornisce metodi statici per creare oggetti tupla in C++."
type: docs
weight: 6500
url: /it/cpp/system/tuplefactory/
---
## TupleFactory class


Fornisce metodi statici per creare oggetti tuple.

```cpp
class TupleFactory
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)(Args...) | Crea un nuovo oggetto tupla. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Crea una nuova 8-tupla. L'ottavo elemento è memorizzato all'interno di [Tuple](../tuple/). |
## Osservazioni



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

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
