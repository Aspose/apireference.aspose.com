---
title: "System::Text::ICUEncoding 类"
linktitle: "ICUEncoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::ICUEncoding 类。基于 ICU 的编码实现。仅供内部使用。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2200
url: /zh/cpp/system.text/icuencoding/
---
## ICUEncoding class


基于 ICU 的编码实现。仅供内部使用。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ICUEncoding : public System::Text::Encoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI。 |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码所需的字符数。 |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码后产生的字符。 |
| [GetDecoder](./getdecoder/)() override | 获取一个将请求转发给此对象的解码器。 |
| [GetEncoder](./getencoder/)() override | 获取一个将请求转发给此对象的编码器。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 获取对指定字符数进行编码所需的最大字节数。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 获取对指定字节数进行解码所需的最大字符数。 |
| [GetPreamble](./getpreamble/)() override | 返回表示编码的字节序列（例如 BOM）。 |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | 构造函数。 |
| [operator==](./operator==/)(const ICUEncoding\&) const | 使用代码页比较编码。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
## 另见

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
