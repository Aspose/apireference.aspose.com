---
title: "System::Drawing::StringFormat 类"
linktitle: "StringFormat"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::StringFormat 类。封装文本布局信息、显示操作和 OpenType 功能。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2500
url: /zh/cpp/system.drawing/stringformat/
---
## StringFormat class


封装文本布局信息、显示操作和 OpenType 功能。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringFormat : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 返回当前对象的精确副本。 |
| [get_Alignment](./get_alignment/)() const | 返回指示字符串水平对齐方式的值。 |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | 返回指示在将本地数字替换为西方数字时使用的语言的值。 |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | 返回数字替换方法。 |
| [get_FormatFlags](./get_formatflags/)() const | 返回一个 [StringFormatFlags](../stringformatflags/) 的按位组合，用于指定当前对象表示的字符串格式。 |
| static [get_GenericDefault](./get_genericdefault/)() | 返回一个表示通用默认格式的 [StringFormat](./) 对象。 |
| static [get_GenericTypographic](./get_generictypographic/)() | 返回一个表示通用排版格式的 [StringFormat](./) 对象。 |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | 返回指示热键前缀显示方式的值。 |
| [get_LineAlignment](./get_linealignment/)() const | 返回指示字符串垂直对齐方式的值。 |
| [get_Trimming](./get_trimming/)() const | 返回指示字符串裁剪方式的值。 |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | 获取 [CharacterRange](../characterrange/) 数组的大小。 |
| [GetTabStops](./gettabstops/)(float\&) const | 返回当前 [StringFormat](./) 对象的制表位。 |
| [set_Alignment](./set_alignment/)(StringAlignment) | 设置字符串的水平对齐方式。 |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | 设置字符串格式标志。 |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | 设置指定热键前缀显示方式的值。 |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | 设置字符串的垂直对齐方式。 |
| [set_Trimming](./set_trimming/)(StringTrimming) | 设置指定字符串裁剪方式的值。 |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | 设置数字替换的语言和方法。 |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | 设置一个 [CharacterRange](../characterrange/) 对象数组，这些对象表示通过调用 MeasureCharacterRanges() 方法测量的字符范围。 |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | 设置当前 [StringFormat](./) 对象的制表位。 |
| [StringFormat](./stringformat/)() | 构造一个新的 [StringFormat](./) 类实例。 |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | 使用指定的格式标志和语言构造一个新的 [StringFormat](./) 类实例。 |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | 拷贝构造函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
