---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "C++용 Aspose.Page"
description: "System::Predicate typedef. 단일 인수를 받아 C++에서 bool 값을 반환하는 호출 가능한 엔터티인 predicate에 대한 포인터를 나타냅니다."
type: docs
weight: 12500
url: /ko/cpp/system/predicate/
---
## Predicate typedef


단일 인자를 받아 bool 값을 반환하는 호출 가능한 엔티티인 프레디케이트에 대한 포인터를 나타냅니다.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## 비고



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // 배열을 채우세요.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // 3보다 큰 배열 요소를 반환하는 predicate를 생성하세요.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // 생성된 predicate를 사용하여 배열의 첫 번째 요소를 찾고 출력하세요.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
