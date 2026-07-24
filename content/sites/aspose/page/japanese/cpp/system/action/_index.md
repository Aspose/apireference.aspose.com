---
title: "System::Action typedef"
linktitle: "Action"
second_title: "C++ 用 Aspose.Page"
description: "System::Action typedef。C++ で戻り値を持たないメソッドを参照するデリゲート型です。"
type: docs
weight: 9400
url: /ja/cpp/system/action/
---
## Action typedef


戻り値のないメソッドを参照するデリゲート型です。

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## 備考



```cpp
#include <system/action.h>

using namespace System;

// 渡された文字列を出力する関数。
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Action のインスタンスを作成します。
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // アクションを呼び出します。
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
