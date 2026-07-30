---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Predicate typedef。表示指向谓词的指针——一种可调用实体，接受单个参数并在 C++ 中返回布尔值。"
type: docs
weight: 12600
url: /zh/cpp/system/predicate/
---
## Predicate typedef


表示指向谓词的指针——接受单个参数并返回布尔值的可调用实体。

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## 备注



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // 填充数组。
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // 创建一个谓词，返回大于 3 的数组元素。
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // 使用创建的谓词查找数组的第一个元素并打印它。
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
