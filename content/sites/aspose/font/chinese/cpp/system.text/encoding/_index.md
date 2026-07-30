---
title: "System::Text::Encoding 类"
linktitle: "Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoding 类。C++ 中的编码服务。"
type: docs
weight: 1600
url: /zh/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | 克隆编码对象。 |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | 在两种编码之间转换字节。 |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | 在两种编码之间转换字节。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 比较编码。 |
| static [get_ASCII](./get_ascii/)() | 获取 ASCII 编码。 |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | 获取标准的大端 Unicode 编码对象。 |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | 获取标准的大端 UTF-32 编码对象。 |
| virtual [get_BodyName](./get_bodyname/)() | 获取邮件代理正文兼容的编码名称。 |
| virtual [get_CodePage](./get_codepage/)() | 获取 [Windows](../../system.windows/) 代码页 ID。 |
| [get_DecoderFallback](./get_decoderfallback/)() const | 获取解码器回退。 |
| static [get_Default](./get_default/)() | 获取默认编码。 |
| [get_EncoderFallback](./get_encoderfallback/)() const | 获取编码器回退。 |
| virtual [get_EncodingName](./get_encodingname/)() | 获取人类可读的编码名称。 |
| virtual [get_HeaderName](./get_headername/)() | 获取邮件代理头兼容的编码名称。 |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | 检查编码是否可以在浏览器中用于显示内容。 |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | 检查编码是否可以在浏览器中用于保存内容。 |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | 检查编码是否可以在邮件客户端中用于显示内容。 |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | 检查编码是否可以在邮件客户端中用于保存内容。 |
| [get_IsReadOnly](./get_isreadonly/)() | 检查编码是否为只读。 |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | 检查编码是否为单字节。 |
| static [get_Latin1](./get_latin1/)() | 获取 Latin1 编码。仅供内部使用。 |
| static [get_Unicode](./get_unicode/)() | 获取标准 Unicode 编码对象。 |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | 获取标准 UTF-7 编码对象。 |
| static [get_UTF8](./get_utf8/)() | 获取标准 UTF-8 编码对象。 |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | 仅内部使用，由类库使用：未标记且不进行输入验证。 |
| virtual [get_WebName](./get_webname/)() | 获取兼容 IANA 的编码名称。 |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | 获取 [Windows](../../system.windows/) 代码页 ID。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 获取对字符串进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | 获取对字符缓冲区进行编码所需的字符数。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const String\&) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | 获取对字符缓冲区进行编码后产生的字节。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | 获取对字节缓冲区进行解码所需的字符数。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | 获取对字节缓冲区进行解码后产生的字符。 |
| virtual [GetDecoder](./getdecoder/)() | 获取一个将请求转发给此对象的解码器。 |
| virtual [GetEncoder](./getencoder/)() | 获取一个将请求转发给此对象的编码器。 |
| static [GetEncoding](./getencoding/)(const String\&) | 通过名称获取编码。 |
| static [GetEncoding](./getencoding/)(int) | 通过代码页获取编码。 |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | 通过代码页获取编码。 |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | 通过名称获取编码。 |
| static [GetEncodings](./getencodings/)() | 获取已知编码的列表。 |
| [GetHashCode](./gethashcode/)() const override | 对编码进行哈希。 |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | 获取对指定字符数进行编码所需的最大字节数。 |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | 获取对指定字节数进行解码所需的最大字符数。 |
| virtual [GetPreamble](./getpreamble/)() | 返回表示编码的字节序列（例如 BOM）。 |
| virtual [GetString](./getstring/)(uint8_t *, int) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | 将字节缓冲区解码为字符串。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | 将字节缓冲区解码为字符串。 |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | 将字节缓冲区解码为字符串。 |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | 将字节缓冲区解码为字符串。 |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | 设置解码器回退。 |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | 设置编码器回退。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | 默认代码页值。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | RTTI。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
