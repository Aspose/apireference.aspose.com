---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Font 适用于 C++"
description: "System::TupleFactory class. 提供用于在 C++ 中创建元组对象的静态方法。"
type: docs
weight: 6500
url: /zh/cpp/system/tuplefactory/
---
## TupleFactory class


提供用于创建元组对象的静态方法。

```cpp
class TupleFactory
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Create](./create/)(Args...) | 创建一个新的元组对象。 |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | 创建一个新的 8 元组。第 8 个元素存储在 [Tuple](../tuple/) 中。 |
## 备注



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

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
