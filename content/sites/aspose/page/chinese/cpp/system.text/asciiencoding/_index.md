---
title: "System::Text::ASCIIEncoding 类"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page 适用于 C++"
description: "System::Text::ASCIIEncoding 类。表示 ASCII 编码。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


表示 ASCII 编码。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | 构造函数。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 获取已知字符计数的字符串可能占用的最大字节数。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 获取解码指定字节数所需的最大字符数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI。 |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
## 另见

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
