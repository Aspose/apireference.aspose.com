---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Font لـ C++"
description: "System::Action typedef. نوع تفويض يشير إلى طرق لا تُعيد قيمة في C++."
type: docs
weight: 9400
url: /ar/cpp/system/action/
---
## Action typedef


نوع تفويض يشير إلى طرق لا تُعيد قيمة.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## ملاحظات



```cpp
#include <system/action.h>

using namespace System;

// الدالة التي تطبع السلسلة المُمرَّرة.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // إنشاء نسخة من Action.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // استدعاء الإجراء.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
