---
title: "System::Globalization::StringInfo 类"
linktitle: "StringInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::StringInfo 类。用于遍历字符串部分的分割器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2400
url: /zh/cpp/system.globalization/stringinfo/
---
## StringInfo class


用于遍历字符串部分的分割器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringInfo : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | 获取 [StringInfo](./) 对象中的文本项数量。 |
| [get_String](./get_string/)() const | 获取 [StringInfo](./) 对象的值。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | 获取指定字符串中的第一个元素。 |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | 获取指定字符串在指定索引处的元素。 |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | 创建枚举器以遍历字符串的字符。 |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | 创建枚举器以从指定索引开始遍历字符串的字符。 |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | 获取基本字符、高代理项和控制字符的索引。 |
| [set_String](./set_string/)(const String\&) | 设置 [StringInfo](./) 对象的值。 |
| [StringInfo](./stringinfo/)() | RTTI 信息。 |
| [StringInfo](./stringinfo/)(const String\&) | 构造函数。 |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | 获取从指定文本元素到最后一个文本元素的文本元素子串。 |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | 获取从指定文本元素起，经过指定数量的文本元素的子串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
