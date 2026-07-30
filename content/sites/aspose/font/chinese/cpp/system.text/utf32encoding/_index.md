---
title: "System::Text::UTF32Encoding 类"
linktitle: "UTF32Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF32Encoding 类。UTF-32 编码。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2600
url: /zh/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 编码。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆编码对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 与对象比较。 |
| [GetHashCode](./gethashcode/)() const override | 获取编码的哈希码。 |
| [GetPreamble](./getpreamble/)() override | 获取代码页前导字节。 |
| [operator==](./operator==/)(const UTF32Encoding\&) const | 比较编码的参数。 |
| [UTF32Encoding](./utf32encoding/)() | 构造函数。 |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | 构造函数。 |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | 由 [Windows](../../system.windows/) 使用的用于大端 UTF-32 代码页 ID 的魔数。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | 由 [Windows](../../system.windows/) 使用的用于小端 UTF-32 代码页 ID 的魔数。 |
## 另见

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
