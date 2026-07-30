---
title: "System::StringComparer 类"
linktitle: "StringComparer"
second_title: "Aspose.Font 适用于 C++"
description: "System::StringComparer 类。使用不同的比较模式比较字符串。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 5900
url: /zh/cpp/system/stringcomparer/
---
## StringComparer class


使用不同的比较模式比较字符串。此类的对象只能通过 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 使用当前设置比较两个字符串。 |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | 创建特定文化的比较器。 |
| [Equals](./equals/)(String, String) const override | 使用当前设置检查两个字符串是否相等。 |
| static [get_CurrentCulture](./get_currentculture/)() | 当前文化比较器单例。 |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | 当前文化不区分大小写的比较器单例。 |
| static [get_InvariantCulture](./get_invariantculture/)() | 不变文化比较器单例。 |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | 不变文化不区分大小写的比较器单例。 |
| static [get_Ordinal](./get_ordinal/)() | 序数比较器单例。 |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | 序数不区分大小写的比较器单例。 |
| [GetHashCode](./gethashcode/)(String) const override | 获取字符串的哈希码。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [args_type](./args_type/) | RTTI 信息。 |
## 另见

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
