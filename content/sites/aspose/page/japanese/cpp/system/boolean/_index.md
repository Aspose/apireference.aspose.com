---
title: "System::Boolean クラス"
linktitle: "Boolean"
second_title: "C++ 用 Aspose.Page"
description: "System::Boolean クラス。C++ で System.Boolean .Net 型の静的メンバーを保持するクラスです。"
type: docs
weight: 600
url: /ja/cpp/system/boolean/
---
## Boolean class


[System.Boolean](./) .[Net](../../system.net/) 型の静的メンバーを保持するクラスです。

```cpp
class Boolean
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 指定された文字列を bool 型の値に変換します。 |
| static [TryParse](./tryparse/)(const String\&, bool\&) | 指定された文字列を bool 型の値に変換します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) は 'false' ブール値の表現です。 |
| static [TrueString](./truestring/) | [String](../string/) は 'true' ブール値の表現です。 |
## 備考



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // ブール変数を作成します。
  bool isWeekend = false;

  // 入力文字列を解析し、結果を出力します。
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
