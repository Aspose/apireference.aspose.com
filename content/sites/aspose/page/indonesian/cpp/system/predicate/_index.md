---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Page untuk C++"
description: "System::Predicate typedef. Mewakili pointer ke sebuah predicate - entitas yang dapat dipanggil yang menerima satu argumen dan mengembalikan nilai bool dalam C++."
type: docs
weight: 12500
url: /id/cpp/system/predicate/
---
## Predicate typedef


Mewakili sebuah pointer ke predikat - entitas yang dapat dipanggil yang menerima satu argumen dan mengembalikan nilai boolean.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## Catatan



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // Isi array.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // Buat predicate yang mengembalikan elemen array yang lebih besar dari 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // Temukan elemen pertama dari array menggunakan predicate yang dibuat dan cetak hasilnya.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
