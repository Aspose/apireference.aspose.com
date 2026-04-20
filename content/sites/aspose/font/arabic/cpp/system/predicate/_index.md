---
title: "System::Predicate typedef"
linktitle: "Predicate"
second_title: "Aspose.Font لـ C++"
description: "System::Predicate typedef. يمثل مؤشرًا إلى Predicate - كيانًا قابلًا للاستدعاء يقبل وسيطًا واحدًا ويعيد قيمة منطقية (bool) في C++."
type: docs
weight: 12600
url: /ar/cpp/system/predicate/
---
## Predicate typedef


يمثل مؤشرًا إلى دالة شرطية - كيانًا قابلًا للاستدعاء يقبل وسيطًا واحدًا ويعيد قيمة منطقية.

```cpp
using System::Predicate =  MulticastDelegate<bool(T)>
```

## ملاحظات



```cpp
#include "system/array.h"
#include "system/predicate.h"
#include <iostream>

int main()
{
  // املأ المصفوفة.
  auto arr = System::MakeArray<int>({-1, -123, 5, 3, 7});

  // أنشئ الـ Predicate الذي يُعيد عنصرًا من المصفوفة أكبر من 3.
  const auto predicate = static_cast<System::Predicate<int>>([](int a) -> bool
  {
      return a > 3;
  });

  // اعثر على العنصر الأول في المصفوفة باستخدام الـ Predicate المُنشأ واطبعَه.
  int firstItem = System::Array<int>::Find(arr, predicate);
  std::cout << firstItem << std::endl;

  return 0;
}
/*
This code example produces the following output:
5
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
