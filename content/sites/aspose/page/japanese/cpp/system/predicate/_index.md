---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "C++ 用 Aspose.Page"
description: "System::Predicate typedef。プレディケートへのポインタを表します。プレディケートは、単一の引数を受け取り、C++ で bool 値を返す呼び出し可能なエンティティです。"
type: docs
weight: 12500
url: /ja/cpp/system/predicate/
---
## Predicate typedef


述語へのポインタを表します - 単一の引数を受け取り bool 値を返す呼び出し可能なエンティティです。

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## 備考



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // 配列を埋めます。
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // 3 より大きい配列要素を返すプレディケートを作成します。
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // 作成したプレディケートを使用して配列の最初の要素を見つけ、出力します。
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
