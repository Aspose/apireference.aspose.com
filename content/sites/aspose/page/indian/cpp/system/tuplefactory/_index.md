---
title: "System::TupleFactory class"
linktitle: "TupleFactory"
second_title: "Aspose.Page C++ के लिए"
description: "System::TupleFactory class. C++ में ट्यूपल ऑब्जेक्ट बनाने के लिए स्थैतिक मेथड प्रदान करता है।"
type: docs
weight: 6500
url: /hi/cpp/system/tuplefactory/
---
## TupleFactory class


ट्यूपल वस्तुओं को बनाने के लिए स्थैतिक मेथड प्रदान करता है।

```cpp
class TupleFactory
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)(Args...) | एक नया ट्यूपल ऑब्जेक्ट बनाता है। |
| static [Create](./create/)(T1, T2, T3, T4, T5, T6, T7, TRest) | एक नया 8-ट्यूपल बनाता है। 8वाँ तत्व [Tuple](../tuple/) के भीतर संग्रहीत किया जाता है। |
## टिप्पणियाँ



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

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
