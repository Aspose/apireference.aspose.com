---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font için C++"
description: "System::Predicate typedef. C++'ta tek bir argüman kabul eden ve bool değer döndüren bir çağrılabilir varlık olan bir predicate - bir işaretçiyi temsil eder."
type: docs
weight: 12600
url: /tr/cpp/system/predicate/
---
## Predicate typedef


Bir koşula işaret eden göstericiyi temsil eder - tek bir argüman kabul eden ve bir bool değeri döndüren çağrılabilir bir varlık.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Açıklamalar



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Diziyi doldur.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // 3'ten büyük bir dizi öğesi döndüren predicate'i oluştur.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Oluşturulan predicate'i kullanarak dizinin ilk öğesini bulun ve yazdır.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
