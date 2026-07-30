---
title: "System::TupleFactory sınıfı"
linktitle: "TupleFactory"
second_title: "Aspose.Font için C++"
description: "System::TupleFactory sınıfı. C++'ta tuple nesneleri oluşturmak için statik yöntemler sağlar."
type: docs
weight: 6500
url: /tr/cpp/system/tuplefactory/
---
## TupleFactory class


Demet nesneleri oluşturmak için statik yöntemler sağlar.

```cpp
class TupleFactory
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)(Args...) | Yeni bir tuple nesnesi oluşturur. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | Yeni bir 8-tuple oluşturur. 8. öğe [Tuple](../tuple/) içinde depolanır. |
## Açıklamalar



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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
