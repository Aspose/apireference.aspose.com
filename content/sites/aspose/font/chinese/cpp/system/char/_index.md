---
title: "System::Char 类"
linktitle: "Char"
second_title: "Aspose.Font 适用于 C++"
description: "System::Char 类。提供用于操作以 UTF-16 代码单元表示的字符的方法。这是一个没有实例服务的静态类型。您绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 1200
url: /zh/cpp/system/char/
---
## Char class


提供对以 UTF-16 代码单元表示的字符进行操作的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。

```cpp
class Char
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | 将 UTF-32 代码单元转换为 [System::String](../string/) 类的实例。 |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | 将指定的 UTF-16 代理对转换为 UTF-32 代码单元。 |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | 将字符串中指定位置的 UTF-16 编码字符或代理对的值转换为 UTF-32 代码单元。 |
| static [GetNumericValue](./getnumericvalue/)(char_t) | 将指定的 UTF-16 字符转换为双精度浮点数值。 |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | 返回表示指定字符的 Unicode 类别的值。 |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | 确定指定字符是否被归类为 ASCII 空白字符。 |
| static [IsControl](./iscontrol/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被归类为 Unicode 控制字符。 |
| static [IsControl](./iscontrol/)(char_t) | 确定指定字符是否被归类为 Unicode 控制字符。 |
| static [IsDigit](./isdigit/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为十进制数字。 |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | 确定指定字符串中指定索引处的字符是否被分类为十进制数字。 |
| static [IsDigit](./isdigit/)(char_t) | 确定指定字符是否被分类为十进制数字。 |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | 确定指定字符串中指定索引处的字符是否为 UTF-16 高代理代码单元。 |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否为高代理。 |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | 确定指定字符是否为高代理。 |
| static [IsLetter](./isletter/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为 Unicode 字母。 |
| static [IsLetter](./isletter/)(char_t) | 确定指定字符是否被分类为 Unicode 字母。 |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为 Unicode 字母或十进制数字。 |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | 确定指定字符是否被分类为 Unicode 字母或十进制数字。 |
| static [IsLower](./islower/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为小写字母。 |
| static [IsLower](./islower/)(char_t) | 确定指定字符是否被分类为小写字母。 |
| static [IsLower](./islower/)(const String\&, int) | 确定指定字符串中指定索引处的字符是否被分类为小写字母。 |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否为低代理。 |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | 确定指定字符是否为低代理。 |
| static [IsNumber](./isnumber/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为数字。 |
| static [IsNumber](./isnumber/)(char_t) | 确定指定字符是否被分类为数字。 |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为标点符号。 |
| static [IsPunctuation](./ispunctuation/)(char_t) | 确定指定字符是否被分类为标点符号。 |
| static [IsSeparator](./isseparator/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为分隔符。 |
| static [IsSeparator](./isseparator/)(char_t) | 确定指定字符是否被分类为分隔符。 |
| static [IsSurrogate](./issurrogate/)(char_t) | 确定指定字符是否为 UTF-16 代理代码单元。 |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | 确定指定字符串中指定索引处的字符是否为 UTF-16 代理代码单元。 |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | 确定两个指定字符是否为 UTF-16 代理对。 |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | 确定指定字符缓冲区中连续的两个字符是否为代理对。 |
| static [IsSymbol](./issymbol/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为符号字符。 |
| static [IsSymbol](./issymbol/)(char_t) | 确定指定字符是否被分类为符号字符。 |
| static [IsUpper](./isupper/)(const String\&, int) | 确定指定字符串中指定索引处的字符是否被分类为大写字母。 |
| static [IsUpper](./isupper/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为大写字母。 |
| static [IsUpper](./isupper/)(char_t) | 确定指定字符是否被分类为大写字母。 |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | 确定指定字符缓冲区中指定索引处的字符是否被分类为空白字符。 |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | 确定指定字符是否被分类为空白字符。 |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | 确定指定字符串中指定索引处的字符是否被分类为空白字符。 |
| static [Parse](./parse/)(const String\&) | 将指定字符串的唯一字符转换为 char_t 值。 |
| static [ToLower](./tolower/)(char_t) | 将指定字符转换为小写。 |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 将指定字符转换为小写。 |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | 将指定字符转换为小写。 |
| static [ToUpper](./toupper/)(char_t) | 将指定字符转换为大写。 |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 将指定字符转换为大写。 |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | 将指定字符转换为大写。 |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | 尝试将仅包含单个字符的字符串转换为 UTF-16 字符。仅当输入字符串非空且长度恰好为一个字符时，函数才会成功。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
