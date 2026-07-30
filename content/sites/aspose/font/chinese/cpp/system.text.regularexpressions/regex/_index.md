---
title: "System::Text::RegularExpressions::Regex 类"
linktitle: "正则表达式"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::Regex 类。遵循类似 C# 语法的正则表达式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 800
url: /zh/cpp/system.text.regularexpressions/regex/
---
## Regex class


遵循类似 C# 语法的正则表达式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Regex : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Escape](./escape/)(const String\&) | 转义特殊字符，以便将字符串用作模式的一部分。 |
| [get_MatchTimeout](./get_matchtimeout/)() | 获取匹配超时时间。 |
| [get_Options](./get_options/)() | 获取正则表达式选项。 |
| [get_RightToLeft](./get_righttoleft/)() | 检查匹配是否以从右到左的模式进行。 |
| [IsMatch](./ismatch/)(const String\&, int) | 将正则表达式与字符串匹配。 |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | 检查字符串是否匹配模式。 |
| [Match](./match/)(const String\&) | 将正则表达式与字符串匹配。 |
| [Match](./match/)(const String\&, int, int) | 将正则表达式与字符串匹配。 |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 匹配字符串和模式。 |
| [Matches](./matches/)(const String\&, int) | 通过重复匹配，获取给定字符串中正则表达式的所有匹配项。 |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 获取字符串与模式之间的所有匹配项。 |
| [Regex](./regex/)() | 构造空正则表达式。 |
| [Regex](./regex/)(const String\&) | 构造函数。 |
| [Regex](./regex/)(const String\&, RegexOptions) | 构造函数。 |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | 构造函数。 |
| [Replace](./replace/)(const String\&, const String\&) | 用替换字符串替换字符串中正则表达式的所有匹配项。 |
| [Replace](./replace/)(const String\&, const char_t *) | 用替换字符串替换字符串中正则表达式的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | 用替换字符串替换字符串中正则表达式的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | 用替换字符串替换字符串中正则表达式的所有匹配项。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | 使用委托生成的替换字符串替换字符串中的所有匹配项。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | 使用委托生成的替换字符串替换字符串中的所有匹配项。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | 使用委托生成的替换字符串替换字符串中的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | 使用委托生成的替换字符串（静态函数）替换字符串中的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | 用替换字符串替换字符串中正则表达式的所有匹配项。 |
| [Replace](./replace/)(const String\&, const String\&, int) | 替换字符串中的子串。未实现。 |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 替换字符串中的子串。未实现。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | 替换正则表达式匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | 替换正则表达式匹配项。 |
| [Split](./split/)(const String\&) | 按正则表达式匹配项拆分字符串。 |
| [Split](./split/)(const String\&, int) | 按正则表达式匹配项拆分字符串。 |
| [Split](./split/)(const String\&, int, int) | 将输入字符串在指定的最大次数内拆分为子串数组，拆分位置由在 [Regex](./) 构造函数中指定的正则表达式定义。正则表达式模式的搜索从输入字符串的指定字符位置开始。 |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | 按正则表达式拆分字符串。 |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | 按正则表达式拆分字符串。 |
| [ToString](./tostring/)() const override | 将正则表达式转换为字符串。 |
| static [Unescape](./unescape/)(const String\&) | 取消转义作为模式一部分使用的字符串中的特殊字符。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | 用于禁用匹配因超时而中断的特殊超时值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
