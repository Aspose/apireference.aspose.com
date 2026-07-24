---
title: "System::Byte class"
linktitle: "Byte"
second_title: "C++ 用 Aspose.Page"
description: "System::Byte クラス。C++ で符号なし 8 ビット整数を扱うためのメソッドを含みます。"
type: docs
weight: 1100
url: /ja/cpp/system/byte/
---
## Byte class


符号なし 8 ビット整数を扱うメソッドを含みます。

```cpp
class Byte
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 指定された文字列（数値の文字列表現を含む）を等価な 8 ビット符号なし整数に変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報を使用して等価な 8 ビット符号なし整数に変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して等価な 8 ビット符号なし整数に変換します。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | 指定された文字列（数値の文字列表現を含む）を等価な 8 ビット符号なし整数に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して等価な 8 ビット符号なし整数に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | 可能な最大値。 |
| static constexpr [MinValue](./minvalue/) | 可能な最小値。 |
## 備考



```cpp
#include <system/byte.h>

using namespace System;

int main()
{
  auto b1 = Byte::Parse(u"123");
  std::cout << static_cast<uint32_t>(b1) << std::endl;

  try
  {
    auto b2 = Byte::Parse(u"345");
    std::cout << static_cast<uint32_t>(b2) << std::endl;
  }
  catch (const OverflowException &ex)
  {
    std::cerr << ex.what() << std::endl;
  }

  uint8_t b3 = 0;
  if (Byte::TryParse(u"10", b3))
  {
    std::cout << static_cast<uint32_t>(b3) << std::endl;
  }
  else
  {
    std::cerr << "Something went wrong." << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
123
System::OverflowException: Value was either too large or too small for an UInt8
10
*/
```

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
