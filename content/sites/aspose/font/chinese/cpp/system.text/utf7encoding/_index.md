---
title: "System::Text::UTF7Encoding 类"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::UTF7Encoding 类。UTF-7 编码。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2700
url: /zh/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7 编码。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆编码对象。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 与对象比较。 |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 获取对字符串进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 获取对字符缓冲区进行编码所需的字符数。 |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | 获取对字节缓冲区进行解码所需的字符数。 |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码所需的字符数。 |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | 获取对字节缓冲区进行解码后产生的字符。 |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码后产生的字符。 |
| [GetDecoder](./getdecoder/)() override | 获取一个将请求转发给此对象的解码器。 |
| [GetEncoder](./getencoder/)() override | 获取一个将请求转发给此对象的编码器。 |
| [GetHashCode](./gethashcode/)() const override | 获取编码的哈希码。 |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 获取对指定字符数进行编码所需的最大字节数。 |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 获取对指定字节数进行解码所需的最大字符数。 |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(uint8_t *, int) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | 将字节缓冲区解码为字符串。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | 将字节缓冲区解码为字符串。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | 将字节缓冲区解码为字符串。 |
| [operator==](./operator==/)(const UTF7Encoding\&) const | 比较编码参数。 |
| [UTF7Encoding](./utf7encoding/)() | 构造函数。 |
| [UTF7Encoding](./utf7encoding/)(bool) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 默认代码页值。 |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | 由 [Windows](../../system.windows/) 使用的用于 UTF-7 代码页标识的魔数。 |
## 另见

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
