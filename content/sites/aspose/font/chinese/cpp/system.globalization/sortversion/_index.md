---
title: "System::Globalization::SortVersion 类"
linktitle: "SortVersion"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::SortVersion 类。提供用于比较和排序字符串的 Unicode 版本信息。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2300
url: /zh/cpp/system.globalization/sortversion/
---
## SortVersion class


提供用于比较和排序字符串的 Unicode 版本信息。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | 检查当前的 [SortVersion](./) 实例是否等于指定的 [SortVersion](./) 对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 检查当前的 [SortVersion](./) 实例是否等于指定的 [SortVersion](./) 对象。 |
| [get_FullVersion](./get_fullversion/)() | 获取完整版本号。 |
| [get_SortId](./get_sortid/)() | 获取此对象的唯一标识符。 |
| [GetHashCode](./gethashcode/)() const override | 获取当前对象的哈希码。 |
| [operator!=](./operator!=/)(const SortVersion\&) | 检查当前的 [SortVersion](./) 实例是否不等于指定的 [SortVersion](./) 对象。 |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | 检查当前的 [SortVersion](./) 实例是否等于指定的 [SortVersion](./) 对象。 |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI 信息。 |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## 另见

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
