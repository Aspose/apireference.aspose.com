---
title: "System::Text::RegularExpressions::Regex 类"
linktitle: "Regex"
second_title: "Aspose.Page 适用于 C++"
description: "System::Text::RegularExpressions::Regex 类。遵循 C# 类似语法的正则表达式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 800
url: /zh/cpp/system.text.regularexpressions/regex/
---
## Regex class


遵循 C# 类似语法的正则表达式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Regex : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Escape](./escape/)(const String\&) | 转义特殊字符以将字符串用作模式的一部分。 |
| [get_MatchTimeout](./get_matchtimeout/)() | 获取匹配超时时间。 |
| [get_Options](./get_options/)() | 获取正则表达式选项。 |
| [get_RightToLeft](./get_righttoleft/)() | 检查匹配是否以从右到左模式进行。 |
| [IsMatch](./ismatch/)(const String\&, int) | 将正则表达式与字符串匹配。 |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | 检查字符串是否匹配模式。 |
| [Match](./match/)(const String\&) | 将正则表达式与字符串匹配。 |
| [Match](./match/)(const String\&, int, int) | 将正则表达式与字符串匹配。 |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 匹配字符串和模式。 |
| [Matches](./matches/)(const String\&, int) | 通过重复匹配获取正则表达式在给定字符串中的所有匹配项。 |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 获取字符串和模式之间的所有匹配项。 |
| [Regex](./regex/)() | 构造空正则表达式。 |
| [Regex](./regex/)(const String\&) | 构造函数。 |
| [Regex](./regex/)(const String\&, RegexOptions) | 构造函数。 |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | 构造函数。 |
| [Replace](./replace/)(const String\&, const String\&) | 将字符串中正则表达式的所有匹配项替换为替换字符串。 |
| [Replace](./replace/)(const String\&, const char_t *) | 将字符串中正则表达式的所有匹配项替换为替换字符串。 |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | 将字符串中正则表达式的所有匹配项替换为替换字符串。 |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | 将字符串中正则表达式的所有匹配项替换为替换字符串。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | 用委托生成的替换字符串替换字符串中的所有匹配项。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | 用委托生成的替换字符串替换字符串中的所有匹配项。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | 用委托生成的替换字符串替换字符串中的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | 用委托生成的替换字符串（静态函数）替换字符串中的所有匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | 将字符串中正则表达式的所有匹配项替换为替换字符串。 |
| [Replace](./replace/)(const String\&, const String\&, int) | 替换字符串中的子串。未实现。 |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 替换字符串中的子串。未实现。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | 替换正则表达式匹配项。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | 替换正则表达式匹配项。 |
| [Split](./split/)(const String\&) | 按正则表达式匹配项拆分字符串。 |
| [Split](./split/)(const String\&, int) | 按正则表达式匹配项拆分字符串。 |
| [Split](./split/)(const String\&, int, int) | 将输入字符串按在 [Regex](./) 构造函数中指定的正则表达式定义的位置，最多拆分指定次数，生成子串数组。正则表达式模式的搜索从输入字符串的指定字符位置开始。 |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | 按正则表达式拆分字符串。 |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | 按正则表达式拆分字符串。 |
| [ToString](./tostring/)() const override | 将正则表达式转换为字符串。 |
| static [Unescape](./unescape/)(const String\&) | 对用作模式一部分的字符串中的特殊字符进行反转义。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | 用于通过超时禁用匹配中断的特殊超时值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
