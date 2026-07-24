---
title: "System::Int32 クラス"
linktitle: "Int32"
second_title: "C++ 用 Aspose.Page"
description: "System::Int32 クラス。C++ で 32 ビット整数を扱うためのメソッドを含みます。"
type: docs
weight: 4100
url: /ja/cpp/system/int32/
---
## Int32 class


32ビット整数を操作するメソッドを含みます。

```cpp
class Int32
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 指定された文字列（数値の文字列表現を含む）を、同等の 32 ビット符号付き整数に変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報を使用して同等の 32 ビット符号付き整数に変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して同等の 32 ビット符号付き整数に変換します。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) |  |
| static [TryParse](./tryparse/)(const String\&, int32_t\&) | 指定された文字列（数値の文字列表現を含む）を、同等の 32 ビット符号付き整数に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) | 指定された文字列（数値の文字列表現を含む）を、提供された書式情報と数値スタイルを使用して同等の 32 ビット符号付き整数に変換します。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) |  |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | 可能な最大値。 |
| static constexpr [MinValue](./minvalue/) | 可能な最小値。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
