---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Font لـ C++"
description: "System::TupleFactory class. يوفر طرقًا ثابتة لإنشاء كائنات tuple في C++."
type: docs
weight: 6500
url: /ar/cpp/system/tuplefactory/
---
## TupleFactory class


يوفر طرقاً ثابتة لإنشاء كائنات tuple.

```cpp
class TupleFactory
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)(Args...) | ينشئ كائن tuple جديد. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | ينشئ 8‑tuple جديد. العنصر الثامن يُخزن داخل [Tuple](../tuple/). |
## ملاحظات



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

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
