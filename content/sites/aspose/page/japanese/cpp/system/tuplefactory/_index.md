---
title: "System::TupleFactory クラス"
linktitle: "TupleFactory"
second_title: "C++ 用 Aspose.Page"
description: "System::TupleFactory クラス。C++ でタプルオブジェクトを作成するための静的メソッドを提供します。"
type: docs
weight: 6500
url: /ja/cpp/system/tuplefactory/
---
## TupleFactory class


タプルオブジェクトを作成するための静的メソッドを提供します。

```cpp
class TupleFactory
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)(Args...) | 新しいタプルオブジェクトを作成します。 |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | 新しい 8 タプルを作成します。8 番目の要素は [Tuple](../tuple/) に格納されます。 |
## 備考



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

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
