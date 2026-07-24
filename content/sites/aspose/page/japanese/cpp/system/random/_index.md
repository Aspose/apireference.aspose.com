---
title: "System::Random クラス"
linktitle: "Random"
second_title: "C++ 用 Aspose.Page"
description: "System::Random クラス。疑似乱数生成器を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数へ引数として渡すようにしてください。"
type: docs
weight: 5200
url: /ja/cpp/system/random/
---
## Random class


疑似乱数生成器を表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Random : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [IsNull](./isnull/)() const | 常に false を返します。 |
| virtual [Next](./next/)() | int32 の最大値未満の非負の乱数を返します。 |
| virtual [Next](./next/)(int32_t) | 指定された最大値未満の非負の乱数を返します。 |
| virtual [Next](./next/)(int32_t, int32_t) | 指定された範囲内の乱数を返します。 |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | 指定されたバイト配列の要素を乱数で埋めます。 |
| virtual [NextDouble](./nextdouble/)() | 0.0 から 1.0 の間の乱数を返します。 |
| [Random](./random/)() | 時間依存のデフォルトシード値を使用して新しいインスタンスを初期化します。 |
| [Random](./random/)(int32_t) | 指定されたシード値を使用して [System.Random](./) クラスの新しいインスタンスを初期化します。 |
## 備考



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // ランダムな月番号を取得し、出力します。
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // 配列を乱数で埋めます。
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // 配列を印刷します。
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
