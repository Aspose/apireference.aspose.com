---
title: "System::Int64 类"
linktitle: "Int64"
second_title: "Aspose.Font 适用于 C++"
description: "System::Int64 类。包含在 C++ 中处理 64 位整数的方法。"
type: docs
weight: 4200
url: /zh/cpp/system/int64/
---
## Int64 class


包含用于处理 64 位整数的方法。

```cpp
class Int64
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 将包含数字字符串表示的指定字符串转换为等价的 64 位有符号整数。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 将包含数字字符串表示的指定字符串转换为等价的 64 位有符号整数，使用提供的格式信息。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 将包含数字字符串表示的指定字符串转换为等价的 64 位有符号整数，使用提供的格式信息和数字样式。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, int64_t\&) | 将包含数字字符串表示的指定字符串转换为等价的 64 位有符号整数。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) | 将包含数字字符串表示的指定字符串转换为等价的 64 位有符号整数，使用提供的格式信息和数字样式。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) |  |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | 可能的最大值。 |
| static constexpr [MinValue](./minvalue/) | 可能的最小值。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
