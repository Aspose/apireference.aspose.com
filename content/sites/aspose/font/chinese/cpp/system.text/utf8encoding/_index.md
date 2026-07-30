---
title: "System::Text::UTF8Encoding 类"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF8Encoding 类。UTF-8 编码。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2800
url: /zh/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8 编码。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆编码对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 与对象比较。 |
| [GetHashCode](./gethashcode/)() const override | 获取编码的哈希码。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 获取对指定字符数进行编码所需的最大字节数。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 获取对指定字节数进行解码所需的最大字符数。 |
| [GetPreamble](./getpreamble/)() override | 获取代码页前导字节。 |
| [operator==](./operator==/)(const UTF8Encoding\&) const | 比较编码参数。 |
| [UTF8Encoding](./utf8encoding/)() | 构造函数。 |
| [UTF8Encoding](./utf8encoding/)(bool) | 构造函数。 |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI 信息。 |
## 另见

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
