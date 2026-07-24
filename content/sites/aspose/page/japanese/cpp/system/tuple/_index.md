---
title: "System::Tuple クラス"
linktitle: "Tuple"
second_title: "C++ 用 Aspose.Page"
description: "System::Tuple クラス。タプル データ構造を表すクラスです。C++ では最大項目数は 8 です。"
type: docs
weight: 6400
url: /ja/cpp/system/tuple/
---
## Tuple class


タプルデータ構造を表すクラスです。最大項目数は 8 です。

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| パラメーター | 説明 |
| --- | --- |
| 引数 | タプル要素の型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 現在のオブジェクトと指定されたオブジェクトが同一かどうかを判定します。 |
| [get_Item](./get_item/)() const | [Tuple](./) オブジェクトのコンポーネントの値を取得します。 |
| [Tuple](./tuple/)(Args...) | タプル オブジェクトを構築します。 |
## 備考



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## 参照

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
