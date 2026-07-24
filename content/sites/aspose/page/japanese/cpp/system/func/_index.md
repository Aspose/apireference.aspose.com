---
title: "System::Func class"
linktitle: "Func"
second_title: "C++ 用 Aspose.Page"
description: "System::Func class. 関数デリゲートです。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 2800
url: /ja/cpp/system/func/
---
## Func class


関数デリゲートです。この型はスタック上に割り当て、値または参照で関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| パラメーター | 説明 |
| --- | --- |
| 引数 | 呼び出し引数、その後必須の戻り値の型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Func](./func/)() | null-Func を作成するデフォルトコンストラクタです。 |
| [Func](./func/)(T\&&) | [Func](./) オブジェクトを構築し、値（実際のコールバックまたは nullptr のいずれか）を割り当てるコンストラクタです。 |
| [Func](./func/)(const Func\&) | コピーコンストラクタ。 |
| [Func](./func/)(Func\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(const Func\&) | コピー代入。 |
| [operator=](./operator=/)(Func\&&) | ムーブ代入。 |
| [~Func](./~func/)() | デストラクタ。 |
## 備考



```cpp
#include "system/func.h"
#include <iostream>

// この関数はパラメータとして System::Func デリゲートのインスタンスを受け取ります。
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // System::Func デリゲートのインスタンスを作成します。
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // 作成したインスタンスを関数引数として渡します。
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
