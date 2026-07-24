---
title: "System::Action typedef"
linktitle: "操作"
second_title: "Aspose.Page 适用于 C++"
description: "System::Action typedef。委托类型，引用在 C++ 中没有返回值的方法。"
type: docs
weight: 9400
url: /zh/cpp/system/action/
---
## Action typedef


委托类型，引用没有返回值的方法。

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

  // 调用该 Action。
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
* Library [Aspose.Page for C++](../../)
