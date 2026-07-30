---
title: "System::Globalization::SortKey class"
linktitle: "SortKey"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::SortKey 类。将字符串映射到其排序键。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2200
url: /zh/cpp/system.globalization/sortkey/
---
## SortKey class


将字符串映射到其排序键。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SortKey : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | 比较两个排序键。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 检查指定的对象是否等于当前的 [SortKey](./) 对象。 |
| virtual [get_KeyData](./get_keydata/)() | 获取表示当前对象的字节数组。 |
| virtual [get_OriginalString](./get_originalstring/)() | 获取用于创建此对象的原始字符串。 |
| [GetHashCode](./gethashcode/)() const override | 获取当前 [SortKey](./) 对象的哈希码。 |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | 将当前对象转换为其字符串表示形式。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
