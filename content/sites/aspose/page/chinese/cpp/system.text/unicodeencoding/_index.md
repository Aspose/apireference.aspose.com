---
title: "System::Text::UnicodeEncoding 类"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page 适用于 C++"
description: "System::Text::UnicodeEncoding 类。Unicode 编码。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 System::SmartPtr 指针，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2500
url: /zh/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode 编码。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆编码对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 比较编码。 |
| [GetHashCode](./gethashcode/)() const override | 对编码进行哈希处理。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 获取编码指定字符数所需的最大字节数。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 获取解码指定字节数所需的最大字符数。 |
| [GetPreamble](./getpreamble/)() override | 返回表示编码的字节序列（例如 BOM）。 |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | 通过代码页和标志比较编码。 |
| [UnicodeEncoding](./unicodeencoding/)() | 构造函数。 |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | 构造函数。 |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | 大端字节序代码页编号。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | 小端字节序代码页编号。 |
## 另见

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
