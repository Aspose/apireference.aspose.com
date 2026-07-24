---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "C++용 Aspose.Page"
description: "System::TupleFactory class. C++에서 튜플 객체를 생성하기 위한 정적 메서드를 제공합니다."
type: docs
weight: 6500
url: /ko/cpp/system/tuplefactory/
---
## TupleFactory class


튜플 객체를 생성하기 위한 정적 메서드를 제공합니다.

```cpp
class TupleFactory
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)(Args...) | 새로운 튜플 객체를 생성합니다. |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | 새로운 8-튜플을 생성합니다. 8번째 요소는 [Tuple](../tuple/) 내부에 저장됩니다. |
## 비고



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

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
