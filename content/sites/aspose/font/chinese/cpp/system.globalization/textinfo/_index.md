---
title: "System::Globalization::TextInfo 类"
linktitle: "TextInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::TextInfo 类。定义特定区域的文本属性。仅在非只读对象上启用设置操作。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2800
url: /zh/cpp/system.globalization/textinfo/
---
## TextInfo class


定义特定区域的文本属性。仅在非只读对象上启用设置操作。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TextInfo : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 信息。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | 获取 ANSI 代码页。 |
| [get_CultureName](./get_culturename/)() const | 获取文化名称。 |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | 获取 EBCDIC 代码页。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 检查格式是否为只读。 |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | 检查文本是否从左到右书写。 |
| [get_LCID](./get_lcid/)() const | 获取区域标识符。 |
| virtual [get_ListSeparator](./get_listseparator/)() const | 获取列表分隔符。 |
| virtual [get_MacCodePage](./get_maccodepage/)() const | 获取 Macintosh 代码页。 |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | 获取 OEM 代码页。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | 获取只读的文化版本。 |
| virtual [set_ListSeparator](./set_listseparator/)(String) | 设置列表分隔符。 |
| [TextInfo](./textinfo/)(const TextInfo\&) | RTTI 信息。 |
| virtual [ToLower](./tolower/)(char_t) const | 将字符转换为小写。 |
| virtual [ToLower](./tolower/)(String) const | 将字符串转换为小写。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| [ToTitleCase](./totitlecase/)(String) const | 将字符串转换为标题大小写（已全部大写的首字母缩写除外）。 |
| virtual [ToUpper](./toupper/)(char_t) const | 将字符转换为大写。 |
| virtual [ToUpper](./toupper/)(String) const | 将字符串转换为大写。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
