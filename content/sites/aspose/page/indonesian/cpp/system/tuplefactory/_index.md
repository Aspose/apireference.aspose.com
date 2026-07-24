---
title: "Kelas System::TupleFactory"
linktitle: "TupleFactory"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::TupleFactory. Menyediakan metode statis untuk membuat objek tuple dalam C++."
type: docs
weight: 6500
url: /id/cpp/system/tuplefactory/
---
## TupleFactory class


Menyediakan metode statis untuk membuat objek tuple.

```cpp
class TupleFactory
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)(Args...) | Membuat objek tuple baru. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Membuat 8-tuple baru. Elemen ke-8 disimpan di dalam [Tuple](../tuple/). |
## Catatan



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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
