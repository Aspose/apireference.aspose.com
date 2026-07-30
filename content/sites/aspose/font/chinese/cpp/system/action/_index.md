---
title: "System::Action typedef"
linktitle: "Action"
second_title: "Aspose.Font 适用于 C++"
description: "System::Action typedef。引用在 C++ 中没有返回值的方法的委托类型。"
type: docs
weight: 9400
url: /zh/cpp/system/action/
---
## Action typedef


引用无返回值方法的委托类型。

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## 备注



```cpp
#include <system/action.h>

using namespace System;

// 打印传入字符串的函数。
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // 创建 Action 的实例。
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // 调用该操作。
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
