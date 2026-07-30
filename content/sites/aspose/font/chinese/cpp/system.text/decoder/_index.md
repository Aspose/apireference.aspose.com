---
title: "System::Text::Decoder 类"
linktitle: "Decoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Decoder 类。将字节序列解码为字符序列的封装。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.text/decoder/
---
## Decoder class


将字节序列解码为字符序列的封装。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Decoder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | 将字节转换为字符。 |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | 将字节转换为字符。 |
| [get_Fallback](./get_fallback/)() const | 获取错误处理回退。 |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | 获取回退缓冲区。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 获取解码缓冲区所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | 获取解码缓冲区所需的字符数。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | 获取解码缓冲区所需的字符数。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 获取解码缓冲区后得到的字符。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | 获取解码缓冲区后得到的字符。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | 获取解码缓冲区后得到的字符。 |
| virtual [Reset](./reset/)() | 清除解码器内部状态。 |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | 设置错误处理回退。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
