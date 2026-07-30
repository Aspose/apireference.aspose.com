---
title: "System::Globalization::CompareInfo 类"
linktitle: "CompareInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::CompareInfo 类。进行区域文化敏感的字符串比较。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system.globalization/compareinfo/
---
## CompareInfo class


进行区域文化敏感的字符串比较。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CompareInfo : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | 比较字符串。未实现。 |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | 比较字符串。仅支持 Ordinal 和 OrdinalIgnoreCase 模式。 |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | 比较一个字符串的一段与第二个字符串的一段。未实现。 |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | 使用字符串比较方法比较一个字符串的结尾段与第二个字符串的结尾段。未实现。 |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | 比较一个字符串的结尾段与第二个字符串的结尾段。未实现。 |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | 使用字符串比较方法比较一个字符串的一段与第二个字符串的一段。未实现。 |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI 信息。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | 获取与比较器关联的文化的 LCID。 |
| virtual [get_Name](./get_name/)() const | 获取与比较器关联的文化名称。 |
| [get_Version](./get_version/)() const | 获取有关排序版本的信息。 |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | 获取与指定文化关联的 [CompareInfo](./)，并在指定程序集里使用字符串比较方法。 |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | 获取与指定文化关联的 [CompareInfo](./)，并在指定程序集里使用字符串比较方法。 |
| static [GetCompareInfo](./getcompareinfo/)(int) | 获取与指定文化关联的 [CompareInfo](./)。 |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | 获取与指定文化关联的 [CompareInfo](./)。 |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | 根据指定的比较选项获取字符串哈希码。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | 获取针对指定字符串的 [SortKey](../sortkey/) 对象，使用指定的比较选项。 |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | 获取指定字符串的 [SortKey](../sortkey/) 对象。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | 查找子字符串。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | 查找子字符串。仅支持序数模式。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | 查找子字符串。仅支持序数模式。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | 查找指定字符。仅支持序数模式。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | 查找子字符串。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | 查找指定字符。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | 查找子字符串。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | 查找指定字符。仅支持序数模式。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | 查找指定字符。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | 查找指定字符。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | 查找子字符串。仅支持序数模式。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | 查找指定字符。仅支持序数模式。 |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | 检查指定字符串是否以指定前缀开头，使用指定的比较选项。 |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | 检查指定字符串是否以指定前缀开头。 |
| static [IsSortable](./issortable/)(char16_t) | 检查指定字符是否可排序。 |
| static [IsSortable](./issortable/)(const String\&) | 检查指定字符串是否可排序。 |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | 检查指定字符串是否以指定后缀结尾，使用指定的比较选项。 |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | 检查指定字符串是否以指定后缀结尾。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | 搜索指定子字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | 使用指定的比较选项搜索指定子字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | 使用指定的比较选项搜索指定字符的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | 搜索指定字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | 使用指定的比较选项搜索指定字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | 使用指定的比较选项搜索指定字符的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | 搜索指定字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | 搜索指定字符的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | 使用指定的比较选项搜索指定字符串的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | 使用指定的比较选项搜索指定字符的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | 搜索指定字符的最后一次出现。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | 搜索指定字符的最后一次出现。 |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
