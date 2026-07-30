---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Font für C++"
description: "System::TupleFactory class. Stellt statische Methoden zum Erzeugen von Tupel‑Objekten in C++ bereit."
type: docs
weight: 6500
url: /de/cpp/system/tuplefactory/
---
## TupleFactory class


Stellt statische Methoden zum Erzeugen von Tupel‑Objekten bereit.

```cpp
class TupleFactory
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)(Args...) | Erstellt ein neues Tupel‑Objekt. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Erstellt ein neues 8‑Tupel. Das 8. Element wird in [Tuple](../tuple/) gespeichert. |
## Hinweise



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

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
