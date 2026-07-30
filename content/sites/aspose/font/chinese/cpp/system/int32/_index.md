---
title: "System::Int32 类"
linktitle: "Int32"
second_title: "Aspose.Font 适用于 C++"
description: "System::Int32 类。包含在 C++ 中处理 32 位整数的方法。"
type: docs
weight: 4100
url: /zh/cpp/system/int32/
---
## Int32 class


包含用于处理 32 位整数的方法。

```cpp
class Int32
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 将包含数字字符串表示的指定字符串转换为等效的 32 位有符号整数。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 将包含数字字符串表示的指定字符串转换为等效的 32 位有符号整数，使用提供的格式信息。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 将包含数字字符串表示的指定字符串转换为等效的 32 位有符号整数，使用提供的格式信息和数字样式。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const ReadOnlySpan\<char16_t\>\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) |  |
| static [TryParse](./tryparse/)(const String\&, int32_t\&) | 将包含数字字符串表示的指定字符串转换为等效的 32 位有符号整数。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) | 将包含数字字符串表示的指定字符串转换为等效的 32 位有符号整数，使用提供的格式信息和数字样式。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) |  |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | 可能的最大值。 |
| static constexpr [MinValue](./minvalue/) | 可能的最小值。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
